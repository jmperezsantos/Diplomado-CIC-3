<%@page import="mx.ipn.cic.mvcexample.model.PersonModel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	List<PersonModel> lista = (List<PersonModel>) request.getAttribute("lista");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de personas</title>
</head>
<body>

	<table>
		<thead>
			<tr>
				<th>Identificador</th>

				<th>Nombre</th>

				<th>Apellido</th>

				<th>Edad</th>
			</tr>
		</thead>
		<tbody>
			<%
				for (PersonModel person : lista) {
			%>
			<tr>
				<td><%=person.getId()%></td>
				<td><%=person.getName()%></td>
				<td><%=person.getLastname()%></td>
				<td><%=person.getAge()%></td>
			</tr>
			<%
				}
			%>
		</tbody>

	</table>

</body>
</html>









