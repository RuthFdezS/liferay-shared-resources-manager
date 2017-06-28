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

import com.rivetlogic.assetmanagement.model.AssetMessage;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the asset message service. This utility wraps {@link com.rivetlogic.assetmanagement.service.persistence.impl.AssetMessagePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetMessagePersistence
 * @see com.rivetlogic.assetmanagement.service.persistence.impl.AssetMessagePersistenceImpl
 * @generated
 */
@ProviderType
public class AssetMessageUtil {
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
	public static void clearCache(AssetMessage assetMessage) {
		getPersistence().clearCache(assetMessage);
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
	public static List<AssetMessage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AssetMessage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AssetMessage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AssetMessage> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AssetMessage update(AssetMessage assetMessage) {
		return getPersistence().update(assetMessage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AssetMessage update(AssetMessage assetMessage,
		ServiceContext serviceContext) {
		return getPersistence().update(assetMessage, serviceContext);
	}

	/**
	* Returns all the asset messages where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching asset messages
	*/
	public static List<AssetMessage> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the asset messages where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of asset messages
	* @param end the upper bound of the range of asset messages (not inclusive)
	* @return the range of matching asset messages
	*/
	public static List<AssetMessage> findByUuid(java.lang.String uuid,
		int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the asset messages where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of asset messages
	* @param end the upper bound of the range of asset messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching asset messages
	*/
	public static List<AssetMessage> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<AssetMessage> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the asset messages where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of asset messages
	* @param end the upper bound of the range of asset messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching asset messages
	*/
	public static List<AssetMessage> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<AssetMessage> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first asset message in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset message
	* @throws NoSuchAssetMessageException if a matching asset message could not be found
	*/
	public static AssetMessage findByUuid_First(java.lang.String uuid,
		OrderByComparator<AssetMessage> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetMessageException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first asset message in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset message, or <code>null</code> if a matching asset message could not be found
	*/
	public static AssetMessage fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<AssetMessage> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last asset message in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset message
	* @throws NoSuchAssetMessageException if a matching asset message could not be found
	*/
	public static AssetMessage findByUuid_Last(java.lang.String uuid,
		OrderByComparator<AssetMessage> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetMessageException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last asset message in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset message, or <code>null</code> if a matching asset message could not be found
	*/
	public static AssetMessage fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<AssetMessage> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the asset messages before and after the current asset message in the ordered set where uuid = &#63;.
	*
	* @param assetMessageId the primary key of the current asset message
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset message
	* @throws NoSuchAssetMessageException if a asset message with the primary key could not be found
	*/
	public static AssetMessage[] findByUuid_PrevAndNext(long assetMessageId,
		java.lang.String uuid, OrderByComparator<AssetMessage> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetMessageException {
		return getPersistence()
				   .findByUuid_PrevAndNext(assetMessageId, uuid,
			orderByComparator);
	}

	/**
	* Removes all the asset messages where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of asset messages where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching asset messages
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the asset message where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchAssetMessageException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching asset message
	* @throws NoSuchAssetMessageException if a matching asset message could not be found
	*/
	public static AssetMessage findByUUID_G(java.lang.String uuid, long groupId)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetMessageException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the asset message where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching asset message, or <code>null</code> if a matching asset message could not be found
	*/
	public static AssetMessage fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the asset message where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching asset message, or <code>null</code> if a matching asset message could not be found
	*/
	public static AssetMessage fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the asset message where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the asset message that was removed
	*/
	public static AssetMessage removeByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetMessageException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of asset messages where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching asset messages
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the asset messages where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching asset messages
	*/
	public static List<AssetMessage> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the asset messages where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of asset messages
	* @param end the upper bound of the range of asset messages (not inclusive)
	* @return the range of matching asset messages
	*/
	public static List<AssetMessage> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the asset messages where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of asset messages
	* @param end the upper bound of the range of asset messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching asset messages
	*/
	public static List<AssetMessage> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<AssetMessage> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the asset messages where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of asset messages
	* @param end the upper bound of the range of asset messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching asset messages
	*/
	public static List<AssetMessage> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<AssetMessage> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first asset message in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset message
	* @throws NoSuchAssetMessageException if a matching asset message could not be found
	*/
	public static AssetMessage findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<AssetMessage> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetMessageException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first asset message in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset message, or <code>null</code> if a matching asset message could not be found
	*/
	public static AssetMessage fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<AssetMessage> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last asset message in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset message
	* @throws NoSuchAssetMessageException if a matching asset message could not be found
	*/
	public static AssetMessage findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<AssetMessage> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetMessageException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last asset message in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset message, or <code>null</code> if a matching asset message could not be found
	*/
	public static AssetMessage fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<AssetMessage> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the asset messages before and after the current asset message in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param assetMessageId the primary key of the current asset message
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset message
	* @throws NoSuchAssetMessageException if a asset message with the primary key could not be found
	*/
	public static AssetMessage[] findByUuid_C_PrevAndNext(long assetMessageId,
		java.lang.String uuid, long companyId,
		OrderByComparator<AssetMessage> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetMessageException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(assetMessageId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the asset messages where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of asset messages where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching asset messages
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the asset messages where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching asset messages
	*/
	public static List<AssetMessage> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the asset messages where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of asset messages
	* @param end the upper bound of the range of asset messages (not inclusive)
	* @return the range of matching asset messages
	*/
	public static List<AssetMessage> findByGroupId(long groupId, int start,
		int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the asset messages where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of asset messages
	* @param end the upper bound of the range of asset messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching asset messages
	*/
	public static List<AssetMessage> findByGroupId(long groupId, int start,
		int end, OrderByComparator<AssetMessage> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the asset messages where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of asset messages
	* @param end the upper bound of the range of asset messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching asset messages
	*/
	public static List<AssetMessage> findByGroupId(long groupId, int start,
		int end, OrderByComparator<AssetMessage> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first asset message in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset message
	* @throws NoSuchAssetMessageException if a matching asset message could not be found
	*/
	public static AssetMessage findByGroupId_First(long groupId,
		OrderByComparator<AssetMessage> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetMessageException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first asset message in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset message, or <code>null</code> if a matching asset message could not be found
	*/
	public static AssetMessage fetchByGroupId_First(long groupId,
		OrderByComparator<AssetMessage> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last asset message in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset message
	* @throws NoSuchAssetMessageException if a matching asset message could not be found
	*/
	public static AssetMessage findByGroupId_Last(long groupId,
		OrderByComparator<AssetMessage> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetMessageException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last asset message in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset message, or <code>null</code> if a matching asset message could not be found
	*/
	public static AssetMessage fetchByGroupId_Last(long groupId,
		OrderByComparator<AssetMessage> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the asset messages before and after the current asset message in the ordered set where groupId = &#63;.
	*
	* @param assetMessageId the primary key of the current asset message
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset message
	* @throws NoSuchAssetMessageException if a asset message with the primary key could not be found
	*/
	public static AssetMessage[] findByGroupId_PrevAndNext(
		long assetMessageId, long groupId,
		OrderByComparator<AssetMessage> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetMessageException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(assetMessageId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the asset messages where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of asset messages where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching asset messages
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the asset messages where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching asset messages
	*/
	public static List<AssetMessage> findByCompanyGroup(long companyId,
		long groupId) {
		return getPersistence().findByCompanyGroup(companyId, groupId);
	}

	/**
	* Returns a range of all the asset messages where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of asset messages
	* @param end the upper bound of the range of asset messages (not inclusive)
	* @return the range of matching asset messages
	*/
	public static List<AssetMessage> findByCompanyGroup(long companyId,
		long groupId, int start, int end) {
		return getPersistence()
				   .findByCompanyGroup(companyId, groupId, start, end);
	}

	/**
	* Returns an ordered range of all the asset messages where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of asset messages
	* @param end the upper bound of the range of asset messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching asset messages
	*/
	public static List<AssetMessage> findByCompanyGroup(long companyId,
		long groupId, int start, int end,
		OrderByComparator<AssetMessage> orderByComparator) {
		return getPersistence()
				   .findByCompanyGroup(companyId, groupId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the asset messages where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of asset messages
	* @param end the upper bound of the range of asset messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching asset messages
	*/
	public static List<AssetMessage> findByCompanyGroup(long companyId,
		long groupId, int start, int end,
		OrderByComparator<AssetMessage> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCompanyGroup(companyId, groupId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first asset message in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset message
	* @throws NoSuchAssetMessageException if a matching asset message could not be found
	*/
	public static AssetMessage findByCompanyGroup_First(long companyId,
		long groupId, OrderByComparator<AssetMessage> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetMessageException {
		return getPersistence()
				   .findByCompanyGroup_First(companyId, groupId,
			orderByComparator);
	}

	/**
	* Returns the first asset message in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset message, or <code>null</code> if a matching asset message could not be found
	*/
	public static AssetMessage fetchByCompanyGroup_First(long companyId,
		long groupId, OrderByComparator<AssetMessage> orderByComparator) {
		return getPersistence()
				   .fetchByCompanyGroup_First(companyId, groupId,
			orderByComparator);
	}

	/**
	* Returns the last asset message in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset message
	* @throws NoSuchAssetMessageException if a matching asset message could not be found
	*/
	public static AssetMessage findByCompanyGroup_Last(long companyId,
		long groupId, OrderByComparator<AssetMessage> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetMessageException {
		return getPersistence()
				   .findByCompanyGroup_Last(companyId, groupId,
			orderByComparator);
	}

	/**
	* Returns the last asset message in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset message, or <code>null</code> if a matching asset message could not be found
	*/
	public static AssetMessage fetchByCompanyGroup_Last(long companyId,
		long groupId, OrderByComparator<AssetMessage> orderByComparator) {
		return getPersistence()
				   .fetchByCompanyGroup_Last(companyId, groupId,
			orderByComparator);
	}

	/**
	* Returns the asset messages before and after the current asset message in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param assetMessageId the primary key of the current asset message
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset message
	* @throws NoSuchAssetMessageException if a asset message with the primary key could not be found
	*/
	public static AssetMessage[] findByCompanyGroup_PrevAndNext(
		long assetMessageId, long companyId, long groupId,
		OrderByComparator<AssetMessage> orderByComparator)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetMessageException {
		return getPersistence()
				   .findByCompanyGroup_PrevAndNext(assetMessageId, companyId,
			groupId, orderByComparator);
	}

	/**
	* Removes all the asset messages where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	*/
	public static void removeByCompanyGroup(long companyId, long groupId) {
		getPersistence().removeByCompanyGroup(companyId, groupId);
	}

	/**
	* Returns the number of asset messages where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching asset messages
	*/
	public static int countByCompanyGroup(long companyId, long groupId) {
		return getPersistence().countByCompanyGroup(companyId, groupId);
	}

	/**
	* Caches the asset message in the entity cache if it is enabled.
	*
	* @param assetMessage the asset message
	*/
	public static void cacheResult(AssetMessage assetMessage) {
		getPersistence().cacheResult(assetMessage);
	}

	/**
	* Caches the asset messages in the entity cache if it is enabled.
	*
	* @param assetMessages the asset messages
	*/
	public static void cacheResult(List<AssetMessage> assetMessages) {
		getPersistence().cacheResult(assetMessages);
	}

	/**
	* Creates a new asset message with the primary key. Does not add the asset message to the database.
	*
	* @param assetMessageId the primary key for the new asset message
	* @return the new asset message
	*/
	public static AssetMessage create(long assetMessageId) {
		return getPersistence().create(assetMessageId);
	}

	/**
	* Removes the asset message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetMessageId the primary key of the asset message
	* @return the asset message that was removed
	* @throws NoSuchAssetMessageException if a asset message with the primary key could not be found
	*/
	public static AssetMessage remove(long assetMessageId)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetMessageException {
		return getPersistence().remove(assetMessageId);
	}

	public static AssetMessage updateImpl(AssetMessage assetMessage) {
		return getPersistence().updateImpl(assetMessage);
	}

	/**
	* Returns the asset message with the primary key or throws a {@link NoSuchAssetMessageException} if it could not be found.
	*
	* @param assetMessageId the primary key of the asset message
	* @return the asset message
	* @throws NoSuchAssetMessageException if a asset message with the primary key could not be found
	*/
	public static AssetMessage findByPrimaryKey(long assetMessageId)
		throws com.rivetlogic.assetmanagement.exception.NoSuchAssetMessageException {
		return getPersistence().findByPrimaryKey(assetMessageId);
	}

	/**
	* Returns the asset message with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param assetMessageId the primary key of the asset message
	* @return the asset message, or <code>null</code> if a asset message with the primary key could not be found
	*/
	public static AssetMessage fetchByPrimaryKey(long assetMessageId) {
		return getPersistence().fetchByPrimaryKey(assetMessageId);
	}

	public static java.util.Map<java.io.Serializable, AssetMessage> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the asset messages.
	*
	* @return the asset messages
	*/
	public static List<AssetMessage> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the asset messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset messages
	* @param end the upper bound of the range of asset messages (not inclusive)
	* @return the range of asset messages
	*/
	public static List<AssetMessage> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the asset messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset messages
	* @param end the upper bound of the range of asset messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of asset messages
	*/
	public static List<AssetMessage> findAll(int start, int end,
		OrderByComparator<AssetMessage> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the asset messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset messages
	* @param end the upper bound of the range of asset messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of asset messages
	*/
	public static List<AssetMessage> findAll(int start, int end,
		OrderByComparator<AssetMessage> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the asset messages from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of asset messages.
	*
	* @return the number of asset messages
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static AssetMessagePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AssetMessagePersistence, AssetMessagePersistence> _serviceTracker =
		ServiceTrackerFactory.open(AssetMessagePersistence.class);
}