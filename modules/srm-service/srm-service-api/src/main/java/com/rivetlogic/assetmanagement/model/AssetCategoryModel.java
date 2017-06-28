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

package com.rivetlogic.assetmanagement.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the AssetCategory service. Represents a row in the &quot;rivetlogic_AssetCategory&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rivetlogic.assetmanagement.model.impl.AssetCategoryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rivetlogic.assetmanagement.model.impl.AssetCategoryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetCategory
 * @see com.rivetlogic.assetmanagement.model.impl.AssetCategoryImpl
 * @see com.rivetlogic.assetmanagement.model.impl.AssetCategoryModelImpl
 * @generated
 */
@ProviderType
public interface AssetCategoryModel extends BaseModel<AssetCategory>,
	ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a asset category model instance should use the {@link AssetCategory} interface instead.
	 */

	/**
	 * Returns the primary key of this asset category.
	 *
	 * @return the primary key of this asset category
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this asset category.
	 *
	 * @param primaryKey the primary key of this asset category
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this asset category.
	 *
	 * @return the uuid of this asset category
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this asset category.
	 *
	 * @param uuid the uuid of this asset category
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the asset category ID of this asset category.
	 *
	 * @return the asset category ID of this asset category
	 */
	public long getAssetCategoryId();

	/**
	 * Sets the asset category ID of this asset category.
	 *
	 * @param assetCategoryId the asset category ID of this asset category
	 */
	public void setAssetCategoryId(long assetCategoryId);

	/**
	 * Returns the group ID of this asset category.
	 *
	 * @return the group ID of this asset category
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this asset category.
	 *
	 * @param groupId the group ID of this asset category
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this asset category.
	 *
	 * @return the company ID of this asset category
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this asset category.
	 *
	 * @param companyId the company ID of this asset category
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this asset category.
	 *
	 * @return the user ID of this asset category
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this asset category.
	 *
	 * @param userId the user ID of this asset category
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this asset category.
	 *
	 * @return the user uuid of this asset category
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this asset category.
	 *
	 * @param userUuid the user uuid of this asset category
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this asset category.
	 *
	 * @return the user name of this asset category
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this asset category.
	 *
	 * @param userName the user name of this asset category
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create date of this asset category.
	 *
	 * @return the create date of this asset category
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this asset category.
	 *
	 * @param createDate the create date of this asset category
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the name of this asset category.
	 *
	 * @return the name of this asset category
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this asset category.
	 *
	 * @param name the name of this asset category
	 */
	public void setName(String name);

	/**
	 * Returns the description of this asset category.
	 *
	 * @return the description of this asset category
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this asset category.
	 *
	 * @param description the description of this asset category
	 */
	public void setDescription(String description);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(AssetCategory assetCategory);

	@Override
	public int hashCode();

	@Override
	public CacheModel<AssetCategory> toCacheModel();

	@Override
	public AssetCategory toEscapedModel();

	@Override
	public AssetCategory toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}