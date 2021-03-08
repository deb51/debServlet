package com.deb1;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletChainningWithContext1 extends GenericServlet {
	static{
		System.out.println("static block-servlet1");
	}
	ServletContext sc1;
	ServletConfig sc2;
	@Override
	public void init(ServletConfig sc)throws ServletException{
		System.out.println("init method-servlet1");
		System.out.println("sc: "+sc);
		sc1 = sc.getServletContext();
		sc2=sc;
	}
	@Override
	public void service(ServletRequest request, ServletResponse response){
		System.out.println("service method-servlet1");
		System.out.println("this: "+this.hashCode());
		System.out.println("thread: "+Thread.currentThread().getName());
		System.out.println("request: "+request.hashCode());
		System.out.println("response: "+response.hashCode());
		System.out.println("scontext: "+sc1);
		System.out.println("sconfig: "+sc2);
		
		System.out.println("==================");
		ServletChainningWithContext2 obj = new ServletChainningWithContext2();
		obj.service(request, response);
	}
	

}
