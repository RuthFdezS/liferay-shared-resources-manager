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
 * The extended model interface for the AssetMessage service. Represents a row in the &quot;rivetlogic_AssetMessage&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AssetMessageModel
 * @see com.rivetlogic.assetmanagement.model.impl.AssetMessageImpl
 * @see com.rivetlogic.assetmanagement.model.impl.AssetMessageModelImpl
 * @generated
 */
@ImplementationClassName("com.rivetlogic.assetmanagement.model.impl.AssetMessageImpl")
@ProviderType
public interface AssetMessage extends AssetMessageModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.rivetlogic.assetmanagement.model.impl.AssetMessageImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AssetMessage, Long> ASSET_MESSAGE_ID_ACCESSOR = new Accessor<AssetMessage, Long>() {
			@Override
			public Long get(AssetMessage assetMessage) {
				return assetMessage.getAssetMessageId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<AssetMessage> getTypeClass() {
				return AssetMessage.class;
			}
		};
}