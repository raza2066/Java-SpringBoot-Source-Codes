package com.login;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class ServletLogin extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		System.out.println("ServletLogin Service Called");
		
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		
		if(uname.equals("raza") && pass.equals("raza")){
			RequestDispatcher rd = req.getRequestDispatcher("twoStepVerification.html");
			rd.forward(req, res);
		}
		else {
			RequestDispatcher rd = req.getRequestDispatcher("failure.html");
			rd.forward(req, res);
		}
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("ServletLogin Post Called");
		
		String pnum = req.getParameter("pnum");
		HttpSession session = req.getSession();
		session.setAttribute("pnum", pnum);
		
		res.sendRedirect("twostepverification");
	}
}
