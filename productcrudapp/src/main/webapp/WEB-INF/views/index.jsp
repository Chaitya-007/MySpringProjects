<html>
<head>
<%@include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
</head>
<body>
	<div class="container center">
		<table class="table">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">First</th>
					<th scope="col">Last</th>
					<th scope="col">Handle</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
			
			<c:forEach items="${products }" var="p">
				<tr>
					<th scope="row">TECHNOLOGY${p.id }</th>
					<td>${p.name }</td>
					<td>${p.description }</td>
					<td class="font-weight-bold">Rs${p.price }</td>
					<td>
					<a href="delete-product/${p.id}" class="text-danger"><i class="fa-solid fa-trash"></i></a>
					<a href="update-product/${p.id}" class="text-primary"><i class="fa-solid fa-pen-nib"></i></a>
					</td>
				</tr>
			</c:forEach>
				
			</tbody>
		</table>
		<div class="container text-center">
		<a href="add-product" class="btn btn-outline-success">Add Product</a>
		</div>
	</div>
</body>
</html>
