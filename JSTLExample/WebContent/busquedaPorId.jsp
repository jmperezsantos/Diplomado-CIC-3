<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="mx.ipn.cic.mvcexample.model.PersonModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	PersonModel persona = (PersonModel) request.getAttribute("person");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%
	if (persona != null) {
%>
<title>Persona: <%=persona.getName()%></title>
<%
	} else {
%>
<title>Persona: NO ENCONTRADA</title>
<%
	}
%>
</head>
<body>

	SIN JSTL
	<%
	if (persona != null) {
%>
	<h1>
		Se encontró a:
		<%=persona.getName()%>
		<%=persona.getLastname()%></h1>

	<h3>
		Que tiene:
		<%=persona.getAge()%>
		años.
	</h3>

	<%
		} else {
	%>
	<h1>No se encontraron resultados</h1>
	<%
		}
	%>

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





