<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
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
					<td><c:out value="${item.id}"></c:out></td>
					<td><c:out value="${item.name}"></c:out></td>
					<td><c:out value="${item.lastname}"></c:out></td>
					<td><c:out value="${item.age}"></c:out></td>
				</tr>
			</c:forEach>
		</tbody>

	</table>

</body>
</html>









