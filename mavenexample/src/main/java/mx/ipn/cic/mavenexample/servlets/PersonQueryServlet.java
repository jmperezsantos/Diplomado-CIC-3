package mx.ipn.cic.mavenexample.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.ipn.cic.mavenexample.model.PersonModel;
import mx.ipn.cic.mavenexample.services.PersonService;

/**
 * Servlet implementation class PersonQueryServlet
 */
public class PersonQueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private PersonService personService;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PersonQueryServlet() {
		super();

		this.personService = new PersonService();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Consumir el servicio y contestar un jsp que muestre
		// Una tabla con todos los usuarios

		List<PersonModel> findAll = this.personService.findAll();

		request.setAttribute("people", findAll);

		request.getRequestDispatcher("allPeople.jsp").forward(request, response);

	}

}
