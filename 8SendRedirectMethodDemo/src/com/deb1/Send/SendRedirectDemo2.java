package com.deb1.Send;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SendRedirectDemo2 extends HttpServlet  {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		out.println("<H1>THIS IS SERVLET-2 SERVICE");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		res.sendRedirect("https://www.google.com");
		out.println("<H1>THIS IS SERVLET-2 SERVICE after SendRedirect");
		
	}
}
