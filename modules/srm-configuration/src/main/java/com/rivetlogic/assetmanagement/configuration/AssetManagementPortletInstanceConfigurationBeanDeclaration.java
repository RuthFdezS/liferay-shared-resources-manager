package com.rivetlogic.assetmanagement.configuration;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.settings.definition.ConfigurationBeanDeclaration;

@Component
public class AssetManagementPortletInstanceConfigurationBeanDeclaration implements ConfigurationBeanDeclaration {

	@Override
	public Class<?> getConfigurationBeanClass() {
		return AssetManagementPortletInstanceConfiguration.class;
	}

}
