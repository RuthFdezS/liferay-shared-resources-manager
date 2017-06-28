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

package com.rivetlogic.assetmanagement.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.rivetlogic.assetmanagement.model.Asset;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the asset service. This utility wraps {@link com.rivetlogic.assetmanagement.service.persistence.impl.AssetPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetPersistence
 * @see com.rivetlogic.assetmanagement.service.persistence.impl.AssetPersistenceImpl
 * @generated
 */
@ProviderType
public class AssetUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Asset asset) {
		getPersistence().clearCache(asset);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Asset> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Asset> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Asset> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Asset> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Asset update(Asset asset) {
		return getPersistence().update(asset);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Asset update(Asset asset, ServiceContext serviceContext) {
		return getPersistence().update(asset, serviceContext);
	}

	/**
	* Returns all the assets where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching assets
	*/
	public static List<Asset> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the assets where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of assets
	* @param end the upper bound of the range of assets (not inclusive)
	* @return the range of matching assets
	*/
	public static List<Asset> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the assets where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of assets
	* @param end the upper bound of the range of assets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assets
	*/
	public static List<Asset> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Asset> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the assets where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of assets
	* @param end the upper bound of the range of assets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching assets
	*/
	public static List<Asset> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Asset> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first asset in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset
	* @throws NoSuchAssetException if a matching asset could not be found
	*/
	public static Asset findByUuid_First(java.lang.String uuid,
		OrderByComparator<Asset> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first asset in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset, or <code>null</code> if a matching asset could not be found
	*/
	public static Asset fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<Asset> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last asset in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset
	* @throws NoSuchAssetException if a matching asset could not be found
	*/
	public static Asset findByUuid_Last(java.lang.String uuid,
		OrderByComparator<Asset> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last asset in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset, or <code>null</code> if a matching asset could not be found
	*/
	public static Asset fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<Asset> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the assets before and after the current asset in the ordered set where uuid = &#63;.
	*
	* @param assetId the primary key of the current asset
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset
	* @throws NoSuchAssetException if a asset with the primary key could not be found
	*/
	public static Asset[] findByUuid_PrevAndNext(long assetId,
		java.lang.String uuid, OrderByComparator<Asset> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetException {
		return getPersistence()
				   .findByUuid_PrevAndNext(assetId, uuid, orderByComparator);
	}

	/**
	* Removes all the assets where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of assets where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching assets
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the asset where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchAssetException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching asset
	* @throws NoSuchAssetException if a matching asset could not be found
	*/
	public static Asset findByUUID_G(java.lang.String uuid, long groupId)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the asset where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching asset, or <code>null</code> if a matching asset could not be found
	*/
	public static Asset fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the asset where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching asset, or <code>null</code> if a matching asset could not be found
	*/
	public static Asset fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the asset where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the asset that was removed
	*/
	public static Asset removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of assets where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching assets
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the assets where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching assets
	*/
	public static List<Asset> findByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the assets where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of assets
	* @param end the upper bound of the range of assets (not inclusive)
	* @return the range of matching assets
	*/
	public static List<Asset> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the assets where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of assets
	* @param end the upper bound of the range of assets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assets
	*/
	public static List<Asset> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Asset> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the assets where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of assets
	* @param end the upper bound of the range of assets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching assets
	*/
	public static List<Asset> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Asset> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first asset in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset
	* @throws NoSuchAssetException if a matching asset could not be found
	*/
	public static Asset findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Asset> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first asset in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset, or <code>null</code> if a matching asset could not be found
	*/
	public static Asset fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Asset> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last asset in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset
	* @throws NoSuchAssetException if a matching asset could not be found
	*/
	public static Asset findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Asset> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last asset in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset, or <code>null</code> if a matching asset could not be found
	*/
	public static Asset fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Asset> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the assets before and after the current asset in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param assetId the primary key of the current asset
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset
	* @throws NoSuchAssetException if a asset with the primary key could not be found
	*/
	public static Asset[] findByUuid_C_PrevAndNext(long assetId,
		java.lang.String uuid, long companyId,
		OrderByComparator<Asset> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(assetId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the assets where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of assets where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching assets
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the assets where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching assets
	*/
	public static List<Asset> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the assets where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of assets
	* @param end the upper bound of the range of assets (not inclusive)
	* @return the range of matching assets
	*/
	public static List<Asset> findByGroupId(long groupId, int start, int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the assets where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of assets
	* @param end the upper bound of the range of assets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assets
	*/
	public static List<Asset> findByGroupId(long groupId, int start, int end,
		OrderByComparator<Asset> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the assets where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of assets
	* @param end the upper bound of the range of assets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching assets
	*/
	public static List<Asset> findByGroupId(long groupId, int start, int end,
		OrderByComparator<Asset> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first asset in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset
	* @throws NoSuchAssetException if a matching asset could not be found
	*/
	public static Asset findByGroupId_First(long groupId,
		OrderByComparator<Asset> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first asset in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset, or <code>null</code> if a matching asset could not be found
	*/
	public static Asset fetchByGroupId_First(long groupId,
		OrderByComparator<Asset> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last asset in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset
	* @throws NoSuchAssetException if a matching asset could not be found
	*/
	public static Asset findByGroupId_Last(long groupId,
		OrderByComparator<Asset> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last asset in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset, or <code>null</code> if a matching asset could not be found
	*/
	public static Asset fetchByGroupId_Last(long groupId,
		OrderByComparator<Asset> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the assets before and after the current asset in the ordered set where groupId = &#63;.
	*
	* @param assetId the primary key of the current asset
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset
	* @throws NoSuchAssetException if a asset with the primary key could not be found
	*/
	public static Asset[] findByGroupId_PrevAndNext(long assetId, long groupId,
		OrderByComparator<Asset> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(assetId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the assets where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of assets where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching assets
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the assets where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching assets
	*/
	public static List<Asset> findByCompanyGroup(long companyId, long groupId) {
		return getPersistence().findByCompanyGroup(companyId, groupId);
	}

	/**
	* Returns a range of all the assets where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of assets
	* @param end the upper bound of the range of assets (not inclusive)
	* @return the range of matching assets
	*/
	public static List<Asset> findByCompanyGroup(long companyId, long groupId,
		int start, int end) {
		return getPersistence()
				   .findByCompanyGroup(companyId, groupId, start, end);
	}

	/**
	* Returns an ordered range of all the assets where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of assets
	* @param end the upper bound of the range of assets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assets
	*/
	public static List<Asset> findByCompanyGroup(long companyId, long groupId,
		int start, int end, OrderByComparator<Asset> orderByComparator) {
		return getPersistence()
				   .findByCompanyGroup(companyId, groupId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the assets where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of assets
	* @param end the upper bound of the range of assets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching assets
	*/
	public static List<Asset> findByCompanyGroup(long companyId, long groupId,
		int start, int end, OrderByComparator<Asset> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCompanyGroup(companyId, groupId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first asset in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset
	* @throws NoSuchAssetException if a matching asset could not be found
	*/
	public static Asset findByCompanyGroup_First(long companyId, long groupId,
		OrderByComparator<Asset> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetException {
		return getPersistence()
				   .findByCompanyGroup_First(companyId, groupId,
			orderByComparator);
	}

	/**
	* Returns the first asset in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset, or <code>null</code> if a matching asset could not be found
	*/
	public static Asset fetchByCompanyGroup_First(long companyId, long groupId,
		OrderByComparator<Asset> orderByComparator) {
		return getPersistence()
				   .fetchByCompanyGroup_First(companyId, groupId,
			orderByComparator);
	}

	/**
	* Returns the last asset in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset
	* @throws NoSuchAssetException if a matching asset could not be found
	*/
	public static Asset findByCompanyGroup_Last(long companyId, long groupId,
		OrderByComparator<Asset> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetException {
		return getPersistence()
				   .findByCompanyGroup_Last(companyId, groupId,
			orderByComparator);
	}

	/**
	* Returns the last asset in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset, or <code>null</code> if a matching asset could not be found
	*/
	public static Asset fetchByCompanyGroup_Last(long companyId, long groupId,
		OrderByComparator<Asset> orderByComparator) {
		return getPersistence()
				   .fetchByCompanyGroup_Last(companyId, groupId,
			orderByComparator);
	}

	/**
	* Returns the assets before and after the current asset in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param assetId the primary key of the current asset
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset
	* @throws NoSuchAssetException if a asset with the primary key could not be found
	*/
	public static Asset[] findByCompanyGroup_PrevAndNext(long assetId,
		long companyId, long groupId, OrderByComparator<Asset> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetException {
		return getPersistence()
				   .findByCompanyGroup_PrevAndNext(assetId, companyId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the assets where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	*/
	public static void removeByCompanyGroup(long companyId, long groupId) {
		getPersistence().removeByCompanyGroup(companyId, groupId);
	}

	/**
	* Returns the number of assets where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching assets
	*/
	public static int countByCompanyGroup(long companyId, long groupId) {
		return getPersistence().countByCompanyGroup(companyId, groupId);
	}

	/**
	* Returns all the assets where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @return the matching assets
	*/
	public static List<Asset> findByCompanyGroupUser(long companyId,
		long groupId, long userId) {
		return getPersistence()
				   .findByCompanyGroupUser(companyId, groupId, userId);
	}

	/**
	* Returns a range of all the assets where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of assets
	* @param end the upper bound of the range of assets (not inclusive)
	* @return the range of matching assets
	*/
	public static List<Asset> findByCompanyGroupUser(long companyId,
		long groupId, long userId, int start, int end) {
		return getPersistence()
				   .findByCompanyGroupUser(companyId, groupId, userId, start,
			end);
	}

	/**
	* Returns an ordered range of all the assets where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of assets
	* @param end the upper bound of the range of assets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assets
	*/
	public static List<Asset> findByCompanyGroupUser(long companyId,
		long groupId, long userId, int start, int end,
		OrderByComparator<Asset> orderByComparator) {
		return getPersistence()
				   .findByCompanyGroupUser(companyId, groupId, userId, start,
			end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the assets where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of assets
	* @param end the upper bound of the range of assets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching assets
	*/
	public static List<Asset> findByCompanyGroupUser(long companyId,
		long groupId, long userId, int start, int end,
		OrderByComparator<Asset> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByCompanyGroupUser(companyId, groupId, userId, start,
			end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first asset in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset
	* @throws NoSuchAssetException if a matching asset could not be found
	*/
	public static Asset findByCompanyGroupUser_First(long companyId,
		long groupId, long userId, OrderByComparator<Asset> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetException {
		return getPersistence()
				   .findByCompanyGroupUser_First(companyId, groupId, userId,
			orderByComparator);
	}

	/**
	* Returns the first asset in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset, or <code>null</code> if a matching asset could not be found
	*/
	public static Asset fetchByCompanyGroupUser_First(long companyId,
		long groupId, long userId, OrderByComparator<Asset> orderByComparator) {
		return getPersistence()
				   .fetchByCompanyGroupUser_First(companyId, groupId, userId,
			orderByComparator);
	}

	/**
	* Returns the last asset in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset
	* @throws NoSuchAssetException if a matching asset could not be found
	*/
	public static Asset findByCompanyGroupUser_Last(long companyId,
		long groupId, long userId, OrderByComparator<Asset> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetException {
		return getPersistence()
				   .findByCompanyGroupUser_Last(companyId, groupId, userId,
			orderByComparator);
	}

	/**
	* Returns the last asset in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset, or <code>null</code> if a matching asset could not be found
	*/
	public static Asset fetchByCompanyGroupUser_Last(long companyId,
		long groupId, long userId, OrderByComparator<Asset> orderByComparator) {
		return getPersistence()
				   .fetchByCompanyGroupUser_Last(companyId, groupId, userId,
			orderByComparator);
	}

	/**
	* Returns the assets before and after the current asset in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param assetId the primary key of the current asset
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset
	* @throws NoSuchAssetException if a asset with the primary key could not be found
	*/
	public static Asset[] findByCompanyGroupUser_PrevAndNext(long assetId,
		long companyId, long groupId, long userId,
		OrderByComparator<Asset> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetException {
		return getPersistence()
				   .findByCompanyGroupUser_PrevAndNext(assetId, companyId,
			groupId, userId, orderByComparator);
	}

	/**
	* Removes all the assets where companyId = &#63; and groupId = &#63; and userId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	*/
	public static void removeByCompanyGroupUser(long companyId, long groupId,
		long userId) {
		getPersistence().removeByCompanyGroupUser(companyId, groupId, userId);
	}

	/**
	* Returns the number of assets where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @return the number of matching assets
	*/
	public static int countByCompanyGroupUser(long companyId, long groupId,
		long userId) {
		return getPersistence()
				   .countByCompanyGroupUser(companyId, groupId, userId);
	}

	/**
	* Caches the asset in the entity cache if it is enabled.
	*
	* @param asset the asset
	*/
	public static void cacheResult(Asset asset) {
		getPersistence().cacheResult(asset);
	}

	/**
	* Caches the assets in the entity cache if it is enabled.
	*
	* @param assets the assets
	*/
	public static void cacheResult(List<Asset> assets) {
		getPersistence().cacheResult(assets);
	}

	/**
	* Creates a new asset with the primary key. Does not add the asset to the database.
	*
	* @param assetId the primary key for the new asset
	* @return the new asset
	*/
	public static Asset create(long assetId) {
		return getPersistence().create(assetId);
	}

	/**
	* Removes the asset with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetId the primary key of the asset
	* @return the asset that was removed
	* @throws NoSuchAssetException if a asset with the primary key could not be found
	*/
	public static Asset remove(long assetId)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetException {
		return getPersistence().remove(assetId);
	}

	public static Asset updateImpl(Asset asset) {
		return getPersistence().updateImpl(asset);
	}

	/**
	* Returns the asset with the primary key or throws a {@link NoSuchAssetException} if it could not be found.
	*
	* @param assetId the primary key of the asset
	* @return the asset
	* @throws NoSuchAssetException if a asset with the primary key could not be found
	*/
	public static Asset findByPrimaryKey(long assetId)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetException {
		return getPersistence().findByPrimaryKey(assetId);
	}

	/**
	* Returns the asset with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param assetId the primary key of the asset
	* @return the asset, or <code>null</code> if a asset with the primary key could not be found
	*/
	public static Asset fetchByPrimaryKey(long assetId) {
		return getPersistence().fetchByPrimaryKey(assetId);
	}

	public static java.util.Map<java.io.Serializable, Asset> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the assets.
	*
	* @return the assets
	*/
	public static List<Asset> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the assets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assets
	* @param end the upper bound of the range of assets (not inclusive)
	* @return the range of assets
	*/
	public static List<Asset> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the assets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assets
	* @param end the upper bound of the range of assets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of assets
	*/
	public static List<Asset> findAll(int start, int end,
		OrderByComparator<Asset> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the assets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assets
	* @param end the upper bound of the range of assets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of assets
	*/
	public static List<Asset> findAll(int start, int end,
		OrderByComparator<Asset> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the assets from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of assets.
	*
	* @return the number of assets
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static AssetPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AssetPersistence, AssetPersistence> _serviceTracker =
		ServiceTrackerFactory.open(AssetPersistence.class);
}