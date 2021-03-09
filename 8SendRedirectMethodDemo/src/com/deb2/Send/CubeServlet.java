package com.deb2.Send;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CubeServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse
			response)
	throws ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String num = request.getParameter("num");
		int no = Integer.parseInt(num);
		int cube = no*no*no;
		out.println("<h2>Cube Of The Given Number Is: "+cube+"</h2><br/>");
	}
}

