<%@include file="/init.jsp"%>

<%
	String redirect = ParamUtil.getString(request, "redirect");

	String currentURL = PortalUtil.getCurrentURL(renderRequest);

	PortletURL portletURL = renderResponse.createRenderURL();
	portletURL.setParameter("redirect", redirect);
%>


<portlet:renderURL var="viewManageAssetsURL" />

<liferay-ui:header backURL="<%=viewManageAssetsURL%>"
	escapeXml="<%=false%>" localizeTitle="<%=true%>"
	showBackURL="<%=true%>" title="view-asset-categories" />
	
<liferay-ui:error key="error-used-category" message="error-used-category"/>
<liferay-ui:error key="error-used-location" message="error-used-location"/>

<aui:button value="add-category" icon="icon-plus" onClick="showDialog('category', null, null)" />

<liferay-ui:search-container var="searchContainer"
	iteratorURL="<%=portletURL%>" emptyResultsMessage="no-asset-categories">

	<liferay-ui:search-container-results
		results="<%=AssetCategoryLocalServiceUtil.getAssetCategories(themeDisplay.getScopeGroupId(), themeDisplay.getCompanyId(),
						searchContainer.getStart(), searchContainer.getEnd())%>" />

	<liferay-ui:search-container-row
		className="com.rivetlogic.assetmanagement.model.AssetCategory"
		keyProperty="assetCategoryId" modelVar="assetCategory">

		<liferay-ui:search-container-column-text property="name" />

		<liferay-ui:search-container-column-text name="actions">
			<c:if test="<%=themeDisplay.getScopeGroupId() == assetCategory.getGroupId()%>">
				<liferay-ui:icon image="edit" message="edit" url="javascript:;"
				 	onClick="showDialog('category', '${ assetCategory.name }', ${ assetCategory.assetCategoryId })" label="true" />
				<liferay-ui:icon image="delete" message="delete" url="javascript:;" 
					onClick="showdDeleteDialog('category', ${ assetCategory.assetCategoryId })" label="true" />
			</c:if>
		</liferay-ui:search-container-column-text>

	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>
<hr/>

<aui:button value="add-location" icon="icon-plus" onClick="showDialog('location', null, null)"/>

<liferay-ui:search-container var="searchContainer"
	iteratorURL="<%=portletURL%>" emptyResultsMessage="no-asset-locations">

	<liferay-ui:search-container-results
		results="<%=AssetLocationLocalServiceUtil.getAssetLocations(themeDisplay.getScopeGroupId(), themeDisplay.getCompanyId(),
						searchContainer.getStart(), searchContainer.getEnd())%>" />

	<liferay-ui:search-container-row
		className="com.rivetlogic.assetmanagement.model.AssetLocation"
		keyProperty="assetLocationId" modelVar="assetLocation">

		<liferay-ui:search-container-column-text property="name" />
		
		<liferay-ui:search-container-column-text name="actions">
			<c:if test="<%=themeDisplay.getScopeGroupId() == assetLocation.getGroupId()%>">
				<liferay-ui:icon image="edit" message="edit" url="javascript:;"
				 	onClick="showDialog('location', '${ assetLocation.name }', ${ assetLocation.assetLocationId })" label="true" />
				<liferay-ui:icon image="delete" message="delete" url="javascript:;" 
					onClick="showdDeleteDialog('location', ${ assetLocation.assetLocationId })" label="true" />
			</c:if>
		</liferay-ui:search-container-column-text>

	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>

<div class="hide">
	<aui:container id="edit-dialog">
		<aui:form name="dialog-form">
			<aui:input name="redirect" type="hidden" value="<%=currentURL%>" />
			<aui:input name="id" type="hidden" value="null"/>
			<aui:input name="name" required="true" />
			<aui:button-row cssClass="pull-right">
				<aui:button value="save" type="submit" cssClass="btn-primary" />
			</aui:button-row>
		</aui:form>
	</aui:container>
</div>

<div class="hide">
	<aui:container id="delete-dialog">
		<aui:form name="dialog-delete-form">
			<aui:input name="redirectDelete" type="hidden" value="<%=currentURL%>" />
			<aui:input name="idDelete" type="hidden" value="null"/>
			<liferay-ui:message key="delete-message" />
			<br />
			<br />
			<aui:button-row cssClass="pull-right">
				<aui:button value="delete" type="submit" cssClass="btn-primary" />
			</aui:button-row>
		</aui:form>
	</aui:container>
</div>

<aui:script use="aui-dialog">
	Liferay.provide(window, 'showDialog', function(type, value, id) {
		var categoryUrl = '<portlet:actionURL name="addAssetCategory" />';
		var locationUrl = '<portlet:actionURL name="addAssetLocation" />';
		A.one('#<portlet:namespace/>dialog-form').attr('action', type == 'category' ? categoryUrl : locationUrl)
		A.one('#<portlet:namespace/>id').attr('value', id);
		A.one('#<portlet:namespace/>name').attr('value', value);
		Liferay.Util.openWindow({
			dialog: {
				centered: true,
				width: '250',
				height: '255',
				bodyContent: A.one('#<portlet:namespace/>edit-dialog')
			},
			title: Liferay.Language.get((id? 'edit' : 'add') + '-' + type)
		});
	});
	
	Liferay.provide(window, 'showdDeleteDialog', function(type, id) {
		var categoryUrl = '<portlet:actionURL name="deleteAssetCategory" />';
		var locationUrl = '<portlet:actionURL name="deleteAssetLocation" />';
		A.one('#<portlet:namespace/>dialog-delete-form').attr('action', type == 'category' ? categoryUrl : locationUrl)
		A.one('#<portlet:namespace/>idDelete').attr('value', id);
		Liferay.Util.openWindow({
			dialog: {
				centered: true,
				width: '250',
				height: '255',
				bodyContent: A.one('#<portlet:namespace/>delete-dialog')
			},
			title: Liferay.Language.get(type == 'category' ? 'delete-category' : 'Delete Location')
		});
	});
</aui:script>