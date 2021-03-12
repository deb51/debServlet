package com.deb3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterConfigDemo1 implements Filter {

	FilterConfig fc=null;
	@Override
	public void init(FilterConfig fc) {
		System.out.println("init method of FilterConfig ");
		
		System.out.println("fc: "+fc);
		this.fc = fc;
		System.out.println("fc: "+this.fc);
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws ServletException, IOException {
		
		System.out.println("doFilter of Filter config class");

		int i=Integer.parseInt(fc.getInitParameter("fno"));
		int j=Integer.parseInt(fc.getInitParameter("sno"));
		
		PrintWriter out=res.getWriter();
		
		res.setContentType("text/html");
		
		out.println("<body bgcolor='yellow'>The Result is: "
				+(i+j)+"</body>");

	}
	
	@Override
	public void destroy() {
		System.out.println("destroy of FilterConfig ");
	}
}
