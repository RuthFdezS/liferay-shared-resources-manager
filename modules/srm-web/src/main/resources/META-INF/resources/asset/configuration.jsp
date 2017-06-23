<%@include file="/init.jsp"%>

<%@page import="com.liferay.portal.kernel.util.Constants"%>

<%
	AssetManagementPortletInstanceConfiguration portletInstanceConfiguration = portletDisplay
			.getPortletInstanceConfiguration(AssetManagementPortletInstanceConfiguration.class);

	String myAssetsTab = AssetManagementPortletInstanceConfiguration.AssetsTabs.MY_ASSETS_TAB.name();
	String allAssetsTab = AssetManagementPortletInstanceConfiguration.AssetsTabs.ALL_ASSETS_TAB.name();
	String tab_cfg = portletInstanceConfiguration.defaultOpenedTab().name();
%>

<liferay-portlet:actionURL var="configurationURL"
	portletConfiguration="true">
</liferay-portlet:actionURL>


<aui:form action="<%=configurationURL%>" method="post" name="fm">
	<aui:input name="<%=Constants.CMD%>" type="hidden"
		value="<%=Constants.UPDATE%>" />
	
	<aui:select name="preferences--defaultOpenedTab--" showEmptyOption="false">
		<aui:option value="<%= myAssetsTab %>" selected="<%= myAssetsTab.equals(tab_cfg) %>"><liferay-ui:message key="my-assets" /></aui:option>
		<aui:option value="<%= allAssetsTab %>" selected="<%= allAssetsTab.equals(tab_cfg) %>"><liferay-ui:message key="all-assets" /></aui:option>
	</aui:select>
	<aui:button-row>
		<aui:button type="submit" />
	</aui:button-row>

</aui:form>