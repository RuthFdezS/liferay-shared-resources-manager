package com.rivetlogic.assetmanagement.notifications;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.model.UserNotificationDeliveryConstants;
import com.liferay.portal.kernel.notifications.UserNotificationDefinition;
import com.liferay.portal.kernel.notifications.UserNotificationDeliveryType;
import com.rivetlogic.assetmanagement.keys.AssetKeys;
import com.rivetlogic.assetmanagement.keys.AssetNotificationType;

@Component(
		immediate = true,
		property = {"javax.portlet.name=" + AssetKeys.PORTLET_ID},
		service = UserNotificationDefinition.class
)
public class AssetAssignedUserNotificationDefinition extends UserNotificationDefinition {
	public AssetAssignedUserNotificationDefinition(){
		super(AssetKeys.PORTLET_ID, 0,
				AssetNotificationType.ASSIGNED.ordinal(),
				"notifications-when-a-resource-can-be-booked-by-you");

		addUserNotificationDeliveryType( new UserNotificationDeliveryType(
				"email", UserNotificationDeliveryConstants.TYPE_EMAIL, true,
				true));
		addUserNotificationDeliveryType( new UserNotificationDeliveryType(
				"website", UserNotificationDeliveryConstants.TYPE_WEBSITE, true,
				true));
	}
}
