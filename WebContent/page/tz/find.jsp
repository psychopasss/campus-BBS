<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>校园论坛</title>
<script src="<%=request.getContextPath()%>/js/jquery.js"></script>
<script src="<%=request.getContextPath()%>/js/table.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery.tablesorter.js"></script>
<script src="<%=request.getContextPath()%>/js/message.js"></script>
</head>
<body>
<jsp:include page="/page/top.jsp"/>
<s:actionerror/>
<div id="content"  align="left" >

<%session.setAttribute("bbsClass",request.getParameter("bbsClass")); %>
		<s:form action="tzfindByKeyword?bbsClass=%{#session.bbsClass}" >
			SEARCH:<s:textfield name="keyword" placeholder="请输入关键字查询" title="支持模糊查询"/>
			<s:checkbox name="mhcx" value="1">模糊查询：</s:checkbox>
			<s:submit value="查询"/>
<%
	//用来判断当前是否有用户登陆，若有则显示发帖！
	if(session.getAttribute("user")!=null){   
%>
			<a href="<%=request.getContextPath()%>/page/tz/insert.jsp?bbsClass=${bbsClass}"><input type="button" value="发帖"></a>	
<%
		}
%>
			<div id="errorAndmes"><s:actionmessage /></div>
			
		</s:form>
<table  class="t" id="theTable" >
			<thead>
			<tr class="t">	
				<th class="t" width="80%">标题</th>
				<th class="t" width="5%">发帖人</th>
				<th class="t" width="15%">发帖时间</th>
			</tr>	
			</thead>
			<s:if test="ul == null">
			<script>alert("查无此贴！")</script>
			</s:if>
			<s:iterator value="ul">
			<tr class="t">
				<td class="t">&nbsp;<a href="tzdetail?h=<s:property value="bbsId"/>" ><s:property value="bbsTitle"/></a></td>
				<td class="t">&nbsp;<s:property value="bbsSender"/></td>
				<td class="t">&nbsp;<s:property value="bbsSendTime"/></td>
			</tr>
			</s:iterator>	
</table>
</div>
</body>
</html>
