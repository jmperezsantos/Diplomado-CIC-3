package mx.ipn.cic;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyFirstServlet
 */
@WebServlet("/MyFirstServlet")
public class MyFirstServlet extends HttpServlet {

	private static final long serialVersionUID = -2502372454077521568L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");

		response.getWriter()
		.append("<!DOCTYPE html>")
		.append("<html>")
		.append("<head>")
		.append("    <meta charset=\"utf-8\" />")
		.append("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">")
		.append("    <title>Hola desde Servlet</title>")
		.append("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">")
		.append("</head>")
		.append("<body>")
		.append("Bienvenido: ").append(name)
		.append("</body>")
		.append("</html>");

		// response.getWriter().append("GET Served at:
		// ").append(request.getContextPath());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String apellidos = request.getParameter("lastname");

		response.getWriter().append("Los apellidos son: " + apellidos);

	}

	@Override
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("PUT Served at: ").append(request.getContextPath());
	}

}
