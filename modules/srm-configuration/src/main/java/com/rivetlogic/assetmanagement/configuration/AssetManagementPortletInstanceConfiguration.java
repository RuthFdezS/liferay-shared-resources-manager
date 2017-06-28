package com.rivetlogic.assetmanagement.configuration;

import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;

import aQute.bnd.annotation.metatype.Meta;

/**
 * @author emmanuelabarca
 */
@ExtendedObjectClassDefinition(
		category = "other",
		scope=ExtendedObjectClassDefinition.Scope.PORTLET_INSTANCE
)
@Meta.OCD(
		id = "com.rivetlogic.assetmanagement.configuration.AssetManagementPortletInstanceConfiguration",
		localization = "content/Language", name = "asset-management-portlet-config-name"
)
public interface AssetManagementPortletInstanceConfiguration {
	public static enum AssetsTabs{
		MY_ASSETS_TAB("my-assets"), ALL_ASSETS_TAB("all-assets");
		
		private AssetsTabs(String tabName){
			this.tabName = tabName;
		}
		public String getTabName(){ return tabName; }
		protected String tabName;
	}
	@Meta.AD(
		deflt = "MY_ASSETS_TAB",
		required=false,
		name="configuration.default-open-tab.name"
	)
	public AssetsTabs defaultOpenedTab();
}
