<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1 class="text-center mb-3">fill the product details</h1>
				<form action="handler_product" method="Post">
					<div class="form-group">
						<label for="name">product name</label> <input
							type="text" class="form-control" id="exampleInputEmail1"
							aria-describedby="emailHelp" placeholder="Enter the product name" name="name"> 
					</div>
					<div class="form-group">
						<label for="description">Product description</label> 
						<textarea class="form-control" rows="5" id="description" name = "description" placeholder = "Enter the description"></textarea>
					</div>
					<div class="form-group">
						<label for="price">product price</label> <input
							type="text" class="form-control" id="exampleInputEmail1"
							aria-describedby="emailHelp" placeholder="Enter the product price" name="price"> 
					</div>
					<div class="container text-center">
					     <a href="${pageContext.request.contextPath }/home" class="btn btn-outline-danger">Back</a>
					      <button type="submit" class="btn btn-primary">Submit</button>
					</div>
					
				</form>
			</div>
		</div>
	</div>
</body>
</html>