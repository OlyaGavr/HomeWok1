package com.OlgaGavryliuk;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Task1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public String login = "Login";
	public String password = "Password";

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String welcomming = "Welcome!";

		String login1 = request.getParameter("login");
		String password1 = request.getParameter("password");

		if (login1.equals(login) && password1.equals(password)) {
		} 
		else {
			welcomming = "Wrong login or password, please try again";
		}
		response.getWriter().println(welcomming);
	}

}
