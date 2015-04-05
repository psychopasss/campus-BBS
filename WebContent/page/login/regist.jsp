<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新用户注册</title>

</head>
<body>
<jsp:include page="/page/top.jsp"/>


<div id="content"  align="center">
<div style="width: 500px;" align="left" >
	<div id="errorAndmes"><s:actionmessage /></div>
	<s:form action="regist">
	<fieldset>
    <legend><h4>新用户注册</h4></legend>
	用户名:<s:textfield name="model.userName" required="required"/><br>
	密码：<s:password name="model.userPassword" required="required"/><br>
	确认密码：<s:password name="renewpassword" required="required"/><br>
	性别:<input type="radio" name="model.userSex" value="男"  checked>男 
		<input type="radio" name="model.userSex" value="女"  >女 <br>
	电子邮箱：<s:textfield name="model.userEmail" required="required"/><br>	
	<s:textfield name="model.root"  value="0" type="hidden"/><br>
	<s:submit value="确定"/>
	<s:reset value="重置" />
	<a href="<%=request.getContextPath()%>/page/login/login.jsp"><input type="button" value="返回"></a>
	
	</fieldset>
</s:form>
</div>
</div>


</body>
</html>