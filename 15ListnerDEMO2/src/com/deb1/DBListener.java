package com.deb1;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DBListener implements ServletContextListener {
	Connection con= null;
	@Override
	public void contextInitialized(ServletContextEvent event) {
		System.out.println("initalized executing");
		try {
			ServletContext sc = event.getServletContext();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl","scott",
					"tiger");
			System.out.println(con);
			sc.setAttribute("connection", con);
		} catch (Exception e) {
			System.out.println("=================");
			e.printStackTrace();
		}
	}
		@Override
		public void contextDestroyed(ServletContextEvent event) {
			System.out.println("destroyed method executing");
			try {
				if(con!=null) {
					con.close();
				}
			}catch(Exception e) {
				System.out.println("****************");
			}
		}
}
