<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>校园论坛</title>
<link href="<%=request.getContextPath()%>/style.css" rel="stylesheet" type="text/css" media="screen" />
<script src="<%=request.getContextPath()%>/js/xgmm.js"></script>
</head>
<body>
<jsp:include page="/page/top.jsp"/>
<div id="content" align="center">
		<a href="tzfind1?bbsSender=${user}" ><input type="button" value="帖子管理"></a>
		<a href="tzfindAnswer?bbsSender=${user}"><input type="button" value="我的回复"></a>
		<a href="tzfindAnswer2?bbsSender=${user}"><input type="button" value="他人回帖"></a>
		<a href="<%=request.getContextPath()%>/page/grzx/xgmm.jsp"><input type="button" value="修改密码"></a>
<div style="width:500px;" align="left" >

	<s:form action="xgmm" onsubmit="return confirmXgmm()">
		<fieldset>
    	<legend><h4>修改密码</h4></legend>
		<table>
		<tr>
			<td>旧密码：</td>
			<td><s:password name="oldpassword" required="true" maxlength="20"/></td>
		</tr>
		<tr>
			<td>输入新密码：</td>
			<td><s:password name="newpassword" id="pw1" required="true" maxlength="20" title="密码最多20位"/></td>
		</tr>
        <tr>
        	<td>确认新密码：</td>
        	<td><s:password name="renewpassword" id="pw2" onkeyup="validate()" maxlength="20" required="true" title="密码最多20位"/><td>
        </tr>
		<tr >
			<td colspan=2>
				<s:submit value="保存"/>
				<s:reset value="重置" />
			</td>
		</tr>
		</table>
		<span id="tishi"></span>
		</fieldset>
	</s:form>
	<div id="errorAndmes"><font color="red" ><s:actionmessage/></font></div>
</div>
</div>
</body>
</html>
