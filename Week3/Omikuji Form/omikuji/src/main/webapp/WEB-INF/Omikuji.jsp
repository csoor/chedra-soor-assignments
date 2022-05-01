<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Omikuji</title>
</head>
<body>
	<h1>Omikuji Here!</h1>
	<h3><c:out value="${result}"/></h3>
	<a href="/omikuji">Return to Omikuji</a>
</body>
</html>