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
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${expenses}" var = "expense" >
				<tr>
					<td><c:out value="${expenses.getExpense()}"></c:out></td>
					<td><c:out value="${expenses.getVendor()}"></c:out></td>
					<td><c:out value="${expenses.getAmount()}"></c:out></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
	<h2>Add your expenses</h2>
	<!-- Form -->
	<form:form action="/travels" method = "post" modelAttribute = "expenses">
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