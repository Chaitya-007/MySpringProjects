<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>This is help page</title>
</head>
<body>
	<h1>Welcome to help page</h1>
	<%-- <%
	String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	LocalDateTime time = (LocalDateTime) request.getAttribute("time");
	%> --%>

	<h1>
		Name :
		<%-- <%=name%> --%>
		${name}
	</h1>
	<h1>
		Id :
		<%-- <%=id%> --%>
		${id }
	</h1>
	<h1>
		Time :
		<%-- <%=time.toString()%> --%>
		${time}
	</h1>

	<hr>

	<c:forEach var="item" items="${list}">
		<%-- <h4>${item }</h4> --%>
		<h4>
		<c:out value="${item }"></c:out>
		</h4>
	</c:forEach>


</body>
</html>