<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de personas</title>
</head>
<body>

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
			<c:forEach items="${people}" var="item">
				<tr>
					<td><c:out value="${item.id}"></c:out> ${item.id}</td>
					<td>${item.name}</td>
					<td>${item.lastname}</td>
					<td>${item.age}</td>
				</tr>
			</c:forEach>
		</tbody>

	</table>

</body>
</html>









