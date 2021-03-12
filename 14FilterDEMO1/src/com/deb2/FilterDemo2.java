package com.deb2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterDemo2 implements Filter {

	@Override
	public void init(FilterConfig fc) {

		System.out.println("this is init method of Filter demo2");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("this is doFilter method of Filter demo2");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<body bgcolor='pink'><h2>");
		out.println("doFiler Method of MyFilter class");
		out.println("</h2></body>");

	}

	@Override
	public void destroy() {
		System.out.println("this is destroy method of Filter demo2");
	}

}
