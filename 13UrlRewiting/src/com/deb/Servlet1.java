package com.deb;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, 
			HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String username = req.getParameter("name");
		out.println("In servlet1: "+username);
	
		out.println("<a href='./s2?name="+username+"'>visit</a>");
		
	}
}
