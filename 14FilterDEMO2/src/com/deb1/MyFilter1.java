package com.deb1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter1 implements Filter {

	@Override
	public void destroy() {
		System.out.println("Filter1 destroy()");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Filter doFilter()");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("file executing in filter 1 before servlet<br/>");
		chain.doFilter(req, res);
		out.println("file executing in filter 1 after servlet<br/>");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("Filter1 init()");

	}

}