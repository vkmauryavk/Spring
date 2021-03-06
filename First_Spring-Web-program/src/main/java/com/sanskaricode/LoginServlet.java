package com.sanskaricode;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	private LoginService service = new LoginService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setAttribute("name", request.getParameter("name"));
		request.setAttribute("password", request.getParameter("password"));

		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String password = request.getParameter("password");

		boolean isUserValid = service.isUserValid(name, password);
		if (isUserValid) {
			request.setAttribute("name", name);
			request.setAttribute("password", password);

			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		} else {
			request.setAttribute("errormsg", "Invalid username");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

		}
	}

}
