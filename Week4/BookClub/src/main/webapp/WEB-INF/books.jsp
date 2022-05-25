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
<title>Books Dashboard</title>
</head>
<body>
	<div class="container"> 
		
			<div class="container">
		<h1>Welcome, <c:out value="${user.name}"/></h1>
		
		<h3>Books from everyone shelves:</h3>
		<a href="/logout">logout</a>
		<a href="/add">Add to my shelf</a>
		
		<div class="container">
		<c:forEach var="book" items="${books}">
			<h3><span style="color: red;"><c:out value="${book.user.name}"/></span> read 
			<span style="color: rebeccapurple;"><c:out value="${book.title}"/></span> by 
			<span style="color: darkgreen;"><c:out value="${book.author}"/></span></h3>
		</div>
		
		<div class="container">
			<h4>Here are their thoughts:</h4>
			<hr />
			
			<p><c:out value="${book.thoughts}"/></p>
			<hr />
		
		</div>
		
		<button>
		<a href="/books/edit/${book.id}">edit</a>
		</button>
		</c:forEach>
	</div>
	</div>
</body>
</html>