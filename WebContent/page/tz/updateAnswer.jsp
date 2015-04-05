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
	<s:form action="tzupdateAnswer"  onsubmit="return confirmBj()">
	<fieldset>
    <legend><h4>修改回复</h4></legend>
    <s:textfield name="u1.bbsAnswerPk"  type="hidden"/>
	<s:textfield name="u1.bbsAnswerId" type="hidden"/><br>
	内容:<br><s:textarea name="u1.bbsAnswerContent" cols="80" rows="20"/><br>
	<s:textfield name="u1.bbsAnswerSender"  type="hidden"/>
	<s:textfield name="u1.bbsAnswerSendTime"  type="hidden"/>
	<s:textfield name="u1.bbsAnswerFloorid"  type="hidden"/>
	<s:submit value="保存"/>
	<a href="tzfindAnswer?bbsSender=${user}"><input type="button" value="返回"></a>
	</fieldset>
</s:form>
</div>
</div>
</body>
</html>
