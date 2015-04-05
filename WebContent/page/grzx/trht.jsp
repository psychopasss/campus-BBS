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
		<s:form action="tzfindByKeyword1?bbsSender=%{#session.user}" >
			SEARCH:<s:textfield name="keyword" placeholder="请输入关键字查询" title="支持模糊查询"/>
			<s:checkbox name="mhcx" value="1">模糊查询：</s:checkbox>
			<s:submit value="查询"/>
			<a href="tzfind1?bbsSender=${user}"><input type="button" value="帖子管理"></a>
			<a href="tzfindAnswer?bbsSender=${user}"><input type="button" value="我的回复"></a>
			<a href="tzfindAnswer2?bbsSender=${user}"><input type="button" value="他人回帖"></a>
			<a href="<%=request.getContextPath()%>/page/grzx/xgmm.jsp"><input type="button" value="修改密码"></a>
		</s:form>
<div id="errorAndmes"><s:actionmessage /></div>
<table  class="t" id="theTable" >
			<thead>
			<tr class="t">	
				<th class="t">回复内容</th>
				<th class="t">回复人</th>
				<th class="t">回复楼层</th>
				<th class="t">回复时间</th>
				<th class="d">操作</th>	
			</tr>	
			</thead>
			<s:if test="ul1 == null">
			<script>alert("没有找到回复帖子！")</script>
			</s:if>
			<s:iterator value="ul1">
			<tr class="t">
				<td class="t" width="66%">&nbsp;<a href="tzdetail?h=<s:property value="bbsAnswerId"/>" ><s:property value="bbsAnswerContent"/></a></td>
				<td class="t" width="8%">&nbsp;<s:property value="bbsAnswerSender"/></td>
				<td class="t" width="8%">&nbsp;<s:property value="bbsAnswerFloorid"/>#</td>
				<td class="t" width="13%">&nbsp;<s:property value="bbsAnswerSendTime"/></td>
				<td class="t" width="5%">
					<div align="center">
					<a href="tzdeleteAnswer2?bbsAnswerId=<s:property value="bbsAnswerId"/>&bbsAnswerFloorid=<s:property value="bbsAnswerFloorid"/>&bbsSender=${user}" onclick="return ConfirmDel();">删除</a>	
					</div>				
				</td>		
			</tr>
			</s:iterator>	
</table>
</div>
</body>
</html>