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

package com.rivetlogic.assetmanagement.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import com.rivetlogic.assetmanagement.exception.NoSuchAssetLocationException;
import com.rivetlogic.assetmanagement.model.AssetLocation;
import com.rivetlogic.assetmanagement.model.impl.AssetLocationImpl;
import com.rivetlogic.assetmanagement.model.impl.AssetLocationModelImpl;
import com.rivetlogic.assetmanagement.service.persistence.AssetLocationPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the asset location service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetLocationPersistence
 * @see com.rivetlogic.assetmanagement.service.persistence.AssetLocationUtil
 * @generated
 */
@ProviderType
public class AssetLocationPersistenceImpl extends BasePersistenceImpl<AssetLocation>
	implements AssetLocationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AssetLocationUtil} to access the asset location persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AssetLocationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AssetLocationModelImpl.ENTITY_CACHE_ENABLED,
			AssetLocationModelImpl.FINDER_CACHE_ENABLED,
			AssetLocationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AssetLocationModelImpl.ENTITY_CACHE_ENABLED,
			AssetLocationModelImpl.FINDER_CACHE_ENABLED,
			AssetLocationImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AssetLocationModelImpl.ENTITY_CACHE_ENABLED,
			AssetLocationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(AssetLocationModelImpl.ENTITY_CACHE_ENABLED,
			AssetLocationModelImpl.FINDER_CACHE_ENABLED,
			AssetLocationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(AssetLocationModelImpl.ENTITY_CACHE_ENABLED,
			AssetLocationModelImpl.FINDER_CACHE_ENABLED,
			AssetLocationImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByUuid", new String[] { String.class.getName() },
			AssetLocationModelImpl.UUID_COLUMN_BITMASK |
			AssetLocationModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(AssetLocationModelImpl.ENTITY_CACHE_ENABLED,
			AssetLocationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the asset locations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching asset locations
	 */
	@Override
	public List<AssetLocation> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<AssetLocation> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

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
	@Override
	public List<AssetLocation> findByUuid(String uuid, int start, int end,
		OrderByComparator<AssetLocation> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

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
	@Override
	public List<AssetLocation> findByUuid(String uuid, int start, int end,
		OrderByComparator<AssetLocation> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<AssetLocation> list = null;

		if (retrieveFromCache) {
			list = (List<AssetLocation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AssetLocation assetLocation : list) {
					if (!Objects.equals(uuid, assetLocation.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_ASSETLOCATION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssetLocationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<AssetLocation>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AssetLocation>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first asset location in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching asset location
	 * @throws NoSuchAssetLocationException if a matching asset location could not be found
	 */
	@Override
	public AssetLocation findByUuid_First(String uuid,
		OrderByComparator<AssetLocation> orderByComparator)
		throws NoSuchAssetLocationException {
		AssetLocation assetLocation = fetchByUuid_First(uuid, orderByComparator);

		if (assetLocation != null) {
			return assetLocation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssetLocationException(msg.toString());
	}

	/**
	 * Returns the first asset location in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching asset location, or <code>null</code> if a matching asset location could not be found
	 */
	@Override
	public AssetLocation fetchByUuid_First(String uuid,
		OrderByComparator<AssetLocation> orderByComparator) {
		List<AssetLocation> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last asset location in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching asset location
	 * @throws NoSuchAssetLocationException if a matching asset location could not be found
	 */
	@Override
	public AssetLocation findByUuid_Last(String uuid,
		OrderByComparator<AssetLocation> orderByComparator)
		throws NoSuchAssetLocationException {
		AssetLocation assetLocation = fetchByUuid_Last(uuid, orderByComparator);

		if (assetLocation != null) {
			return assetLocation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssetLocationException(msg.toString());
	}

	/**
	 * Returns the last asset location in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching asset location, or <code>null</code> if a matching asset location could not be found
	 */
	@Override
	public AssetLocation fetchByUuid_Last(String uuid,
		OrderByComparator<AssetLocation> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<AssetLocation> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the asset locations before and after the current asset location in the ordered set where uuid = &#63;.
	 *
	 * @param assetLocationId the primary key of the current asset location
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next asset location
	 * @throws NoSuchAssetLocationException if a asset location with the primary key could not be found
	 */
	@Override
	public AssetLocation[] findByUuid_PrevAndNext(long assetLocationId,
		String uuid, OrderByComparator<AssetLocation> orderByComparator)
		throws NoSuchAssetLocationException {
		AssetLocation assetLocation = findByPrimaryKey(assetLocationId);

		Session session = null;

		try {
			session = openSession();

			AssetLocation[] array = new AssetLocationImpl[3];

			array[0] = getByUuid_PrevAndNext(session, assetLocation, uuid,
					orderByComparator, true);

			array[1] = assetLocation;

			array[2] = getByUuid_PrevAndNext(session, assetLocation, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AssetLocation getByUuid_PrevAndNext(Session session,
		AssetLocation assetLocation, String uuid,
		OrderByComparator<AssetLocation> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASSETLOCATION_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(AssetLocationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assetLocation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssetLocation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the asset locations where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (AssetLocation assetLocation : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(assetLocation);
		}
	}

	/**
	 * Returns the number of asset locations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching asset locations
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ASSETLOCATION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "assetLocation.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "assetLocation.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(assetLocation.uuid IS NULL OR assetLocation.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(AssetLocationModelImpl.ENTITY_CACHE_ENABLED,
			AssetLocationModelImpl.FINDER_CACHE_ENABLED,
			AssetLocationImpl.class, FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			AssetLocationModelImpl.UUID_COLUMN_BITMASK |
			AssetLocationModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(AssetLocationModelImpl.ENTITY_CACHE_ENABLED,
			AssetLocationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the asset location where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchAssetLocationException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching asset location
	 * @throws NoSuchAssetLocationException if a matching asset location could not be found
	 */
	@Override
	public AssetLocation findByUUID_G(String uuid, long groupId)
		throws NoSuchAssetLocationException {
		AssetLocation assetLocation = fetchByUUID_G(uuid, groupId);

		if (assetLocation == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchAssetLocationException(msg.toString());
		}

		return assetLocation;
	}

	/**
	 * Returns the asset location where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching asset location, or <code>null</code> if a matching asset location could not be found
	 */
	@Override
	public AssetLocation fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the asset location where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching asset location, or <code>null</code> if a matching asset location could not be found
	 */
	@Override
	public AssetLocation fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof AssetLocation) {
			AssetLocation assetLocation = (AssetLocation)result;

			if (!Objects.equals(uuid, assetLocation.getUuid()) ||
					(groupId != assetLocation.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_ASSETLOCATION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<AssetLocation> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					AssetLocation assetLocation = list.get(0);

					result = assetLocation;

					cacheResult(assetLocation);

					if ((assetLocation.getUuid() == null) ||
							!assetLocation.getUuid().equals(uuid) ||
							(assetLocation.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, assetLocation);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (AssetLocation)result;
		}
	}

	/**
	 * Removes the asset location where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the asset location that was removed
	 */
	@Override
	public AssetLocation removeByUUID_G(String uuid, long groupId)
		throws NoSuchAssetLocationException {
		AssetLocation assetLocation = findByUUID_G(uuid, groupId);

		return remove(assetLocation);
	}

	/**
	 * Returns the number of asset locations where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching asset locations
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ASSETLOCATION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "assetLocation.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "assetLocation.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(assetLocation.uuid IS NULL OR assetLocation.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "assetLocation.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(AssetLocationModelImpl.ENTITY_CACHE_ENABLED,
			AssetLocationModelImpl.FINDER_CACHE_ENABLED,
			AssetLocationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(AssetLocationModelImpl.ENTITY_CACHE_ENABLED,
			AssetLocationModelImpl.FINDER_CACHE_ENABLED,
			AssetLocationImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			AssetLocationModelImpl.UUID_COLUMN_BITMASK |
			AssetLocationModelImpl.COMPANYID_COLUMN_BITMASK |
			AssetLocationModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(AssetLocationModelImpl.ENTITY_CACHE_ENABLED,
			AssetLocationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the asset locations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching asset locations
	 */
	@Override
	public List<AssetLocation> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<AssetLocation> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

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
	@Override
	public List<AssetLocation> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<AssetLocation> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<AssetLocation> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<AssetLocation> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<AssetLocation> list = null;

		if (retrieveFromCache) {
			list = (List<AssetLocation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AssetLocation assetLocation : list) {
					if (!Objects.equals(uuid, assetLocation.getUuid()) ||
							(companyId != assetLocation.getCompanyId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_ASSETLOCATION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssetLocationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<AssetLocation>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AssetLocation>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first asset location in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching asset location
	 * @throws NoSuchAssetLocationException if a matching asset location could not be found
	 */
	@Override
	public AssetLocation findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<AssetLocation> orderByComparator)
		throws NoSuchAssetLocationException {
		AssetLocation assetLocation = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (assetLocation != null) {
			return assetLocation;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssetLocationException(msg.toString());
	}

	/**
	 * Returns the first asset location in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching asset location, or <code>null</code> if a matching asset location could not be found
	 */
	@Override
	public AssetLocation fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<AssetLocation> orderByComparator) {
		List<AssetLocation> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last asset location in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching asset location
	 * @throws NoSuchAssetLocationException if a matching asset location could not be found
	 */
	@Override
	public AssetLocation findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<AssetLocation> orderByComparator)
		throws NoSuchAssetLocationException {
		AssetLocation assetLocation = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (assetLocation != null) {
			return assetLocation;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssetLocationException(msg.toString());
	}

	/**
	 * Returns the last asset location in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching asset location, or <code>null</code> if a matching asset location could not be found
	 */
	@Override
	public AssetLocation fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<AssetLocation> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<AssetLocation> list = findByUuid_C(uuid, companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public AssetLocation[] findByUuid_C_PrevAndNext(long assetLocationId,
		String uuid, long companyId,
		OrderByComparator<AssetLocation> orderByComparator)
		throws NoSuchAssetLocationException {
		AssetLocation assetLocation = findByPrimaryKey(assetLocationId);

		Session session = null;

		try {
			session = openSession();

			AssetLocation[] array = new AssetLocationImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, assetLocation, uuid,
					companyId, orderByComparator, true);

			array[1] = assetLocation;

			array[2] = getByUuid_C_PrevAndNext(session, assetLocation, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AssetLocation getByUuid_C_PrevAndNext(Session session,
		AssetLocation assetLocation, String uuid, long companyId,
		OrderByComparator<AssetLocation> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_ASSETLOCATION_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(AssetLocationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assetLocation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssetLocation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the asset locations where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (AssetLocation assetLocation : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assetLocation);
		}
	}

	/**
	 * Returns the number of asset locations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching asset locations
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ASSETLOCATION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "assetLocation.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "assetLocation.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(assetLocation.uuid IS NULL OR assetLocation.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "assetLocation.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(AssetLocationModelImpl.ENTITY_CACHE_ENABLED,
			AssetLocationModelImpl.FINDER_CACHE_ENABLED,
			AssetLocationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(AssetLocationModelImpl.ENTITY_CACHE_ENABLED,
			AssetLocationModelImpl.FINDER_CACHE_ENABLED,
			AssetLocationImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByGroupId", new String[] { Long.class.getName() },
			AssetLocationModelImpl.GROUPID_COLUMN_BITMASK |
			AssetLocationModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(AssetLocationModelImpl.ENTITY_CACHE_ENABLED,
			AssetLocationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the asset locations where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching asset locations
	 */
	@Override
	public List<AssetLocation> findByGroupId(long groupId) {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<AssetLocation> findByGroupId(long groupId, int start, int end) {
		return findByGroupId(groupId, start, end, null);
	}

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
	@Override
	public List<AssetLocation> findByGroupId(long groupId, int start, int end,
		OrderByComparator<AssetLocation> orderByComparator) {
		return findByGroupId(groupId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<AssetLocation> findByGroupId(long groupId, int start, int end,
		OrderByComparator<AssetLocation> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId, start, end, orderByComparator };
		}

		List<AssetLocation> list = null;

		if (retrieveFromCache) {
			list = (List<AssetLocation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AssetLocation assetLocation : list) {
					if ((groupId != assetLocation.getGroupId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_ASSETLOCATION_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssetLocationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<AssetLocation>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AssetLocation>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first asset location in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching asset location
	 * @throws NoSuchAssetLocationException if a matching asset location could not be found
	 */
	@Override
	public AssetLocation findByGroupId_First(long groupId,
		OrderByComparator<AssetLocation> orderByComparator)
		throws NoSuchAssetLocationException {
		AssetLocation assetLocation = fetchByGroupId_First(groupId,
				orderByComparator);

		if (assetLocation != null) {
			return assetLocation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssetLocationException(msg.toString());
	}

	/**
	 * Returns the first asset location in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching asset location, or <code>null</code> if a matching asset location could not be found
	 */
	@Override
	public AssetLocation fetchByGroupId_First(long groupId,
		OrderByComparator<AssetLocation> orderByComparator) {
		List<AssetLocation> list = findByGroupId(groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last asset location in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching asset location
	 * @throws NoSuchAssetLocationException if a matching asset location could not be found
	 */
	@Override
	public AssetLocation findByGroupId_Last(long groupId,
		OrderByComparator<AssetLocation> orderByComparator)
		throws NoSuchAssetLocationException {
		AssetLocation assetLocation = fetchByGroupId_Last(groupId,
				orderByComparator);

		if (assetLocation != null) {
			return assetLocation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssetLocationException(msg.toString());
	}

	/**
	 * Returns the last asset location in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching asset location, or <code>null</code> if a matching asset location could not be found
	 */
	@Override
	public AssetLocation fetchByGroupId_Last(long groupId,
		OrderByComparator<AssetLocation> orderByComparator) {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<AssetLocation> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the asset locations before and after the current asset location in the ordered set where groupId = &#63;.
	 *
	 * @param assetLocationId the primary key of the current asset location
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next asset location
	 * @throws NoSuchAssetLocationException if a asset location with the primary key could not be found
	 */
	@Override
	public AssetLocation[] findByGroupId_PrevAndNext(long assetLocationId,
		long groupId, OrderByComparator<AssetLocation> orderByComparator)
		throws NoSuchAssetLocationException {
		AssetLocation assetLocation = findByPrimaryKey(assetLocationId);

		Session session = null;

		try {
			session = openSession();

			AssetLocation[] array = new AssetLocationImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, assetLocation,
					groupId, orderByComparator, true);

			array[1] = assetLocation;

			array[2] = getByGroupId_PrevAndNext(session, assetLocation,
					groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AssetLocation getByGroupId_PrevAndNext(Session session,
		AssetLocation assetLocation, long groupId,
		OrderByComparator<AssetLocation> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASSETLOCATION_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(AssetLocationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assetLocation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssetLocation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the asset locations where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByGroupId(long groupId) {
		for (AssetLocation assetLocation : findByGroupId(groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assetLocation);
		}
	}

	/**
	 * Returns the number of asset locations where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching asset locations
	 */
	@Override
	public int countByGroupId(long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ASSETLOCATION_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "assetLocation.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYGROUP =
		new FinderPath(AssetLocationModelImpl.ENTITY_CACHE_ENABLED,
			AssetLocationModelImpl.FINDER_CACHE_ENABLED,
			AssetLocationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCompanyGroup",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYGROUP =
		new FinderPath(AssetLocationModelImpl.ENTITY_CACHE_ENABLED,
			AssetLocationModelImpl.FINDER_CACHE_ENABLED,
			AssetLocationImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCompanyGroup",
			new String[] { Long.class.getName(), Long.class.getName() },
			AssetLocationModelImpl.COMPANYID_COLUMN_BITMASK |
			AssetLocationModelImpl.GROUPID_COLUMN_BITMASK |
			AssetLocationModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYGROUP = new FinderPath(AssetLocationModelImpl.ENTITY_CACHE_ENABLED,
			AssetLocationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyGroup",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the asset locations where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the matching asset locations
	 */
	@Override
	public List<AssetLocation> findByCompanyGroup(long companyId, long groupId) {
		return findByCompanyGroup(companyId, groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<AssetLocation> findByCompanyGroup(long companyId, long groupId,
		int start, int end) {
		return findByCompanyGroup(companyId, groupId, start, end, null);
	}

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
	@Override
	public List<AssetLocation> findByCompanyGroup(long companyId, long groupId,
		int start, int end, OrderByComparator<AssetLocation> orderByComparator) {
		return findByCompanyGroup(companyId, groupId, start, end,
			orderByComparator, true);
	}

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
	@Override
	public List<AssetLocation> findByCompanyGroup(long companyId, long groupId,
		int start, int end, OrderByComparator<AssetLocation> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYGROUP;
			finderArgs = new Object[] { companyId, groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYGROUP;
			finderArgs = new Object[] {
					companyId, groupId,
					
					start, end, orderByComparator
				};
		}

		List<AssetLocation> list = null;

		if (retrieveFromCache) {
			list = (List<AssetLocation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AssetLocation assetLocation : list) {
					if ((companyId != assetLocation.getCompanyId()) ||
							(groupId != assetLocation.getGroupId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_ASSETLOCATION_WHERE);

			query.append(_FINDER_COLUMN_COMPANYGROUP_COMPANYID_2);

			query.append(_FINDER_COLUMN_COMPANYGROUP_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssetLocationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<AssetLocation>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AssetLocation>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first asset location in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching asset location
	 * @throws NoSuchAssetLocationException if a matching asset location could not be found
	 */
	@Override
	public AssetLocation findByCompanyGroup_First(long companyId, long groupId,
		OrderByComparator<AssetLocation> orderByComparator)
		throws NoSuchAssetLocationException {
		AssetLocation assetLocation = fetchByCompanyGroup_First(companyId,
				groupId, orderByComparator);

		if (assetLocation != null) {
			return assetLocation;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssetLocationException(msg.toString());
	}

	/**
	 * Returns the first asset location in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching asset location, or <code>null</code> if a matching asset location could not be found
	 */
	@Override
	public AssetLocation fetchByCompanyGroup_First(long companyId,
		long groupId, OrderByComparator<AssetLocation> orderByComparator) {
		List<AssetLocation> list = findByCompanyGroup(companyId, groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last asset location in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching asset location
	 * @throws NoSuchAssetLocationException if a matching asset location could not be found
	 */
	@Override
	public AssetLocation findByCompanyGroup_Last(long companyId, long groupId,
		OrderByComparator<AssetLocation> orderByComparator)
		throws NoSuchAssetLocationException {
		AssetLocation assetLocation = fetchByCompanyGroup_Last(companyId,
				groupId, orderByComparator);

		if (assetLocation != null) {
			return assetLocation;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssetLocationException(msg.toString());
	}

	/**
	 * Returns the last asset location in the ordered set where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching asset location, or <code>null</code> if a matching asset location could not be found
	 */
	@Override
	public AssetLocation fetchByCompanyGroup_Last(long companyId, long groupId,
		OrderByComparator<AssetLocation> orderByComparator) {
		int count = countByCompanyGroup(companyId, groupId);

		if (count == 0) {
			return null;
		}

		List<AssetLocation> list = findByCompanyGroup(companyId, groupId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public AssetLocation[] findByCompanyGroup_PrevAndNext(
		long assetLocationId, long companyId, long groupId,
		OrderByComparator<AssetLocation> orderByComparator)
		throws NoSuchAssetLocationException {
		AssetLocation assetLocation = findByPrimaryKey(assetLocationId);

		Session session = null;

		try {
			session = openSession();

			AssetLocation[] array = new AssetLocationImpl[3];

			array[0] = getByCompanyGroup_PrevAndNext(session, assetLocation,
					companyId, groupId, orderByComparator, true);

			array[1] = assetLocation;

			array[2] = getByCompanyGroup_PrevAndNext(session, assetLocation,
					companyId, groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AssetLocation getByCompanyGroup_PrevAndNext(Session session,
		AssetLocation assetLocation, long companyId, long groupId,
		OrderByComparator<AssetLocation> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_ASSETLOCATION_WHERE);

		query.append(_FINDER_COLUMN_COMPANYGROUP_COMPANYID_2);

		query.append(_FINDER_COLUMN_COMPANYGROUP_GROUPID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(AssetLocationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assetLocation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssetLocation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the asset locations where companyId = &#63; and groupId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 */
	@Override
	public void removeByCompanyGroup(long companyId, long groupId) {
		for (AssetLocation assetLocation : findByCompanyGroup(companyId,
				groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assetLocation);
		}
	}

	/**
	 * Returns the number of asset locations where companyId = &#63; and groupId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @return the number of matching asset locations
	 */
	@Override
	public int countByCompanyGroup(long companyId, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPANYGROUP;

		Object[] finderArgs = new Object[] { companyId, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ASSETLOCATION_WHERE);

			query.append(_FINDER_COLUMN_COMPANYGROUP_COMPANYID_2);

			query.append(_FINDER_COLUMN_COMPANYGROUP_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_COMPANYGROUP_COMPANYID_2 = "assetLocation.companyId = ? AND ";
	private static final String _FINDER_COLUMN_COMPANYGROUP_GROUPID_2 = "assetLocation.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYGROUPUSER =
		new FinderPath(AssetLocationModelImpl.ENTITY_CACHE_ENABLED,
			AssetLocationModelImpl.FINDER_CACHE_ENABLED,
			AssetLocationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCompanyGroupUser",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYGROUPUSER =
		new FinderPath(AssetLocationModelImpl.ENTITY_CACHE_ENABLED,
			AssetLocationModelImpl.FINDER_CACHE_ENABLED,
			AssetLocationImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCompanyGroupUser",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			AssetLocationModelImpl.COMPANYID_COLUMN_BITMASK |
			AssetLocationModelImpl.GROUPID_COLUMN_BITMASK |
			AssetLocationModelImpl.USERID_COLUMN_BITMASK |
			AssetLocationModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYGROUPUSER = new FinderPath(AssetLocationModelImpl.ENTITY_CACHE_ENABLED,
			AssetLocationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCompanyGroupUser",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns all the asset locations where companyId = &#63; and groupId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @return the matching asset locations
	 */
	@Override
	public List<AssetLocation> findByCompanyGroupUser(long companyId,
		long groupId, long userId) {
		return findByCompanyGroupUser(companyId, groupId, userId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<AssetLocation> findByCompanyGroupUser(long companyId,
		long groupId, long userId, int start, int end) {
		return findByCompanyGroupUser(companyId, groupId, userId, start, end,
			null);
	}

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
	@Override
	public List<AssetLocation> findByCompanyGroupUser(long companyId,
		long groupId, long userId, int start, int end,
		OrderByComparator<AssetLocation> orderByComparator) {
		return findByCompanyGroupUser(companyId, groupId, userId, start, end,
			orderByComparator, true);
	}

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
	@Override
	public List<AssetLocation> findByCompanyGroupUser(long companyId,
		long groupId, long userId, int start, int end,
		OrderByComparator<AssetLocation> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYGROUPUSER;
			finderArgs = new Object[] { companyId, groupId, userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYGROUPUSER;
			finderArgs = new Object[] {
					companyId, groupId, userId,
					
					start, end, orderByComparator
				};
		}

		List<AssetLocation> list = null;

		if (retrieveFromCache) {
			list = (List<AssetLocation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AssetLocation assetLocation : list) {
					if ((companyId != assetLocation.getCompanyId()) ||
							(groupId != assetLocation.getGroupId()) ||
							(userId != assetLocation.getUserId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_ASSETLOCATION_WHERE);

			query.append(_FINDER_COLUMN_COMPANYGROUPUSER_COMPANYID_2);

			query.append(_FINDER_COLUMN_COMPANYGROUPUSER_GROUPID_2);

			query.append(_FINDER_COLUMN_COMPANYGROUPUSER_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssetLocationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(userId);

				if (!pagination) {
					list = (List<AssetLocation>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AssetLocation>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

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
	@Override
	public AssetLocation findByCompanyGroupUser_First(long companyId,
		long groupId, long userId,
		OrderByComparator<AssetLocation> orderByComparator)
		throws NoSuchAssetLocationException {
		AssetLocation assetLocation = fetchByCompanyGroupUser_First(companyId,
				groupId, userId, orderByComparator);

		if (assetLocation != null) {
			return assetLocation;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssetLocationException(msg.toString());
	}

	/**
	 * Returns the first asset location in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching asset location, or <code>null</code> if a matching asset location could not be found
	 */
	@Override
	public AssetLocation fetchByCompanyGroupUser_First(long companyId,
		long groupId, long userId,
		OrderByComparator<AssetLocation> orderByComparator) {
		List<AssetLocation> list = findByCompanyGroupUser(companyId, groupId,
				userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public AssetLocation findByCompanyGroupUser_Last(long companyId,
		long groupId, long userId,
		OrderByComparator<AssetLocation> orderByComparator)
		throws NoSuchAssetLocationException {
		AssetLocation assetLocation = fetchByCompanyGroupUser_Last(companyId,
				groupId, userId, orderByComparator);

		if (assetLocation != null) {
			return assetLocation;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssetLocationException(msg.toString());
	}

	/**
	 * Returns the last asset location in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching asset location, or <code>null</code> if a matching asset location could not be found
	 */
	@Override
	public AssetLocation fetchByCompanyGroupUser_Last(long companyId,
		long groupId, long userId,
		OrderByComparator<AssetLocation> orderByComparator) {
		int count = countByCompanyGroupUser(companyId, groupId, userId);

		if (count == 0) {
			return null;
		}

		List<AssetLocation> list = findByCompanyGroupUser(companyId, groupId,
				userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public AssetLocation[] findByCompanyGroupUser_PrevAndNext(
		long assetLocationId, long companyId, long groupId, long userId,
		OrderByComparator<AssetLocation> orderByComparator)
		throws NoSuchAssetLocationException {
		AssetLocation assetLocation = findByPrimaryKey(assetLocationId);

		Session session = null;

		try {
			session = openSession();

			AssetLocation[] array = new AssetLocationImpl[3];

			array[0] = getByCompanyGroupUser_PrevAndNext(session,
					assetLocation, companyId, groupId, userId,
					orderByComparator, true);

			array[1] = assetLocation;

			array[2] = getByCompanyGroupUser_PrevAndNext(session,
					assetLocation, companyId, groupId, userId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AssetLocation getByCompanyGroupUser_PrevAndNext(Session session,
		AssetLocation assetLocation, long companyId, long groupId, long userId,
		OrderByComparator<AssetLocation> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_ASSETLOCATION_WHERE);

		query.append(_FINDER_COLUMN_COMPANYGROUPUSER_COMPANYID_2);

		query.append(_FINDER_COLUMN_COMPANYGROUPUSER_GROUPID_2);

		query.append(_FINDER_COLUMN_COMPANYGROUPUSER_USERID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(AssetLocationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(groupId);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assetLocation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssetLocation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the asset locations where companyId = &#63; and groupId = &#63; and userId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param userId the user ID
	 */
	@Override
	public void removeByCompanyGroupUser(long companyId, long groupId,
		long userId) {
		for (AssetLocation assetLocation : findByCompanyGroupUser(companyId,
				groupId, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assetLocation);
		}
	}

	/**
	 * Returns the number of asset locations where companyId = &#63; and groupId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @return the number of matching asset locations
	 */
	@Override
	public int countByCompanyGroupUser(long companyId, long groupId, long userId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPANYGROUPUSER;

		Object[] finderArgs = new Object[] { companyId, groupId, userId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ASSETLOCATION_WHERE);

			query.append(_FINDER_COLUMN_COMPANYGROUPUSER_COMPANYID_2);

			query.append(_FINDER_COLUMN_COMPANYGROUPUSER_GROUPID_2);

			query.append(_FINDER_COLUMN_COMPANYGROUPUSER_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(groupId);

				qPos.add(userId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_COMPANYGROUPUSER_COMPANYID_2 = "assetLocation.companyId = ? AND ";
	private static final String _FINDER_COLUMN_COMPANYGROUPUSER_GROUPID_2 = "assetLocation.groupId = ? AND ";
	private static final String _FINDER_COLUMN_COMPANYGROUPUSER_USERID_2 = "assetLocation.userId = ?";

	public AssetLocationPersistenceImpl() {
		setModelClass(AssetLocation.class);
	}

	/**
	 * Caches the asset location in the entity cache if it is enabled.
	 *
	 * @param assetLocation the asset location
	 */
	@Override
	public void cacheResult(AssetLocation assetLocation) {
		entityCache.putResult(AssetLocationModelImpl.ENTITY_CACHE_ENABLED,
			AssetLocationImpl.class, assetLocation.getPrimaryKey(),
			assetLocation);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { assetLocation.getUuid(), assetLocation.getGroupId() },
			assetLocation);

		assetLocation.resetOriginalValues();
	}

	/**
	 * Caches the asset locations in the entity cache if it is enabled.
	 *
	 * @param assetLocations the asset locations
	 */
	@Override
	public void cacheResult(List<AssetLocation> assetLocations) {
		for (AssetLocation assetLocation : assetLocations) {
			if (entityCache.getResult(
						AssetLocationModelImpl.ENTITY_CACHE_ENABLED,
						AssetLocationImpl.class, assetLocation.getPrimaryKey()) == null) {
				cacheResult(assetLocation);
			}
			else {
				assetLocation.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all asset locations.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AssetLocationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the asset location.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AssetLocation assetLocation) {
		entityCache.removeResult(AssetLocationModelImpl.ENTITY_CACHE_ENABLED,
			AssetLocationImpl.class, assetLocation.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((AssetLocationModelImpl)assetLocation, true);
	}

	@Override
	public void clearCache(List<AssetLocation> assetLocations) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AssetLocation assetLocation : assetLocations) {
			entityCache.removeResult(AssetLocationModelImpl.ENTITY_CACHE_ENABLED,
				AssetLocationImpl.class, assetLocation.getPrimaryKey());

			clearUniqueFindersCache((AssetLocationModelImpl)assetLocation, true);
		}
	}

	protected void cacheUniqueFindersCache(
		AssetLocationModelImpl assetLocationModelImpl) {
		Object[] args = new Object[] {
				assetLocationModelImpl.getUuid(),
				assetLocationModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			assetLocationModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		AssetLocationModelImpl assetLocationModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					assetLocationModelImpl.getUuid(),
					assetLocationModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((assetLocationModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					assetLocationModelImpl.getOriginalUuid(),
					assetLocationModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new asset location with the primary key. Does not add the asset location to the database.
	 *
	 * @param assetLocationId the primary key for the new asset location
	 * @return the new asset location
	 */
	@Override
	public AssetLocation create(long assetLocationId) {
		AssetLocation assetLocation = new AssetLocationImpl();

		assetLocation.setNew(true);
		assetLocation.setPrimaryKey(assetLocationId);

		String uuid = PortalUUIDUtil.generate();

		assetLocation.setUuid(uuid);

		assetLocation.setCompanyId(companyProvider.getCompanyId());

		return assetLocation;
	}

	/**
	 * Removes the asset location with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param assetLocationId the primary key of the asset location
	 * @return the asset location that was removed
	 * @throws NoSuchAssetLocationException if a asset location with the primary key could not be found
	 */
	@Override
	public AssetLocation remove(long assetLocationId)
		throws NoSuchAssetLocationException {
		return remove((Serializable)assetLocationId);
	}

	/**
	 * Removes the asset location with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the asset location
	 * @return the asset location that was removed
	 * @throws NoSuchAssetLocationException if a asset location with the primary key could not be found
	 */
	@Override
	public AssetLocation remove(Serializable primaryKey)
		throws NoSuchAssetLocationException {
		Session session = null;

		try {
			session = openSession();

			AssetLocation assetLocation = (AssetLocation)session.get(AssetLocationImpl.class,
					primaryKey);

			if (assetLocation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAssetLocationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(assetLocation);
		}
		catch (NoSuchAssetLocationException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected AssetLocation removeImpl(AssetLocation assetLocation) {
		assetLocation = toUnwrappedModel(assetLocation);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(assetLocation)) {
				assetLocation = (AssetLocation)session.get(AssetLocationImpl.class,
						assetLocation.getPrimaryKeyObj());
			}

			if (assetLocation != null) {
				session.delete(assetLocation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (assetLocation != null) {
			clearCache(assetLocation);
		}

		return assetLocation;
	}

	@Override
	public AssetLocation updateImpl(AssetLocation assetLocation) {
		assetLocation = toUnwrappedModel(assetLocation);

		boolean isNew = assetLocation.isNew();

		AssetLocationModelImpl assetLocationModelImpl = (AssetLocationModelImpl)assetLocation;

		if (Validator.isNull(assetLocation.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			assetLocation.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (assetLocation.isNew()) {
				session.save(assetLocation);

				assetLocation.setNew(false);
			}
			else {
				assetLocation = (AssetLocation)session.merge(assetLocation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !AssetLocationModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((assetLocationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assetLocationModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { assetLocationModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((assetLocationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assetLocationModelImpl.getOriginalUuid(),
						assetLocationModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						assetLocationModelImpl.getUuid(),
						assetLocationModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((assetLocationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assetLocationModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { assetLocationModelImpl.getGroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((assetLocationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYGROUP.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assetLocationModelImpl.getOriginalCompanyId(),
						assetLocationModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COMPANYGROUP, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYGROUP,
					args);

				args = new Object[] {
						assetLocationModelImpl.getCompanyId(),
						assetLocationModelImpl.getGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COMPANYGROUP, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYGROUP,
					args);
			}

			if ((assetLocationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYGROUPUSER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assetLocationModelImpl.getOriginalCompanyId(),
						assetLocationModelImpl.getOriginalGroupId(),
						assetLocationModelImpl.getOriginalUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COMPANYGROUPUSER,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYGROUPUSER,
					args);

				args = new Object[] {
						assetLocationModelImpl.getCompanyId(),
						assetLocationModelImpl.getGroupId(),
						assetLocationModelImpl.getUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COMPANYGROUPUSER,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYGROUPUSER,
					args);
			}
		}

		entityCache.putResult(AssetLocationModelImpl.ENTITY_CACHE_ENABLED,
			AssetLocationImpl.class, assetLocation.getPrimaryKey(),
			assetLocation, false);

		clearUniqueFindersCache(assetLocationModelImpl, false);
		cacheUniqueFindersCache(assetLocationModelImpl);

		assetLocation.resetOriginalValues();

		return assetLocation;
	}

	protected AssetLocation toUnwrappedModel(AssetLocation assetLocation) {
		if (assetLocation instanceof AssetLocationImpl) {
			return assetLocation;
		}

		AssetLocationImpl assetLocationImpl = new AssetLocationImpl();

		assetLocationImpl.setNew(assetLocation.isNew());
		assetLocationImpl.setPrimaryKey(assetLocation.getPrimaryKey());

		assetLocationImpl.setUuid(assetLocation.getUuid());
		assetLocationImpl.setAssetLocationId(assetLocation.getAssetLocationId());
		assetLocationImpl.setGroupId(assetLocation.getGroupId());
		assetLocationImpl.setCompanyId(assetLocation.getCompanyId());
		assetLocationImpl.setUserId(assetLocation.getUserId());
		assetLocationImpl.setUserName(assetLocation.getUserName());
		assetLocationImpl.setCreateDate(assetLocation.getCreateDate());
		assetLocationImpl.setName(assetLocation.getName());
		assetLocationImpl.setDescription(assetLocation.getDescription());

		return assetLocationImpl;
	}

	/**
	 * Returns the asset location with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the asset location
	 * @return the asset location
	 * @throws NoSuchAssetLocationException if a asset location with the primary key could not be found
	 */
	@Override
	public AssetLocation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAssetLocationException {
		AssetLocation assetLocation = fetchByPrimaryKey(primaryKey);

		if (assetLocation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAssetLocationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return assetLocation;
	}

	/**
	 * Returns the asset location with the primary key or throws a {@link NoSuchAssetLocationException} if it could not be found.
	 *
	 * @param assetLocationId the primary key of the asset location
	 * @return the asset location
	 * @throws NoSuchAssetLocationException if a asset location with the primary key could not be found
	 */
	@Override
	public AssetLocation findByPrimaryKey(long assetLocationId)
		throws NoSuchAssetLocationException {
		return findByPrimaryKey((Serializable)assetLocationId);
	}

	/**
	 * Returns the asset location with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the asset location
	 * @return the asset location, or <code>null</code> if a asset location with the primary key could not be found
	 */
	@Override
	public AssetLocation fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AssetLocationModelImpl.ENTITY_CACHE_ENABLED,
				AssetLocationImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		AssetLocation assetLocation = (AssetLocation)serializable;

		if (assetLocation == null) {
			Session session = null;

			try {
				session = openSession();

				assetLocation = (AssetLocation)session.get(AssetLocationImpl.class,
						primaryKey);

				if (assetLocation != null) {
					cacheResult(assetLocation);
				}
				else {
					entityCache.putResult(AssetLocationModelImpl.ENTITY_CACHE_ENABLED,
						AssetLocationImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AssetLocationModelImpl.ENTITY_CACHE_ENABLED,
					AssetLocationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return assetLocation;
	}

	/**
	 * Returns the asset location with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param assetLocationId the primary key of the asset location
	 * @return the asset location, or <code>null</code> if a asset location with the primary key could not be found
	 */
	@Override
	public AssetLocation fetchByPrimaryKey(long assetLocationId) {
		return fetchByPrimaryKey((Serializable)assetLocationId);
	}

	@Override
	public Map<Serializable, AssetLocation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, AssetLocation> map = new HashMap<Serializable, AssetLocation>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			AssetLocation assetLocation = fetchByPrimaryKey(primaryKey);

			if (assetLocation != null) {
				map.put(primaryKey, assetLocation);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AssetLocationModelImpl.ENTITY_CACHE_ENABLED,
					AssetLocationImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (AssetLocation)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ASSETLOCATION_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (AssetLocation assetLocation : (List<AssetLocation>)q.list()) {
				map.put(assetLocation.getPrimaryKeyObj(), assetLocation);

				cacheResult(assetLocation);

				uncachedPrimaryKeys.remove(assetLocation.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AssetLocationModelImpl.ENTITY_CACHE_ENABLED,
					AssetLocationImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the asset locations.
	 *
	 * @return the asset locations
	 */
	@Override
	public List<AssetLocation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<AssetLocation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<AssetLocation> findAll(int start, int end,
		OrderByComparator<AssetLocation> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<AssetLocation> findAll(int start, int end,
		OrderByComparator<AssetLocation> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<AssetLocation> list = null;

		if (retrieveFromCache) {
			list = (List<AssetLocation>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ASSETLOCATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ASSETLOCATION;

				if (pagination) {
					sql = sql.concat(AssetLocationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AssetLocation>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AssetLocation>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the asset locations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AssetLocation assetLocation : findAll()) {
			remove(assetLocation);
		}
	}

	/**
	 * Returns the number of asset locations.
	 *
	 * @return the number of asset locations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ASSETLOCATION);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AssetLocationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the asset location persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AssetLocationImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ASSETLOCATION = "SELECT assetLocation FROM AssetLocation assetLocation";
	private static final String _SQL_SELECT_ASSETLOCATION_WHERE_PKS_IN = "SELECT assetLocation FROM AssetLocation assetLocation WHERE assetLocationId IN (";
	private static final String _SQL_SELECT_ASSETLOCATION_WHERE = "SELECT assetLocation FROM AssetLocation assetLocation WHERE ";
	private static final String _SQL_COUNT_ASSETLOCATION = "SELECT COUNT(assetLocation) FROM AssetLocation assetLocation";
	private static final String _SQL_COUNT_ASSETLOCATION_WHERE = "SELECT COUNT(assetLocation) FROM AssetLocation assetLocation WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "assetLocation.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AssetLocation exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AssetLocation exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(AssetLocationPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}