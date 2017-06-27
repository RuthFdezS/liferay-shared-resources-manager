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

package com.rivetlogic.assetmanagement.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.rivetlogic.assetmanagement.model.AssetRequest;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AssetRequest in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see AssetRequest
 * @generated
 */
@ProviderType
public class AssetRequestCacheModel implements CacheModel<AssetRequest>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssetRequestCacheModel)) {
			return false;
		}

		AssetRequestCacheModel assetRequestCacheModel = (AssetRequestCacheModel)obj;

		if (assetRequestId == assetRequestCacheModel.assetRequestId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, assetRequestId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", assetRequestId=");
		sb.append(assetRequestId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", assetId=");
		sb.append(assetId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", requestedDate=");
		sb.append(requestedDate);
		sb.append(", assignedDate=");
		sb.append(assignedDate);
		sb.append(", bookedDate=");
		sb.append(bookedDate);
		sb.append(", returnedDate=");
		sb.append(returnedDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", priority=");
		sb.append(priority);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AssetRequest toEntityModel() {
		AssetRequestImpl assetRequestImpl = new AssetRequestImpl();

		if (uuid == null) {
			assetRequestImpl.setUuid(StringPool.BLANK);
		}
		else {
			assetRequestImpl.setUuid(uuid);
		}

		assetRequestImpl.setAssetRequestId(assetRequestId);
		assetRequestImpl.setGroupId(groupId);
		assetRequestImpl.setAssetId(assetId);
		assetRequestImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			assetRequestImpl.setCreateDate(null);
		}
		else {
			assetRequestImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			assetRequestImpl.setModifiedDate(null);
		}
		else {
			assetRequestImpl.setModifiedDate(new Date(modifiedDate));
		}

		assetRequestImpl.setCompanyId(companyId);

		if (userName == null) {
			assetRequestImpl.setUserName(StringPool.BLANK);
		}
		else {
			assetRequestImpl.setUserName(userName);
		}

		if (requestedDate == Long.MIN_VALUE) {
			assetRequestImpl.setRequestedDate(null);
		}
		else {
			assetRequestImpl.setRequestedDate(new Date(requestedDate));
		}

		if (assignedDate == Long.MIN_VALUE) {
			assetRequestImpl.setAssignedDate(null);
		}
		else {
			assetRequestImpl.setAssignedDate(new Date(assignedDate));
		}

		if (bookedDate == Long.MIN_VALUE) {
			assetRequestImpl.setBookedDate(null);
		}
		else {
			assetRequestImpl.setBookedDate(new Date(bookedDate));
		}

		if (returnedDate == Long.MIN_VALUE) {
			assetRequestImpl.setReturnedDate(null);
		}
		else {
			assetRequestImpl.setReturnedDate(new Date(returnedDate));
		}

		if (status == null) {
			assetRequestImpl.setStatus(StringPool.BLANK);
		}
		else {
			assetRequestImpl.setStatus(status);
		}

		if (priority == null) {
			assetRequestImpl.setPriority(StringPool.BLANK);
		}
		else {
			assetRequestImpl.setPriority(priority);
		}

		if (description == null) {
			assetRequestImpl.setDescription(StringPool.BLANK);
		}
		else {
			assetRequestImpl.setDescription(description);
		}

		assetRequestImpl.resetOriginalValues();

		return assetRequestImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		assetRequestId = objectInput.readLong();

		groupId = objectInput.readLong();

		assetId = objectInput.readLong();

		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		companyId = objectInput.readLong();
		userName = objectInput.readUTF();
		requestedDate = objectInput.readLong();
		assignedDate = objectInput.readLong();
		bookedDate = objectInput.readLong();
		returnedDate = objectInput.readLong();
		status = objectInput.readUTF();
		priority = objectInput.readUTF();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(assetRequestId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(assetId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(companyId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(requestedDate);
		objectOutput.writeLong(assignedDate);
		objectOutput.writeLong(bookedDate);
		objectOutput.writeLong(returnedDate);

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}

		if (priority == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(priority);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public String uuid;
	public long assetRequestId;
	public long groupId;
	public long assetId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public long companyId;
	public String userName;
	public long requestedDate;
	public long assignedDate;
	public long bookedDate;
	public long returnedDate;
	public String status;
	public String priority;
	public String description;
}