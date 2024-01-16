<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body>
	<div class="cotainer" style="margin-top: 2rem; margin-left: 26rem; width: 50%; ">
	<h3 class="text-center">Registration Form</h3>
		<form action="processform" method="POST">
		    <div class="form-group">
				<label for="firstname">First Name</label> <input
					type="text" class="form-control" id="firstname"
					aria-describedby="emailHelp" placeholder="Enter First Name here" name="firstname">
			</div>
			<div class="form-group">
				<label for="lastname">Last Name</label> <input
					type="text" class="form-control" id="lastname"
					aria-describedby="emailHelp" placeholder="Enter Last Name here" name="lastname">
			</div>
			<div class="form-group">
				<label for="number">Mobile Number</label> <input
					type="text" class="form-control" id="number"
					aria-describedby="emailHelp" placeholder="Enter Mobile No..." name="number">
			</div>
			
			<div class="form-group">
				<label for="exampleInputEmail1">Email address</label> <input
					type="email" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="Enter email" name="exampleInputEmail1">
			</div>
	
			<div class="form-group">
				<label for="username">User Name</label> <input
					type="text" class="form-control" id="username"
					placeholder="Enter userName" name="username">
			</div>
			
			<div class="form-group">
				<label for="Password">Password</label> <input
					type="password" class="form-control" id="Password"
					placeholder="Enter Password" name="Password">
			</div>
			
			<div class="container text-center"><button type="submit" class="btn btn-primary">Submit</button></div>
		</form>
	</div>





	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>