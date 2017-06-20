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
 * This class is a wrapper for {@link AssetMessage}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetMessage
 * @generated
 */
@ProviderType
public class AssetMessageWrapper implements AssetMessage,
	ModelWrapper<AssetMessage> {
	public AssetMessageWrapper(AssetMessage assetMessage) {
		_assetMessage = assetMessage;
	}

	@Override
	public Class<?> getModelClass() {
		return AssetMessage.class;
	}

	@Override
	public String getModelClassName() {
		return AssetMessage.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("assetMessageId", getAssetMessageId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("assetId", getAssetId());
		attributes.put("fromUserId", getFromUserId());
		attributes.put("toUserId", getToUserId());
		attributes.put("message", getMessage());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long assetMessageId = (Long)attributes.get("assetMessageId");

		if (assetMessageId != null) {
			setAssetMessageId(assetMessageId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Long assetId = (Long)attributes.get("assetId");

		if (assetId != null) {
			setAssetId(assetId);
		}

		Long fromUserId = (Long)attributes.get("fromUserId");

		if (fromUserId != null) {
			setFromUserId(fromUserId);
		}

		Long toUserId = (Long)attributes.get("toUserId");

		if (toUserId != null) {
			setToUserId(toUserId);
		}

		String message = (String)attributes.get("message");

		if (message != null) {
			setMessage(message);
		}
	}

	@Override
	public AssetMessage toEscapedModel() {
		return new AssetMessageWrapper(_assetMessage.toEscapedModel());
	}

	@Override
	public AssetMessage toUnescapedModel() {
		return new AssetMessageWrapper(_assetMessage.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _assetMessage.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _assetMessage.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _assetMessage.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _assetMessage.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<AssetMessage> toCacheModel() {
		return _assetMessage.toCacheModel();
	}

	@Override
	public int compareTo(AssetMessage assetMessage) {
		return _assetMessage.compareTo(assetMessage);
	}

	@Override
	public int hashCode() {
		return _assetMessage.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _assetMessage.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AssetMessageWrapper((AssetMessage)_assetMessage.clone());
	}

	/**
	* Returns the from user uuid of this asset message.
	*
	* @return the from user uuid of this asset message
	*/
	@Override
	public java.lang.String getFromUserUuid() {
		return _assetMessage.getFromUserUuid();
	}

	/**
	* Returns the message of this asset message.
	*
	* @return the message of this asset message
	*/
	@Override
	public java.lang.String getMessage() {
		return _assetMessage.getMessage();
	}

	/**
	* Returns the to user uuid of this asset message.
	*
	* @return the to user uuid of this asset message
	*/
	@Override
	public java.lang.String getToUserUuid() {
		return _assetMessage.getToUserUuid();
	}

	/**
	* Returns the uuid of this asset message.
	*
	* @return the uuid of this asset message
	*/
	@Override
	public java.lang.String getUuid() {
		return _assetMessage.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _assetMessage.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _assetMessage.toXmlString();
	}

	/**
	* Returns the create date of this asset message.
	*
	* @return the create date of this asset message
	*/
	@Override
	public Date getCreateDate() {
		return _assetMessage.getCreateDate();
	}

	/**
	* Returns the asset ID of this asset message.
	*
	* @return the asset ID of this asset message
	*/
	@Override
	public long getAssetId() {
		return _assetMessage.getAssetId();
	}

	/**
	* Returns the asset message ID of this asset message.
	*
	* @return the asset message ID of this asset message
	*/
	@Override
	public long getAssetMessageId() {
		return _assetMessage.getAssetMessageId();
	}

	/**
	* Returns the company ID of this asset message.
	*
	* @return the company ID of this asset message
	*/
	@Override
	public long getCompanyId() {
		return _assetMessage.getCompanyId();
	}

	/**
	* Returns the from user ID of this asset message.
	*
	* @return the from user ID of this asset message
	*/
	@Override
	public long getFromUserId() {
		return _assetMessage.getFromUserId();
	}

	/**
	* Returns the group ID of this asset message.
	*
	* @return the group ID of this asset message
	*/
	@Override
	public long getGroupId() {
		return _assetMessage.getGroupId();
	}

	/**
	* Returns the primary key of this asset message.
	*
	* @return the primary key of this asset message
	*/
	@Override
	public long getPrimaryKey() {
		return _assetMessage.getPrimaryKey();
	}

	/**
	* Returns the to user ID of this asset message.
	*
	* @return the to user ID of this asset message
	*/
	@Override
	public long getToUserId() {
		return _assetMessage.getToUserId();
	}

	@Override
	public void persist() {
		_assetMessage.persist();
	}

	/**
	* Sets the asset ID of this asset message.
	*
	* @param assetId the asset ID of this asset message
	*/
	@Override
	public void setAssetId(long assetId) {
		_assetMessage.setAssetId(assetId);
	}

	/**
	* Sets the asset message ID of this asset message.
	*
	* @param assetMessageId the asset message ID of this asset message
	*/
	@Override
	public void setAssetMessageId(long assetMessageId) {
		_assetMessage.setAssetMessageId(assetMessageId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_assetMessage.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this asset message.
	*
	* @param companyId the company ID of this asset message
	*/
	@Override
	public void setCompanyId(long companyId) {
		_assetMessage.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this asset message.
	*
	* @param createDate the create date of this asset message
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_assetMessage.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_assetMessage.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_assetMessage.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_assetMessage.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the from user ID of this asset message.
	*
	* @param fromUserId the from user ID of this asset message
	*/
	@Override
	public void setFromUserId(long fromUserId) {
		_assetMessage.setFromUserId(fromUserId);
	}

	/**
	* Sets the from user uuid of this asset message.
	*
	* @param fromUserUuid the from user uuid of this asset message
	*/
	@Override
	public void setFromUserUuid(java.lang.String fromUserUuid) {
		_assetMessage.setFromUserUuid(fromUserUuid);
	}

	/**
	* Sets the group ID of this asset message.
	*
	* @param groupId the group ID of this asset message
	*/
	@Override
	public void setGroupId(long groupId) {
		_assetMessage.setGroupId(groupId);
	}

	/**
	* Sets the message of this asset message.
	*
	* @param message the message of this asset message
	*/
	@Override
	public void setMessage(java.lang.String message) {
		_assetMessage.setMessage(message);
	}

	@Override
	public void setNew(boolean n) {
		_assetMessage.setNew(n);
	}

	/**
	* Sets the primary key of this asset message.
	*
	* @param primaryKey the primary key of this asset message
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_assetMessage.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_assetMessage.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the to user ID of this asset message.
	*
	* @param toUserId the to user ID of this asset message
	*/
	@Override
	public void setToUserId(long toUserId) {
		_assetMessage.setToUserId(toUserId);
	}

	/**
	* Sets the to user uuid of this asset message.
	*
	* @param toUserUuid the to user uuid of this asset message
	*/
	@Override
	public void setToUserUuid(java.lang.String toUserUuid) {
		_assetMessage.setToUserUuid(toUserUuid);
	}

	/**
	* Sets the uuid of this asset message.
	*
	* @param uuid the uuid of this asset message
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_assetMessage.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssetMessageWrapper)) {
			return false;
		}

		AssetMessageWrapper assetMessageWrapper = (AssetMessageWrapper)obj;

		if (Objects.equals(_assetMessage, assetMessageWrapper._assetMessage)) {
			return true;
		}

		return false;
	}

	@Override
	public AssetMessage getWrappedModel() {
		return _assetMessage;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _assetMessage.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _assetMessage.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_assetMessage.resetOriginalValues();
	}

	private final AssetMessage _assetMessage;
}