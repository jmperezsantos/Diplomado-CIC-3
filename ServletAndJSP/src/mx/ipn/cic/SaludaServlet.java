package mx.ipn.cic;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.ipn.cic.dao.PersonaDAO;
import mx.ipn.cic.model.Person;

/**
 * Servlet implementation class SaludaServlet
 */
@WebServlet("/SaludaServlet")
public class SaludaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private PersonaDAO personDAO;
	
	public SaludaServlet() {
		
		super();
		this.personDAO = new PersonaDAO();
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Person> all = this.personDAO.getAll();
		
		request.setAttribute("lista", all);
		
		// Se obtiene el nombre del parámetro de la url (get)
		String nombre = request.getParameter("name");
		
		// Se asigna la variable a un atributo de sesión
		request.setAttribute("nombre", nombre);
		
		// Se define el JSP a responder y se envía el flujo a ese elemento
		request.getRequestDispatcher("hello.jsp")
				.forward(request, response);

	}

}
