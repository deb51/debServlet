package com.deb1;

import javax.servlet.*;
public class ServletContextEventHandler implements
ServletContextListener{
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("contextDestroyed method");
		ServletContext sct = sce.getServletContext();
		sct.removeAttribute("faculty");
	}
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("contextInitializedmethodm starts");
		ServletContext sct = sce.getServletContext();
		sct.setAttribute("faculty", "ramchandra");
		System.out.println("contextInitializedmethodm ends");
	}
}

