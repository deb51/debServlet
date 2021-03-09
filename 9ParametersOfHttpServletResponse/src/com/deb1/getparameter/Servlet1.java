package com.deb1.getparameter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		System.out.println("servlet1 service method");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<H1>THIS IS SERVLET-1 SERVICE</H1><br/>");
		String name = req.getParameter("name");
		out.println("Name: "+name);
		String[] s = req.getParameterValues("course");
		for(String s1: s){
			out.println(s1+"<br/>");
		}
		out.println("<H1>THIS IS SERVLET-1 RESPONSE");

		
		
	}
}
