package com.square;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class ServletSquare extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter out = res.getWriter();
		out.println("ServletSquare called with Send Redirect HttpSession");
		
		HttpSession session = req.getSession();
		int k = (int)session.getAttribute("k");
		k = k*k;
		
		out.println("The Result is: " + k);
	}
}
