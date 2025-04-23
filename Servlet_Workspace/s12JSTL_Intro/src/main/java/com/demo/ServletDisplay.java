package com.demo;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/display")
public class ServletDisplay extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = "Raza";
		
		req.setAttribute("name", name);
		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
		rd.forward(req, resp);
	}
}
