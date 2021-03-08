package com.deb;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletChainningDemo2 extends GenericServlet {

	@Override
	public void init(ServletConfig scf) {
		System.out.println("this is init method of Demo2");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("this is demo2 service");
		
	}
}
