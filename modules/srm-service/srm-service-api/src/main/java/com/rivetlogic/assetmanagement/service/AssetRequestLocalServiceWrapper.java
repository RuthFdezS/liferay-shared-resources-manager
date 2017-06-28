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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AssetRequestLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AssetRequestLocalService
 * @generated
 */
@ProviderType
public class AssetRequestLocalServiceWrapper implements AssetRequestLocalService,
	ServiceWrapper<AssetRequestLocalService> {
	public AssetRequestLocalServiceWrapper(
		AssetRequestLocalService assetRequestLocalService) {
		_assetRequestLocalService = assetRequestLocalService;
	}

	@Override
	public boolean hasUserAssetRequests(long assetId, long userId,
		java.lang.String status) {
		return _assetRequestLocalService.hasUserAssetRequests(assetId, userId,
			status);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _assetRequestLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _assetRequestLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _assetRequestLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _assetRequestLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _assetRequestLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _assetRequestLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the asset request to the database. Also notifies the appropriate model listeners.
	*
	* @param assetRequest the asset request
	* @return the asset request that was added
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest addAssetRequest(
		com.rivetlogic.assetmanagement.model.AssetRequest assetRequest) {
		return _assetRequestLocalService.addAssetRequest(assetRequest);
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest bookAsset(
		com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay,
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		com.rivetlogic.assetmanagement.model.AssetRequest requestedAsset)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetRequestLocalService.bookAsset(themeDisplay,
			serviceContext, requestedAsset);
	}

	/**
	* Creates a new asset request with the primary key. Does not add the asset request to the database.
	*
	* @param assetRequestId the primary key for the new asset request
	* @return the new asset request
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest createAssetRequest(
		long assetRequestId) {
		return _assetRequestLocalService.createAssetRequest(assetRequestId);
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest deleteAssetRequest(
		com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay,
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long assetRequestId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetRequestLocalService.deleteAssetRequest(themeDisplay,
			serviceContext, assetRequestId);
	}

	/**
	* Deletes the asset request from the database. Also notifies the appropriate model listeners.
	*
	* @param assetRequest the asset request
	* @return the asset request that was removed
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest deleteAssetRequest(
		com.rivetlogic.assetmanagement.model.AssetRequest assetRequest) {
		return _assetRequestLocalService.deleteAssetRequest(assetRequest);
	}

	/**
	* Deletes the asset request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetRequestId the primary key of the asset request
	* @return the asset request that was removed
	* @throws PortalException if a asset request with the primary key could not be found
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest deleteAssetRequest(
		long assetRequestId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _assetRequestLocalService.deleteAssetRequest(assetRequestId);
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest fetchAssetRequest(
		long assetRequestId) {
		return _assetRequestLocalService.fetchAssetRequest(assetRequestId);
	}

	/**
	* Returns the asset request matching the UUID and group.
	*
	* @param uuid the asset request's UUID
	* @param groupId the primary key of the group
	* @return the matching asset request, or <code>null</code> if a matching asset request could not be found
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest fetchAssetRequestByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _assetRequestLocalService.fetchAssetRequestByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the asset request with the primary key.
	*
	* @param assetRequestId the primary key of the asset request
	* @return the asset request
	* @throws PortalException if a asset request with the primary key could not be found
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest getAssetRequest(
		long assetRequestId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _assetRequestLocalService.getAssetRequest(assetRequestId);
	}

	/**
	* Returns the asset request matching the UUID and group.
	*
	* @param uuid the asset request's UUID
	* @param groupId the primary key of the group
	* @return the matching asset request
	* @throws PortalException if a matching asset request could not be found
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest getAssetRequestByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _assetRequestLocalService.getAssetRequestByUuidAndGroupId(uuid,
			groupId);
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest getRequestAssetByAssetId(
		long assetId, java.lang.String status) {
		return _assetRequestLocalService.getRequestAssetByAssetId(assetId,
			status);
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest getRequestAssetByAssetId(
		long assetId, long userId, java.lang.String status) {
		return _assetRequestLocalService.getRequestAssetByAssetId(assetId,
			userId, status);
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest getUserAssetRequests(
		long assetId, long userId, java.lang.String status) {
		return _assetRequestLocalService.getUserAssetRequests(assetId, userId,
			status);
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest receiveAsset(
		com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay,
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long assetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetRequestLocalService.receiveAsset(themeDisplay,
			serviceContext, assetId);
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest rejectAssetRequest(
		com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay,
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long assetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetRequestLocalService.rejectAssetRequest(themeDisplay,
			serviceContext, assetId);
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest returnAsset(
		com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay,
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long assetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetRequestLocalService.returnAsset(themeDisplay,
			serviceContext, assetId);
	}

	/**
	* Updates the asset request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assetRequest the asset request
	* @return the asset request that was updated
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetRequest updateAssetRequest(
		com.rivetlogic.assetmanagement.model.AssetRequest assetRequest) {
		return _assetRequestLocalService.updateAssetRequest(assetRequest);
	}

	/**
	* Returns the number of asset requests.
	*
	* @return the number of asset requests
	*/
	@Override
	public int getAssetRequestsCount() {
		return _assetRequestLocalService.getAssetRequestsCount();
	}

	@Override
	public int getRequestsCountByAsset(long assetId) {
		return _assetRequestLocalService.getRequestsCountByAsset(assetId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _assetRequestLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _assetRequestLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _assetRequestLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _assetRequestLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the asset requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset requests
	* @param end the upper bound of the range of asset requests (not inclusive)
	* @return the range of asset requests
	*/
	@Override
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetRequest> getAssetRequests(
		int start, int end) {
		return _assetRequestLocalService.getAssetRequests(start, end);
	}

	/**
	* Returns all the asset requests matching the UUID and company.
	*
	* @param uuid the UUID of the asset requests
	* @param companyId the primary key of the company
	* @return the matching asset requests, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetRequest> getAssetRequestsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _assetRequestLocalService.getAssetRequestsByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of asset requests matching the UUID and company.
	*
	* @param uuid the UUID of the asset requests
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of asset requests
	* @param end the upper bound of the range of asset requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching asset requests, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetRequest> getAssetRequestsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.rivetlogic.assetmanagement.model.AssetRequest> orderByComparator) {
		return _assetRequestLocalService.getAssetRequestsByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetRequest> getAssignedAssetsRequest() {
		return _assetRequestLocalService.getAssignedAssetsRequest();
	}

	@Override
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetRequest> getRequestsByAsset(
		long assetId, int start, int end, java.lang.String orderByColumn,
		java.lang.String orderByType) {
		return _assetRequestLocalService.getRequestsByAsset(assetId, start,
			end, orderByColumn, orderByType);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _assetRequestLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _assetRequestLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public void deleteAssetRequestByAssetId(long assetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_assetRequestLocalService.deleteAssetRequestByAssetId(assetId);
	}

	@Override
	public void reassignAssets()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_assetRequestLocalService.reassignAssets();
	}

	@Override
	public AssetRequestLocalService getWrappedService() {
		return _assetRequestLocalService;
	}

	@Override
	public void setWrappedService(
		AssetRequestLocalService assetRequestLocalService) {
		_assetRequestLocalService = assetRequestLocalService;
	}

	private AssetRequestLocalService _assetRequestLocalService;
}