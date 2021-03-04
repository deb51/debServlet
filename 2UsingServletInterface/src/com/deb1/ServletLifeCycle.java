package com.deb1;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletLifeCycle implements Servlet {

	static int a = m1();

	static int m1() {
		System.out.println("static m1 method");
		System.out.println("a: " + 0);
		return 111;
	}

	static {
		System.out.println("static blocks");
	}
	int b = m2();

	int m2() {
		System.out.println("non-static m2 method");
		System.out.println("b: " + 0);
		return 222;
	}

	{
		System.out.println("non-static blocks");
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("init method");

	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig method");
		return null;
	}

	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo method");
		return null;
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("service method");
	}

	@Override
	public void destroy() {
		System.out.println("destroy method");

	}

}
