<%@page import="mx.ipn.cic.mvcexample.model.PersonModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	PersonModel persona = (PersonModel) request.getAttribute("persona");
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

	<%
		if (persona != null) {
	%>
	<h1>
		Se encontró a:
		<%=persona.getName()%>
		<%=persona.getLastname()%></h1>

	Que tiene:
	<%=persona.getAge()%>
	años.

	<%
			} else {
		%>
	<h1>No se encontraron resultados</h1>
	<%
		}
	%>

</body>
</html>





