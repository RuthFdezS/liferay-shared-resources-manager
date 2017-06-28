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

import com.rivetlogic.assetmanagement.model.Asset;
import com.rivetlogic.assetmanagement.model.AssetPhotoBlobModel;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for Asset. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see AssetLocalServiceUtil
 * @see com.rivetlogic.assetmanagement.service.base.AssetLocalServiceBaseImpl
 * @see com.rivetlogic.assetmanagement.service.impl.AssetLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface AssetLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AssetLocalServiceUtil} to access the asset local service. Add custom service methods to {@link com.rivetlogic.assetmanagement.service.impl.AssetLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
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
	* Adds the asset to the database. Also notifies the appropriate model listeners.
	*
	* @param asset the asset
	* @return the asset that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Asset addAsset(Asset asset);

	/**
	* Creates a new asset with the primary key. Does not add the asset to the database.
	*
	* @param assetId the primary key for the new asset
	* @return the new asset
	*/
	public Asset createAsset(long assetId);

	/**
	* Deletes the asset from the database. Also notifies the appropriate model listeners.
	*
	* @param asset the asset
	* @return the asset that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public Asset deleteAsset(Asset asset);

	/**
	* Deletes the asset with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetId the primary key of the asset
	* @return the asset that was removed
	* @throws PortalException if a asset with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public Asset deleteAsset(long assetId) throws PortalException;

	public Asset editAsset(ThemeDisplay themeDisplay,
		ServiceContext serviceContext, Asset asset) throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Asset fetchAsset(long assetId);

	/**
	* Returns the asset matching the UUID and group.
	*
	* @param uuid the asset's UUID
	* @param groupId the primary key of the group
	* @return the matching asset, or <code>null</code> if a matching asset could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Asset fetchAssetByUuidAndGroupId(java.lang.String uuid, long groupId);

	/**
	* Returns the asset with the primary key.
	*
	* @param assetId the primary key of the asset
	* @return the asset
	* @throws PortalException if a asset with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Asset getAsset(long assetId) throws PortalException;

	/**
	* Returns the asset matching the UUID and group.
	*
	* @param uuid the asset's UUID
	* @param groupId the primary key of the group
	* @return the matching asset
	* @throws PortalException if a matching asset could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Asset getAssetByUuidAndGroupId(java.lang.String uuid, long groupId)
		throws PortalException;

	/**
	* Updates the asset in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param asset the asset
	* @return the asset that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Asset updateAsset(Asset asset);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public AssetPhotoBlobModel getPhotoBlobModel(Serializable primaryKey);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getAssetsByUserCount(long groupId, long companyId, long userId,
		java.lang.String status) throws PortalException, SystemException;

	/**
	* Returns the number of assets.
	*
	* @return the number of assets
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getAssetsCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getAssetsCount(long groupId, long companyId,
		java.lang.String searchText, java.lang.String category,
		java.lang.String location);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getAvailableAssetsCount(long groupId, long companyId,
		java.lang.String searchText, java.lang.String category,
		java.lang.String location) throws PortalException, SystemException;

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the assets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assets
	* @param end the upper bound of the range of assets (not inclusive)
	* @return the range of assets
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Asset> getAssets(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Asset> getAssets(long groupId, long companyId, int start,
		int end, java.lang.String orderByColumn, java.lang.String orderByType,
		java.lang.String searchText, java.lang.String category,
		java.lang.String location);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Asset> getAssetsByUser(long groupId, long companyId,
		long userId, java.lang.String status, int start, int end,
		java.lang.String orderByColumn, java.lang.String orderByType)
		throws PortalException, SystemException;

	/**
	* Returns all the assets matching the UUID and company.
	*
	* @param uuid the UUID of the assets
	* @param companyId the primary key of the company
	* @return the matching assets, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Asset> getAssetsByUuidAndCompanyId(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of assets matching the UUID and company.
	*
	* @param uuid the UUID of the assets
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of assets
	* @param end the upper bound of the range of assets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching assets, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Asset> getAssetsByUuidAndCompanyId(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Asset> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Asset> getAvailableAssets(long groupId, long companyId,
		int start, int end, java.lang.String orderByColumn,
		java.lang.String orderByType, java.lang.String searchText,
		java.lang.String category, java.lang.String location)
		throws PortalException, SystemException;

	public long addAsset(ThemeDisplay themeDisplay,
		ServiceContext serviceContext, Asset asset) throws SystemException;

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
}