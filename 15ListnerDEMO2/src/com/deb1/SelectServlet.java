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

public class SelectServlet extends GenericServlet {
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
			System.out.println(con);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from empram");
			while(rs.next()) {
				out.println(rs.getInt(1)+"-----"+rs.getString(2)+"----"+
			rs.getInt(3)+"----"+rs.getString(4)+"<br/>");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		out.println("</body>");
	}
}
