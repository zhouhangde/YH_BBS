<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/jquery.date_input.pack.js"></script>

<link rel="stylesheet" type="text/css" href="../css/date.css">
</head>

<body>
	<form action="tbBbs/updateTbBbs.do" method="post" >
		<pre>
		帖子ID：<input type="text" name="bbsId" value="${tbBbs.bbsId}" />
		帖子标题：<input type="text" name="bbsTitle" value="${tbBbs.bbsTitle}" />
		帖子内容：<textarea name="bbsContent">${tbBbs.bbsContent }</textarea>
		帖子的发布者：<input type="text" name="bbsSender" value="${tbBbs.bbsSender}" />
		帖子的发布时间：<%-- <input type="text" name="bbsSendtime" value="<fmt:formatDate value='${tbBbs.bbsSendtime}' pattern='yyyy-MM-dd HH:mm:ss' />"> --%>
		  <%--  <fmt:formatDate  value="${tbBbs.bbsSendtime}" type="both" 
            dateStyle="medium" timeStyle="medium"/> --%>
            <input name="bbsSendtime" style="width:226px;background: #fefefe;border: 1px solid #bbb;font-size: 14px;color: #333;padding: 7px;border-radius: 3px;"
            value="<fmt:formatDate value='${tbBbs.bbsSendtime}' pattern='yyyy-MM-dd' />"
             type="text" class="date_picker">
		帖子表情：<input type="text" name="bbsFace" value="${tbBbs.bbsFace}" />
		对帖子进行操作的时间：<fmt:formatDate  value="${tbBbs.bbsOptime}" type="both" 
            dateStyle="medium" timeStyle="medium"/>
		是否为置顶帖子：<input type="text" name="bbsIstop" value="${tbBbs.bbsIstop}" />
		帖子被置顶的时间：<fmt:formatDate  value="${tbBbs.bbsTotoptime}" type="both" 
            dateStyle="medium" timeStyle="medium"/>
		是否为精华帖子：<input type="text" name="bbsIsgood" value="${tbBbs.bbsIsgood}" />
		帖子被设为精华帖子的时间：<fmt:formatDate  value="${tbBbs.bbsTogoodtime}" type="both" 
            dateStyle="medium" timeStyle="medium"/>
		<input type="submit" value="保存">
		</pre>
	</form>
</body>
<script type="text/javascript">
	$(function(){

	$('.date_picker').date_input();

	});
	
</script>
</html>
