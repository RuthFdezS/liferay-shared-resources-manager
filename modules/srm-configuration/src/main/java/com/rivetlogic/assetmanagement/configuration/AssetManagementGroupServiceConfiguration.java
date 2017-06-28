package com.rivetlogic.assetmanagement.configuration;

import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;

import aQute.bnd.annotation.metatype.Meta;

/**
 * @author emmanuelabarca
 */
@ExtendedObjectClassDefinition(
		category = "other",
		scope=ExtendedObjectClassDefinition.Scope.GROUP
)
@Meta.OCD(
		id = "com.rivetlogic.assetmanagement.configuration.AssetManagementGroupServiceConfiguration",
		localization = "content/Language", name = "asset-management-group-config-name"
)
public interface AssetManagementGroupServiceConfiguration {
	@Meta.AD(
		required=false,
		name="configuration.time.name",
		deflt="1"
	)
	public int time();
	
	@Meta.AD(
		required=false,
		name="configuration.minutes.name",
		optionValues={"60","1440"},
		deflt="60"
	)
	public int minutes();
}
