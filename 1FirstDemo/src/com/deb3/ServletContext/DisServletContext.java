package com.deb3.ServletContext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DisServletContext extends GenericServlet {
	public ServletContext sct;
	public void init(ServletConfig sc) throws ServletException {
		sct=sc.getServletContext();
		this.init();
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		
		pw.print(sct.getInitParameter("number"));
		
	}

}
