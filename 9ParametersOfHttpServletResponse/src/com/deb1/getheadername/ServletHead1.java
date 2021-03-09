package com.deb1.getheadername;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletHead1 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, 
			HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("servlet1 service method");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<H1>THIS IS SERVLET-1 SERVICE</H1><br/>");
		Enumeration e= req.getParameterNames();
		while(e.hasMoreElements()){
			String tfn = (String) e.nextElement();
			String tfv = req.getParameter(tfn);
			out.println(tfn+"...."+tfv);
			out.println("$$$$$$$$$$$$$$$");
		}
		Enumeration<String> e1 = req.getHeaderNames();
		while(e1.hasMoreElements()){
			String headerName = e1.nextElement();
			String headerValue = req.getHeader(headerName);
			out.println(headerName+":::"+headerValue);
			System.out.println(headerName+"::"+headerValue);
			out.println("=================");
		}
		out.println("<H1>THIS IS SERVLET-1 RESPONSE");
	}}

