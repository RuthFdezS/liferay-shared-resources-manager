package com.rivetlogic.assetmanagement.notifications;

import java.util.Locale;
import java.util.ResourceBundle;

import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.notifications.UserNotificationDefinition;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.ResourceBundleLoader;
import com.liferay.portal.kernel.util.ResourceBundleUtil;
import com.rivetlogic.assetmanagement.keys.AssetKeys;
import com.rivetlogic.assetmanagement.keys.AssetNotificationType;

public class BaseAssetUserNotificationDefinition extends UserNotificationDefinition {

	public BaseAssetUserNotificationDefinition(AssetNotificationType type, String description) {
		super(AssetKeys.PORTLET_ID, 0, type.ordinal(), description);
		_description = description;
	}

	@Override
	public String getDescription(Locale locale) {
		String languageId = LocaleUtil.toLanguageId(locale);

		ResourceBundle resourceBundle = resourceBundleLoader.loadResourceBundle(
				languageId);

		String description = ResourceBundleUtil.getString(
				resourceBundle, _description);

		if (description != null) {
			return description;
		}

		return _description;
	}

	@Reference(target = "(bundle.symbolic.name=com.rivetlogic.assetmanagement.language)")
	protected ResourceBundleLoader resourceBundleLoader;

	private final String _description;
}
