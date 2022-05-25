<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page isErrorPage="true" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<title>Book Club Login and Registration</title>
</head>
<body>
	<!-- Registration -->
	<div class="container">
		<div class="row">
			<div class="col">
				<h1>Register</h1>
				<form:form method="POST" action="/registration" modelAttribute="user">
					<div class="form-group">
						<form:label path="name">User Name: </form:label>
						<form:errors class="text-danger" path="name"/>
						<form:input class="form-control" path="name"/>
					</div>
					<div class="form-group">
						<form:label path="email">Email: </form:label>
						<form:errors class="text-danger" path="email"/>
						<form:input class="form-control" path="email"/>
					</div>
					<div class="form-group">
						<form:label path="password">Password: </form:label>
						<form:errors class="text-danger" path="password"/>
						<form:input class="form-control" type="password" path="password"/>
					</div>
					<div class="form-group">
						<form:label path="confirm">Confirm Password: </form:label>
						<form:errors class="text-danger" path="confirm"/>
						<form:input class="form-control" type="password" path="confirm"/>
					</div>
					<button>Register</button>
				</form:form>
			</div>
			<div class="col">
				<h1>Login</h1>
				<form method="post" action="/login">
				<p class="text-danger"><c:out value="${error}"/></p>
					<div class="form-group">
						<label type="email" for="email">Email: </label>
						<input class="form-control" type="text" id="email" name="email"/>
					</div>
					<div class="form-group">
						<label for="password">Password: </label>
						<input class="form-control" type="password" id="password" name="password"/>
					</div>
					<button>Login</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>