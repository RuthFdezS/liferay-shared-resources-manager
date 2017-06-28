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

import com.rivetlogic.assetmanagement.model.AssetRequest;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the asset request service. This utility wraps {@link com.rivetlogic.assetmanagement.service.persistence.impl.AssetRequestPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetRequestPersistence
 * @see com.rivetlogic.assetmanagement.service.persistence.impl.AssetRequestPersistenceImpl
 * @generated
 */
@ProviderType
public class AssetRequestUtil {
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
	public static void clearCache(AssetRequest assetRequest) {
		getPersistence().clearCache(assetRequest);
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
	public static List<AssetRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AssetRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AssetRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AssetRequest> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AssetRequest update(AssetRequest assetRequest) {
		return getPersistence().update(assetRequest);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AssetRequest update(AssetRequest assetRequest,
		ServiceContext serviceContext) {
		return getPersistence().update(assetRequest, serviceContext);
	}

	/**
	* Returns all the asset requests where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching asset requests
	*/
	public static List<AssetRequest> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the asset requests where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of asset requests
	* @param end the upper bound of the range of asset requests (not inclusive)
	* @return the range of matching asset requests
	*/
	public static List<AssetRequest> findByUuid(java.lang.String uuid,
		int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the asset requests where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of asset requests
	* @param end the upper bound of the range of asset requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching asset requests
	*/
	public static List<AssetRequest> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<AssetRequest> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the asset requests where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of asset requests
	* @param end the upper bound of the range of asset requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching asset requests
	*/
	public static List<AssetRequest> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<AssetRequest> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first asset request in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset request
	* @throws NoSuchAssetRequestException if a matching asset request could not be found
	*/
	public static AssetRequest findByUuid_First(java.lang.String uuid,
		OrderByComparator<AssetRequest> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetRequestException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first asset request in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset request, or <code>null</code> if a matching asset request could not be found
	*/
	public static AssetRequest fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<AssetRequest> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last asset request in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset request
	* @throws NoSuchAssetRequestException if a matching asset request could not be found
	*/
	public static AssetRequest findByUuid_Last(java.lang.String uuid,
		OrderByComparator<AssetRequest> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetRequestException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last asset request in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset request, or <code>null</code> if a matching asset request could not be found
	*/
	public static AssetRequest fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<AssetRequest> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the asset requests before and after the current asset request in the ordered set where uuid = &#63;.
	*
	* @param assetRequestId the primary key of the current asset request
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset request
	* @throws NoSuchAssetRequestException if a asset request with the primary key could not be found
	*/
	public static AssetRequest[] findByUuid_PrevAndNext(long assetRequestId,
		java.lang.String uuid, OrderByComparator<AssetRequest> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetRequestException {
		return getPersistence()
				   .findByUuid_PrevAndNext(assetRequestId, uuid,
			orderByComparator);
	}

	/**
	* Removes all the asset requests where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of asset requests where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching asset requests
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the asset request where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchAssetRequestException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching asset request
	* @throws NoSuchAssetRequestException if a matching asset request could not be found
	*/
	public static AssetRequest findByUUID_G(java.lang.String uuid, long groupId)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetRequestException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the asset request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching asset request, or <code>null</code> if a matching asset request could not be found
	*/
	public static AssetRequest fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the asset request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching asset request, or <code>null</code> if a matching asset request could not be found
	*/
	public static AssetRequest fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the asset request where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the asset request that was removed
	*/
	public static AssetRequest removeByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetRequestException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of asset requests where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching asset requests
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the asset requests where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching asset requests
	*/
	public static List<AssetRequest> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the asset requests where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of asset requests
	* @param end the upper bound of the range of asset requests (not inclusive)
	* @return the range of matching asset requests
	*/
	public static List<AssetRequest> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the asset requests where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of asset requests
	* @param end the upper bound of the range of asset requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching asset requests
	*/
	public static List<AssetRequest> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<AssetRequest> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the asset requests where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of asset requests
	* @param end the upper bound of the range of asset requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching asset requests
	*/
	public static List<AssetRequest> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<AssetRequest> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first asset request in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset request
	* @throws NoSuchAssetRequestException if a matching asset request could not be found
	*/
	public static AssetRequest findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<AssetRequest> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetRequestException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first asset request in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset request, or <code>null</code> if a matching asset request could not be found
	*/
	public static AssetRequest fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<AssetRequest> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last asset request in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset request
	* @throws NoSuchAssetRequestException if a matching asset request could not be found
	*/
	public static AssetRequest findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<AssetRequest> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetRequestException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last asset request in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset request, or <code>null</code> if a matching asset request could not be found
	*/
	public static AssetRequest fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<AssetRequest> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the asset requests before and after the current asset request in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param assetRequestId the primary key of the current asset request
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset request
	* @throws NoSuchAssetRequestException if a asset request with the primary key could not be found
	*/
	public static AssetRequest[] findByUuid_C_PrevAndNext(long assetRequestId,
		java.lang.String uuid, long companyId,
		OrderByComparator<AssetRequest> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetRequestException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(assetRequestId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the asset requests where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of asset requests where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching asset requests
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the asset requests where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching asset requests
	*/
	public static List<AssetRequest> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the asset requests where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of asset requests
	* @param end the upper bound of the range of asset requests (not inclusive)
	* @return the range of matching asset requests
	*/
	public static List<AssetRequest> findByGroupId(long groupId, int start,
		int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the asset requests where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of asset requests
	* @param end the upper bound of the range of asset requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching asset requests
	*/
	public static List<AssetRequest> findByGroupId(long groupId, int start,
		int end, OrderByComparator<AssetRequest> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the asset requests where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of asset requests
	* @param end the upper bound of the range of asset requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching asset requests
	*/
	public static List<AssetRequest> findByGroupId(long groupId, int start,
		int end, OrderByComparator<AssetRequest> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first asset request in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset request
	* @throws NoSuchAssetRequestException if a matching asset request could not be found
	*/
	public static AssetRequest findByGroupId_First(long groupId,
		OrderByComparator<AssetRequest> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetRequestException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first asset request in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset request, or <code>null</code> if a matching asset request could not be found
	*/
	public static AssetRequest fetchByGroupId_First(long groupId,
		OrderByComparator<AssetRequest> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last asset request in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset request
	* @throws NoSuchAssetRequestException if a matching asset request could not be found
	*/
	public static AssetRequest findByGroupId_Last(long groupId,
		OrderByComparator<AssetRequest> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetRequestException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last asset request in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset request, or <code>null</code> if a matching asset request could not be found
	*/
	public static AssetRequest fetchByGroupId_Last(long groupId,
		OrderByComparator<AssetRequest> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the asset requests before and after the current asset request in the ordered set where groupId = &#63;.
	*
	* @param assetRequestId the primary key of the current asset request
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset request
	* @throws NoSuchAssetRequestException if a asset request with the primary key could not be found
	*/
	public static AssetRequest[] findByGroupId_PrevAndNext(
		long assetRequestId, long groupId,
		OrderByComparator<AssetRequest> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetRequestException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(assetRequestId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the asset requests where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of asset requests where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching asset requests
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the asset requests where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching asset requests
	*/
	public static List<AssetRequest> findByCompanyGroup(long companyId,
		long groupId) {
		return getPersistence().findByCompanyGroup(companyId, groupId);
	}

	/**
	* Returns a range of all the asset requests where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of asset requests
	* @param end the upper bound of the range of asset requests (not inclusive)
	* @return the range of matching asset requests
	*/
	public static List<AssetRequest> findByCompanyGroup(long companyId,
		long groupId, int start, int end) {
		return getPersistence()
				   .findByCompanyGroup(companyId, groupId, start, end);
	}

	/**
	* Returns an ordered range of all the asset requests where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of asset requests
	* @param end the upper bound of the range of asset requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching asset requests
	*/
	public static List<AssetRequest> findByCompanyGroup(long companyId,
		long groupId, int start, int end,
		OrderByComparator<AssetRequest> orderByComparator) {
		return getPersistence()
				   .findByCompanyGroup(companyId, groupId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the asset requests where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of asset requests
	* @param end the upper bound of the range of asset requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching asset requests
	*/
	public static List<AssetRequest> findByCompanyGroup(long companyId,
		long groupId, int start, int end,
		OrderByComparator<AssetRequest> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCompanyGroup(companyId, groupId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first asset request in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset request
	* @throws NoSuchAssetRequestException if a matching asset request could not be found
	*/
	public static AssetRequest findByCompanyGroup_First(long companyId,
		long groupId, OrderByComparator<AssetRequest> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetRequestException {
		return getPersistence()
				   .findByCompanyGroup_First(companyId, groupId,
			orderByComparator);
	}

	/**
	* Returns the first asset request in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset request, or <code>null</code> if a matching asset request could not be found
	*/
	public static AssetRequest fetchByCompanyGroup_First(long companyId,
		long groupId, OrderByComparator<AssetRequest> orderByComparator) {
		return getPersistence()
				   .fetchByCompanyGroup_First(companyId, groupId,
			orderByComparator);
	}

	/**
	* Returns the last asset request in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset request
	* @throws NoSuchAssetRequestException if a matching asset request could not be found
	*/
	public static AssetRequest findByCompanyGroup_Last(long companyId,
		long groupId, OrderByComparator<AssetRequest> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetRequestException {
		return getPersistence()
				   .findByCompanyGroup_Last(companyId, groupId,
			orderByComparator);
	}

	/**
	* Returns the last asset request in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset request, or <code>null</code> if a matching asset request could not be found
	*/
	public static AssetRequest fetchByCompanyGroup_Last(long companyId,
		long groupId, OrderByComparator<AssetRequest> orderByComparator) {
		return getPersistence()
				   .fetchByCompanyGroup_Last(companyId, groupId,
			orderByComparator);
	}

	/**
	* Returns the asset requests before and after the current asset request in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param assetRequestId the primary key of the current asset request
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset request
	* @throws NoSuchAssetRequestException if a asset request with the primary key could not be found
	*/
	public static AssetRequest[] findByCompanyGroup_PrevAndNext(
		long assetRequestId, long companyId, long groupId,
		OrderByComparator<AssetRequest> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetRequestException {
		return getPersistence()
				   .findByCompanyGroup_PrevAndNext(assetRequestId, companyId,
			groupId, orderByComparator);
	}

	/**
	* Removes all the asset requests where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	*/
	public static void removeByCompanyGroup(long companyId, long groupId) {
		getPersistence().removeByCompanyGroup(companyId, groupId);
	}

	/**
	* Returns the number of asset requests where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching asset requests
	*/
	public static int countByCompanyGroup(long companyId, long groupId) {
		return getPersistence().countByCompanyGroup(companyId, groupId);
	}

	/**
	* Returns all the asset requests where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @return the matching asset requests
	*/
	public static List<AssetRequest> findByCompanyGroupUser(long companyId,
		long groupId, long userId) {
		return getPersistence()
				   .findByCompanyGroupUser(companyId, groupId, userId);
	}

	/**
	* Returns a range of all the asset requests where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of asset requests
	* @param end the upper bound of the range of asset requests (not inclusive)
	* @return the range of matching asset requests
	*/
	public static List<AssetRequest> findByCompanyGroupUser(long companyId,
		long groupId, long userId, int start, int end) {
		return getPersistence()
				   .findByCompanyGroupUser(companyId, groupId, userId, start,
			end);
	}

	/**
	* Returns an ordered range of all the asset requests where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of asset requests
	* @param end the upper bound of the range of asset requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching asset requests
	*/
	public static List<AssetRequest> findByCompanyGroupUser(long companyId,
		long groupId, long userId, int start, int end,
		OrderByComparator<AssetRequest> orderByComparator) {
		return getPersistence()
				   .findByCompanyGroupUser(companyId, groupId, userId, start,
			end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the asset requests where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of asset requests
	* @param end the upper bound of the range of asset requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching asset requests
	*/
	public static List<AssetRequest> findByCompanyGroupUser(long companyId,
		long groupId, long userId, int start, int end,
		OrderByComparator<AssetRequest> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCompanyGroupUser(companyId, groupId, userId, start,
			end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first asset request in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset request
	* @throws NoSuchAssetRequestException if a matching asset request could not be found
	*/
	public static AssetRequest findByCompanyGroupUser_First(long companyId,
		long groupId, long userId,
		OrderByComparator<AssetRequest> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetRequestException {
		return getPersistence()
				   .findByCompanyGroupUser_First(companyId, groupId, userId,
			orderByComparator);
	}

	/**
	* Returns the first asset request in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset request, or <code>null</code> if a matching asset request could not be found
	*/
	public static AssetRequest fetchByCompanyGroupUser_First(long companyId,
		long groupId, long userId,
		OrderByComparator<AssetRequest> orderByComparator) {
		return getPersistence()
				   .fetchByCompanyGroupUser_First(companyId, groupId, userId,
			orderByComparator);
	}

	/**
	* Returns the last asset request in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset request
	* @throws NoSuchAssetRequestException if a matching asset request could not be found
	*/
	public static AssetRequest findByCompanyGroupUser_Last(long companyId,
		long groupId, long userId,
		OrderByComparator<AssetRequest> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetRequestException {
		return getPersistence()
				   .findByCompanyGroupUser_Last(companyId, groupId, userId,
			orderByComparator);
	}

	/**
	* Returns the last asset request in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset request, or <code>null</code> if a matching asset request could not be found
	*/
	public static AssetRequest fetchByCompanyGroupUser_Last(long companyId,
		long groupId, long userId,
		OrderByComparator<AssetRequest> orderByComparator) {
		return getPersistence()
				   .fetchByCompanyGroupUser_Last(companyId, groupId, userId,
			orderByComparator);
	}

	/**
	* Returns the asset requests before and after the current asset request in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param assetRequestId the primary key of the current asset request
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset request
	* @throws NoSuchAssetRequestException if a asset request with the primary key could not be found
	*/
	public static AssetRequest[] findByCompanyGroupUser_PrevAndNext(
		long assetRequestId, long companyId, long groupId, long userId,
		OrderByComparator<AssetRequest> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetRequestException {
		return getPersistence()
				   .findByCompanyGroupUser_PrevAndNext(assetRequestId,
			companyId, groupId, userId, orderByComparator);
	}

	/**
	* Removes all the asset requests where companyId = &#63; and groupId = &#63; and userId = &#63; from the database.
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
	* Returns the number of asset requests where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @return the number of matching asset requests
	*/
	public static int countByCompanyGroupUser(long companyId, long groupId,
		long userId) {
		return getPersistence()
				   .countByCompanyGroupUser(companyId, groupId, userId);
	}

	/**
	* Caches the asset request in the entity cache if it is enabled.
	*
	* @param assetRequest the asset request
	*/
	public static void cacheResult(AssetRequest assetRequest) {
		getPersistence().cacheResult(assetRequest);
	}

	/**
	* Caches the asset requests in the entity cache if it is enabled.
	*
	* @param assetRequests the asset requests
	*/
	public static void cacheResult(List<AssetRequest> assetRequests) {
		getPersistence().cacheResult(assetRequests);
	}

	/**
	* Creates a new asset request with the primary key. Does not add the asset request to the database.
	*
	* @param assetRequestId the primary key for the new asset request
	* @return the new asset request
	*/
	public static AssetRequest create(long assetRequestId) {
		return getPersistence().create(assetRequestId);
	}

	/**
	* Removes the asset request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetRequestId the primary key of the asset request
	* @return the asset request that was removed
	* @throws NoSuchAssetRequestException if a asset request with the primary key could not be found
	*/
	public static AssetRequest remove(long assetRequestId)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetRequestException {
		return getPersistence().remove(assetRequestId);
	}

	public static AssetRequest updateImpl(AssetRequest assetRequest) {
		return getPersistence().updateImpl(assetRequest);
	}

	/**
	* Returns the asset request with the primary key or throws a {@link NoSuchAssetRequestException} if it could not be found.
	*
	* @param assetRequestId the primary key of the asset request
	* @return the asset request
	* @throws NoSuchAssetRequestException if a asset request with the primary key could not be found
	*/
	public static AssetRequest findByPrimaryKey(long assetRequestId)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetRequestException {
		return getPersistence().findByPrimaryKey(assetRequestId);
	}

	/**
	* Returns the asset request with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param assetRequestId the primary key of the asset request
	* @return the asset request, or <code>null</code> if a asset request with the primary key could not be found
	*/
	public static AssetRequest fetchByPrimaryKey(long assetRequestId) {
		return getPersistence().fetchByPrimaryKey(assetRequestId);
	}

	public static java.util.Map<java.io.Serializable, AssetRequest> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the asset requests.
	*
	* @return the asset requests
	*/
	public static List<AssetRequest> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the asset requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset requests
	* @param end the upper bound of the range of asset requests (not inclusive)
	* @return the range of asset requests
	*/
	public static List<AssetRequest> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the asset requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset requests
	* @param end the upper bound of the range of asset requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of asset requests
	*/
	public static List<AssetRequest> findAll(int start, int end,
		OrderByComparator<AssetRequest> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the asset requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset requests
	* @param end the upper bound of the range of asset requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of asset requests
	*/
	public static List<AssetRequest> findAll(int start, int end,
		OrderByComparator<AssetRequest> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the asset requests from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of asset requests.
	*
	* @return the number of asset requests
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static AssetRequestPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AssetRequestPersistence, AssetRequestPersistence> _serviceTracker =
		ServiceTrackerFactory.open(AssetRequestPersistence.class);
}