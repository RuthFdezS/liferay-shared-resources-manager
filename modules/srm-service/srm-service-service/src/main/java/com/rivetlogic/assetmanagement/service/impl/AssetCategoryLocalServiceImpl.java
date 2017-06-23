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
import com.rivetlogic.assetmanagement.model.AssetCategory;
import com.rivetlogic.assetmanagement.service.base.AssetCategoryLocalServiceBaseImpl;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the asset category local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.rivetlogic.assetmanagement.service.AssetCategoryLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetCategoryLocalServiceBaseImpl
 * @see com.rivetlogic.assetmanagement.service.AssetCategoryLocalServiceUtil
 */
@ProviderType
public class AssetCategoryLocalServiceImpl
extends AssetCategoryLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.rivetlogic.assetmanagement.service.AssetCategoryLocalServiceUtil} to access the asset category local service.
	 */

	public AssetCategory addAssetCategory(ThemeDisplay themeDisplay, ServiceContext serviceContext, AssetCategory assetCategory)
			throws SystemException {

		long assetCategoryId = counterLocalService.increment(AssetCategory.class.getName());
		Date now = new Date();

		AssetCategory category = assetCategoryPersistence.create(assetCategoryId);

		category.setCompanyId(themeDisplay.getCompanyId());
		category.setGroupId(themeDisplay.getScopeGroupId());
		category.setUserId(themeDisplay.getUserId());

		category.setCreateDate(now);
		category.setName(assetCategory.getName());

		return assetCategoryLocalService.addAssetCategory(category);
	}

	public List<AssetCategory> getAssetCategories(long groupId, long companyId, int start, int end) throws PortalException, SystemException {

		List<AssetCategory> categories = null;

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

			categories = dynamicQuery(dynamicQuery);

		} catch (SystemException e) {
			_log.error(e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			_log.error(e.getMessage());
		}

		return categories;
	}

	public int getAssetCategoriesCount(long groupId, long companyId) throws SystemException {
		return assetCategoryPersistence.countByCompanyGroup(companyId, groupId);
	}

	private static final Log _log = LogFactoryUtil.getLog(AssetCategoryLocalServiceImpl.class);
}
