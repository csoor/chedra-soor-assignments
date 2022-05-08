<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji</title>
</head>
<body>
	<h1>Send an Omikuji</h1>
	<form action="/message" method="post">
		<div>
			<label for="">Pick any number from 5 to 25</label><br />
			<input type="number" name="number"/>
		</div>
		<div>
			<label for="">Enter the name of any city</label><br />
			<input type="text" name="city"/>
		</div>
		<div>
			<label for="">Enter professional hobby</label><br />
			<input type="text" name="hobby"/>
		</div>
		<div>
			<label for="">Enter any type of cat</label><br />
			<input type="text" name="cat"/>
		</div>
		
		<p>Send and Show a friend</p>
		<input type="submit" value="Send"/>
	</form>
</body>
</html>