<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>校园论坛</title>
<script src="<%=request.getContextPath()%>/js/jquery.js"></script>
<script src="<%=request.getContextPath()%>/js/alert.js"></script>
</head>
<body>
<jsp:include page="/page/top.jsp"/>
<div id="content"  align="center">
<div style="width: 80%;" align="left" >
	<div id="errorAndmes"><s:actionmessage /></div>
	<s:form action="tzinsert"  onsubmit="return confirmFt()">
	<fieldset>
    <legend><h4>发帖</h4></legend>
	标题:<s:textfield name="u.bbsTitle" required="required"/><br>
	内容:<br><s:textarea name="u.bbsContent" cols="80" rows="20"/><br>
	<s:textfield name="u.bbsSender" value="%{#session.user}" type="hidden"/>
	<s:textfield name="u.bbsClass" value="%{#session.bbsClass}" type="hidden"/>
	<s:submit value="保存"/>
	<a href="tzfind?bbsClass=${session.bbsClass}"><input type="button" value="返回"></a>
	</fieldset>
</s:form>
</div>
</div>
</body>
</html>
