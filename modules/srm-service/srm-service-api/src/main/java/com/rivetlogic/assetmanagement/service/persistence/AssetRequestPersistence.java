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

import com.rivetlogic.assetmanagement.exception.NoSuchAssetRequestException;
import com.rivetlogic.assetmanagement.model.AssetRequest;

/**
 * The persistence interface for the asset request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.rivetlogic.assetmanagement.service.persistence.impl.AssetRequestPersistenceImpl
 * @see AssetRequestUtil
 * @generated
 */
@ProviderType
public interface AssetRequestPersistence extends BasePersistence<AssetRequest> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AssetRequestUtil} to access the asset request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the asset requests where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching asset requests
	*/
	public java.util.List<AssetRequest> findByUuid(java.lang.String uuid);

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
	public java.util.List<AssetRequest> findByUuid(java.lang.String uuid,
		int start, int end);

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
	public java.util.List<AssetRequest> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator);

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
	public java.util.List<AssetRequest> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first asset request in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset request
	* @throws NoSuchAssetRequestException if a matching asset request could not be found
	*/
	public AssetRequest findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator)
		throws NoSuchAssetRequestException;

	/**
	* Returns the first asset request in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset request, or <code>null</code> if a matching asset request could not be found
	*/
	public AssetRequest fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator);

	/**
	* Returns the last asset request in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset request
	* @throws NoSuchAssetRequestException if a matching asset request could not be found
	*/
	public AssetRequest findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator)
		throws NoSuchAssetRequestException;

	/**
	* Returns the last asset request in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset request, or <code>null</code> if a matching asset request could not be found
	*/
	public AssetRequest fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator);

	/**
	* Returns the asset requests before and after the current asset request in the ordered set where uuid = &#63;.
	*
	* @param assetRequestId the primary key of the current asset request
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset request
	* @throws NoSuchAssetRequestException if a asset request with the primary key could not be found
	*/
	public AssetRequest[] findByUuid_PrevAndNext(long assetRequestId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator)
		throws NoSuchAssetRequestException;

	/**
	* Removes all the asset requests where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of asset requests where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching asset requests
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the asset request where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchAssetRequestException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching asset request
	* @throws NoSuchAssetRequestException if a matching asset request could not be found
	*/
	public AssetRequest findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchAssetRequestException;

	/**
	* Returns the asset request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching asset request, or <code>null</code> if a matching asset request could not be found
	*/
	public AssetRequest fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the asset request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching asset request, or <code>null</code> if a matching asset request could not be found
	*/
	public AssetRequest fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the asset request where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the asset request that was removed
	*/
	public AssetRequest removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchAssetRequestException;

	/**
	* Returns the number of asset requests where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching asset requests
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the asset requests where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching asset requests
	*/
	public java.util.List<AssetRequest> findByUuid_C(java.lang.String uuid,
		long companyId);

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
	public java.util.List<AssetRequest> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

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
	public java.util.List<AssetRequest> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator);

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
	public java.util.List<AssetRequest> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first asset request in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset request
	* @throws NoSuchAssetRequestException if a matching asset request could not be found
	*/
	public AssetRequest findByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator)
		throws NoSuchAssetRequestException;

	/**
	* Returns the first asset request in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset request, or <code>null</code> if a matching asset request could not be found
	*/
	public AssetRequest fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator);

	/**
	* Returns the last asset request in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset request
	* @throws NoSuchAssetRequestException if a matching asset request could not be found
	*/
	public AssetRequest findByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator)
		throws NoSuchAssetRequestException;

	/**
	* Returns the last asset request in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset request, or <code>null</code> if a matching asset request could not be found
	*/
	public AssetRequest fetchByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator);

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
	public AssetRequest[] findByUuid_C_PrevAndNext(long assetRequestId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator)
		throws NoSuchAssetRequestException;

	/**
	* Removes all the asset requests where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of asset requests where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching asset requests
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the asset requests where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching asset requests
	*/
	public java.util.List<AssetRequest> findByGroupId(long groupId);

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
	public java.util.List<AssetRequest> findByGroupId(long groupId, int start,
		int end);

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
	public java.util.List<AssetRequest> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator);

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
	public java.util.List<AssetRequest> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first asset request in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset request
	* @throws NoSuchAssetRequestException if a matching asset request could not be found
	*/
	public AssetRequest findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator)
		throws NoSuchAssetRequestException;

	/**
	* Returns the first asset request in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset request, or <code>null</code> if a matching asset request could not be found
	*/
	public AssetRequest fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator);

	/**
	* Returns the last asset request in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset request
	* @throws NoSuchAssetRequestException if a matching asset request could not be found
	*/
	public AssetRequest findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator)
		throws NoSuchAssetRequestException;

	/**
	* Returns the last asset request in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset request, or <code>null</code> if a matching asset request could not be found
	*/
	public AssetRequest fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator);

	/**
	* Returns the asset requests before and after the current asset request in the ordered set where groupId = &#63;.
	*
	* @param assetRequestId the primary key of the current asset request
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset request
	* @throws NoSuchAssetRequestException if a asset request with the primary key could not be found
	*/
	public AssetRequest[] findByGroupId_PrevAndNext(long assetRequestId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator)
		throws NoSuchAssetRequestException;

	/**
	* Removes all the asset requests where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of asset requests where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching asset requests
	*/
	public int countByGroupId(long groupId);

	/**
	* Returns all the asset requests where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching asset requests
	*/
	public java.util.List<AssetRequest> findByCompanyGroup(long companyId,
		long groupId);

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
	public java.util.List<AssetRequest> findByCompanyGroup(long companyId,
		long groupId, int start, int end);

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
	public java.util.List<AssetRequest> findByCompanyGroup(long companyId,
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator);

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
	public java.util.List<AssetRequest> findByCompanyGroup(long companyId,
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first asset request in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset request
	* @throws NoSuchAssetRequestException if a matching asset request could not be found
	*/
	public AssetRequest findByCompanyGroup_First(long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator)
		throws NoSuchAssetRequestException;

	/**
	* Returns the first asset request in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset request, or <code>null</code> if a matching asset request could not be found
	*/
	public AssetRequest fetchByCompanyGroup_First(long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator);

	/**
	* Returns the last asset request in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset request
	* @throws NoSuchAssetRequestException if a matching asset request could not be found
	*/
	public AssetRequest findByCompanyGroup_Last(long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator)
		throws NoSuchAssetRequestException;

	/**
	* Returns the last asset request in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset request, or <code>null</code> if a matching asset request could not be found
	*/
	public AssetRequest fetchByCompanyGroup_Last(long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator);

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
	public AssetRequest[] findByCompanyGroup_PrevAndNext(long assetRequestId,
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator)
		throws NoSuchAssetRequestException;

	/**
	* Removes all the asset requests where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	*/
	public void removeByCompanyGroup(long companyId, long groupId);

	/**
	* Returns the number of asset requests where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching asset requests
	*/
	public int countByCompanyGroup(long companyId, long groupId);

	/**
	* Returns all the asset requests where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @return the matching asset requests
	*/
	public java.util.List<AssetRequest> findByCompanyGroupUser(long companyId,
		long groupId, long userId);

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
	public java.util.List<AssetRequest> findByCompanyGroupUser(long companyId,
		long groupId, long userId, int start, int end);

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
	public java.util.List<AssetRequest> findByCompanyGroupUser(long companyId,
		long groupId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator);

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
	public java.util.List<AssetRequest> findByCompanyGroupUser(long companyId,
		long groupId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator,
		boolean retrieveFromCache);

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
	public AssetRequest findByCompanyGroupUser_First(long companyId,
		long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator)
		throws NoSuchAssetRequestException;

	/**
	* Returns the first asset request in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset request, or <code>null</code> if a matching asset request could not be found
	*/
	public AssetRequest fetchByCompanyGroupUser_First(long companyId,
		long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator);

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
	public AssetRequest findByCompanyGroupUser_Last(long companyId,
		long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator)
		throws NoSuchAssetRequestException;

	/**
	* Returns the last asset request in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset request, or <code>null</code> if a matching asset request could not be found
	*/
	public AssetRequest fetchByCompanyGroupUser_Last(long companyId,
		long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator);

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
	public AssetRequest[] findByCompanyGroupUser_PrevAndNext(
		long assetRequestId, long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator)
		throws NoSuchAssetRequestException;

	/**
	* Removes all the asset requests where companyId = &#63; and groupId = &#63; and userId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	*/
	public void removeByCompanyGroupUser(long companyId, long groupId,
		long userId);

	/**
	* Returns the number of asset requests where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @return the number of matching asset requests
	*/
	public int countByCompanyGroupUser(long companyId, long groupId, long userId);

	/**
	* Caches the asset request in the entity cache if it is enabled.
	*
	* @param assetRequest the asset request
	*/
	public void cacheResult(AssetRequest assetRequest);

	/**
	* Caches the asset requests in the entity cache if it is enabled.
	*
	* @param assetRequests the asset requests
	*/
	public void cacheResult(java.util.List<AssetRequest> assetRequests);

	/**
	* Creates a new asset request with the primary key. Does not add the asset request to the database.
	*
	* @param assetRequestId the primary key for the new asset request
	* @return the new asset request
	*/
	public AssetRequest create(long assetRequestId);

	/**
	* Removes the asset request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetRequestId the primary key of the asset request
	* @return the asset request that was removed
	* @throws NoSuchAssetRequestException if a asset request with the primary key could not be found
	*/
	public AssetRequest remove(long assetRequestId)
		throws NoSuchAssetRequestException;

	public AssetRequest updateImpl(AssetRequest assetRequest);

	/**
	* Returns the asset request with the primary key or throws a {@link NoSuchAssetRequestException} if it could not be found.
	*
	* @param assetRequestId the primary key of the asset request
	* @return the asset request
	* @throws NoSuchAssetRequestException if a asset request with the primary key could not be found
	*/
	public AssetRequest findByPrimaryKey(long assetRequestId)
		throws NoSuchAssetRequestException;

	/**
	* Returns the asset request with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param assetRequestId the primary key of the asset request
	* @return the asset request, or <code>null</code> if a asset request with the primary key could not be found
	*/
	public AssetRequest fetchByPrimaryKey(long assetRequestId);

	@Override
	public java.util.Map<java.io.Serializable, AssetRequest> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the asset requests.
	*
	* @return the asset requests
	*/
	public java.util.List<AssetRequest> findAll();

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
	public java.util.List<AssetRequest> findAll(int start, int end);

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
	public java.util.List<AssetRequest> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator);

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
	public java.util.List<AssetRequest> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetRequest> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the asset requests from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of asset requests.
	*
	* @return the number of asset requests
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}