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
<title>Add to Shelf</title>
</head>
<body>
<div class="container">

	<h1>Add to Your Book Shelf</h1>

	<a href="/dashboard">Back to Shelves</a>

	<div class="container">
		<form:form action="/books" method="post" modelAttribute="book" class="form">
		
			<div class="form-row">
			 	<form:errors path="title" class="error"/>
				<form:label for="title" path="title">Title:</form:label>
				<form:input type="text" path="title" class="form-control"/>
			</div>
			
			<div class="form-row">
				<form:errors path="author" class="error"/>
				<form:label for="author" path="author">Author:</form:label>
				<form:input type="text" path="author" class="form-control"/>
			</div>
			
			<div class="form-row">
				<form:errors path="thoughts" class="error"/>
				<form:label for="thoughts" path="thoughts">Thoughts:</form:label>
				<form:textarea path="thoughts" class="form-control"/>
			</div>
			
			<div class="form-row">
				<form:errors path="user" class="error"/>
				<form:input type="hidden" path="user" value="${user.id}" class="form-control"/>
			</div>
			
			<div class="form-row">
				<input type="submit" value="Submit" class="btn-primary"/>
			</div>
			
		</form:form>
	</div>

</div>
</body>
</html>