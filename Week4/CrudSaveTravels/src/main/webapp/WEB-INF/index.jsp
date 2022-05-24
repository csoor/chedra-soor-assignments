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
<title>Full CRUD Save Travels</title>
</head>
<body>
	<h1>Save Travels</h1>
	<!-- Table -->
	<table>
		<thead>
			<tr>
				<th>Expense</th>
				<th>Vendor</th>
				<th>Amount</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${expense}" var = "e" >
				<tr>
					<td>
						<a href="/expenses/show/${e.id}"><c:out value="${e.expense}"></c:out></a>
					</td>
					<td><c:out value="${e.vendor}"></c:out></td>
					<td>$ <c:out value="${e.amount}"></c:out></td>
					<td>
						<a href="/expenses/edit/${e.id}">edit</a>
						<form:form action="/expenses/delete/${e.id}"  method="post">
    						<button type="submit">Delete</button>
						</form:form>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
	<h2>Add your expenses</h2>
	<!-- Form -->
	<form:form action="/travels" method ="post" modelAttribute ="expenses">
		<div>
			<form:label path="expense">Expense</form:label>
			<form:errors path="expense"/>
			<form:input path="expense"/>
		</div>
		<div>
			<form:label path="vendor">Vendor</form:label>
			<form:errors path="vendor"/>
			<form:input path="vendor"/>
		</div>
		<div>
			<form:label path="amount">Amount</form:label>
			<form:errors path="amount"/>
			<form:input type="number" path="amount"/>
		</div>
		<div>
			<form:label path="description">Description</form:label>
			<form:errors path="description"/>
			<form:textarea path="description"/>
		</div>
		<div>
			<input type="submit" value="Submit"/>
		</div>
	</form:form>
</body>
</html>