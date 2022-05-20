<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Omikuji</title>
</head>
<body>
	<h1>Omikuji</h1>
	<h2><c:out value = "${result}"/></h2>
	<a href="/omikuji">Return to Omikuji</a>
</body>
</html>