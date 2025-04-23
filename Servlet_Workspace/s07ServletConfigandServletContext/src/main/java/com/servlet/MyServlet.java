package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MyServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter writer = res.getWriter();
		System.out.println("Servlet Called");
		
		ServletContext context = getServletContext();
		ServletConfig config = getServletConfig();
		
		String name = context.getInitParameter("Name");
		String phoneNumber = context.getInitParameter("Phone Number");
		String college = config.getInitParameter("College");
		
		writer.println("Hello Mr." +name+" your Phone Number is " + phoneNumber + " and the name of your college is "+college+".");
	}
}
