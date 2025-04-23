package com.add;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ServletAdd extends HttpServlet{
	
//	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		
//		int k = i+j;
//		System.out.println("Running Service");
//		
//		PrintWriter out = res.getWriter();
//		
//		out.println("The Result is: " + k);
//	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		System.out.println("running doget");
		
		PrintWriter out = res.getWriter();
		
		out.println("The Result is: " + k);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		System.out.println("running doPost");
		
		PrintWriter out = res.getWriter();
		
		out.println("The Result is: " + k);
	}
	
}
