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

import com.rivetlogic.assetmanagement.exception.NoSuchAssetCategoryException;
import com.rivetlogic.assetmanagement.model.AssetCategory;

/**
 * The persistence interface for the asset category service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.rivetlogic.assetmanagement.service.persistence.impl.AssetCategoryPersistenceImpl
 * @see AssetCategoryUtil
 * @generated
 */
@ProviderType
public interface AssetCategoryPersistence extends BasePersistence<AssetCategory> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AssetCategoryUtil} to access the asset category persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the asset categories where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching asset categories
	*/
	public java.util.List<AssetCategory> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the asset categories where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of asset categories
	* @param end the upper bound of the range of asset categories (not inclusive)
	* @return the range of matching asset categories
	*/
	public java.util.List<AssetCategory> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the asset categories where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of asset categories
	* @param end the upper bound of the range of asset categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching asset categories
	*/
	public java.util.List<AssetCategory> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator);

	/**
	* Returns an ordered range of all the asset categories where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of asset categories
	* @param end the upper bound of the range of asset categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching asset categories
	*/
	public java.util.List<AssetCategory> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first asset category in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset category
	* @throws NoSuchAssetCategoryException if a matching asset category could not be found
	*/
	public AssetCategory findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator)
		throws NoSuchAssetCategoryException;

	/**
	* Returns the first asset category in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset category, or <code>null</code> if a matching asset category could not be found
	*/
	public AssetCategory fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator);

	/**
	* Returns the last asset category in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset category
	* @throws NoSuchAssetCategoryException if a matching asset category could not be found
	*/
	public AssetCategory findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator)
		throws NoSuchAssetCategoryException;

	/**
	* Returns the last asset category in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset category, or <code>null</code> if a matching asset category could not be found
	*/
	public AssetCategory fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator);

	/**
	* Returns the asset categories before and after the current asset category in the ordered set where uuid = &#63;.
	*
	* @param assetCategoryId the primary key of the current asset category
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset category
	* @throws NoSuchAssetCategoryException if a asset category with the primary key could not be found
	*/
	public AssetCategory[] findByUuid_PrevAndNext(long assetCategoryId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator)
		throws NoSuchAssetCategoryException;

	/**
	* Removes all the asset categories where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of asset categories where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching asset categories
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the asset category where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchAssetCategoryException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching asset category
	* @throws NoSuchAssetCategoryException if a matching asset category could not be found
	*/
	public AssetCategory findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchAssetCategoryException;

	/**
	* Returns the asset category where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching asset category, or <code>null</code> if a matching asset category could not be found
	*/
	public AssetCategory fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the asset category where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching asset category, or <code>null</code> if a matching asset category could not be found
	*/
	public AssetCategory fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the asset category where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the asset category that was removed
	*/
	public AssetCategory removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchAssetCategoryException;

	/**
	* Returns the number of asset categories where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching asset categories
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the asset categories where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching asset categories
	*/
	public java.util.List<AssetCategory> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the asset categories where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of asset categories
	* @param end the upper bound of the range of asset categories (not inclusive)
	* @return the range of matching asset categories
	*/
	public java.util.List<AssetCategory> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the asset categories where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of asset categories
	* @param end the upper bound of the range of asset categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching asset categories
	*/
	public java.util.List<AssetCategory> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator);

	/**
	* Returns an ordered range of all the asset categories where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of asset categories
	* @param end the upper bound of the range of asset categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching asset categories
	*/
	public java.util.List<AssetCategory> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first asset category in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset category
	* @throws NoSuchAssetCategoryException if a matching asset category could not be found
	*/
	public AssetCategory findByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator)
		throws NoSuchAssetCategoryException;

	/**
	* Returns the first asset category in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset category, or <code>null</code> if a matching asset category could not be found
	*/
	public AssetCategory fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator);

	/**
	* Returns the last asset category in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset category
	* @throws NoSuchAssetCategoryException if a matching asset category could not be found
	*/
	public AssetCategory findByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator)
		throws NoSuchAssetCategoryException;

	/**
	* Returns the last asset category in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset category, or <code>null</code> if a matching asset category could not be found
	*/
	public AssetCategory fetchByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator);

	/**
	* Returns the asset categories before and after the current asset category in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param assetCategoryId the primary key of the current asset category
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset category
	* @throws NoSuchAssetCategoryException if a asset category with the primary key could not be found
	*/
	public AssetCategory[] findByUuid_C_PrevAndNext(long assetCategoryId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator)
		throws NoSuchAssetCategoryException;

	/**
	* Removes all the asset categories where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of asset categories where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching asset categories
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the asset categories where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching asset categories
	*/
	public java.util.List<AssetCategory> findByGroupId(long groupId);

	/**
	* Returns a range of all the asset categories where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of asset categories
	* @param end the upper bound of the range of asset categories (not inclusive)
	* @return the range of matching asset categories
	*/
	public java.util.List<AssetCategory> findByGroupId(long groupId, int start,
		int end);

	/**
	* Returns an ordered range of all the asset categories where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of asset categories
	* @param end the upper bound of the range of asset categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching asset categories
	*/
	public java.util.List<AssetCategory> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator);

	/**
	* Returns an ordered range of all the asset categories where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of asset categories
	* @param end the upper bound of the range of asset categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching asset categories
	*/
	public java.util.List<AssetCategory> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first asset category in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset category
	* @throws NoSuchAssetCategoryException if a matching asset category could not be found
	*/
	public AssetCategory findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator)
		throws NoSuchAssetCategoryException;

	/**
	* Returns the first asset category in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset category, or <code>null</code> if a matching asset category could not be found
	*/
	public AssetCategory fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator);

	/**
	* Returns the last asset category in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset category
	* @throws NoSuchAssetCategoryException if a matching asset category could not be found
	*/
	public AssetCategory findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator)
		throws NoSuchAssetCategoryException;

	/**
	* Returns the last asset category in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset category, or <code>null</code> if a matching asset category could not be found
	*/
	public AssetCategory fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator);

	/**
	* Returns the asset categories before and after the current asset category in the ordered set where groupId = &#63;.
	*
	* @param assetCategoryId the primary key of the current asset category
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset category
	* @throws NoSuchAssetCategoryException if a asset category with the primary key could not be found
	*/
	public AssetCategory[] findByGroupId_PrevAndNext(long assetCategoryId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator)
		throws NoSuchAssetCategoryException;

	/**
	* Removes all the asset categories where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of asset categories where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching asset categories
	*/
	public int countByGroupId(long groupId);

	/**
	* Returns all the asset categories where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching asset categories
	*/
	public java.util.List<AssetCategory> findByCompanyGroup(long companyId,
		long groupId);

	/**
	* Returns a range of all the asset categories where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of asset categories
	* @param end the upper bound of the range of asset categories (not inclusive)
	* @return the range of matching asset categories
	*/
	public java.util.List<AssetCategory> findByCompanyGroup(long companyId,
		long groupId, int start, int end);

	/**
	* Returns an ordered range of all the asset categories where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of asset categories
	* @param end the upper bound of the range of asset categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching asset categories
	*/
	public java.util.List<AssetCategory> findByCompanyGroup(long companyId,
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator);

	/**
	* Returns an ordered range of all the asset categories where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of asset categories
	* @param end the upper bound of the range of asset categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching asset categories
	*/
	public java.util.List<AssetCategory> findByCompanyGroup(long companyId,
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first asset category in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset category
	* @throws NoSuchAssetCategoryException if a matching asset category could not be found
	*/
	public AssetCategory findByCompanyGroup_First(long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator)
		throws NoSuchAssetCategoryException;

	/**
	* Returns the first asset category in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset category, or <code>null</code> if a matching asset category could not be found
	*/
	public AssetCategory fetchByCompanyGroup_First(long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator);

	/**
	* Returns the last asset category in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset category
	* @throws NoSuchAssetCategoryException if a matching asset category could not be found
	*/
	public AssetCategory findByCompanyGroup_Last(long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator)
		throws NoSuchAssetCategoryException;

	/**
	* Returns the last asset category in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset category, or <code>null</code> if a matching asset category could not be found
	*/
	public AssetCategory fetchByCompanyGroup_Last(long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator);

	/**
	* Returns the asset categories before and after the current asset category in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param assetCategoryId the primary key of the current asset category
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset category
	* @throws NoSuchAssetCategoryException if a asset category with the primary key could not be found
	*/
	public AssetCategory[] findByCompanyGroup_PrevAndNext(
		long assetCategoryId, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator)
		throws NoSuchAssetCategoryException;

	/**
	* Removes all the asset categories where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	*/
	public void removeByCompanyGroup(long companyId, long groupId);

	/**
	* Returns the number of asset categories where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching asset categories
	*/
	public int countByCompanyGroup(long companyId, long groupId);

	/**
	* Returns all the asset categories where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @return the matching asset categories
	*/
	public java.util.List<AssetCategory> findByCompanyGroupUser(
		long companyId, long groupId, long userId);

	/**
	* Returns a range of all the asset categories where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of asset categories
	* @param end the upper bound of the range of asset categories (not inclusive)
	* @return the range of matching asset categories
	*/
	public java.util.List<AssetCategory> findByCompanyGroupUser(
		long companyId, long groupId, long userId, int start, int end);

	/**
	* Returns an ordered range of all the asset categories where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of asset categories
	* @param end the upper bound of the range of asset categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching asset categories
	*/
	public java.util.List<AssetCategory> findByCompanyGroupUser(
		long companyId, long groupId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator);

	/**
	* Returns an ordered range of all the asset categories where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of asset categories
	* @param end the upper bound of the range of asset categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching asset categories
	*/
	public java.util.List<AssetCategory> findByCompanyGroupUser(
		long companyId, long groupId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first asset category in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset category
	* @throws NoSuchAssetCategoryException if a matching asset category could not be found
	*/
	public AssetCategory findByCompanyGroupUser_First(long companyId,
		long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator)
		throws NoSuchAssetCategoryException;

	/**
	* Returns the first asset category in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset category, or <code>null</code> if a matching asset category could not be found
	*/
	public AssetCategory fetchByCompanyGroupUser_First(long companyId,
		long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator);

	/**
	* Returns the last asset category in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset category
	* @throws NoSuchAssetCategoryException if a matching asset category could not be found
	*/
	public AssetCategory findByCompanyGroupUser_Last(long companyId,
		long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator)
		throws NoSuchAssetCategoryException;

	/**
	* Returns the last asset category in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset category, or <code>null</code> if a matching asset category could not be found
	*/
	public AssetCategory fetchByCompanyGroupUser_Last(long companyId,
		long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator);

	/**
	* Returns the asset categories before and after the current asset category in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param assetCategoryId the primary key of the current asset category
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset category
	* @throws NoSuchAssetCategoryException if a asset category with the primary key could not be found
	*/
	public AssetCategory[] findByCompanyGroupUser_PrevAndNext(
		long assetCategoryId, long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator)
		throws NoSuchAssetCategoryException;

	/**
	* Removes all the asset categories where companyId = &#63; and groupId = &#63; and userId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	*/
	public void removeByCompanyGroupUser(long companyId, long groupId,
		long userId);

	/**
	* Returns the number of asset categories where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @return the number of matching asset categories
	*/
	public int countByCompanyGroupUser(long companyId, long groupId, long userId);

	/**
	* Caches the asset category in the entity cache if it is enabled.
	*
	* @param assetCategory the asset category
	*/
	public void cacheResult(AssetCategory assetCategory);

	/**
	* Caches the asset categories in the entity cache if it is enabled.
	*
	* @param assetCategories the asset categories
	*/
	public void cacheResult(java.util.List<AssetCategory> assetCategories);

	/**
	* Creates a new asset category with the primary key. Does not add the asset category to the database.
	*
	* @param assetCategoryId the primary key for the new asset category
	* @return the new asset category
	*/
	public AssetCategory create(long assetCategoryId);

	/**
	* Removes the asset category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetCategoryId the primary key of the asset category
	* @return the asset category that was removed
	* @throws NoSuchAssetCategoryException if a asset category with the primary key could not be found
	*/
	public AssetCategory remove(long assetCategoryId)
		throws NoSuchAssetCategoryException;

	public AssetCategory updateImpl(AssetCategory assetCategory);

	/**
	* Returns the asset category with the primary key or throws a {@link NoSuchAssetCategoryException} if it could not be found.
	*
	* @param assetCategoryId the primary key of the asset category
	* @return the asset category
	* @throws NoSuchAssetCategoryException if a asset category with the primary key could not be found
	*/
	public AssetCategory findByPrimaryKey(long assetCategoryId)
		throws NoSuchAssetCategoryException;

	/**
	* Returns the asset category with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param assetCategoryId the primary key of the asset category
	* @return the asset category, or <code>null</code> if a asset category with the primary key could not be found
	*/
	public AssetCategory fetchByPrimaryKey(long assetCategoryId);

	@Override
	public java.util.Map<java.io.Serializable, AssetCategory> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the asset categories.
	*
	* @return the asset categories
	*/
	public java.util.List<AssetCategory> findAll();

	/**
	* Returns a range of all the asset categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset categories
	* @param end the upper bound of the range of asset categories (not inclusive)
	* @return the range of asset categories
	*/
	public java.util.List<AssetCategory> findAll(int start, int end);

	/**
	* Returns an ordered range of all the asset categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset categories
	* @param end the upper bound of the range of asset categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of asset categories
	*/
	public java.util.List<AssetCategory> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator);

	/**
	* Returns an ordered range of all the asset categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset categories
	* @param end the upper bound of the range of asset categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of asset categories
	*/
	public java.util.List<AssetCategory> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetCategory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the asset categories from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of asset categories.
	*
	* @return the number of asset categories
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}