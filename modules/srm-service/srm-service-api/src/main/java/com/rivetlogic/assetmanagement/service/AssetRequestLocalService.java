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

import com.liferay.exportimport.kernel.lar.PortletDataContext;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.rivetlogic.assetmanagement.model.AssetRequest;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for AssetRequest. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see AssetRequestLocalServiceUtil
 * @see com.rivetlogic.assetmanagement.service.base.AssetRequestLocalServiceBaseImpl
 * @see com.rivetlogic.assetmanagement.service.impl.AssetRequestLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface AssetRequestLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AssetRequestLocalServiceUtil} to access the asset request local service. Add custom service methods to {@link com.rivetlogic.assetmanagement.service.impl.AssetRequestLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasUserAssetRequests(long assetId, long userId,
		java.lang.String status);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Adds the asset request to the database. Also notifies the appropriate model listeners.
	*
	* @param assetRequest the asset request
	* @return the asset request that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public AssetRequest addAssetRequest(AssetRequest assetRequest);

	public AssetRequest bookAsset(ThemeDisplay themeDisplay,
		ServiceContext serviceContext, AssetRequest requestedAsset)
		throws PortalException, SystemException;

	/**
	* Creates a new asset request with the primary key. Does not add the asset request to the database.
	*
	* @param assetRequestId the primary key for the new asset request
	* @return the new asset request
	*/
	public AssetRequest createAssetRequest(long assetRequestId);

	public AssetRequest deleteAssetRequest(ThemeDisplay themeDisplay,
		ServiceContext serviceContext, long assetRequestId)
		throws PortalException, SystemException;

	/**
	* Deletes the asset request from the database. Also notifies the appropriate model listeners.
	*
	* @param assetRequest the asset request
	* @return the asset request that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public AssetRequest deleteAssetRequest(AssetRequest assetRequest);

	/**
	* Deletes the asset request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetRequestId the primary key of the asset request
	* @return the asset request that was removed
	* @throws PortalException if a asset request with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public AssetRequest deleteAssetRequest(long assetRequestId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public AssetRequest fetchAssetRequest(long assetRequestId);

	/**
	* Returns the asset request matching the UUID and group.
	*
	* @param uuid the asset request's UUID
	* @param groupId the primary key of the group
	* @return the matching asset request, or <code>null</code> if a matching asset request could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public AssetRequest fetchAssetRequestByUuidAndGroupId(
		java.lang.String uuid, long groupId);

	/**
	* Returns the asset request with the primary key.
	*
	* @param assetRequestId the primary key of the asset request
	* @return the asset request
	* @throws PortalException if a asset request with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public AssetRequest getAssetRequest(long assetRequestId)
		throws PortalException;

	/**
	* Returns the asset request matching the UUID and group.
	*
	* @param uuid the asset request's UUID
	* @param groupId the primary key of the group
	* @return the matching asset request
	* @throws PortalException if a matching asset request could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public AssetRequest getAssetRequestByUuidAndGroupId(java.lang.String uuid,
		long groupId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public AssetRequest getRequestAssetByAssetId(long assetId,
		java.lang.String status);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public AssetRequest getRequestAssetByAssetId(long assetId, long userId,
		java.lang.String status);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public AssetRequest getUserAssetRequests(long assetId, long userId,
		java.lang.String status);

	public AssetRequest receiveAsset(ThemeDisplay themeDisplay,
		ServiceContext serviceContext, long assetId)
		throws PortalException, SystemException;

	public AssetRequest rejectAssetRequest(ThemeDisplay themeDisplay,
		ServiceContext serviceContext, long assetId)
		throws PortalException, SystemException;

	public AssetRequest returnAsset(ThemeDisplay themeDisplay,
		ServiceContext serviceContext, long assetId)
		throws PortalException, SystemException;

	/**
	* Updates the asset request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assetRequest the asset request
	* @return the asset request that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public AssetRequest updateAssetRequest(AssetRequest assetRequest);

	/**
	* Returns the number of asset requests.
	*
	* @return the number of asset requests
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getAssetRequestsCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getRequestsCountByAsset(long assetId);

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<AssetRequest> getAssetRequests(int start, int end);

	/**
	* Returns all the asset requests matching the UUID and company.
	*
	* @param uuid the UUID of the asset requests
	* @param companyId the primary key of the company
	* @return the matching asset requests, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<AssetRequest> getAssetRequestsByUuidAndCompanyId(
		java.lang.String uuid, long companyId);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<AssetRequest> getAssetRequestsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		OrderByComparator<AssetRequest> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<AssetRequest> getAssignedAssetsRequest();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<AssetRequest> getRequestsByAsset(long assetId, int start,
		int end, java.lang.String orderByColumn, java.lang.String orderByType);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	public void deleteAssetRequestByAssetId(long assetId)
		throws PortalException, SystemException;

	public void reassignAssets() throws PortalException, SystemException;
}