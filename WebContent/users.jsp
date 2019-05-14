<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	


	<table border="1">
		<tr>
			<td>id</td>
			<td>姓名</td>
			<td>年龄</td>
			<td>性别</td>
			<td>地址</td>
		</tr>
		<c:forEach items="${usersList}" var="users" varStatus="userss">
			<tr>
				<td>${users.id}</td>
				<td>${users.name}</td>
				<td>${users.age}</td>
				<td>${users.sex}</td>
				<td>${users.addr}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>