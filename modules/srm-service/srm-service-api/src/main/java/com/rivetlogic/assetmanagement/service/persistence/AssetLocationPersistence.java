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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.rivetlogic.assetmanagement.exception.NoSuchAssetLocationException;
import com.rivetlogic.assetmanagement.model.AssetLocation;

/**
 * The persistence interface for the asset location service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.rivetlogic.assetmanagement.service.persistence.impl.AssetLocationPersistenceImpl
 * @see AssetLocationUtil
 * @generated
 */
@ProviderType
public interface AssetLocationPersistence extends BasePersistence<AssetLocation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AssetLocationUtil} to access the asset location persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the asset locations where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching asset locations
	*/
	public java.util.List<AssetLocation> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the asset locations where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @return the range of matching asset locations
	*/
	public java.util.List<AssetLocation> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the asset locations where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching asset locations
	*/
	public java.util.List<AssetLocation> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator);

	/**
	* Returns an ordered range of all the asset locations where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching asset locations
	*/
	public java.util.List<AssetLocation> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first asset location in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset location
	* @throws NoSuchAssetLocationException if a matching asset location could not be found
	*/
	public AssetLocation findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator)
		throws NoSuchAssetLocationException;

	/**
	* Returns the first asset location in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset location, or <code>null</code> if a matching asset location could not be found
	*/
	public AssetLocation fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator);

	/**
	* Returns the last asset location in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset location
	* @throws NoSuchAssetLocationException if a matching asset location could not be found
	*/
	public AssetLocation findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator)
		throws NoSuchAssetLocationException;

	/**
	* Returns the last asset location in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset location, or <code>null</code> if a matching asset location could not be found
	*/
	public AssetLocation fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator);

	/**
	* Returns the asset locations before and after the current asset location in the ordered set where uuid = &#63;.
	*
	* @param assetLocationId the primary key of the current asset location
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset location
	* @throws NoSuchAssetLocationException if a asset location with the primary key could not be found
	*/
	public AssetLocation[] findByUuid_PrevAndNext(long assetLocationId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator)
		throws NoSuchAssetLocationException;

	/**
	* Removes all the asset locations where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of asset locations where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching asset locations
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the asset location where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchAssetLocationException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching asset location
	* @throws NoSuchAssetLocationException if a matching asset location could not be found
	*/
	public AssetLocation findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchAssetLocationException;

	/**
	* Returns the asset location where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching asset location, or <code>null</code> if a matching asset location could not be found
	*/
	public AssetLocation fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the asset location where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching asset location, or <code>null</code> if a matching asset location could not be found
	*/
	public AssetLocation fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the asset location where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the asset location that was removed
	*/
	public AssetLocation removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchAssetLocationException;

	/**
	* Returns the number of asset locations where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching asset locations
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the asset locations where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching asset locations
	*/
	public java.util.List<AssetLocation> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the asset locations where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @return the range of matching asset locations
	*/
	public java.util.List<AssetLocation> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the asset locations where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching asset locations
	*/
	public java.util.List<AssetLocation> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator);

	/**
	* Returns an ordered range of all the asset locations where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching asset locations
	*/
	public java.util.List<AssetLocation> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first asset location in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset location
	* @throws NoSuchAssetLocationException if a matching asset location could not be found
	*/
	public AssetLocation findByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator)
		throws NoSuchAssetLocationException;

	/**
	* Returns the first asset location in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset location, or <code>null</code> if a matching asset location could not be found
	*/
	public AssetLocation fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator);

	/**
	* Returns the last asset location in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset location
	* @throws NoSuchAssetLocationException if a matching asset location could not be found
	*/
	public AssetLocation findByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator)
		throws NoSuchAssetLocationException;

	/**
	* Returns the last asset location in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset location, or <code>null</code> if a matching asset location could not be found
	*/
	public AssetLocation fetchByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator);

	/**
	* Returns the asset locations before and after the current asset location in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param assetLocationId the primary key of the current asset location
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset location
	* @throws NoSuchAssetLocationException if a asset location with the primary key could not be found
	*/
	public AssetLocation[] findByUuid_C_PrevAndNext(long assetLocationId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator)
		throws NoSuchAssetLocationException;

	/**
	* Removes all the asset locations where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of asset locations where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching asset locations
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the asset locations where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching asset locations
	*/
	public java.util.List<AssetLocation> findByGroupId(long groupId);

	/**
	* Returns a range of all the asset locations where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @return the range of matching asset locations
	*/
	public java.util.List<AssetLocation> findByGroupId(long groupId, int start,
		int end);

	/**
	* Returns an ordered range of all the asset locations where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching asset locations
	*/
	public java.util.List<AssetLocation> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator);

	/**
	* Returns an ordered range of all the asset locations where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching asset locations
	*/
	public java.util.List<AssetLocation> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first asset location in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset location
	* @throws NoSuchAssetLocationException if a matching asset location could not be found
	*/
	public AssetLocation findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator)
		throws NoSuchAssetLocationException;

	/**
	* Returns the first asset location in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset location, or <code>null</code> if a matching asset location could not be found
	*/
	public AssetLocation fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator);

	/**
	* Returns the last asset location in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset location
	* @throws NoSuchAssetLocationException if a matching asset location could not be found
	*/
	public AssetLocation findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator)
		throws NoSuchAssetLocationException;

	/**
	* Returns the last asset location in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset location, or <code>null</code> if a matching asset location could not be found
	*/
	public AssetLocation fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator);

	/**
	* Returns the asset locations before and after the current asset location in the ordered set where groupId = &#63;.
	*
	* @param assetLocationId the primary key of the current asset location
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset location
	* @throws NoSuchAssetLocationException if a asset location with the primary key could not be found
	*/
	public AssetLocation[] findByGroupId_PrevAndNext(long assetLocationId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator)
		throws NoSuchAssetLocationException;

	/**
	* Removes all the asset locations where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of asset locations where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching asset locations
	*/
	public int countByGroupId(long groupId);

	/**
	* Returns all the asset locations where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching asset locations
	*/
	public java.util.List<AssetLocation> findByCompanyGroup(long companyId,
		long groupId);

	/**
	* Returns a range of all the asset locations where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @return the range of matching asset locations
	*/
	public java.util.List<AssetLocation> findByCompanyGroup(long companyId,
		long groupId, int start, int end);

	/**
	* Returns an ordered range of all the asset locations where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching asset locations
	*/
	public java.util.List<AssetLocation> findByCompanyGroup(long companyId,
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator);

	/**
	* Returns an ordered range of all the asset locations where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching asset locations
	*/
	public java.util.List<AssetLocation> findByCompanyGroup(long companyId,
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first asset location in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset location
	* @throws NoSuchAssetLocationException if a matching asset location could not be found
	*/
	public AssetLocation findByCompanyGroup_First(long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator)
		throws NoSuchAssetLocationException;

	/**
	* Returns the first asset location in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset location, or <code>null</code> if a matching asset location could not be found
	*/
	public AssetLocation fetchByCompanyGroup_First(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator);

	/**
	* Returns the last asset location in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset location
	* @throws NoSuchAssetLocationException if a matching asset location could not be found
	*/
	public AssetLocation findByCompanyGroup_Last(long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator)
		throws NoSuchAssetLocationException;

	/**
	* Returns the last asset location in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset location, or <code>null</code> if a matching asset location could not be found
	*/
	public AssetLocation fetchByCompanyGroup_Last(long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator);

	/**
	* Returns the asset locations before and after the current asset location in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param assetLocationId the primary key of the current asset location
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset location
	* @throws NoSuchAssetLocationException if a asset location with the primary key could not be found
	*/
	public AssetLocation[] findByCompanyGroup_PrevAndNext(
		long assetLocationId, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator)
		throws NoSuchAssetLocationException;

	/**
	* Removes all the asset locations where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	*/
	public void removeByCompanyGroup(long companyId, long groupId);

	/**
	* Returns the number of asset locations where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching asset locations
	*/
	public int countByCompanyGroup(long companyId, long groupId);

	/**
	* Returns all the asset locations where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @return the matching asset locations
	*/
	public java.util.List<AssetLocation> findByCompanyGroupUser(
		long companyId, long groupId, long userId);

	/**
	* Returns a range of all the asset locations where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @return the range of matching asset locations
	*/
	public java.util.List<AssetLocation> findByCompanyGroupUser(
		long companyId, long groupId, long userId, int start, int end);

	/**
	* Returns an ordered range of all the asset locations where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching asset locations
	*/
	public java.util.List<AssetLocation> findByCompanyGroupUser(
		long companyId, long groupId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator);

	/**
	* Returns an ordered range of all the asset locations where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching asset locations
	*/
	public java.util.List<AssetLocation> findByCompanyGroupUser(
		long companyId, long groupId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first asset location in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset location
	* @throws NoSuchAssetLocationException if a matching asset location could not be found
	*/
	public AssetLocation findByCompanyGroupUser_First(long companyId,
		long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator)
		throws NoSuchAssetLocationException;

	/**
	* Returns the first asset location in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset location, or <code>null</code> if a matching asset location could not be found
	*/
	public AssetLocation fetchByCompanyGroupUser_First(long companyId,
		long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator);

	/**
	* Returns the last asset location in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset location
	* @throws NoSuchAssetLocationException if a matching asset location could not be found
	*/
	public AssetLocation findByCompanyGroupUser_Last(long companyId,
		long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator)
		throws NoSuchAssetLocationException;

	/**
	* Returns the last asset location in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset location, or <code>null</code> if a matching asset location could not be found
	*/
	public AssetLocation fetchByCompanyGroupUser_Last(long companyId,
		long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator);

	/**
	* Returns the asset locations before and after the current asset location in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param assetLocationId the primary key of the current asset location
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset location
	* @throws NoSuchAssetLocationException if a asset location with the primary key could not be found
	*/
	public AssetLocation[] findByCompanyGroupUser_PrevAndNext(
		long assetLocationId, long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator)
		throws NoSuchAssetLocationException;

	/**
	* Removes all the asset locations where companyId = &#63; and groupId = &#63; and userId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	*/
	public void removeByCompanyGroupUser(long companyId, long groupId,
		long userId);

	/**
	* Returns the number of asset locations where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @return the number of matching asset locations
	*/
	public int countByCompanyGroupUser(long companyId, long groupId, long userId);

	/**
	* Caches the asset location in the entity cache if it is enabled.
	*
	* @param assetLocation the asset location
	*/
	public void cacheResult(AssetLocation assetLocation);

	/**
	* Caches the asset locations in the entity cache if it is enabled.
	*
	* @param assetLocations the asset locations
	*/
	public void cacheResult(java.util.List<AssetLocation> assetLocations);

	/**
	* Creates a new asset location with the primary key. Does not add the asset location to the database.
	*
	* @param assetLocationId the primary key for the new asset location
	* @return the new asset location
	*/
	public AssetLocation create(long assetLocationId);

	/**
	* Removes the asset location with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetLocationId the primary key of the asset location
	* @return the asset location that was removed
	* @throws NoSuchAssetLocationException if a asset location with the primary key could not be found
	*/
	public AssetLocation remove(long assetLocationId)
		throws NoSuchAssetLocationException;

	public AssetLocation updateImpl(AssetLocation assetLocation);

	/**
	* Returns the asset location with the primary key or throws a {@link NoSuchAssetLocationException} if it could not be found.
	*
	* @param assetLocationId the primary key of the asset location
	* @return the asset location
	* @throws NoSuchAssetLocationException if a asset location with the primary key could not be found
	*/
	public AssetLocation findByPrimaryKey(long assetLocationId)
		throws NoSuchAssetLocationException;

	/**
	* Returns the asset location with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param assetLocationId the primary key of the asset location
	* @return the asset location, or <code>null</code> if a asset location with the primary key could not be found
	*/
	public AssetLocation fetchByPrimaryKey(long assetLocationId);

	@Override
	public java.util.Map<java.io.Serializable, AssetLocation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the asset locations.
	*
	* @return the asset locations
	*/
	public java.util.List<AssetLocation> findAll();

	/**
	* Returns a range of all the asset locations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @return the range of asset locations
	*/
	public java.util.List<AssetLocation> findAll(int start, int end);

	/**
	* Returns an ordered range of all the asset locations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of asset locations
	*/
	public java.util.List<AssetLocation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator);

	/**
	* Returns an ordered range of all the asset locations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of asset locations
	*/
	public java.util.List<AssetLocation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLocation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the asset locations from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of asset locations.
	*
	* @return the number of asset locations
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}