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

package com.rivetlogic.assetmanagement.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AssetMessageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AssetMessageLocalService
 * @generated
 */
@ProviderType
public class AssetMessageLocalServiceWrapper implements AssetMessageLocalService,
	ServiceWrapper<AssetMessageLocalService> {
	public AssetMessageLocalServiceWrapper(
		AssetMessageLocalService assetMessageLocalService) {
		_assetMessageLocalService = assetMessageLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _assetMessageLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _assetMessageLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _assetMessageLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _assetMessageLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _assetMessageLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetMessage addAssetMessage(
		com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay,
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		com.rivetlogic.assetmanagement.model.AssetMessage assetMessage,
		java.lang.String notificationType)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetMessageLocalService.addAssetMessage(themeDisplay,
			serviceContext, assetMessage, notificationType);
	}

	/**
	* Adds the asset message to the database. Also notifies the appropriate model listeners.
	*
	* @param assetMessage the asset message
	* @return the asset message that was added
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetMessage addAssetMessage(
		com.rivetlogic.assetmanagement.model.AssetMessage assetMessage) {
		return _assetMessageLocalService.addAssetMessage(assetMessage);
	}

	/**
	* Creates a new asset message with the primary key. Does not add the asset message to the database.
	*
	* @param assetMessageId the primary key for the new asset message
	* @return the new asset message
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetMessage createAssetMessage(
		long assetMessageId) {
		return _assetMessageLocalService.createAssetMessage(assetMessageId);
	}

	/**
	* Deletes the asset message from the database. Also notifies the appropriate model listeners.
	*
	* @param assetMessage the asset message
	* @return the asset message that was removed
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetMessage deleteAssetMessage(
		com.rivetlogic.assetmanagement.model.AssetMessage assetMessage) {
		return _assetMessageLocalService.deleteAssetMessage(assetMessage);
	}

	/**
	* Deletes the asset message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetMessageId the primary key of the asset message
	* @return the asset message that was removed
	* @throws PortalException if a asset message with the primary key could not be found
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetMessage deleteAssetMessage(
		long assetMessageId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _assetMessageLocalService.deleteAssetMessage(assetMessageId);
	}

	@Override
	public com.rivetlogic.assetmanagement.model.AssetMessage fetchAssetMessage(
		long assetMessageId) {
		return _assetMessageLocalService.fetchAssetMessage(assetMessageId);
	}

	/**
	* Returns the asset message matching the UUID and group.
	*
	* @param uuid the asset message's UUID
	* @param groupId the primary key of the group
	* @return the matching asset message, or <code>null</code> if a matching asset message could not be found
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetMessage fetchAssetMessageByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _assetMessageLocalService.fetchAssetMessageByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the asset message with the primary key.
	*
	* @param assetMessageId the primary key of the asset message
	* @return the asset message
	* @throws PortalException if a asset message with the primary key could not be found
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetMessage getAssetMessage(
		long assetMessageId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _assetMessageLocalService.getAssetMessage(assetMessageId);
	}

	/**
	* Returns the asset message matching the UUID and group.
	*
	* @param uuid the asset message's UUID
	* @param groupId the primary key of the group
	* @return the matching asset message
	* @throws PortalException if a matching asset message could not be found
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetMessage getAssetMessageByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _assetMessageLocalService.getAssetMessageByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Updates the asset message in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assetMessage the asset message
	* @return the asset message that was updated
	*/
	@Override
	public com.rivetlogic.assetmanagement.model.AssetMessage updateAssetMessage(
		com.rivetlogic.assetmanagement.model.AssetMessage assetMessage) {
		return _assetMessageLocalService.updateAssetMessage(assetMessage);
	}

	/**
	* Returns the number of asset messages.
	*
	* @return the number of asset messages
	*/
	@Override
	public int getAssetMessagesCount() {
		return _assetMessageLocalService.getAssetMessagesCount();
	}

	@Override
	public int getAssetMessagesCount(long assetId, long userId) {
		return _assetMessageLocalService.getAssetMessagesCount(assetId, userId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _assetMessageLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _assetMessageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _assetMessageLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _assetMessageLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the asset messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset messages
	* @param end the upper bound of the range of asset messages (not inclusive)
	* @return the range of asset messages
	*/
	@Override
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetMessage> getAssetMessages(
		int start, int end) {
		return _assetMessageLocalService.getAssetMessages(start, end);
	}

	@Override
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetMessage> getAssetMessages(
		long assetId, long userId, int start, int end) {
		return _assetMessageLocalService.getAssetMessages(assetId, userId,
			start, end);
	}

	/**
	* Returns all the asset messages matching the UUID and company.
	*
	* @param uuid the UUID of the asset messages
	* @param companyId the primary key of the company
	* @return the matching asset messages, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetMessage> getAssetMessagesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _assetMessageLocalService.getAssetMessagesByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of asset messages matching the UUID and company.
	*
	* @param uuid the UUID of the asset messages
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of asset messages
	* @param end the upper bound of the range of asset messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching asset messages, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.rivetlogic.assetmanagement.model.AssetMessage> getAssetMessagesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.rivetlogic.assetmanagement.model.AssetMessage> orderByComparator) {
		return _assetMessageLocalService.getAssetMessagesByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _assetMessageLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _assetMessageLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public AssetMessageLocalService getWrappedService() {
		return _assetMessageLocalService;
	}

	@Override
	public void setWrappedService(
		AssetMessageLocalService assetMessageLocalService) {
		_assetMessageLocalService = assetMessageLocalService;
	}

	private AssetMessageLocalService _assetMessageLocalService;
}