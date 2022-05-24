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
<title>View Expenses</title>
</head>
<body>
	
	<nav>
		<h1>Expense Details</h1>
		<a href="/">Go Back</a>
	</nav>
	<div>
		
		<table>
			<tr>
				<th>Expense Name:</th>
				<td><c:out value = "${expense.expense}"/></td>
			</tr>
			<tr>
				<th>Vendor Name:</th>
				<td><c:out value = "${expense.vendor}"/></td>
			</tr>
			<tr>
				<th>Amount Spent:</th>
				<td><c:out value = "${expense.amount}"/></td>
			</tr>
			<tr>
				<th>Description:</th>
				<td><c:out value = "${expense.description}"/></td>
			</tr>
		</table>
	</div>
</body>
</html>