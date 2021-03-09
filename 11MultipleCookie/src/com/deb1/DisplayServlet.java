package com.deb1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class DisplayServlet extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest request,
			HttpServletResponse response )
	throws IOException,ServletException{
		Cookie[]  c = request.getCookies();
		System.out.println(c.length);
		String username=null;
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<body bgcolor='red'>");
		for(Cookie c1: c){
			System.out.println(c1.getValue());
			pw.println("<h2>In DisplayServlet Cookie is: "+c1.getName()+"</h2>");
			pw.println("<h2>In DisplayServlet user is: "+c1.getValue()+"</h2>");
		}
		pw.println("</body>");
	}
	@Override
	public void doGet(HttpServletRequest request,
			HttpServletResponse response )
	throws IOException,ServletException{
		doPost(request,response);
	}
}
