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
<form action="<%=request.getContextPath()%>/searchemp.mybatis" method="post">
<input type="text" name="word" />
<select name="searchname">
<option value="employee_id"> 사번검색 </option>
<option value="first_name"> 이름검색 </option>
<option value="phone"> 전화번호검색 </option>
</select>
<input type="submit" value="검색" />

</form>
</body>
</html>