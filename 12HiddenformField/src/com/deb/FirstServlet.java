package com.deb;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class FirstServlet extends GenericServlet{
	@Override
	public void service(ServletRequest request,ServletResponse response)
	throws ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<body bgcolor='pink'>");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		if(password.equals("deba")){
			out.println("you are successfully loged in<br/>");
			out.println("Mr. "+name);
			out.println("<form action='./ss'>");
			out.println("<input type='hidden' name='uname' value='"+name+"'/>");
			out.println("<input type='submit' value='submit'/>");
			out.println("</form>");
		}
		else{
			out.println("sorry your password incorrect....");
request.getRequestDispatcher("./user.html").include(request, response);
		}
		out.println("</body>");
	}
}

