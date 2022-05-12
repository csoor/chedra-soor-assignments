<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class = "container">
		<h1>Fruit Store</h1>
		<table  class = "table">
		<tbody>
			<tr>
				<th>Name</th>
				<th>Price</th>
			</tr>
			<!--Since var ="fruit".  It should be fruit.getName(), fruit.getPrice().  You're using "fruits".  -->
			<c:forEach items = "${fruits}" var = "fruit"> 
			<tr>
				<td><c:out value = "${fruit.getName()}"/></td>
				<td><c:out value = "${fruit.getPrice()}"/></td>
			</tr>
			</c:forEach>
		</tbody>
		</table>
	</div>


</body>
</html>