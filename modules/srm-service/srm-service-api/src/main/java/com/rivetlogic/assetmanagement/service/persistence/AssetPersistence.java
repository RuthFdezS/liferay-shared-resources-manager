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

import com.rivetlogic.assetmanagement.exception.NoSuchAssetException;
import com.rivetlogic.assetmanagement.model.Asset;

/**
 * The persistence interface for the asset service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.rivetlogic.assetmanagement.service.persistence.impl.AssetPersistenceImpl
 * @see AssetUtil
 * @generated
 */
@ProviderType
public interface AssetPersistence extends BasePersistence<Asset> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AssetUtil} to access the asset persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the assets where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching assets
	*/
	public java.util.List<Asset> findByUuid(java.lang.String uuid);

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
	public java.util.List<Asset> findByUuid(java.lang.String uuid, int start,
		int end);

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
	public java.util.List<Asset> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator);

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
	public java.util.List<Asset> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first asset in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset
	* @throws NoSuchAssetException if a matching asset could not be found
	*/
	public Asset findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator)
		throws NoSuchAssetException;

	/**
	* Returns the first asset in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset, or <code>null</code> if a matching asset could not be found
	*/
	public Asset fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator);

	/**
	* Returns the last asset in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset
	* @throws NoSuchAssetException if a matching asset could not be found
	*/
	public Asset findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator)
		throws NoSuchAssetException;

	/**
	* Returns the last asset in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset, or <code>null</code> if a matching asset could not be found
	*/
	public Asset fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator);

	/**
	* Returns the assets before and after the current asset in the ordered set where uuid = &#63;.
	*
	* @param assetId the primary key of the current asset
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset
	* @throws NoSuchAssetException if a asset with the primary key could not be found
	*/
	public Asset[] findByUuid_PrevAndNext(long assetId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator)
		throws NoSuchAssetException;

	/**
	* Removes all the assets where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of assets where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching assets
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the asset where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchAssetException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching asset
	* @throws NoSuchAssetException if a matching asset could not be found
	*/
	public Asset findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchAssetException;

	/**
	* Returns the asset where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching asset, or <code>null</code> if a matching asset could not be found
	*/
	public Asset fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the asset where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching asset, or <code>null</code> if a matching asset could not be found
	*/
	public Asset fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the asset where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the asset that was removed
	*/
	public Asset removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchAssetException;

	/**
	* Returns the number of assets where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching assets
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the assets where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching assets
	*/
	public java.util.List<Asset> findByUuid_C(java.lang.String uuid,
		long companyId);

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
	public java.util.List<Asset> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

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
	public java.util.List<Asset> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator);

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
	public java.util.List<Asset> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first asset in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset
	* @throws NoSuchAssetException if a matching asset could not be found
	*/
	public Asset findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator)
		throws NoSuchAssetException;

	/**
	* Returns the first asset in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset, or <code>null</code> if a matching asset could not be found
	*/
	public Asset fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator);

	/**
	* Returns the last asset in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset
	* @throws NoSuchAssetException if a matching asset could not be found
	*/
	public Asset findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator)
		throws NoSuchAssetException;

	/**
	* Returns the last asset in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset, or <code>null</code> if a matching asset could not be found
	*/
	public Asset fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator);

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
	public Asset[] findByUuid_C_PrevAndNext(long assetId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator)
		throws NoSuchAssetException;

	/**
	* Removes all the assets where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of assets where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching assets
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the assets where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching assets
	*/
	public java.util.List<Asset> findByGroupId(long groupId);

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
	public java.util.List<Asset> findByGroupId(long groupId, int start, int end);

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
	public java.util.List<Asset> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator);

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
	public java.util.List<Asset> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first asset in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset
	* @throws NoSuchAssetException if a matching asset could not be found
	*/
	public Asset findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator)
		throws NoSuchAssetException;

	/**
	* Returns the first asset in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset, or <code>null</code> if a matching asset could not be found
	*/
	public Asset fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator);

	/**
	* Returns the last asset in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset
	* @throws NoSuchAssetException if a matching asset could not be found
	*/
	public Asset findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator)
		throws NoSuchAssetException;

	/**
	* Returns the last asset in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset, or <code>null</code> if a matching asset could not be found
	*/
	public Asset fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator);

	/**
	* Returns the assets before and after the current asset in the ordered set where groupId = &#63;.
	*
	* @param assetId the primary key of the current asset
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset
	* @throws NoSuchAssetException if a asset with the primary key could not be found
	*/
	public Asset[] findByGroupId_PrevAndNext(long assetId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator)
		throws NoSuchAssetException;

	/**
	* Removes all the assets where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of assets where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching assets
	*/
	public int countByGroupId(long groupId);

	/**
	* Returns all the assets where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching assets
	*/
	public java.util.List<Asset> findByCompanyGroup(long companyId, long groupId);

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
	public java.util.List<Asset> findByCompanyGroup(long companyId,
		long groupId, int start, int end);

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
	public java.util.List<Asset> findByCompanyGroup(long companyId,
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator);

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
	public java.util.List<Asset> findByCompanyGroup(long companyId,
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first asset in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset
	* @throws NoSuchAssetException if a matching asset could not be found
	*/
	public Asset findByCompanyGroup_First(long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator)
		throws NoSuchAssetException;

	/**
	* Returns the first asset in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset, or <code>null</code> if a matching asset could not be found
	*/
	public Asset fetchByCompanyGroup_First(long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator);

	/**
	* Returns the last asset in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset
	* @throws NoSuchAssetException if a matching asset could not be found
	*/
	public Asset findByCompanyGroup_Last(long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator)
		throws NoSuchAssetException;

	/**
	* Returns the last asset in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset, or <code>null</code> if a matching asset could not be found
	*/
	public Asset fetchByCompanyGroup_Last(long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator);

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
	public Asset[] findByCompanyGroup_PrevAndNext(long assetId, long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator)
		throws NoSuchAssetException;

	/**
	* Removes all the assets where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	*/
	public void removeByCompanyGroup(long companyId, long groupId);

	/**
	* Returns the number of assets where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching assets
	*/
	public int countByCompanyGroup(long companyId, long groupId);

	/**
	* Returns all the assets where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @return the matching assets
	*/
	public java.util.List<Asset> findByCompanyGroupUser(long companyId,
		long groupId, long userId);

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
	public java.util.List<Asset> findByCompanyGroupUser(long companyId,
		long groupId, long userId, int start, int end);

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
	public java.util.List<Asset> findByCompanyGroupUser(long companyId,
		long groupId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator);

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
	public java.util.List<Asset> findByCompanyGroupUser(long companyId,
		long groupId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator,
		boolean retrieveFromCache);

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
	public Asset findByCompanyGroupUser_First(long companyId, long groupId,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator)
		throws NoSuchAssetException;

	/**
	* Returns the first asset in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset, or <code>null</code> if a matching asset could not be found
	*/
	public Asset fetchByCompanyGroupUser_First(long companyId, long groupId,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator);

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
	public Asset findByCompanyGroupUser_Last(long companyId, long groupId,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator)
		throws NoSuchAssetException;

	/**
	* Returns the last asset in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset, or <code>null</code> if a matching asset could not be found
	*/
	public Asset fetchByCompanyGroupUser_Last(long companyId, long groupId,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator);

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
	public Asset[] findByCompanyGroupUser_PrevAndNext(long assetId,
		long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator)
		throws NoSuchAssetException;

	/**
	* Removes all the assets where companyId = &#63; and groupId = &#63; and userId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	*/
	public void removeByCompanyGroupUser(long companyId, long groupId,
		long userId);

	/**
	* Returns the number of assets where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @return the number of matching assets
	*/
	public int countByCompanyGroupUser(long companyId, long groupId, long userId);

	/**
	* Caches the asset in the entity cache if it is enabled.
	*
	* @param asset the asset
	*/
	public void cacheResult(Asset asset);

	/**
	* Caches the assets in the entity cache if it is enabled.
	*
	* @param assets the assets
	*/
	public void cacheResult(java.util.List<Asset> assets);

	/**
	* Creates a new asset with the primary key. Does not add the asset to the database.
	*
	* @param assetId the primary key for the new asset
	* @return the new asset
	*/
	public Asset create(long assetId);

	/**
	* Removes the asset with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetId the primary key of the asset
	* @return the asset that was removed
	* @throws NoSuchAssetException if a asset with the primary key could not be found
	*/
	public Asset remove(long assetId) throws NoSuchAssetException;

	public Asset updateImpl(Asset asset);

	/**
	* Returns the asset with the primary key or throws a {@link NoSuchAssetException} if it could not be found.
	*
	* @param assetId the primary key of the asset
	* @return the asset
	* @throws NoSuchAssetException if a asset with the primary key could not be found
	*/
	public Asset findByPrimaryKey(long assetId) throws NoSuchAssetException;

	/**
	* Returns the asset with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param assetId the primary key of the asset
	* @return the asset, or <code>null</code> if a asset with the primary key could not be found
	*/
	public Asset fetchByPrimaryKey(long assetId);

	@Override
	public java.util.Map<java.io.Serializable, Asset> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the assets.
	*
	* @return the assets
	*/
	public java.util.List<Asset> findAll();

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
	public java.util.List<Asset> findAll(int start, int end);

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
	public java.util.List<Asset> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator);

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
	public java.util.List<Asset> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Asset> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the assets from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of assets.
	*
	* @return the number of assets
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}