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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link AssetCategory}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetCategory
 * @generated
 */
@ProviderType
public class AssetCategoryWrapper implements AssetCategory,
	ModelWrapper<AssetCategory> {
	public AssetCategoryWrapper(AssetCategory assetCategory) {
		_assetCategory = assetCategory;
	}

	@Override
	public Class<?> getModelClass() {
		return AssetCategory.class;
	}

	@Override
	public String getModelClassName() {
		return AssetCategory.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("assetCategoryId", getAssetCategoryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("name", getName());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long assetCategoryId = (Long)attributes.get("assetCategoryId");

		if (assetCategoryId != null) {
			setAssetCategoryId(assetCategoryId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	@Override
	public AssetCategory toEscapedModel() {
		return new AssetCategoryWrapper(_assetCategory.toEscapedModel());
	}

	@Override
	public AssetCategory toUnescapedModel() {
		return new AssetCategoryWrapper(_assetCategory.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _assetCategory.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _assetCategory.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _assetCategory.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _assetCategory.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<AssetCategory> toCacheModel() {
		return _assetCategory.toCacheModel();
	}

	@Override
	public int compareTo(AssetCategory assetCategory) {
		return _assetCategory.compareTo(assetCategory);
	}

	@Override
	public int hashCode() {
		return _assetCategory.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _assetCategory.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AssetCategoryWrapper((AssetCategory)_assetCategory.clone());
	}

	/**
	* Returns the description of this asset category.
	*
	* @return the description of this asset category
	*/
	@Override
	public java.lang.String getDescription() {
		return _assetCategory.getDescription();
	}

	/**
	* Returns the name of this asset category.
	*
	* @return the name of this asset category
	*/
	@Override
	public java.lang.String getName() {
		return _assetCategory.getName();
	}

	/**
	* Returns the user name of this asset category.
	*
	* @return the user name of this asset category
	*/
	@Override
	public java.lang.String getUserName() {
		return _assetCategory.getUserName();
	}

	/**
	* Returns the user uuid of this asset category.
	*
	* @return the user uuid of this asset category
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _assetCategory.getUserUuid();
	}

	/**
	* Returns the uuid of this asset category.
	*
	* @return the uuid of this asset category
	*/
	@Override
	public java.lang.String getUuid() {
		return _assetCategory.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _assetCategory.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _assetCategory.toXmlString();
	}

	/**
	* Returns the create date of this asset category.
	*
	* @return the create date of this asset category
	*/
	@Override
	public Date getCreateDate() {
		return _assetCategory.getCreateDate();
	}

	/**
	* Returns the asset category ID of this asset category.
	*
	* @return the asset category ID of this asset category
	*/
	@Override
	public long getAssetCategoryId() {
		return _assetCategory.getAssetCategoryId();
	}

	/**
	* Returns the company ID of this asset category.
	*
	* @return the company ID of this asset category
	*/
	@Override
	public long getCompanyId() {
		return _assetCategory.getCompanyId();
	}

	/**
	* Returns the group ID of this asset category.
	*
	* @return the group ID of this asset category
	*/
	@Override
	public long getGroupId() {
		return _assetCategory.getGroupId();
	}

	/**
	* Returns the primary key of this asset category.
	*
	* @return the primary key of this asset category
	*/
	@Override
	public long getPrimaryKey() {
		return _assetCategory.getPrimaryKey();
	}

	/**
	* Returns the user ID of this asset category.
	*
	* @return the user ID of this asset category
	*/
	@Override
	public long getUserId() {
		return _assetCategory.getUserId();
	}

	@Override
	public void persist() {
		_assetCategory.persist();
	}

	/**
	* Sets the asset category ID of this asset category.
	*
	* @param assetCategoryId the asset category ID of this asset category
	*/
	@Override
	public void setAssetCategoryId(long assetCategoryId) {
		_assetCategory.setAssetCategoryId(assetCategoryId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_assetCategory.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this asset category.
	*
	* @param companyId the company ID of this asset category
	*/
	@Override
	public void setCompanyId(long companyId) {
		_assetCategory.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this asset category.
	*
	* @param createDate the create date of this asset category
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_assetCategory.setCreateDate(createDate);
	}

	/**
	* Sets the description of this asset category.
	*
	* @param description the description of this asset category
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_assetCategory.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_assetCategory.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_assetCategory.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_assetCategory.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this asset category.
	*
	* @param groupId the group ID of this asset category
	*/
	@Override
	public void setGroupId(long groupId) {
		_assetCategory.setGroupId(groupId);
	}

	/**
	* Sets the name of this asset category.
	*
	* @param name the name of this asset category
	*/
	@Override
	public void setName(java.lang.String name) {
		_assetCategory.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_assetCategory.setNew(n);
	}

	/**
	* Sets the primary key of this asset category.
	*
	* @param primaryKey the primary key of this asset category
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_assetCategory.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_assetCategory.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this asset category.
	*
	* @param userId the user ID of this asset category
	*/
	@Override
	public void setUserId(long userId) {
		_assetCategory.setUserId(userId);
	}

	/**
	* Sets the user name of this asset category.
	*
	* @param userName the user name of this asset category
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_assetCategory.setUserName(userName);
	}

	/**
	* Sets the user uuid of this asset category.
	*
	* @param userUuid the user uuid of this asset category
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_assetCategory.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this asset category.
	*
	* @param uuid the uuid of this asset category
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_assetCategory.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssetCategoryWrapper)) {
			return false;
		}

		AssetCategoryWrapper assetCategoryWrapper = (AssetCategoryWrapper)obj;

		if (Objects.equals(_assetCategory, assetCategoryWrapper._assetCategory)) {
			return true;
		}

		return false;
	}

	@Override
	public AssetCategory getWrappedModel() {
		return _assetCategory;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _assetCategory.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _assetCategory.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_assetCategory.resetOriginalValues();
	}

	private final AssetCategory _assetCategory;
}