package com.deb1;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class ReadListenerServlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request,
			HttpServletResponse response)throws ServletException,
	IOException{
		System.out.println("doGet method");
		ServletContext sct = getServletContext();
		String facultyname = (String)sct.getAttribute("faculty");
		
		System.out.println("facultyname: "+facultyname);
		String fage = (String)request.getAttribute("fage");
		System.out.println("fage: "+fage);
		HttpSession hs = request.getSession();
		String fsal = (String)hs.getAttribute("fsal");
		System.out.println("fsal: "+fsal);
		hs.invalidate();
	}
}

