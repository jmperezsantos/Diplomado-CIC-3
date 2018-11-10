<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

	Sin JSTL
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

	Con JSTL
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
			<c:forEach items="${lista}" var="item">
				<tr>
					<td>${item.id}</td>
					<td>${item.name}</td>
					<td>${item.lastname}</td>
					<td>${item.age}</td>
				</tr>
			</c:forEach>
		</tbody>

	</table>

</body>
</html>









