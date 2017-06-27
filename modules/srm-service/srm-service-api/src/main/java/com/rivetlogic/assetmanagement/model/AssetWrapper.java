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

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.sql.Blob;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Asset}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Asset
 * @generated
 */
@ProviderType
public class AssetWrapper implements Asset, ModelWrapper<Asset> {
	public AssetWrapper(Asset asset) {
		_asset = asset;
	}

	@Override
	public Class<?> getModelClass() {
		return Asset.class;
	}

	@Override
	public String getModelClassName() {
		return Asset.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("assetId", getAssetId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("location", getLocation());
		attributes.put("active", getActive());
		attributes.put("category", getCategory());
		attributes.put("status", getStatus());
		attributes.put("mimeType", getMimeType());
		attributes.put("photo", getPhoto());
		attributes.put("currentUserId", getCurrentUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long assetId = (Long)attributes.get("assetId");

		if (assetId != null) {
			setAssetId(assetId);
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

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long location = (Long)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		Boolean active = (Boolean)attributes.get("active");

		if (active != null) {
			setActive(active);
		}

		Long category = (Long)attributes.get("category");

		if (category != null) {
			setCategory(category);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String mimeType = (String)attributes.get("mimeType");

		if (mimeType != null) {
			setMimeType(mimeType);
		}

		Blob photo = (Blob)attributes.get("photo");

		if (photo != null) {
			setPhoto(photo);
		}

		Long currentUserId = (Long)attributes.get("currentUserId");

		if (currentUserId != null) {
			setCurrentUserId(currentUserId);
		}
	}

	@Override
	public Asset toEscapedModel() {
		return new AssetWrapper(_asset.toEscapedModel());
	}

	@Override
	public Asset toUnescapedModel() {
		return new AssetWrapper(_asset.toUnescapedModel());
	}

	/**
	* Returns the active of this asset.
	*
	* @return the active of this asset
	*/
	@Override
	public boolean getActive() {
		return _asset.getActive();
	}

	/**
	* Returns <code>true</code> if this asset is active.
	*
	* @return <code>true</code> if this asset is active; <code>false</code> otherwise
	*/
	@Override
	public boolean isActive() {
		return _asset.isActive();
	}

	@Override
	public boolean isCachedModel() {
		return _asset.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _asset.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _asset.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _asset.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Asset> toCacheModel() {
		return _asset.toCacheModel();
	}

	@Override
	public int compareTo(Asset asset) {
		return _asset.compareTo(asset);
	}

	@Override
	public int hashCode() {
		return _asset.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _asset.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AssetWrapper((Asset)_asset.clone());
	}

	/**
	* Returns the current user uuid of this asset.
	*
	* @return the current user uuid of this asset
	*/
	@Override
	public java.lang.String getCurrentUserUuid() {
		return _asset.getCurrentUserUuid();
	}

	/**
	* Returns the description of this asset.
	*
	* @return the description of this asset
	*/
	@Override
	public java.lang.String getDescription() {
		return _asset.getDescription();
	}

	/**
	* Returns the mime type of this asset.
	*
	* @return the mime type of this asset
	*/
	@Override
	public java.lang.String getMimeType() {
		return _asset.getMimeType();
	}

	/**
	* Returns the name of this asset.
	*
	* @return the name of this asset
	*/
	@Override
	public java.lang.String getName() {
		return _asset.getName();
	}

	/**
	* Returns the status of this asset.
	*
	* @return the status of this asset
	*/
	@Override
	public java.lang.String getStatus() {
		return _asset.getStatus();
	}

	/**
	* Returns the user name of this asset.
	*
	* @return the user name of this asset
	*/
	@Override
	public java.lang.String getUserName() {
		return _asset.getUserName();
	}

	/**
	* Returns the user uuid of this asset.
	*
	* @return the user uuid of this asset
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _asset.getUserUuid();
	}

	/**
	* Returns the uuid of this asset.
	*
	* @return the uuid of this asset
	*/
	@Override
	public java.lang.String getUuid() {
		return _asset.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _asset.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _asset.toXmlString();
	}

	/**
	* Returns the photo of this asset.
	*
	* @return the photo of this asset
	*/
	@Override
	public Blob getPhoto() {
		return _asset.getPhoto();
	}

	/**
	* Returns the create date of this asset.
	*
	* @return the create date of this asset
	*/
	@Override
	public Date getCreateDate() {
		return _asset.getCreateDate();
	}

	/**
	* Returns the modified date of this asset.
	*
	* @return the modified date of this asset
	*/
	@Override
	public Date getModifiedDate() {
		return _asset.getModifiedDate();
	}

	/**
	* Returns the asset ID of this asset.
	*
	* @return the asset ID of this asset
	*/
	@Override
	public long getAssetId() {
		return _asset.getAssetId();
	}

	/**
	* Returns the category of this asset.
	*
	* @return the category of this asset
	*/
	@Override
	public long getCategory() {
		return _asset.getCategory();
	}

	/**
	* Returns the company ID of this asset.
	*
	* @return the company ID of this asset
	*/
	@Override
	public long getCompanyId() {
		return _asset.getCompanyId();
	}

	/**
	* Returns the current user ID of this asset.
	*
	* @return the current user ID of this asset
	*/
	@Override
	public long getCurrentUserId() {
		return _asset.getCurrentUserId();
	}

	/**
	* Returns the group ID of this asset.
	*
	* @return the group ID of this asset
	*/
	@Override
	public long getGroupId() {
		return _asset.getGroupId();
	}

	/**
	* Returns the location of this asset.
	*
	* @return the location of this asset
	*/
	@Override
	public long getLocation() {
		return _asset.getLocation();
	}

	/**
	* Returns the primary key of this asset.
	*
	* @return the primary key of this asset
	*/
	@Override
	public long getPrimaryKey() {
		return _asset.getPrimaryKey();
	}

	/**
	* Returns the user ID of this asset.
	*
	* @return the user ID of this asset
	*/
	@Override
	public long getUserId() {
		return _asset.getUserId();
	}

	@Override
	public void persist() {
		_asset.persist();
	}

	/**
	* Sets whether this asset is active.
	*
	* @param active the active of this asset
	*/
	@Override
	public void setActive(boolean active) {
		_asset.setActive(active);
	}

	/**
	* Sets the asset ID of this asset.
	*
	* @param assetId the asset ID of this asset
	*/
	@Override
	public void setAssetId(long assetId) {
		_asset.setAssetId(assetId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_asset.setCachedModel(cachedModel);
	}

	/**
	* Sets the category of this asset.
	*
	* @param category the category of this asset
	*/
	@Override
	public void setCategory(long category) {
		_asset.setCategory(category);
	}

	/**
	* Sets the company ID of this asset.
	*
	* @param companyId the company ID of this asset
	*/
	@Override
	public void setCompanyId(long companyId) {
		_asset.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this asset.
	*
	* @param createDate the create date of this asset
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_asset.setCreateDate(createDate);
	}

	/**
	* Sets the current user ID of this asset.
	*
	* @param currentUserId the current user ID of this asset
	*/
	@Override
	public void setCurrentUserId(long currentUserId) {
		_asset.setCurrentUserId(currentUserId);
	}

	/**
	* Sets the current user uuid of this asset.
	*
	* @param currentUserUuid the current user uuid of this asset
	*/
	@Override
	public void setCurrentUserUuid(java.lang.String currentUserUuid) {
		_asset.setCurrentUserUuid(currentUserUuid);
	}

	/**
	* Sets the description of this asset.
	*
	* @param description the description of this asset
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_asset.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_asset.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_asset.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_asset.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this asset.
	*
	* @param groupId the group ID of this asset
	*/
	@Override
	public void setGroupId(long groupId) {
		_asset.setGroupId(groupId);
	}

	/**
	* Sets the location of this asset.
	*
	* @param location the location of this asset
	*/
	@Override
	public void setLocation(long location) {
		_asset.setLocation(location);
	}

	/**
	* Sets the mime type of this asset.
	*
	* @param mimeType the mime type of this asset
	*/
	@Override
	public void setMimeType(java.lang.String mimeType) {
		_asset.setMimeType(mimeType);
	}

	/**
	* Sets the modified date of this asset.
	*
	* @param modifiedDate the modified date of this asset
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_asset.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this asset.
	*
	* @param name the name of this asset
	*/
	@Override
	public void setName(java.lang.String name) {
		_asset.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_asset.setNew(n);
	}

	/**
	* Sets the photo of this asset.
	*
	* @param photo the photo of this asset
	*/
	@Override
	public void setPhoto(Blob photo) {
		_asset.setPhoto(photo);
	}

	/**
	* Sets the primary key of this asset.
	*
	* @param primaryKey the primary key of this asset
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_asset.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_asset.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status of this asset.
	*
	* @param status the status of this asset
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_asset.setStatus(status);
	}

	/**
	* Sets the user ID of this asset.
	*
	* @param userId the user ID of this asset
	*/
	@Override
	public void setUserId(long userId) {
		_asset.setUserId(userId);
	}

	/**
	* Sets the user name of this asset.
	*
	* @param userName the user name of this asset
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_asset.setUserName(userName);
	}

	/**
	* Sets the user uuid of this asset.
	*
	* @param userUuid the user uuid of this asset
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_asset.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this asset.
	*
	* @param uuid the uuid of this asset
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_asset.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssetWrapper)) {
			return false;
		}

		AssetWrapper assetWrapper = (AssetWrapper)obj;

		if (Objects.equals(_asset, assetWrapper._asset)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _asset.getStagedModelType();
	}

	@Override
	public Asset getWrappedModel() {
		return _asset;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _asset.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _asset.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_asset.resetOriginalValues();
	}

	private final Asset _asset;
}