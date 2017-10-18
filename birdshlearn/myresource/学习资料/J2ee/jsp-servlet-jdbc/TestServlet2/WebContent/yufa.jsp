<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ page import="java.io.*" %>

<%@ include file="parent.jsp" %>

<%-- <%@ taglib uri="uri" prefix="prefixOfTag" %> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>菜鸟教程(runoob.com)</title>
</head>
<body>
声明的测试
<%
	int count=0;
	out.println(parent+"\r\n");
	out.println("sum="+(++sum)+"\r\n");
	out.println("count="+(++count)+"\r\n");
%>
</br>
表达式的测试
今天的日期是: <%= (new java.util.Date()).toLocaleString()%>
今天的日期是: <%out.println((new java.util.Date()).toLocaleString());%>
</br>
</br>
<%-- 该部分注释在网页中不会被显示--%> 
<!-- 该部分注释在网页源码中会被显示 -->
控制语句：
<%! int day = 3; %> 
<% if (day == 1 | day == 7) { %>
      <p>今天是周末</p>
<% } else { %>
      <p>今天不是周末</p>
<% } %>

</body>
</html>