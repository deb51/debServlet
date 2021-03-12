package com.deb1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class UpdateServlet extends GenericServlet {
	@Override
	public void service(ServletRequest request,
			ServletResponse response)throws ServletException,
	IOException{
		System.out.println("servlet service method");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<body bgcolor='yellow'>");
		
		
		try {
			ServletContext sc = request.getServletContext();
			Connection con = (Connection) sc.getAttribute("connection");
			Statement st = con.createStatement();
			int count = st.executeUpdate(
	"update empram set ename='vani' where eno=101");
			out.println(count+".record updated");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		out.println("</body>");
	}
}
