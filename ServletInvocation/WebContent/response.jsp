<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String value1 = (String) request.getAttribute("value1");
	String value2 = (String) request.getAttribute("value2");
	String value3 = (String) request.getAttribute("value3");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Response</title>
</head>
<body>


	<table>

		<thead>
			<tr>
				<th>Atributo</th>
				<th>Valor</th>
			</tr>
		</thead>

		<tbody>
			<tr>
				<td>Valor 1</td>
				<td><%=value1%></td>
			</tr>
			<tr>
				<td>Valor 2</td>
				<td><%=value2%></td>
			</tr>
			<tr>
				<td>Valor 3</td>
				<td><%=value3%></td>
			</tr>
		</tbody>



	</table>


</body>
</html>