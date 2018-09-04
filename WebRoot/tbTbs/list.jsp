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
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<script type="text/javascript" src="js/jquery.min.js"></script>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script>

</script>
</head>
<body>
    <form action="tbBbs/SelectTbBbsLike.do" method="post">
     	<table style="height: 34px;" align="center" class="hovertable" >
     		<tr>
     			<td style="font-size: 20px" onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">查询类型</td>
		     	<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
		     	<select style="height: 34px; font-size: 20px" name="select">
		     		<option >帖子标题</option>
		     		<option >帖子的发布者</option>
		     		<option >是否为置顶帖子</option>
		     		<option >是否为精华帖子</option>
		     	</select>
		     	</td>
		     	<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';"><input type="text"  style="width: 257px; height: 38px" name="value"></td>
		     	<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';"><input type="submit" value="模糊查询" style="font-size: 20px; height: 35px; width: 88px;border: none;background-color: #d4e3e5;"></a></td>
     		</tr>
     	</table>
     </form>
     <form action="tbBbs/SelectTbBbsOrder.do" method="post">
     	<table style="height: 34px;" align="center" class="hovertable" >
     		<tr>
     			<td style="font-size: 20px" onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">查询类型</td>
		     	<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
		     	  帖子标题：<input type="text" name="bbsTitle" value="${tbBbs.bbsTitle}" />
		     	</td>
		     	<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
		     	 帖子的发布者：<input type="text" name="bbsSender" value="${tbBbs.bbsSender}" />
		     	</td>
		     	<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
		     	 是否为置顶帖子：<input type="text" name="bbsIstop" value="${tbBbs.bbsIstop}" />
		     	</td>
		     	<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
		     	 是否为精华帖子：<input type="text" name="bbsIsgood" value="${tbBbs.bbsIsgood}" />
		     	</td>
		     	<td onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
		     	<input type="submit" value="指定查询" style="font-size: 20px; height: 35px; width: 88px;border: none;background-color: #d4e3e5;">
		     	</td>
     		</tr>
     	</table>
     </form>
	<table>
		<tr>
			<th>帖子标题</th>
			<th>帖子内容</th>
			<th>帖子的发布者</th>
			<th>帖子的发布时间</th>
			<th>帖子表情</th>
			<th>对帖子进行操作的时间</th>
			<th>是否为置顶帖子</th>
			<th>帖子被置顶的时间</th>
			<th>是否为精华帖子</th>
			<th>帖子被设为精华帖子的时间</th>
		</tr>
		<c:forEach items="${listTbBbs }" var="tbBbs">
			<tr>
				<td>${tbBbs.bbsTitle }</td>
				<td>${tbBbs.bbsContent }</td>
				<td>${tbBbs.bbsSender }</td>
				<td>
				  <fmt:formatDate  value="${tbBbs.bbsSendtime}" type="both" 
                    dateStyle="medium" timeStyle="medium"/>
				</td>
				<td>${tbBbs.bbsFace }</td>
				<td>
				  <fmt:formatDate  value="${tbBbs.bbsOptime}" type="both" 
                    dateStyle="medium" timeStyle="medium"/>
				</td>
				<td>${tbBbs.bbsIstop }</td>
				<td>
				   <fmt:formatDate  value="${tbBbs.bbsTotoptime}" type="both" 
                    dateStyle="medium" timeStyle="medium"/>
				</td>
				<td>${tbBbs.bbsIsgood }</td>
				<td>
				<fmt:formatDate  value="${tbBbs.bbsTogoodtime }" type="both" 
                    dateStyle="medium" timeStyle="medium"/>
				</td>
				<td><a href="tbBbs/queryTbBbsById.do?id=${tbBbs.bbsId}" style="text-decoration: none;">✎修改</a></td>
				<td><a href="tbBbs/deleteTbBbsByid.do?id=${tbBbs.bbsId}" style="text-decoration: none;">✄删除</a></td>
			</tr>
		</c:forEach>
          <tr height="23px" class="fenye"  onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
   			<td colspan="2" ><a href="tbBbs/showTbBbsByPage.do?pageNow=1"><input type="button" value="首页"></a></td>
   			<td colspan="2"><a href="tbBbs/showTbBbsByPage.do?pageNow=${pageNow-1}"><input type="button" class="lastPage" value="上一页"></a></td>
   			<td colspan="2"><a href="tbBbs/showTbBbsByPage.do?pageNow=${pageNow+1}"><input type="button" class="nextPage" value="下一页"></a></td>
   			<td colspan="2"><a href="tbBbs/showTbBbsByPage.do?pageNow=${page}"><input type="button" value="尾页"></a></td>
   			<td colspan="2">第<input type="text" name="page" class="page" value="${pageNow}" style="width: 30px">页 共<span class="pagetotal">${page}</span>页
   			<button onclick="goPage()">go</button>
   			</td>
   		</tr>
	</table>
	<button onclick="toInsert()">
	    新增
	</button>

</body>
<script src="js/jquery.min.js"></script>
<script type="text/javascript">
     function toInsert(){
         window.open("tbTbs/insert.jsp");
     }
     
      function goPage(){
         var thispage = $(".page").val();
         window.location.href="tbBbs/showTbBbsByPage.do?pageNow="+thispage;
      }
      
      $(function(){
         var pagethis = $(".page").val();
         var pagetotal = $(".pagetotal").text();
         if(pagethis == 0){
             $(".fenye").html('<td><a href="tbBbs/showTbBbsByPage.do?pageNow=1"><input type="button" value="首页"></a></td>"');
         }
         if(pagethis == 1){
            $(".lastPage").attr("disabled",true);
            $(".lastPage").css("cursor","not-allowed");
         }else{
            $(".lastPage").attr("disabled",false);
         }
         if(pagethis == pagetotal){
            $(".nextPage").attr("disabled",true);
            $(".nextPage").css("cursor","not-allowed");
         }else{
            $(".nextPage").attr("disabled",false);
         }
         
      })
     
</script>
</html>
