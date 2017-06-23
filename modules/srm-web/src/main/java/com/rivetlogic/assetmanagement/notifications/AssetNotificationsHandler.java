package com.rivetlogic.assetmanagement.notifications;

import static com.rivetlogic.assetmanagement.keys.AssetKeys.PORTLET_ID;

import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.WindowState;
import javax.portlet.WindowStateException;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.model.UserNotificationEvent;
import com.liferay.portal.kernel.notifications.BaseUserNotificationHandler;
import com.liferay.portal.kernel.notifications.UserNotificationHandler;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.portlet.PortletPreferencesFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.service.LayoutLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.rivetlogic.assetmanagement.keys.AssetKeys;
import com.rivetlogic.assetmanagement.keys.AssetNotificationType;

@Component(
	immediate = true,
	property = {"javax.portlet.name=" + AssetKeys.PORTLET_ID},
	service = UserNotificationHandler.class
)
public class AssetNotificationsHandler extends BaseUserNotificationHandler {
	public AssetNotificationsHandler() {
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

		String title = serviceContext.translate("user-reply",userName,assetName);

		return StringUtil.replace(getBodyTemplate(), new String[] { "[$TITLE$]", "[$BODY_TEXT$]" }, new String[] { title, message });
	}

	private String getMessageSendTemplate(JSONObject jsonObject, ServiceContext serviceContext) {

		long fromUserId = jsonObject.getLong("fromUserId");

		String assetName = jsonObject.getString("assetName");
		String message = HtmlUtil.escape(StringUtil.shorten(jsonObject.getString("message"), 50));

		String userName = PortalUtil.getUserName(fromUserId, fromUserId + StringPool.BLANK);

		String title = serviceContext.translate("user-send-msg",userName,assetName);

		return StringUtil.replace(getBodyTemplate(), new String[] { "[$TITLE$]", "[$BODY_TEXT$]" }, new String[] { title, message });
	}

	private String getPreBookTemplate(JSONObject jsonObject, ServiceContext serviceContext) throws SystemException, PortalException {

		long portletPlid = PortalUtil.getPlidFromPortletId(serviceContext.getScopeGroupId(), PORTLET_ID);

		Layout layout = LayoutLocalServiceUtil.getLayout(portletPlid);

		long returnedUserId = jsonObject.getLong("returnedUserId");

		String returnedUserName = PortalUtil.getUserName(returnedUserId, StringPool.BLANK);

		PortletPreferences preferences = PortletPreferencesFactoryUtil.getLayoutPortletSetup(layout, PORTLET_ID);

		int time = GetterUtil.getInteger(preferences.getValue("time", "1"));
		int minutes = GetterUtil.getInteger(preferences.getValue("minutes", "60"));

		String assetName = jsonObject.getString("assetName");

		String title = serviceContext.translate("user-returned-asset-title",returnedUserName,assetName);
		String body = serviceContext.translate("user-returned-asset-body",(time * minutes));

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

	@Override
	protected String getBodyTemplate() {
		StringBundler sb = new StringBundler(5);
		sb.append("<div class=\"title\">[$TITLE$]</div>");
		sb.append("<div class=\"body\">[$BODY_TEXT$]</div>");
		return sb.toString();
	}

}
