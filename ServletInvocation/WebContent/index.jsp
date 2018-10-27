<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Bienvenidos</h1>

	<form action="InvokedServlet" method="get">
		
		<input name="value1" placeholder="Valor 1"> 
		<input name="value2" placeholder="Valor 2">
		<input name="value3" placeholder="Valor 3"> 
		
		<input type="submit" value="Get">
	</form>
	
	<br>
	<br>
	
	<form action="InvokedServlet" method="post">
		
		<input name="value1" placeholder="Valor 1"> 
		<input name="value2" placeholder="Valor 2">
		<input name="value3" placeholder="Valor 3">
				
		<input type="submit" value="Post">
	</form>

</body>
</html>