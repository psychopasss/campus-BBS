<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script src="<%=request.getContextPath()%>/js/current.js"></script>
<link href="<%=request.getContextPath()%>/style.css" rel="stylesheet" type="text/css" media="screen" />
<div id="wrapper">
	<div id="header-wrapper">
		<div id="header">
			<div id="logo">
			
				<h2><a href="<%=request.getContextPath()%>/page/index/index.jsp"><img height="80"  src="<%=request.getContextPath()%>/images/img05.png" width="220" ></a></h2>
			</div>
<%
	//用来判断当前是否有用户登陆，若有则显示当前用户名！
	if(session.getAttribute("user")==null){   
%>
			<div id="log_inout">	
				<a href="<%=request.getContextPath()%>/page/login/login.jsp">登陆</a>
				<a href="<%=request.getContextPath()%>/page/login/regist.jsp">注册</a>	</div>			
<%
					}else{
%>
					<div id="log_inout">	
						<a href="#">用户：<font color="red">${session.user}</font></a>
						<a href="<%=request.getContextPath()%>/page/grzx/tzfind1?bbsSender=${user}">个人中心</a>
						<a href="<%=request.getContextPath()%>/page/login/logout.jsp">注销</a>			
					</div>
<%
						 }	
%>		
				<div id="menu">
				<ul>
				    <li><a href="<%=request.getContextPath()%>/page/index/index.jsp" id="s9">首页</a></li>
					<li><a href="<%=request.getContextPath()%>/tzfind?bbsClass=1" id="s0">工大资讯</a></li>
					<li><a href="<%=request.getContextPath()%>/tzfind?bbsClass=2" id="s1">考研交流</a></li>
					<li><a href="<%=request.getContextPath()%>/tzfind?bbsClass=3" id="s2">跳蚤市场</a></li>
					<li><a href="<%=request.getContextPath()%>/tzfind?bbsClass=4" id="s3">工大文学</a></li>
					<li><a href="<%=request.getContextPath()%>/tzfind?bbsClass=5" id="s4">寝室乱谈</a></li>
					<li><a href="<%=request.getContextPath()%>/tzfind?bbsClass=6" id="s5">帖图乐园</a></li>
					<li><a href="<%=request.getContextPath()%>/tzfind?bbsClass=7" id="s6">影视音乐</a></li>
					<li><a href="<%=request.getContextPath()%>/tzfind?bbsClass=8" id="s7">游戏天地</a></li>
					<li><a href="<%=request.getContextPath()%>/tzfind?bbsClass=9" id="s8">漫友交流</a></li>					
				</ul>
			</div>
		</div>
	</div>

</div>
