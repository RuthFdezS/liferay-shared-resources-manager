<%@include file="/init.jsp"%>

<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.rivetlogic.assetmanagement.configuration.AssetManagementPortletInstanceConfiguration"%>

<%
	AssetManagementPortletInstanceConfiguration portletInstanceConfiguration = portletDisplay
			.getPortletInstanceConfiguration(AssetManagementPortletInstanceConfiguration.class);

	String myAssetsTab = AssetManagementPortletInstanceConfiguration.AssetsTabs.MY_ASSETS_TAB.getTabName();
	String allAssetsTab = AssetManagementPortletInstanceConfiguration.AssetsTabs.ALL_ASSETS_TAB.getTabName();
	String tab_cfg = portletInstanceConfiguration.defaultOpenedTab().getTabName();
%>

<liferay-portlet:actionURL var="configurationURL"
	portletConfiguration="true">
</liferay-portlet:actionURL>


<aui:form action="<%=configurationURL%>" method="post" name="fm">
	<aui:input name="<%=Constants.CMD%>" type="hidden"
		value="<%=Constants.UPDATE%>" />

	<p style="font-size: medium;"><liferay-ui:message key="configuration-description" /></p>
	
	<aui:select name="preferences--default-opened-tab--" showEmptyOption="false">
		<aui:option value="<%= myAssetsTab %>" selected="<%= myAssetsTab.equals(tab_cfg) %>"><liferay-ui:message key="my-assets" /></aui:option>
		<aui:option value="<%= allAssetsTab %>" selected="<%= allAssetsTab.equals(tab_cfg) %>"><liferay-ui:message key="all-assets" /></aui:option>
	</aui:select>
	<aui:button-row>
		<aui:button type="submit" />
	</aui:button-row>

</aui:form>