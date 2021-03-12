package com.deb1;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
public class ServletRequestEventHandler implements
ServletRequestListener{
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("RequesttDestroyed method-requst");
		ServletRequest sr = sre.getServletRequest();
		sr.removeAttribute("fage");
	}
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("RequestInitializedmethodm starts-request");
		ServletRequest sr = sre.getServletRequest();
				
		sr.setAttribute("fage", "30");
		System.out.println("RequestInitializedmethodm ends-request");
	}
}

