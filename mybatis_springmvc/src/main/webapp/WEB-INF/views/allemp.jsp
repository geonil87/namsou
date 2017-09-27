<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
${allemplist }
<c:forEach items="${allemplist }" var="empvo">
<h1>
${empvo.employee_id} :${empvo.first_name} 
${empvo.phone} 
</h1>
</c:forEach>
</body>
</html>