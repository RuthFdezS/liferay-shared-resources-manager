/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.rivetlogic.assetmanagement.service.impl;

import static com.rivetlogic.assetmanagement.keys.AssetNotificationsKeys.PORTLET_ID;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.module.configuration.ConfigurationException;
import com.liferay.portal.kernel.module.configuration.ConfigurationProvider;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserNotificationEventLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.rivetlogic.assetmanagement.configuration.AssetManagementGroupServiceConfiguration;
import com.rivetlogic.assetmanagement.keys.AssetNotificationsKeys;
import com.rivetlogic.assetmanagement.keys.AssetNotificationsKeys.NotificationType;
import com.rivetlogic.assetmanagement.model.Asset;
import com.rivetlogic.assetmanagement.model.AssetRequest;
import com.rivetlogic.assetmanagement.model.AssetStatus;
import com.rivetlogic.assetmanagement.service.AssetLocalServiceUtil;
import com.rivetlogic.assetmanagement.service.AssetRequestLocalServiceUtil;
import com.rivetlogic.assetmanagement.service.base.AssetRequestLocalServiceBaseImpl;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the asset request local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.rivetlogic.assetmanagement.service.AssetRequestLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetRequestLocalServiceBaseImpl
 * @see com.rivetlogic.assetmanagement.service.AssetRequestLocalServiceUtil
 */
@Component
@ProviderType
public class AssetRequestLocalServiceImpl
extends AssetRequestLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.rivetlogic.assetmanagement.service.AssetRequestLocalServiceUtil} to access the asset request local service.
	 */

	public AssetRequest bookAsset(ThemeDisplay themeDisplay, ServiceContext serviceContext, AssetRequest requestedAsset) throws SystemException,
	PortalException {

		long assetId = counterLocalService.increment(AssetRequest.class.getName());
		Date now = new Date();

		AssetRequest _assetRequest = assetRequestPersistence.create(assetId);
		Asset asset = AssetLocalServiceUtil.getAsset(requestedAsset.getAssetId());

		_assetRequest.setCompanyId(themeDisplay.getCompanyId());
		_assetRequest.setGroupId(themeDisplay.getScopeGroupId());
		_assetRequest.setUserId(themeDisplay.getUserId());

		_assetRequest.setCreateDate(now);
		_assetRequest.setModifiedDate(now);

		_assetRequest.setAssetId(requestedAsset.getAssetId());
		_assetRequest.setDescription(requestedAsset.getDescription());

		_assetRequest.setStatus("REQUESTED");
		_assetRequest.setRequestedDate(now);

		if (asset.getStatus().equals(AssetStatus.AVAILABLE.toString())) {
			_assetRequest.setStatus("BOOKED");
			_assetRequest.setAssingedDate(now);
			_assetRequest.setBookedDate(now);

			asset.setStatus(AssetStatus.BOOKED.toString());
			asset.setCurrentUserId(_assetRequest.getUserId());

			asset = assetPersistence.update(asset);
		}

		_assetRequest = assetRequestLocalService.addAssetRequest(_assetRequest);

		return _assetRequest;

	}

	public AssetRequest returnAsset(ThemeDisplay themeDisplay, ServiceContext serviceContext, long assetId) throws SystemException, PortalException {

		Date now = new Date();

		Asset asset = AssetLocalServiceUtil.getAsset(assetId);

		AssetRequest assetRequest = getRequestAssetByAssetId(assetId, themeDisplay.getUserId(), "BOOKED");

		assetRequest.setModifiedDate(now);
		assetRequest.setReturnedDate(now);
		assetRequest.setStatus("RETURNED");
		assetRequest = assetRequestLocalService.updateAssetRequest(assetRequest);

		asset.setStatus(AssetStatus.AVAILABLE.toString());
		asset.setCurrentUserId(0L);

		AssetRequest nextAssetRequest = getRequestAssetByAssetId(assetId, "REQUESTED");

		if (asset.getActive() && nextAssetRequest != null) {

			now = this.addSecond(now);

			nextAssetRequest.setStatus("ASSIGNED");
			nextAssetRequest.setModifiedDate(now);
			nextAssetRequest.setAssingedDate(now);

			nextAssetRequest = assetRequestLocalService.updateAssetRequest(nextAssetRequest);

			asset.setStatus(AssetStatus.ASSIGNED.toString());
			asset.setCurrentUserId(nextAssetRequest.getUserId());

			asset = assetPersistence.update(asset);

			sendNotificiationMessage(serviceContext, asset, nextAssetRequest, themeDisplay.getUserId(), NotificationType.ASSIGNED);

		} else {

			assetPersistence.update(asset);
		}

		return assetRequest;
	}

	public AssetRequest rejectAssetRequest(ThemeDisplay themeDisplay, ServiceContext serviceContext, long assetId) throws SystemException,
	PortalException {

		Date now = new Date();

		Asset asset = AssetLocalServiceUtil.getAsset(assetId);

		AssetRequest assetRequest = AssetRequestLocalServiceUtil.getUserAssetRequests(assetId, themeDisplay.getUserId(), "ASSIGNED");

		AssetRequestLocalServiceUtil.deleteAssetRequest(themeDisplay, serviceContext, assetRequest.getAssetRequestId());

		asset.setStatus(AssetStatus.AVAILABLE.toString());
		asset.setCurrentUserId(0L);

		AssetRequest nextAssetRequest = getRequestAssetByAssetId(assetId, "REQUESTED");

		if (asset.getActive() && nextAssetRequest != null) {

			now = this.addSecond(now);

			nextAssetRequest.setStatus("ASSIGNED");
			nextAssetRequest.setModifiedDate(now);
			nextAssetRequest.setAssingedDate(now);

			nextAssetRequest = assetRequestLocalService.updateAssetRequest(nextAssetRequest);

			asset.setStatus(AssetStatus.ASSIGNED.toString());
			asset.setCurrentUserId(nextAssetRequest.getUserId());

			asset = assetPersistence.update(asset);

			sendNotificiationMessage(serviceContext, asset, nextAssetRequest, themeDisplay.getUserId(), NotificationType.ASSIGNED);

		} else {

			assetPersistence.update(asset);
		}

		return nextAssetRequest;
	}

	public AssetRequest receiveAsset(ThemeDisplay themeDisplay, ServiceContext serviceContext, long assetId) throws SystemException, PortalException {

		Date now = new Date();

		Asset asset = AssetLocalServiceUtil.getAsset(assetId);

		AssetRequest assetRequest = getRequestAssetByAssetId(assetId, themeDisplay.getUserId(), "ASSIGNED");

		assetRequest.setModifiedDate(now);
		assetRequest.setBookedDate(now);
		assetRequest.setStatus("BOOKED");

		asset.setStatus(AssetStatus.BOOKED.toString());
		asset.setCurrentUserId(themeDisplay.getUserId());

		assetPersistence.update(asset);

		return assetRequestLocalService.updateAssetRequest(assetRequest);

	}

	public AssetRequest deleteAssetRequest(ThemeDisplay themeDisplay, ServiceContext serviceContext, long assetRequestId) throws SystemException,
	PortalException {
		// TODO: Check for erros, status and asset assigned user
		return assetRequestLocalService.deleteAssetRequest(assetRequestId);
	}

	@SuppressWarnings("unchecked")
	public void deleteAssetRequestByAssetId(long assetId) throws SystemException, PortalException {
		// TODO: Check for erros, status and asset assigned user
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(AssetRequest.class);

		dynamicQuery.add(PropertyFactoryUtil.forName("assetId").eq(assetId));

		List<AssetRequest> assetRequests = assetRequestPersistence.findWithDynamicQuery(dynamicQuery);

		for (AssetRequest assetRequest : assetRequests) {
			assetRequestLocalService.deleteAssetRequest(assetRequest.getAssetRequestId());
		}
	}

	@SuppressWarnings("unchecked")
	public AssetRequest getRequestAssetByAssetId(long assetId, long userId, String status) {

		AssetRequest assetRequest = null;

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(AssetRequest.class);

		dynamicQuery.add(PropertyFactoryUtil.forName("assetId").eq(assetId));

		dynamicQuery.add(PropertyFactoryUtil.forName("userId").eq(userId));

		dynamicQuery.add(PropertyFactoryUtil.forName("status").eq(status));

		dynamicQuery.addOrder(OrderFactoryUtil.asc("requestedDate"));

		try {
			List<AssetRequest> assetRequests = assetRequestPersistence.findWithDynamicQuery(dynamicQuery);
			assetRequest = assetRequests.get(0);
		} catch (SystemException e) {
			_log.error(e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			_log.error(e.getMessage());
		}

		return assetRequest;
	}

	@SuppressWarnings("unchecked")
	public AssetRequest getRequestAssetByAssetId(long assetId, String status) {

		AssetRequest assetRequest = null;

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(AssetRequest.class);

		dynamicQuery.add(PropertyFactoryUtil.forName("assetId").eq(assetId));

		dynamicQuery.add(PropertyFactoryUtil.forName("status").eq(status));

		dynamicQuery.addOrder(OrderFactoryUtil.asc("requestedDate"));

		try {
			List<AssetRequest> assetRequests = assetRequestPersistence.findWithDynamicQuery(dynamicQuery);
			assetRequest = assetRequests.get(0);
		} catch (SystemException e) {
			_log.error(e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			_log.error(e.getMessage());
		}

		return assetRequest;
	}

	@SuppressWarnings("unchecked")
	public boolean hasUserAssetRequests(long assetId, long userId, String status) {

		boolean hasAssetRequests = false;

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(AssetRequest.class);

		dynamicQuery.add(PropertyFactoryUtil.forName("assetId").eq(assetId));

		dynamicQuery.add(PropertyFactoryUtil.forName("userId").eq(userId));

		dynamicQuery.add(PropertyFactoryUtil.forName("status").eq(status));

		try {
			List<AssetRequest> assetRequests = assetRequestPersistence.findWithDynamicQuery(dynamicQuery);
			if (assetRequests.size() > 0) {
				hasAssetRequests = true;
			}
		} catch (SystemException e) {
			_log.error(e.getMessage());
		}

		return hasAssetRequests;
	}

	@SuppressWarnings("unchecked")
	public AssetRequest getUserAssetRequests(long assetId, long userId, String status) {

		AssetRequest assetRequest = null;

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(AssetRequest.class);

		dynamicQuery.add(PropertyFactoryUtil.forName("assetId").eq(assetId));

		dynamicQuery.add(PropertyFactoryUtil.forName("userId").eq(userId));

		dynamicQuery.add(PropertyFactoryUtil.forName("status").eq(status));

		try {
			List<AssetRequest> assetRequests = assetRequestPersistence.findWithDynamicQuery(dynamicQuery);
			assetRequest = assetRequests.get(0);
		} catch (SystemException e) {
			_log.error(e.getMessage());
		}

		return assetRequest;
	}

	@SuppressWarnings("unchecked")
	public List<AssetRequest> getRequestsByAsset(long assetId, int start, int end, String orderByColumn, String orderByType) {

		List<AssetRequest> myList = new ArrayList<AssetRequest>();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(AssetRequest.class);

		dynamicQuery.add(PropertyFactoryUtil.forName("assetId").eq(assetId));

		dynamicQuery.setLimit(start, end);

		dynamicQuery.addOrder(OrderFactoryUtil.desc("modifiedDate"));

		try {
			myList = assetRequestPersistence.findWithDynamicQuery(dynamicQuery);
		} catch (SystemException e) {
			_log.error(e.getMessage());
		}
		return myList;
	}

	public int getRequestsCountByAsset(long assetId) {

		int myList = 0;

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(AssetRequest.class);

		dynamicQuery.add(PropertyFactoryUtil.forName("assetId").eq(assetId));

		try {
			myList = (int) assetPersistence.countWithDynamicQuery(dynamicQuery);
		} catch (SystemException e) {
			_log.error(e.getMessage());
		}
		return myList;
	}

	public void reasignAssets() throws PortalException, SystemException {

		Date now = new Date();

		List<AssetRequest> requestAssets = this.getAssignedAssetsRequest();

		_log.info("Verifying " + requestAssets.size() + " Assets");

		for (AssetRequest requestAsset : requestAssets) {

			long groupId = requestAsset.getGroupId();

			try {

				AssetManagementGroupServiceConfiguration groupConfig = getGroupPreferences(groupId, PORTLET_ID);

				int time = groupConfig.time();
				int minutes = groupConfig.minutes();

				int fullTime = time * minutes;

				if (fullTime != 0) {

					Date assingedDate = requestAsset.getAssingedDate();

					Calendar today = Calendar.getInstance();
					today.setTime(assingedDate);
					today.add(Calendar.MINUTE, fullTime);

					Date date = today.getTime();

					if (date.before(now)) {

						Asset asset = AssetLocalServiceUtil.getAsset(requestAsset.getAssetId());

						_log.info("Reassigning Asset with ID: " + asset.getAssetId());

						requestAsset.setReturnedDate(now);
						requestAsset.setModifiedDate(now);
						requestAsset.setStatus("RETURNED");
						assetRequestLocalService.updateAssetRequest(requestAsset);

						AssetRequest nextAssetRequest = getRequestAssetByAssetId(asset.getAssetId(), "REQUESTED");

						if (asset.getActive() && nextAssetRequest != null) {

							nextAssetRequest.setStatus("ASSIGNED");
							nextAssetRequest.setModifiedDate(now);
							nextAssetRequest.setAssingedDate(now);

							nextAssetRequest = assetRequestLocalService.updateAssetRequest(nextAssetRequest);

							asset.setStatus(AssetStatus.ASSIGNED.toString());
							asset.setCurrentUserId(nextAssetRequest.getUserId());

							asset = assetPersistence.update(asset);

							// Send notification
							ServiceContext serviceContext = new ServiceContext();
							serviceContext.setScopeGroupId(groupId);

							sendNotificiationMessage(serviceContext, asset, nextAssetRequest, requestAsset.getUserId(), NotificationType.ASSIGNED);

						} else {
							asset.setStatus(AssetStatus.AVAILABLE.toString());
							asset.setCurrentUserId(0L);
							assetPersistence.update(asset);
						}

					}
				}
			} catch (Exception e) {
				_log.info("Error reasigning asset: \n" + e.getMessage());
			}

		}
	}

	private AssetManagementGroupServiceConfiguration getGroupPreferences(long groupId, String portletId) throws ConfigurationException {
		AssetManagementGroupServiceConfiguration groupConfig = _configurationProvider.getGroupConfiguration(
                AssetManagementGroupServiceConfiguration.class, groupId);
		return groupConfig;
	}

	@SuppressWarnings("unchecked")
	public List<AssetRequest> getAssignedAssetsRequest() {

		List<AssetRequest> myList = new ArrayList<AssetRequest>();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(AssetRequest.class);

		dynamicQuery.add(PropertyFactoryUtil.forName("status").eq("ASSIGNED"));

		try {
			myList = assetRequestPersistence.findWithDynamicQuery(dynamicQuery);
		} catch (SystemException e) {
			_log.error(e.getMessage());
		}
		return myList;
	}

	private Date addSecond(Date date) {

		Calendar today = Calendar.getInstance();
		today.setTime(date);
		today.add(Calendar.SECOND, 1);

		return today.getTime();

	}

	private void sendNotificiationMessage(ServiceContext serviceContext, Asset asset, AssetRequest assetRequest, long returnedUserId,
			String notificationType) throws PortalException, SystemException {

		JSONObject notificationEventJSONObject = JSONFactoryUtil.createJSONObject();

		notificationEventJSONObject.put("notificationType", notificationType);

		notificationEventJSONObject.put("returnedUserId", returnedUserId);

		notificationEventJSONObject.put("assetId", asset.getAssetId());
		notificationEventJSONObject.put("assetName", asset.getName());

		notificationEventJSONObject.put("assetRequestId", assetRequest.getAssetRequestId());

		UserNotificationEventLocalServiceUtil.addUserNotificationEvent(assetRequest.getUserId(), AssetNotificationsKeys.PORTLET_ID,
				new Date().getTime(), returnedUserId, notificationEventJSONObject.toString(), false, serviceContext);

	}
	
	@Reference
    private ConfigurationProvider _configurationProvider;
	
	private static final Log _log = LogFactoryUtil.getLog(AssetRequestLocalServiceImpl.class);
}