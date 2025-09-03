<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>
	<h1>This is home page</h1>
	<h1>Called by hoe controller</h1>

	<%
	String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	List<String> friends = (List) request.getAttribute("f");
	%>
	<h1>
		My name is
		<%=name%>
	</h1>
	<h1>
		My id is
		<%=id%>
	</h1>

	<h1>
		Name of friends :
		<% for(String str : friends)
		{
			%>
		<h1>
			<%=str %>
		</h1>
		<%
		}
			%>


		
	</h1>

	<h1>url home</h1>
</body>
</html>