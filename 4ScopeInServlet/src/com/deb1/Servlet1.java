package com.deb1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet1 extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws  IOException, ServletException {

		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		//request scope
		req.setAttribute("name","Hari");
		
		//session scope
		HttpSession session=req.getSession(true);
		session.setAttribute("name","Hari");
		
		//context scope
		req.getServletContext().setAttribute("name", "Hari");
		
		RequestDispatcher rd=req.getRequestDispatcher("/ss");
		//rd.forward(req, res);
		rd.include(req, res);
		
	}

}
