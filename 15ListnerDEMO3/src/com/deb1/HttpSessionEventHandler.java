package com.deb1;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.catalina.SessionEvent;

public class HttpSessionEventHandler implements HttpSessionListener{

	

	@Override
	public void sessionCreated(HttpSessionEvent hse) {
		System.out.println("sessioncreated starts");
		HttpSession hs = hse.getSession();
		hs.setAttribute("fsal", "7000");
		System.out.println("sessioncreated ends");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent hse) {
		System.out.println("sessiondestroyed");
		HttpSession hs = hse.getSession();
		hs.removeAttribute("fsal");
	}
	
}

