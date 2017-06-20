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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class AssetMessageSoap implements Serializable {
	public static AssetMessageSoap toSoapModel(AssetMessage model) {
		AssetMessageSoap soapModel = new AssetMessageSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setAssetMessageId(model.getAssetMessageId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setAssetId(model.getAssetId());
		soapModel.setFromUserId(model.getFromUserId());
		soapModel.setToUserId(model.getToUserId());
		soapModel.setMessage(model.getMessage());

		return soapModel;
	}

	public static AssetMessageSoap[] toSoapModels(AssetMessage[] models) {
		AssetMessageSoap[] soapModels = new AssetMessageSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AssetMessageSoap[][] toSoapModels(AssetMessage[][] models) {
		AssetMessageSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AssetMessageSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AssetMessageSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AssetMessageSoap[] toSoapModels(List<AssetMessage> models) {
		List<AssetMessageSoap> soapModels = new ArrayList<AssetMessageSoap>(models.size());

		for (AssetMessage model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AssetMessageSoap[soapModels.size()]);
	}

	public AssetMessageSoap() {
	}

	public long getPrimaryKey() {
		return _assetMessageId;
	}

	public void setPrimaryKey(long pk) {
		setAssetMessageId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getAssetMessageId() {
		return _assetMessageId;
	}

	public void setAssetMessageId(long assetMessageId) {
		_assetMessageId = assetMessageId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public long getAssetId() {
		return _assetId;
	}

	public void setAssetId(long assetId) {
		_assetId = assetId;
	}

	public long getFromUserId() {
		return _fromUserId;
	}

	public void setFromUserId(long fromUserId) {
		_fromUserId = fromUserId;
	}

	public long getToUserId() {
		return _toUserId;
	}

	public void setToUserId(long toUserId) {
		_toUserId = toUserId;
	}

	public String getMessage() {
		return _message;
	}

	public void setMessage(String message) {
		_message = message;
	}

	private String _uuid;
	private long _assetMessageId;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private long _assetId;
	private long _fromUserId;
	private long _toUserId;
	private String _message;
}