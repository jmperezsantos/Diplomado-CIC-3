package mx.ipn.cic.invoked;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InvokedServlet
 */
@WebServlet("/InvokedServlet")
public class InvokedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InvokedServlet() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String valor1 = request.getParameter("value1");
		String valor2 = request.getParameter("value2");
		String valor3 = request.getParameter("value3");

//		response.getWriter().append("Get: ")
//		.append(String.format("%s %s %s", valor1, valor2, valor3));
		
		request.setAttribute("value1", valor1);
		request.setAttribute("value2", valor2);
		request.setAttribute("value3", valor3);

		request.getRequestDispatcher("response.jsp")
		.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String valor1 = request.getParameter("value1");
		String valor2 = request.getParameter("value2");
		String valor3 = request.getParameter("value3");

		response.getWriter().append("Post: ")
		.append(String.format("%s %s %s", valor1, valor2, valor3));

	}

}
