<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<c:choose>

	<c:when test="${person!=null}">
		<title>Persona: ${person.name }</title>
	</c:when>
	<c:otherwise>
		<title>Persona: NO ENCONTRADA</title>
	</c:otherwise>

</c:choose>

</head>
<body>

	<br>
	<br> CON JSTL (if)

	<c:if test="${person != null}">

		<h1>Se encontró a: ${person.name} ${person.lastname}</h1>
		<h3>Que tiene: ${person.age} años.</h3>

	</c:if>

	<c:if test="${person == null}">

		<h1>No se encontraron resultados</h1>

	</c:if>

	<br> CON JSTL (Choose)

	<c:choose>

		<c:when test="${person != null}">

			<h1>Se encontró a: ${person.name} ${person.lastname}</h1>
			<h3>Que tiene: ${person.age} años.</h3>

		</c:when>

		<c:otherwise>

			<h1>No se encontraron resultados</h1>

		</c:otherwise>

	</c:choose>
</body>
</html>





