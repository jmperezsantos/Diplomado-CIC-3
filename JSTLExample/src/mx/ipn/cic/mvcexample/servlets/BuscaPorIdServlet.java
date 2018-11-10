package mx.ipn.cic.mvcexample.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.ipn.cic.mvcexample.model.PersonModel;
import mx.ipn.cic.mvcexample.services.PersonService;

/**
 * Servlet implementation class BuscaPorIdServlet
 */
@WebServlet("/BuscaPorIdServlet")
public class BuscaPorIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private PersonService personService;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BuscaPorIdServlet() {
		super();

		this.personService = new PersonService();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("identificador"));

		PersonModel person = this.personService.findById(id);

		request.setAttribute("person", person);

		request.getRequestDispatcher("busquedaPorId.jsp").forward(request, response);

	}

}
