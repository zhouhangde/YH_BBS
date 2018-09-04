<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML>
<html>
<head>
  <title>宇航论坛</title>
  <base href="<%=basePath%>">
  <link style="text/css" rel="stylesheet" href="css/style.css">
  <script type="text/javascript" src="js/bbs.js"></script>  
  <script type="text/javascript" src="js/jquery.min.js"></script>
</head>
  <body bgcolor="#AA8D60">
    <center>
      <table bgcolor="#F0F0F0" border="0" width="800" cellspacing="0" cellpadding="0" bordercolor="lightgrey" bordercolorlight="lightgrey" bordercolordark="white">
        <tr><td><jsp:include page="top.jsp"/></td></tr>
        <tr><td><jsp:include page="menu.jsp"/></td></tr>        
        <%-- <tr><td><jsp:include page="<%=mainPage%>"/></td></tr> --%>
        <tr><td height="82"><jsp:include page="end.jsp"/></td></tr>
      </table>
    </center>
  </body>
</html>
</body>
</html>
