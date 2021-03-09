package com.deb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieServlet2 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, 
			HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		Cookie[] c = req.getCookies();
		out.println("in servlet 2: "+c[0].getValue());
		
	}
}
