<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title>Welcome</title>
</head>
<body>
<jsp:include page="/page/top.jsp"/>
<div  id="content" align="center">
	<h1>登陆成功.欢迎您<font color="red" >${session.user}</font>!!!</h1>
</div>
</body>
</html>
