package com.deb2.servletconfig;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DisConfigDemo extends GenericServlet {

	public int scf;
	@Override
	public void init(ServletConfig sc) {
		scf=Integer.parseInt(sc.getInitParameter("count"));
	
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {


		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		
		pw.print("The First servlet withe servletconfig count value is: "+scf);
		
		
	}
	@Override
	public void destroy() {
		
	}
}
