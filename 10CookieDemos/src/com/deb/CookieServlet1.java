package com.deb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieServlet1 extends HttpServlet{
		@Override
		public void doGet(HttpServletRequest req, 
				HttpServletResponse res)
				throws ServletException, IOException {
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			String name = req.getParameter("name");
			out.println("In servlet1: "+name);
			Cookie c = new Cookie("name", name);
			res.addCookie(c);
			out.println("<form action='./s2' method='get'>");
			out.println("<input type='submit' value='click' >");
			out.println("</form>");
			
			
		}

}
