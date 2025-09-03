<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp" %>
<title>Insert title here</title>
</head>
<body>
<div class="container mt-5">
	<h3 class="text-center">Change Details</h3>
	<form action="${pageContext.request.contextPath }/handle-product" method="post">
	<input type="hidden" name="id" value="${product.id}">
		<div class="mb-3">
			<label for="exampleInputProductName" class="form-label">Product Name</label> <input type="text" class="form-control"
				id="exampleInputProductName" aria-describedby="emailHelp" name="name" value="${product.name }">
			
		</div>
		<div class="mb-3">
			<label for="exampleInputProductDescription" class="form-label">Product Description</label> <input type="text" class="form-control"
				id="exampleInputProductDescription" aria-describedby="ProductDescriptionHelp" name="description" value="${product.description }">
			
		</div>
		<div class="mb-3">
			<label for="exampleInputProductPrice" class="form-label">Product Price</label> <input type="number" class="form-control"
				id="exampleInputProductPrice" aria-describedby="ProductPriceHelp" name="price" value="${product.price }">
			
		</div>
	<div class="container mt-5 text-center">
		<button type="submit" class="btn btn-warning">Update</button>
	</div>
	</form>
</body>
</html>