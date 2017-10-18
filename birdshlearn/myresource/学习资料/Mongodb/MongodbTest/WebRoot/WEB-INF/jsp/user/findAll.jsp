<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/jsp/common/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>mongodb</title>
</head>
<body>
<c:forEach items="${allUser}" var="node">
id：<c:out value="${node._id}"></c:out>
标题：<c:out value="${node.title}"></c:out>
描述： <c:out value="${node.description}"></c:out><br/>
</c:forEach>
   <a href="${pageContext.request.contextPath}">返回</a>
</body>
</html>