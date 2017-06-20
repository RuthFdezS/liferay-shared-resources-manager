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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the AssetRequest service. Represents a row in the &quot;rivetlogic_AssetRequest&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AssetRequestModel
 * @see com.rivetlogic.assetmanagement.model.impl.AssetRequestImpl
 * @see com.rivetlogic.assetmanagement.model.impl.AssetRequestModelImpl
 * @generated
 */
@ImplementationClassName("com.rivetlogic.assetmanagement.model.impl.AssetRequestImpl")
@ProviderType
public interface AssetRequest extends AssetRequestModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.rivetlogic.assetmanagement.model.impl.AssetRequestImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AssetRequest, Long> ASSET_REQUEST_ID_ACCESSOR = new Accessor<AssetRequest, Long>() {
			@Override
			public Long get(AssetRequest assetRequest) {
				return assetRequest.getAssetRequestId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<AssetRequest> getTypeClass() {
				return AssetRequest.class;
			}
		};
}