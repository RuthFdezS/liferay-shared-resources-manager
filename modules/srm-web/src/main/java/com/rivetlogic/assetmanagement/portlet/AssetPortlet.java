package com.rivetlogic.assetmanagement.portlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Blob;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.apache.commons.io.IOUtils;
import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.rivetlogic.assetmanagement.keys.AssetNotificationsKeys;
import com.rivetlogic.assetmanagement.model.Asset;
import com.rivetlogic.assetmanagement.model.AssetMessage;
import com.rivetlogic.assetmanagement.model.AssetRequest;
import com.rivetlogic.assetmanagement.service.AssetLocalServiceUtil;
import com.rivetlogic.assetmanagement.service.AssetMessageLocalServiceUtil;
import com.rivetlogic.assetmanagement.service.AssetRequestLocalServiceUtil;

/**
 * @author emmanuelabarca
 */
@Component(
	immediate = true,
	property = {
		"javax.portlet.name="+AssetNotificationsKeys.PORTLET_ID,
		"com.liferay.portlet.icon=/icon.png",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/asset/view.jsp",
		"javax.portlet.init-param.config-template=/asset/configuration.jsp",
		"javax.portlet.portlet-mode=text/html;view,help",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=administrator,power-user,user,guest",
		"com.liferay.portlet.show-portlet-access-denied=false",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.footer-portlet-javascript=/js/main.js",
		"com.liferay.portlet.css-class-wrapper=asset-portlet",
		"javax.portlet.init-param.copy-request-parameters=false",
	},
	service = Portlet.class
)
public class AssetPortlet extends MVCPortlet {

	public void bookAsset(ActionRequest request, ActionResponse response) throws PortalException, SystemException, IOException {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(Asset.class.getName(), request);

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		AssetRequest assetRequest = AssetRequestLocalServiceUtil.createAssetRequest(0);

		assetRequest.setAssetId(ParamUtil.getLong(request, "assetId"));
		assetRequest.setDescription(ParamUtil.getString(request, "description"));

		AssetRequestLocalServiceUtil.bookAsset(themeDisplay, serviceContext, assetRequest);

		sendRedirect(request, response);
	}

	public void returnAsset(ActionRequest request, ActionResponse response) throws PortalException, SystemException, IOException {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(Asset.class.getName(), request);

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		long assetId = ParamUtil.getLong(request, "assetId");

		AssetRequestLocalServiceUtil.returnAsset(themeDisplay, serviceContext, assetId);

		sendRedirect(request, response);
	}

	public void receiveAsset(ActionRequest request, ActionResponse response) throws PortalException, SystemException, IOException {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(Asset.class.getName(), request);

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		long assetId = ParamUtil.getLong(request, "assetId");

		AssetRequestLocalServiceUtil.receiveAsset(themeDisplay, serviceContext, assetId);

		sendRedirect(request, response);
	}

	public void deleteAssetRequest(ActionRequest request, ActionResponse response) throws PortalException, SystemException, IOException {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(Asset.class.getName(), request);

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		long assetId = ParamUtil.getLong(request, "assetId");

		AssetRequest requestAsset = AssetRequestLocalServiceUtil.getUserAssetRequests(assetId, themeDisplay.getUserId(), "REQUESTED");

		AssetRequestLocalServiceUtil.deleteAssetRequest(themeDisplay, serviceContext, requestAsset.getAssetRequestId());

		sendRedirect(request, response);
	}

	public void rejectAssetRequest(ActionRequest request, ActionResponse response) throws PortalException, SystemException, IOException {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(Asset.class.getName(), request);

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		long assetId = ParamUtil.getLong(request, "assetId");

		AssetRequestLocalServiceUtil.rejectAssetRequest(themeDisplay, serviceContext, assetId);

		sendRedirect(request, response);
	}

	public void addAssetMessage(ActionRequest request, ActionResponse response) throws PortalException, SystemException, IOException {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(Asset.class.getName(), request);

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		AssetMessage assetMessage = AssetMessageLocalServiceUtil.createAssetMessage(0);

		assetMessage.setAssetId(ParamUtil.getLong(request, "assetId"));
		assetMessage.setToUserId(ParamUtil.getLong(request, "toUserId"));
		assetMessage.setMessage(ParamUtil.getString(request, "message"));

		AssetMessageLocalServiceUtil.addAssetMessage(themeDisplay, serviceContext, assetMessage, ParamUtil.getString(request, "messageType"));

		sendRedirect(request, response);
	}

	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException, PortletException {

		long assetId = ParamUtil.getLong(resourceRequest, "assetId");

		
		
		if (assetId > 0) {
			try {
				Asset asset = AssetLocalServiceUtil.getAsset(assetId);

				if (asset != null) {
					Blob image = asset.getPhoto();
					if (image != null && image.length() > 0) {
						byte[] imgData = image.getBytes(1, (int) image.length());
						resourceResponse.setContentType(asset.getMimeType());
						OutputStream o = resourceResponse.getPortletOutputStream();
						o.write(imgData);
						o.flush();
						o.close();
					} else {
						// return default image
						InputStream is = getPortletContext().getResourceAsStream("/images/no-preview-available.jpg");
						OutputStream o = resourceResponse.getPortletOutputStream();
						IOUtils.copy(is, o);

						o.flush();
						o.close();
					}
				}

			} catch (Exception e) {
				_log.error(e);
			}
		} else {

			super.serveResource(resourceRequest, resourceResponse);
		}
	}
	

	private static final Log _log = LogFactoryUtil.getLog(AssetPortlet.class);
}
