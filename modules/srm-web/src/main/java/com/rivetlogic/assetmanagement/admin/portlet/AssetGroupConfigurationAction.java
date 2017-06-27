package com.rivetlogic.assetmanagement.admin.portlet;

import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Modified;

import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;
import com.liferay.portal.kernel.portlet.BaseJSPSettingsConfigurationAction;
import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import com.rivetlogic.assetmanagement.configuration.AssetManagementGroupServiceConfiguration;
import com.rivetlogic.assetmanagement.keys.AssetKeys;

@Component(
    configurationPid = "com.rivetlogic.assetmanagement.configuration.AssetManagementGroupServiceConfiguration",
    configurationPolicy = ConfigurationPolicy.OPTIONAL,
    immediate = true,
    property = {
        "javax.portlet.name="+AssetKeys.MANAGEMENT_PORTLET_ID
    },
    service = ConfigurationAction.class
)
public class AssetGroupConfigurationAction extends BaseJSPSettingsConfigurationAction {
	@Override
    public void processAction(
            PortletConfig portletConfig, ActionRequest actionRequest,
            ActionResponse actionResponse)
        throws Exception {

        super.processAction(portletConfig, actionRequest, actionResponse);
    }

    @Override
    public void include(
        PortletConfig portletConfig, HttpServletRequest httpServletRequest,
        HttpServletResponse httpServletResponse) throws Exception {

        httpServletRequest.setAttribute(
            AssetManagementGroupServiceConfiguration.class.getName(),
            _assetGroupConfiguration);

        super.include(portletConfig, httpServletRequest, httpServletResponse);
    }

    @Activate
    @Modified
    protected void activate(Map<Object, Object> properties) {
        _assetGroupConfiguration = ConfigurableUtil.createConfigurable(
        		AssetManagementGroupServiceConfiguration.class, properties);
    }

    private volatile AssetManagementGroupServiceConfiguration _assetGroupConfiguration;
}
