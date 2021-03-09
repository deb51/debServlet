package com.loginlogout;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		RequestDispatcher rd = request.getRequestDispatcher("./link.html");
		rd.include(request, response);

		String name = request.getParameter("name");
		String password = request.getParameter("password");

		if (password.equals("naaz")) {
			out.print("<br/>You are successfully logged in!<br/>");
			out.print("<br/>Welcome, " + name);

			Cookie ck = new Cookie("name", name);
			response.addCookie(ck);
		} else {
			out.print("<br/>sorry, username or password error!");
			request.getRequestDispatcher("Login.html").include(request, response);
		}

		out.close();
	}
}
