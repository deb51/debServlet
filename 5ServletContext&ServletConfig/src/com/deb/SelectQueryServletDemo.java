package com.deb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import oracle.jdbc.driver.OracleDriver;

public class SelectQueryServletDemo extends GenericServlet {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	@Override

	public void init(ServletConfig scf) {
		String driver = scf.getInitParameter("driver");
		String url = scf.getInitParameter("url");
		String user = scf.getInitParameter("user");
		String pass = scf.getInitParameter("pass");

		System.out.println(driver);
		System.out.println(url+" "+user+" "+pass);
		try {
			Driver drive= new OracleDriver();
			DriverManager.registerDriver(drive);
			//Class.forName(driver);
			conn = DriverManager.getConnection(url,user,pass);
		} catch (SQLException  e) {

			System.out.println("connection not established");
			e.printStackTrace();
		}

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		try {
			ps = conn.prepareStatement("select * from empram");

			rs = ps.executeQuery();
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

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
