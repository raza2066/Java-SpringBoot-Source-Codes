package com.login;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class ServletTwoStepVerificaton extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		System.out.println("ServletTwoStepVerificaton called");
		
		HttpSession session = req.getSession();
		
		String pnum = (String) session.getAttribute("pnum");
		
		if(pnum.equals("8765685799")) {
			RequestDispatcher rd = req.getRequestDispatcher("success.html");
			rd.forward(req, res);
		}
		else {
			RequestDispatcher rd = req.getRequestDispatcher("twoStepVerification.html");
			rd.forward(req, res);
		}
	}
}
