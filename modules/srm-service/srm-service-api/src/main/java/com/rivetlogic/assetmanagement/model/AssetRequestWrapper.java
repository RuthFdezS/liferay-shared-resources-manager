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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link AssetRequest}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetRequest
 * @generated
 */
@ProviderType
public class AssetRequestWrapper implements AssetRequest,
	ModelWrapper<AssetRequest> {
	public AssetRequestWrapper(AssetRequest assetRequest) {
		_assetRequest = assetRequest;
	}

	@Override
	public Class<?> getModelClass() {
		return AssetRequest.class;
	}

	@Override
	public String getModelClassName() {
		return AssetRequest.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("assetRequestId", getAssetRequestId());
		attributes.put("groupId", getGroupId());
		attributes.put("assetId", getAssetId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("companyId", getCompanyId());
		attributes.put("userName", getUserName());
		attributes.put("requestedDate", getRequestedDate());
		attributes.put("assingedDate", getAssingedDate());
		attributes.put("bookedDate", getBookedDate());
		attributes.put("returnedDate", getReturnedDate());
		attributes.put("status", getStatus());
		attributes.put("priority", getPriority());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long assetRequestId = (Long)attributes.get("assetRequestId");

		if (assetRequestId != null) {
			setAssetRequestId(assetRequestId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long assetId = (Long)attributes.get("assetId");

		if (assetId != null) {
			setAssetId(assetId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date requestedDate = (Date)attributes.get("requestedDate");

		if (requestedDate != null) {
			setRequestedDate(requestedDate);
		}

		Date assingedDate = (Date)attributes.get("assingedDate");

		if (assingedDate != null) {
			setAssingedDate(assingedDate);
		}

		Date bookedDate = (Date)attributes.get("bookedDate");

		if (bookedDate != null) {
			setBookedDate(bookedDate);
		}

		Date returnedDate = (Date)attributes.get("returnedDate");

		if (returnedDate != null) {
			setReturnedDate(returnedDate);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String priority = (String)attributes.get("priority");

		if (priority != null) {
			setPriority(priority);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	@Override
	public AssetRequest toEscapedModel() {
		return new AssetRequestWrapper(_assetRequest.toEscapedModel());
	}

	@Override
	public AssetRequest toUnescapedModel() {
		return new AssetRequestWrapper(_assetRequest.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _assetRequest.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _assetRequest.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _assetRequest.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _assetRequest.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<AssetRequest> toCacheModel() {
		return _assetRequest.toCacheModel();
	}

	@Override
	public int compareTo(AssetRequest assetRequest) {
		return _assetRequest.compareTo(assetRequest);
	}

	@Override
	public int hashCode() {
		return _assetRequest.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _assetRequest.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AssetRequestWrapper((AssetRequest)_assetRequest.clone());
	}

	/**
	* Returns the description of this asset request.
	*
	* @return the description of this asset request
	*/
	@Override
	public java.lang.String getDescription() {
		return _assetRequest.getDescription();
	}

	/**
	* Returns the priority of this asset request.
	*
	* @return the priority of this asset request
	*/
	@Override
	public java.lang.String getPriority() {
		return _assetRequest.getPriority();
	}

	/**
	* Returns the status of this asset request.
	*
	* @return the status of this asset request
	*/
	@Override
	public java.lang.String getStatus() {
		return _assetRequest.getStatus();
	}

	/**
	* Returns the user name of this asset request.
	*
	* @return the user name of this asset request
	*/
	@Override
	public java.lang.String getUserName() {
		return _assetRequest.getUserName();
	}

	/**
	* Returns the user uuid of this asset request.
	*
	* @return the user uuid of this asset request
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _assetRequest.getUserUuid();
	}

	/**
	* Returns the uuid of this asset request.
	*
	* @return the uuid of this asset request
	*/
	@Override
	public java.lang.String getUuid() {
		return _assetRequest.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _assetRequest.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _assetRequest.toXmlString();
	}

	/**
	* Returns the assinged date of this asset request.
	*
	* @return the assinged date of this asset request
	*/
	@Override
	public Date getAssingedDate() {
		return _assetRequest.getAssingedDate();
	}

	/**
	* Returns the booked date of this asset request.
	*
	* @return the booked date of this asset request
	*/
	@Override
	public Date getBookedDate() {
		return _assetRequest.getBookedDate();
	}

	/**
	* Returns the create date of this asset request.
	*
	* @return the create date of this asset request
	*/
	@Override
	public Date getCreateDate() {
		return _assetRequest.getCreateDate();
	}

	/**
	* Returns the modified date of this asset request.
	*
	* @return the modified date of this asset request
	*/
	@Override
	public Date getModifiedDate() {
		return _assetRequest.getModifiedDate();
	}

	/**
	* Returns the requested date of this asset request.
	*
	* @return the requested date of this asset request
	*/
	@Override
	public Date getRequestedDate() {
		return _assetRequest.getRequestedDate();
	}

	/**
	* Returns the returned date of this asset request.
	*
	* @return the returned date of this asset request
	*/
	@Override
	public Date getReturnedDate() {
		return _assetRequest.getReturnedDate();
	}

	/**
	* Returns the asset ID of this asset request.
	*
	* @return the asset ID of this asset request
	*/
	@Override
	public long getAssetId() {
		return _assetRequest.getAssetId();
	}

	/**
	* Returns the asset request ID of this asset request.
	*
	* @return the asset request ID of this asset request
	*/
	@Override
	public long getAssetRequestId() {
		return _assetRequest.getAssetRequestId();
	}

	/**
	* Returns the company ID of this asset request.
	*
	* @return the company ID of this asset request
	*/
	@Override
	public long getCompanyId() {
		return _assetRequest.getCompanyId();
	}

	/**
	* Returns the group ID of this asset request.
	*
	* @return the group ID of this asset request
	*/
	@Override
	public long getGroupId() {
		return _assetRequest.getGroupId();
	}

	/**
	* Returns the primary key of this asset request.
	*
	* @return the primary key of this asset request
	*/
	@Override
	public long getPrimaryKey() {
		return _assetRequest.getPrimaryKey();
	}

	/**
	* Returns the user ID of this asset request.
	*
	* @return the user ID of this asset request
	*/
	@Override
	public long getUserId() {
		return _assetRequest.getUserId();
	}

	@Override
	public void persist() {
		_assetRequest.persist();
	}

	/**
	* Sets the asset ID of this asset request.
	*
	* @param assetId the asset ID of this asset request
	*/
	@Override
	public void setAssetId(long assetId) {
		_assetRequest.setAssetId(assetId);
	}

	/**
	* Sets the asset request ID of this asset request.
	*
	* @param assetRequestId the asset request ID of this asset request
	*/
	@Override
	public void setAssetRequestId(long assetRequestId) {
		_assetRequest.setAssetRequestId(assetRequestId);
	}

	/**
	* Sets the assinged date of this asset request.
	*
	* @param assingedDate the assinged date of this asset request
	*/
	@Override
	public void setAssingedDate(Date assingedDate) {
		_assetRequest.setAssingedDate(assingedDate);
	}

	/**
	* Sets the booked date of this asset request.
	*
	* @param bookedDate the booked date of this asset request
	*/
	@Override
	public void setBookedDate(Date bookedDate) {
		_assetRequest.setBookedDate(bookedDate);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_assetRequest.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this asset request.
	*
	* @param companyId the company ID of this asset request
	*/
	@Override
	public void setCompanyId(long companyId) {
		_assetRequest.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this asset request.
	*
	* @param createDate the create date of this asset request
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_assetRequest.setCreateDate(createDate);
	}

	/**
	* Sets the description of this asset request.
	*
	* @param description the description of this asset request
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_assetRequest.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_assetRequest.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_assetRequest.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_assetRequest.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this asset request.
	*
	* @param groupId the group ID of this asset request
	*/
	@Override
	public void setGroupId(long groupId) {
		_assetRequest.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this asset request.
	*
	* @param modifiedDate the modified date of this asset request
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_assetRequest.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_assetRequest.setNew(n);
	}

	/**
	* Sets the primary key of this asset request.
	*
	* @param primaryKey the primary key of this asset request
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_assetRequest.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_assetRequest.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the priority of this asset request.
	*
	* @param priority the priority of this asset request
	*/
	@Override
	public void setPriority(java.lang.String priority) {
		_assetRequest.setPriority(priority);
	}

	/**
	* Sets the requested date of this asset request.
	*
	* @param requestedDate the requested date of this asset request
	*/
	@Override
	public void setRequestedDate(Date requestedDate) {
		_assetRequest.setRequestedDate(requestedDate);
	}

	/**
	* Sets the returned date of this asset request.
	*
	* @param returnedDate the returned date of this asset request
	*/
	@Override
	public void setReturnedDate(Date returnedDate) {
		_assetRequest.setReturnedDate(returnedDate);
	}

	/**
	* Sets the status of this asset request.
	*
	* @param status the status of this asset request
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_assetRequest.setStatus(status);
	}

	/**
	* Sets the user ID of this asset request.
	*
	* @param userId the user ID of this asset request
	*/
	@Override
	public void setUserId(long userId) {
		_assetRequest.setUserId(userId);
	}

	/**
	* Sets the user name of this asset request.
	*
	* @param userName the user name of this asset request
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_assetRequest.setUserName(userName);
	}

	/**
	* Sets the user uuid of this asset request.
	*
	* @param userUuid the user uuid of this asset request
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_assetRequest.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this asset request.
	*
	* @param uuid the uuid of this asset request
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_assetRequest.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssetRequestWrapper)) {
			return false;
		}

		AssetRequestWrapper assetRequestWrapper = (AssetRequestWrapper)obj;

		if (Objects.equals(_assetRequest, assetRequestWrapper._assetRequest)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _assetRequest.getStagedModelType();
	}

	@Override
	public AssetRequest getWrappedModel() {
		return _assetRequest;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _assetRequest.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _assetRequest.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_assetRequest.resetOriginalValues();
	}

	private final AssetRequest _assetRequest;
}