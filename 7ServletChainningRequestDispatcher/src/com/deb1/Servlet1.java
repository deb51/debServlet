package com.deb1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet1 extends GenericServlet{
	@Override
	public void service(ServletRequest request, ServletResponse response) 
			throws IOException,ServletException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<body bgcolor='yellow'>");
		out.println("<h1>THIS IS SERVLET-1 RESPONSE</H1>");
		out.println("<h1>S1-Request:"+request.hashCode()+"</h1>");
		out.println("<h1>S1-Response:"+response.hashCode()+"</h1>");
		out.println("<body>");
		RequestDispatcher rd = request.getRequestDispatcher("./s2");
		//rd.forward(request, response);
		rd.include(request, response);
	}

}
