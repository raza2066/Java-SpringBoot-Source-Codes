package com.square;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ServletSquare extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter out = res.getWriter();
		out.println("ServletSquare called with Send Redirect Cookies");
		
		int k = 0;
		
		Cookie cookies[] = req.getCookies();
		
		for(Cookie cookie:cookies) {
			if(cookie.getName().equals("k")) {
				k = Integer.parseInt(cookie.getValue());
			}
		}
		
		k = k*k;
		
		out.println("The Result is: " + k);
	}
}
