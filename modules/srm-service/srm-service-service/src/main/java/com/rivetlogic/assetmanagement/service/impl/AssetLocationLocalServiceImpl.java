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

package com.rivetlogic.assetmanagement.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.Disjunction;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.PortalUtil;
import com.rivetlogic.assetmanagement.model.AssetLocation;
import com.rivetlogic.assetmanagement.service.base.AssetLocationLocalServiceBaseImpl;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the asset location local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.rivetlogic.assetmanagement.service.AssetLocationLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetLocationLocalServiceBaseImpl
 * @see com.rivetlogic.assetmanagement.service.AssetLocationLocalServiceUtil
 */
@ProviderType
public class AssetLocationLocalServiceImpl
extends AssetLocationLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.rivetlogic.assetmanagement.service.AssetLocationLocalServiceUtil} to access the asset location local service.
	 */

	public AssetLocation addAssetLocation(ThemeDisplay themeDisplay, ServiceContext serviceContext, AssetLocation AssetLocation)
			throws SystemException {

		long assetLocationId = counterLocalService.increment(AssetLocation.class.getName());
		Date now = new Date();

		AssetLocation location = assetLocationPersistence.create(assetLocationId);

		location.setCompanyId(themeDisplay.getCompanyId());
		location.setGroupId(themeDisplay.getScopeGroupId());
		location.setUserId(themeDisplay.getUserId());

		location.setCreateDate(now);
		location.setName(AssetLocation.getName());

		return assetLocationLocalService.addAssetLocation(location);
	}

	public List<AssetLocation> getAssetLocations(long groupId, long companyId, int start, int end) throws PortalException, SystemException {

		List<AssetLocation> locations = null;

		DynamicQuery dynamicQuery = dynamicQuery();

		Disjunction disjunction = RestrictionsFactoryUtil.disjunction();
		disjunction.add(PropertyFactoryUtil.forName("groupId").eq(groupId));
		disjunction.add(PropertyFactoryUtil.forName("groupId").eq(
				GroupLocalServiceUtil.getCompanyGroup(PortalUtil.getDefaultCompanyId()).getGroupId()));
		dynamicQuery.add(disjunction);

		dynamicQuery.add(PropertyFactoryUtil.forName("companyId").eq(companyId));

		dynamicQuery.setLimit(start, end);

		dynamicQuery.addOrder(OrderFactoryUtil.asc("name"));

		try {

			locations = dynamicQuery(dynamicQuery);

		} catch (SystemException e) {
			_log.error(e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			_log.error(e.getMessage());
		}

		return locations;
	}

	public int getAssetLocationsCount(long groupId, long companyId) throws SystemException {
		return assetLocationPersistence.countByCompanyGroup(companyId, groupId);
	}

	private static final Log _log = LogFactoryUtil.getLog(AssetLocationLocalServiceImpl.class);
}
