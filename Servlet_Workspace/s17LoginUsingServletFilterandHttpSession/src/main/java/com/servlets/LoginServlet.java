package com.servlets;

import java.io.IOException;
import java.sql.SQLException;

import com.Dao.LoginDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		
		try {
			if(LoginDao.check(uname, pass)) {
				
				HttpSession session = req.getSession();
				session.setAttribute("uname", uname);
				resp.sendRedirect("welcome.jsp");
			}
			else{
				resp.sendRedirect("login.jsp");
			}
		} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
