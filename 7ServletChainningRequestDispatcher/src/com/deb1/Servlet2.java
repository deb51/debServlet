package com.deb1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet2 extends GenericServlet{

	@Override
	public void service(ServletRequest request, ServletResponse response)
	throws IOException,ServletException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<body bgcolor='Green'>");
		out.println("<h1>THIS IS SERVLET-2 RESPONSE</H1>");
		out.println("<h1>S2-Request:"+request.hashCode()+"</h1>");
		out.println("<h1>S2-Response:"+response.hashCode()+"</h1>");
		out.println("<body>");
		
	}
	

}
