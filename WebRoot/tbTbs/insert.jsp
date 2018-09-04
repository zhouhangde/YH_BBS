<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="js/jquery.min.js"></script>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	<form action="tbBbs/insertTbBbs.do" method="post">
		<pre>
		<%-- 帖子ID：<input type="text" name="bbsId" value="${tbBbs.bbsId}" /> --%>
		帖子标题：<input type="text" name="bbsTitle" value="${tbBbs.bbsTitle}" />
		帖子内容：<textarea name="bbsContent">${tbBbs.bbsContent }</textarea>
		帖子的发布者：<input type="text" name="bbsSender" value="${tbBbs.bbsSender}" />
		<%-- 帖子的发布时间：<input type="text" name="bbsSendtime" value="${tbBbs.bbsSendtime}" /> --%>
		帖子表情：<input type="text" name="bbsFace" value="${tbBbs.bbsFace}" />
		<%-- 对帖子进行操作的时间：<input type="text" name="bbsOptime" value="${tbBbs.bbsOptime}" /> --%>
		是否为置顶帖子：<input type="text" name="bbsIstop" value="${tbBbs.bbsIstop}" />
		<%-- 帖子被置顶的时间：<input type="text" name="bbsTotoptime" value="${tbBbs.bbsTotoptime}" /> --%>
		是否为精华帖子：<input type="text" name="bbsIsgood" value="${tbBbs.bbsIsgood}" />
		<%-- 帖子被设为精华帖子的时间：<input type="text" name="bbsTogoodtime" value="${tbBbs.bbsTogoodtime}" /> --%>
		<input type="submit" value="保存">
		</pre>
	</form>
</body>
</html>
