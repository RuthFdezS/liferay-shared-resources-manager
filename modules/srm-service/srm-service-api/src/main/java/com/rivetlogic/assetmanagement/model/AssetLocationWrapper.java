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
 * This class is a wrapper for {@link AssetLocation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetLocation
 * @generated
 */
@ProviderType
public class AssetLocationWrapper implements AssetLocation,
	ModelWrapper<AssetLocation> {
	public AssetLocationWrapper(AssetLocation assetLocation) {
		_assetLocation = assetLocation;
	}

	@Override
	public Class<?> getModelClass() {
		return AssetLocation.class;
	}

	@Override
	public String getModelClassName() {
		return AssetLocation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("assetLocationId", getAssetLocationId());
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

		Long assetLocationId = (Long)attributes.get("assetLocationId");

		if (assetLocationId != null) {
			setAssetLocationId(assetLocationId);
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
	public AssetLocation toEscapedModel() {
		return new AssetLocationWrapper(_assetLocation.toEscapedModel());
	}

	@Override
	public AssetLocation toUnescapedModel() {
		return new AssetLocationWrapper(_assetLocation.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _assetLocation.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _assetLocation.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _assetLocation.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _assetLocation.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<AssetLocation> toCacheModel() {
		return _assetLocation.toCacheModel();
	}

	@Override
	public int compareTo(AssetLocation assetLocation) {
		return _assetLocation.compareTo(assetLocation);
	}

	@Override
	public int hashCode() {
		return _assetLocation.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _assetLocation.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AssetLocationWrapper((AssetLocation)_assetLocation.clone());
	}

	/**
	* Returns the description of this asset location.
	*
	* @return the description of this asset location
	*/
	@Override
	public java.lang.String getDescription() {
		return _assetLocation.getDescription();
	}

	/**
	* Returns the name of this asset location.
	*
	* @return the name of this asset location
	*/
	@Override
	public java.lang.String getName() {
		return _assetLocation.getName();
	}

	/**
	* Returns the user name of this asset location.
	*
	* @return the user name of this asset location
	*/
	@Override
	public java.lang.String getUserName() {
		return _assetLocation.getUserName();
	}

	/**
	* Returns the user uuid of this asset location.
	*
	* @return the user uuid of this asset location
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _assetLocation.getUserUuid();
	}

	/**
	* Returns the uuid of this asset location.
	*
	* @return the uuid of this asset location
	*/
	@Override
	public java.lang.String getUuid() {
		return _assetLocation.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _assetLocation.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _assetLocation.toXmlString();
	}

	/**
	* Returns the create date of this asset location.
	*
	* @return the create date of this asset location
	*/
	@Override
	public Date getCreateDate() {
		return _assetLocation.getCreateDate();
	}

	/**
	* Returns the asset location ID of this asset location.
	*
	* @return the asset location ID of this asset location
	*/
	@Override
	public long getAssetLocationId() {
		return _assetLocation.getAssetLocationId();
	}

	/**
	* Returns the company ID of this asset location.
	*
	* @return the company ID of this asset location
	*/
	@Override
	public long getCompanyId() {
		return _assetLocation.getCompanyId();
	}

	/**
	* Returns the group ID of this asset location.
	*
	* @return the group ID of this asset location
	*/
	@Override
	public long getGroupId() {
		return _assetLocation.getGroupId();
	}

	/**
	* Returns the primary key of this asset location.
	*
	* @return the primary key of this asset location
	*/
	@Override
	public long getPrimaryKey() {
		return _assetLocation.getPrimaryKey();
	}

	/**
	* Returns the user ID of this asset location.
	*
	* @return the user ID of this asset location
	*/
	@Override
	public long getUserId() {
		return _assetLocation.getUserId();
	}

	@Override
	public void persist() {
		_assetLocation.persist();
	}

	/**
	* Sets the asset location ID of this asset location.
	*
	* @param assetLocationId the asset location ID of this asset location
	*/
	@Override
	public void setAssetLocationId(long assetLocationId) {
		_assetLocation.setAssetLocationId(assetLocationId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_assetLocation.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this asset location.
	*
	* @param companyId the company ID of this asset location
	*/
	@Override
	public void setCompanyId(long companyId) {
		_assetLocation.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this asset location.
	*
	* @param createDate the create date of this asset location
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_assetLocation.setCreateDate(createDate);
	}

	/**
	* Sets the description of this asset location.
	*
	* @param description the description of this asset location
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_assetLocation.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_assetLocation.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_assetLocation.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_assetLocation.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this asset location.
	*
	* @param groupId the group ID of this asset location
	*/
	@Override
	public void setGroupId(long groupId) {
		_assetLocation.setGroupId(groupId);
	}

	/**
	* Sets the name of this asset location.
	*
	* @param name the name of this asset location
	*/
	@Override
	public void setName(java.lang.String name) {
		_assetLocation.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_assetLocation.setNew(n);
	}

	/**
	* Sets the primary key of this asset location.
	*
	* @param primaryKey the primary key of this asset location
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_assetLocation.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_assetLocation.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this asset location.
	*
	* @param userId the user ID of this asset location
	*/
	@Override
	public void setUserId(long userId) {
		_assetLocation.setUserId(userId);
	}

	/**
	* Sets the user name of this asset location.
	*
	* @param userName the user name of this asset location
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_assetLocation.setUserName(userName);
	}

	/**
	* Sets the user uuid of this asset location.
	*
	* @param userUuid the user uuid of this asset location
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_assetLocation.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this asset location.
	*
	* @param uuid the uuid of this asset location
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_assetLocation.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssetLocationWrapper)) {
			return false;
		}

		AssetLocationWrapper assetLocationWrapper = (AssetLocationWrapper)obj;

		if (Objects.equals(_assetLocation, assetLocationWrapper._assetLocation)) {
			return true;
		}

		return false;
	}

	@Override
	public AssetLocation getWrappedModel() {
		return _assetLocation;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _assetLocation.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _assetLocation.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_assetLocation.resetOriginalValues();
	}

	private final AssetLocation _assetLocation;
}