package com.deb1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TestServlet extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("servlet1 servicece method");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		ServletContext sc = req.getServletContext();
		String name = (String) sc.getAttribute("name");
		System.out.println("name: " + name);
		out.println("<H1>THIS IS SERVLET-1 RESPONSE");
	}
}
