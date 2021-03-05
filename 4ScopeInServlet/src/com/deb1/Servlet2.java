package com.deb1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet2 extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		// request scope
		String name1=(String) req.getAttribute("name");

		// session scope
		HttpSession session = req.getSession(true);
		String name2=(String)session.getAttribute("name");

		// context scope
		String name3=(String)req.getServletContext().getAttribute("name");
		
	        
	        out.println("<html>");
			out.println("<body>");
			out.println("applicationScope/ context scope: " + name3);
			out.println("sessionScope: " + name2);
			out.println("requestScope: " + name1);
			out.println("</body>");
			out.println("</html>");


	}
}
