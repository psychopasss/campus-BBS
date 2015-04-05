<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>校园论坛</title>
 <script>
 	/*用于获取新的验证码*/
    function refresh(obj) {
        obj.src = "imageServlet.servlet?"+Math.random();
    }
 </script>
</head>

<body >
<jsp:include page="/page/top.jsp"/>

<div  id="content" align="center">

<s:form  action="login" >
<table border=1>
<tr>
	<h4>用户登录</h4>
</tr>
<tr>
	<td>用户名:</td>  
	<td><s:textfield name="userName" required="required"/></td>
</tr>
<tr>
	<td>密码:</td>
	<td><s:password name="userPassword" required="required"/></td>
</tr>
<tr>
	<td>验证码：</td>
	<td>
	<s:textfield name="randomCode"/>
	<img title="点击更换" onclick="refresh(this)" src="imageServlet.servlet">
	</td>
</tr>
<tr>
	<td colspan=2>
	<s:submit value="登陆"/>
	<s:reset value="重置"/>
	</td>	
</tr>
</table>
</s:form>
<div id="errorAndmes"><font color="red"><s:actionmessage /></font></div>
</div>

</body>
</html>

