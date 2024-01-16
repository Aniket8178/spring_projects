<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

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
	
<link href="<c:url value="/resources/css/style.css" />">
<script src="<c:url value="/resources/js/script.js"/>"></script>

<title>Registration From</title>
</head>
<body class="" style="background: #e2e2e2;">

	<div class="container mt-4">
		<div class="row">
			<div class="col-md-8 offset-md-2">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center">Complex From</h3>

						<div class="alert alert-danger" role="alert">
						    <form:errors path = "student.*" />
						</div>
						<form action="handleform" method="POST">
							<div class="form-group">
								<label for="name">Enter Your Name</label> <input type="text"
									class="form-control" id="name" aria-describedby="emailHelp"
									placeholder="Enter Name" name="name">
							</div>

							<div class="form-group">
								<label for="ID">Enter ID</label> <input type="text"
									class="form-control" id="ID" aria-describedby="emailHelp"
									placeholder="Enter Name" name="id">
							</div>

							<div class="form-group">
								<label for="DOB">Enter Your DOB</label> <input type="text"
									class="form-control" aria-describedby="emailHelp"
									placeholder="dd/mm/yyyy" name="date">
							</div>

							<div class="form-group">
								<label for="Multiplecourse">Select Multiple Course </label> <select
									multiple class="form-control" id="Multiplecourse" name="course">
									<option>Java</option>
									<option>SpringBoot</option>
									<option>Python</option>
									<option>HTML</option>
									<option>Css</option>
								</select>
							</div>

							<div class="form-group">
								<span>Select Gender </span>
								<div class="custom-control custom-radio custom-control-inline">
									<input type="radio" id="customRadioInline1" name="gender"
										class="custom-control-input" value="male"> <label
										class="custom-control-label" for="customRadioInline1">Male</label>
								</div>
								<div class="custom-control custom-radio custom-control-inline">
									<input type="radio" id="customRadioInline2" name="gender"
										class="custom-control-input" value="female"> <label
										class="custom-control-label" for="customRadioInline2">Female</label>
								</div>
							</div>

							<div class="form-group">
								<label for="">Select Type </label> <select class="form-control"
									name="type">
									<option value="oldestudent">old Student</option>
									<option value="normaalstudent">Normal Student</option>
								</select>
							</div>
							<div class="card">
								<h5>Address</h5>
								<div class="form-group">
									<label for="validationCustom03">street</label> <input
										type="text" class="form-control" id="validationCustom03"
										placeholder="street" name="address.street" required>
								</div>
								<div class="form-group">
									<label for="validationCustom03">City</label> <input type="text"
										class="form-control" id="validationCustom03"
										placeholder="City" name="address.city" required>
								</div>
							</div>

							<div class="container text-center mt-2">
								<button type="submit" class="btn btn-primary">Submit</button>
							</div>

						</form>
					</div>
				</div>
			</div>
		</div>
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