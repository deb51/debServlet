package com.deb1;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class TestServlet extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest request,
			HttpServletResponse response )
	throws IOException,ServletException{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Cookie c1 = new Cookie("user",username);
		Cookie c2 = new Cookie("password",password);
		response.addCookie(c1);
		response.addCookie(c2);
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<body bgcolor='orangered'>");
		pw.println("<h2>In TestServlet user is: "+username+"<br/>");
		pw.println("In TestServlet password is: "+password+"</h2>");
		pw.println("<form action='./ds'>");
		
		pw.println("<input type='submit' value='clickme'/>");
		pw.println("</form>");
		pw.println("</body>");
	}
	@Override
	public void doGet(HttpServletRequest request,
			HttpServletResponse response )
	throws IOException,ServletException{
		doPost(request,response);
	}
}
