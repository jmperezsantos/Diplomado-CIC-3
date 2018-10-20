<%@page import="mx.ipn.cic.model.Person"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	//Tag de apertura de código Java

	String theName = (String) request.getAttribute("nombre");

	List<Person> list = (List<Person>) request.getAttribute("lista");
	
%>
<!-- Tag de cierre de código Java  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hola Mundo desde JSP</title>
</head>
<body>

	Hola:
	<%=theName%>

	<ul>
		<%
			for (Person person : list) {
		%>
		<li><%=person.getName()%></li>
		<%
			}
		%>

	</ul>

	<ol>
		<%
			for (Person person : list) {

				out.write("<li>" + person.getName() + "</li>");

			}
		%>

	</ol>

</body>
</html>