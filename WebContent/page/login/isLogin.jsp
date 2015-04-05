<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title>校园论坛<</title>
</head>

<body>

<jsp:include page="/page/top.jsp"/>

<div  id="content" align="center">
		<h3>
		您还没有登陆，请先<a href="<%=request.getContextPath()%>/page/login/login.jsp"><font color="red">登陆</font></a>!
		</h3>
</div>

</body>/
</html>
