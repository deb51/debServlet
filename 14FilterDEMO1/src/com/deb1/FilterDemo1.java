package com.deb1;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterDemo1 implements Filter {

	
	@Override
	public void init(FilterConfig fc) {
		
		System.out.println("this is init method of Filter demo1");
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("this is doFilter() method of Filter demo1");
		
	}
	
	@Override
	public void destroy() {
		System.out.println("this is destroy method of Filter demo1");
	}

}
