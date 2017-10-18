<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/jsp/common/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>mongodb</title>
</head>
<script>
 function returnPage(){
    var frmObj=document.forms[0];
    frmObj.action="${pageContext.request.contextPath}";
    frmObj.submit();
 }
</script>
<body>    
    <form action="${pageContext.request.contextPath}/users/save" method="post">
       title: <input name="title" />  <br />
       description: <input name="description" /> <br />
       <input type="submit" value="提交"/>
       <input type="submit" value="返回" onclick="returnPage();">
    </form>
</body>
</html>