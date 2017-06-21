<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@page import="java.util.*"%>
<%@page import="java.text.DateFormat"%>
<%@page import="javax.portlet.PortletURL"%>

<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>

<%@page import="com.rivetlogic.assetmanagement.model.Asset"%>
<%@page import="com.rivetlogic.assetmanagement.model.AssetStatus"%>
<%@page import="com.rivetlogic.assetmanagement.service.AssetLocalServiceUtil"%>
<%@page import="com.rivetlogic.assetmanagement.model.AssetLocation"%>
<%@page import="com.rivetlogic.assetmanagement.service.AssetLocationLocalServiceUtil"%>
<%@page import="com.rivetlogic.assetmanagement.model.AssetCategory"%>
<%@page import="com.rivetlogic.assetmanagement.service.AssetCategoryLocalServiceUtil"%>
<%@page import="com.rivetlogic.assetmanagement.service.AssetRequestLocalServiceUtil"%>
<%@page import="com.rivetlogic.assetmanagement.service.AssetMessageLocalServiceUtil"%>
<%@page import="com.rivetlogic.assetmanagement.keys.AssetNotificationsKeys"%>


<liferay-theme:defineObjects />

<portlet:defineObjects />