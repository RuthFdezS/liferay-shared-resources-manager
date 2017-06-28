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

import java.sql.Blob;

/**
 * The Blob model class for lazy loading the photo column in Asset.
 *
 * @author Brian Wing Shun Chan
 * @see Asset
 * @generated
 */
@ProviderType
public class AssetPhotoBlobModel {
	public AssetPhotoBlobModel() {
	}

	public AssetPhotoBlobModel(long assetId) {
		_assetId = assetId;
	}

	public AssetPhotoBlobModel(long assetId, Blob photoBlob) {
		_assetId = assetId;
		_photoBlob = photoBlob;
	}

	public long getAssetId() {
		return _assetId;
	}

	public void setAssetId(long assetId) {
		_assetId = assetId;
	}

	public Blob getPhotoBlob() {
		return _photoBlob;
	}

	public void setPhotoBlob(Blob photoBlob) {
		_photoBlob = photoBlob;
	}

	private long _assetId;
	private Blob _photoBlob;
}