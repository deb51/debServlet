package com.deb2.Send;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse
			response)
	throws ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<body bgcolor='cyan'>");
		String num = request.getParameter("num");
		int no = Integer.parseInt(num);
		int square = no*no;
		out.println("<h2>Square Of The Given Number Is: "+square+"</h2><br/>");
		ServletContext sct1 = getServletContext();
		ServletContext sct2 = sct1.getContext("/8SendRedirectMethodDemo");
		RequestDispatcher rd = sct2.getRequestDispatcher("/cs");
		rd.include(request, response);
		out.println("</body>");
	}
}
