package com.deb;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet extends GenericServlet {
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<body bgcolor='pink'>");
		String user = request.getParameter("uname");
		out.println("Welcome mr: " + user + "<br/>");
		request.getRequestDispatcher("./User.html").include(request, response);
		out.println("</body>");
	}
}
