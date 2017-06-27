package com.rivetlogic.assetmanagement.notifications;

import static com.rivetlogic.assetmanagement.keys.AssetKeys.PORTLET_ID;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.WindowState;
import javax.portlet.WindowStateException;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.model.UserNotificationEvent;
import com.liferay.portal.kernel.module.configuration.ConfigurationProvider;
import com.liferay.portal.kernel.notifications.BaseUserNotificationHandler;
import com.liferay.portal.kernel.notifications.UserNotificationHandler;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.portlet.PortletPreferencesFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.service.LayoutLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ResourceBundleLoader;
import com.liferay.portal.kernel.util.ResourceBundleUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.rivetlogic.assetmanagement.configuration.AssetManagementGroupServiceConfiguration;
import com.rivetlogic.assetmanagement.keys.AssetKeys;
import com.rivetlogic.assetmanagement.keys.AssetNotificationType;

@Component(
	immediate = true,
	property = {"javax.portlet.name=" + AssetKeys.PORTLET_ID},
	service = UserNotificationHandler.class
)
public class AssetNotificationHandler extends BaseUserNotificationHandler {
	private static final Log LOG = LogFactoryUtil.getLog(AssetNotificationHandler.class);
	
	public AssetNotificationHandler() {
		setPortletId(AssetKeys.PORTLET_ID);
	}

	@Override
	protected String getBody(UserNotificationEvent userNotificationEvent, ServiceContext serviceContext) throws Exception {

		JSONObject jsonObject = JSONFactoryUtil.createJSONObject(userNotificationEvent.getPayload());

		return getNotificationBodyTemplate(jsonObject, serviceContext);
	}

	private String getNotificationBodyTemplate(JSONObject jsonObject, ServiceContext serviceContext) throws SystemException, PortalException {
		String template = "Asset Notification";

		AssetNotificationType notificationType = AssetNotificationType.valueOf(jsonObject.getString("notificationType"));

		switch (notificationType) {
		case ASSIGNED:
			template = getPreBookTemplate(jsonObject, serviceContext);
			break;

		case MESSAGE_SEND:
			template = getMessageSendTemplate(jsonObject, serviceContext);
			break;

		case MESSAGE_REPLY:
			template = getMessageReplyTemplate(jsonObject, serviceContext);
			break;

		default:
			break;
		}

		return template;
	}

	private String getMessageReplyTemplate(JSONObject jsonObject, ServiceContext serviceContext) {
		long fromUserId = jsonObject.getLong("fromUserId");
		String assetName = jsonObject.getString("assetName");
		String message = HtmlUtil.escape(StringUtil.shorten(jsonObject.getString("message"), 50));

		String userName = PortalUtil.getUserName(fromUserId, fromUserId + StringPool.BLANK);

		String title = translate(serviceContext.getLocale(), "user-reply", new Object[]{userName,assetName} );

		return StringUtil.replace(getBodyTemplate(), new String[] { "[$TITLE$]", "[$BODY_TEXT$]" }, new String[] { title, message });
	}

	private String getMessageSendTemplate(JSONObject jsonObject, ServiceContext serviceContext) {

		long fromUserId = jsonObject.getLong("fromUserId");

		String assetName = jsonObject.getString("assetName");
		String message = HtmlUtil.escape(StringUtil.shorten(jsonObject.getString("message"), 50));

		String userName = PortalUtil.getUserName(fromUserId, fromUserId + StringPool.BLANK);

		String title = translate(serviceContext.getLocale(), "user-send-msg", new Object[] {userName,assetName});

		return StringUtil.replace(getBodyTemplate(), new String[] { "[$TITLE$]", "[$BODY_TEXT$]" }, new String[] { title, message });
	}

	private String getPreBookTemplate(JSONObject jsonObject, ServiceContext serviceContext) throws SystemException, PortalException {
		long returnedUserId = jsonObject.getLong("returnedUserId");

		String returnedUserName = PortalUtil.getUserName(returnedUserId, StringPool.BLANK);

		AssetManagementGroupServiceConfiguration config = _configurationProvider.getGroupConfiguration(
                AssetManagementGroupServiceConfiguration.class, serviceContext.getScopeGroupId());

		int time = config.time();
		int minutes = config.minutes();

		String assetName = jsonObject.getString("assetName");

		String title = translate(serviceContext.getLocale(), "user-returned-asset-title", new Object[]{returnedUserName,assetName});
		String body = translate(serviceContext.getLocale(), "user-returned-asset-body", new Object[]{(time * minutes)} );

		return StringUtil.replace(getBodyTemplate(), new String[] { "[$TITLE$]", "[$BODY_TEXT$]" }, new String[] { title, body });
	}

	@Override
	protected String getLink(UserNotificationEvent userNotificationEvent, ServiceContext serviceContext) throws Exception {

		JSONObject jsonObject = JSONFactoryUtil.createJSONObject(userNotificationEvent.getPayload());

		return getNotificationLink(jsonObject, serviceContext);
	}

	private String getNotificationLink(JSONObject jsonObject, ServiceContext serviceContext) throws SystemException, PortalException,
			WindowStateException {
		String assetId = jsonObject.getString("assetId");

		PortletURL portletURL = getPortletUrl(serviceContext);

		portletURL.setParameter("mvcPath", "/asset/request_asset.jsp");

		portletURL.setParameter("redirect", serviceContext.getLayoutFullURL());
		portletURL.setParameter("tabs1", "all-assets");
		portletURL.setParameter("assetId", assetId);

		portletURL.setWindowState(WindowState.NORMAL);

		return portletURL.toString();
	}

	private PortletURL getPortletUrl(ServiceContext serviceContext) throws PortalException, SystemException {

		long portletPlid = PortalUtil.getPlidFromPortletId(serviceContext.getScopeGroupId(), PORTLET_ID);

		PortletURL portletURL = null;

		if (portletPlid != 0) {
			portletURL = PortletURLFactoryUtil
					.create(serviceContext.getLiferayPortletRequest(), PORTLET_ID, portletPlid, PortletRequest.RENDER_PHASE);
		} else {
			LiferayPortletResponse liferayPortletResponse = serviceContext.getLiferayPortletResponse();
			portletURL = liferayPortletResponse.createRenderURL(PORTLET_ID);
		}

		return portletURL;
	}
	
	protected String translate(Locale locale, String translateKey){
		String languageId = LocaleUtil.toLanguageId(locale);

		ResourceBundle resourceBundle = resourceBundleLoader.loadResourceBundle(
				languageId);

		String description = ResourceBundleUtil.getString(
				resourceBundle, translateKey);
		if(description==null)
			return translateKey;

		return description;
	}
	
	protected String translate(Locale locale, String translateKey, Object[] arguments){
		String languageId = LocaleUtil.toLanguageId(locale);

		ResourceBundle resourceBundle = resourceBundleLoader.loadResourceBundle(
				languageId);

		String description = ResourceBundleUtil.getString(
				resourceBundle, locale, translateKey, arguments);
		if(description==null)
			return translateKey;

		return description;
	}

	@Override
	protected String getBodyTemplate() {
		StringBundler sb = new StringBundler(5);
		sb.append("<div class=\"title\">[$TITLE$]</div>");
		sb.append("<div class=\"body\">[$BODY_TEXT$]</div>");
		return sb.toString();
	}

	@Reference(target = "(bundle.symbolic.name=com.rivetlogic.assetmanagement.language)")
	protected ResourceBundleLoader resourceBundleLoader;
	@Reference
    private ConfigurationProvider _configurationProvider;
}
