<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="java.util.*"%>
<html>
<head>
<title>校园论坛</title>
<script src="<%=request.getContextPath()%>/js/jquery.js"></script>
<script src="<%=request.getContextPath()%>/js/readonly.js"></script>
</head>
<body>
<%session.setAttribute("bbsId",request.getParameter("h")); %>
<jsp:include page="/page/top.jsp"/>
<s:actionerror/>
<div id="content"  align="center" >
<div id="errorAndmes"><s:actionmessage /></div>
	<div style="width:80%;" align="left" >
	<fieldset>
    <legend><h4><s:property value="u.bbsTitle"/></h4></legend>
	<h4><s:property value="u.bbsSender"/>(1#)&nbsp;&nbsp;<sh><s:property value="u.bbsSendTime"/></sh></h4>
	<p><s:textarea name="u.bbsContent" cols="100" rows="20"/></p>
	<hr>
	
	<s:iterator value="ul1">
	    <h4>
		    <s:property value="bbsAnswerSender"/>(<s:property value="bbsAnswerFloorid"/>#)
		    &nbsp;&nbsp;
		    <sh><s:property value="bbsAnswerSendTime"/></sh>
	    </h4>
		<p><s:textarea name="bbsAnswerContent" cols="100" rows="10"/></p>
		<hr>
	</s:iterator>
<%
	//用来判断当前是否有用户登陆，若有则显示！
	if(session.getAttribute("user")!=null){   
%>
	<s:form action="tzinsertAnswer">
	<B>发表回复：</B>
	<s:textfield name="u1.bbsAnswerSendTo" value="%{#request.u.bbsSender}"  type="hidden" />
	<s:textfield name="u1.bbsAnswerSender" value="%{#session.user}" type="hidden" />
	<s:textfield name="u1.bbsAnswerId" value="%{#session.bbsId}" type="hidden"/>
	<s:textfield name="u1.bbsAnswerFloorid" value="%{#request.floor+1}" type="hidden"/>
	<p><s:textarea name="u1.bbsAnswerContent" cols="80" rows="10"/></p>
	<s:submit value="发表"/>
	</s:form>
<%
					}else{
%>
	<B>发表回复：</B>
	<p>
			<h3>
					请
					<a href="<%=request.getContextPath()%>/page/login/login.jsp">
					<font color="red" >登陆</font></a>
					后,发表回复!
			</h3>
	</p>
<%
						 }	
%>	
	</fieldset>
	</div>
</div>
</body>
</html>