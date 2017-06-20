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

package com.rivetlogic.assetmanagement.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for AssetLocation. This utility wraps
 * {@link com.rivetlogic.assetmanagement.service.impl.AssetLocationLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AssetLocationLocalService
 * @see com.rivetlogic.assetmanagement.service.base.AssetLocationLocalServiceBaseImpl
 * @see com.rivetlogic.assetmanagement.service.impl.AssetLocationLocalServiceImpl
 * @generated
 */
@ProviderType
public class AssetLocationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.rivetlogic.assetmanagement.service.impl.AssetLocationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	public static com.rivetlogic.assetmanagement.model.AssetLocation addAssetLocation(
		com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay,
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		com.rivetlogic.assetmanagement.model.AssetLocation AssetLocation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addAssetLocation(themeDisplay, serviceContext, AssetLocation);
	}

	/**
	* Adds the asset location to the database. Also notifies the appropriate model listeners.
	*
	* @param assetLocation the asset location
	* @return the asset location that was added
	*/
	public static com.rivetlogic.assetmanagement.model.AssetLocation addAssetLocation(
		com.rivetlogic.assetmanagement.model.AssetLocation assetLocation) {
		return getService().addAssetLocation(assetLocation);
	}

	/**
	* Creates a new asset location with the primary key. Does not add the asset location to the database.
	*
	* @param assetLocationId the primary key for the new asset location
	* @return the new asset location
	*/
	public static com.rivetlogic.assetmanagement.model.AssetLocation createAssetLocation(
		long assetLocationId) {
		return getService().createAssetLocation(assetLocationId);
	}

	/**
	* Deletes the asset location from the database. Also notifies the appropriate model listeners.
	*
	* @param assetLocation the asset location
	* @return the asset location that was removed
	*/
	public static com.rivetlogic.assetmanagement.model.AssetLocation deleteAssetLocation(
		com.rivetlogic.assetmanagement.model.AssetLocation assetLocation) {
		return getService().deleteAssetLocation(assetLocation);
	}

	/**
	* Deletes the asset location with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetLocationId the primary key of the asset location
	* @return the asset location that was removed
	* @throws PortalException if a asset location with the primary key could not be found
	*/
	public static com.rivetlogic.assetmanagement.model.AssetLocation deleteAssetLocation(
		long assetLocationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteAssetLocation(assetLocationId);
	}

	public static com.rivetlogic.assetmanagement.model.AssetLocation fetchAssetLocation(
		long assetLocationId) {
		return getService().fetchAssetLocation(assetLocationId);
	}

	/**
	* Returns the asset location matching the UUID and group.
	*
	* @param uuid the asset location's UUID
	* @param groupId the primary key of the group
	* @return the matching asset location, or <code>null</code> if a matching asset location could not be found
	*/
	public static com.rivetlogic.assetmanagement.model.AssetLocation fetchAssetLocationByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchAssetLocationByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the asset location with the primary key.
	*
	* @param assetLocationId the primary key of the asset location
	* @return the asset location
	* @throws PortalException if a asset location with the primary key could not be found
	*/
	public static com.rivetlogic.assetmanagement.model.AssetLocation getAssetLocation(
		long assetLocationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getAssetLocation(assetLocationId);
	}

	/**
	* Returns the asset location matching the UUID and group.
	*
	* @param uuid the asset location's UUID
	* @param groupId the primary key of the group
	* @return the matching asset location
	* @throws PortalException if a matching asset location could not be found
	*/
	public static com.rivetlogic.assetmanagement.model.AssetLocation getAssetLocationByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getAssetLocationByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the asset location in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assetLocation the asset location
	* @return the asset location that was updated
	*/
	public static com.rivetlogic.assetmanagement.model.AssetLocation updateAssetLocation(
		com.rivetlogic.assetmanagement.model.AssetLocation assetLocation) {
		return getService().updateAssetLocation(assetLocation);
	}

	/**
	* Returns the number of asset locations.
	*
	* @return the number of asset locations
	*/
	public static int getAssetLocationsCount() {
		return getService().getAssetLocationsCount();
	}

	public static int getAssetLocationsCount(long groupId, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAssetLocationsCount(groupId, companyId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the asset locations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @return the range of asset locations
	*/
	public static java.util.List<com.rivetlogic.assetmanagement.model.AssetLocation> getAssetLocations(
		int start, int end) {
		return getService().getAssetLocations(start, end);
	}

	public static java.util.List<com.rivetlogic.assetmanagement.model.AssetLocation> getAssetLocations(
		long groupId, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAssetLocations(groupId, companyId, start, end);
	}

	/**
	* Returns all the asset locations matching the UUID and company.
	*
	* @param uuid the UUID of the asset locations
	* @param companyId the primary key of the company
	* @return the matching asset locations, or an empty list if no matches were found
	*/
	public static java.util.List<com.rivetlogic.assetmanagement.model.AssetLocation> getAssetLocationsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getAssetLocationsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of asset locations matching the UUID and company.
	*
	* @param uuid the UUID of the asset locations
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching asset locations, or an empty list if no matches were found
	*/
	public static java.util.List<com.rivetlogic.assetmanagement.model.AssetLocation> getAssetLocationsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.rivetlogic.assetmanagement.model.AssetLocation> orderByComparator) {
		return getService()
				   .getAssetLocationsByUuidAndCompanyId(uuid, companyId, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static AssetLocationLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AssetLocationLocalService, AssetLocationLocalService> _serviceTracker =
		ServiceTrackerFactory.open(AssetLocationLocalService.class);
}