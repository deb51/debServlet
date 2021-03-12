package com.deb1;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class ServletContextHandler implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("servletcontext is destroyed");
		ServletContext sc = arg0.getServletContext();
		sc.removeAttribute("name");
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("servletcontext is created");
		ServletContext sc = arg0.getServletContext();
		sc.setAttribute("name", "ram");
		
		
	}

}
