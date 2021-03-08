package com.deb2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletContextDemo extends GenericServlet {
	public ServletContext sct;
	Connection conn=null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	@Override
	public void init(ServletConfig scf1) {
		sct=scf1.getServletContext();
	}
	
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String driver = sct.getInitParameter("driver");
		String url = sct.getInitParameter("url");
		String user = sct.getInitParameter("user");
		String pass = sct.getInitParameter("pass");
		System.out.println(driver);
		System.out.println(url+" "+user+" "+pass);
		
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,pass);
			
			ps = conn.prepareStatement("select * from empram");

			rs = ps.executeQuery();
			res.setContentType("text/html");
			PrintWriter pw = res.getWriter();
			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt(3));
				System.out.println(rs.getString(4));
				System.out.println("------------------");

				pw.println(rs.getInt(1));
				pw.println(rs.getString(2));
				pw.println(rs.getInt(3));
				pw.println(rs.getString(4));
				pw.println("------------------");

			}
			conn.close();
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("connection not established");
			e.printStackTrace();
		}
		
	}

}
