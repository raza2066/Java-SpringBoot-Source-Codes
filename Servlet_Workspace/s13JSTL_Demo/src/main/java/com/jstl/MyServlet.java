package com.jstl;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/display")
public class MyServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Student> students = Arrays.asList(new Student(1, "Raza"), new Student(2, "Hasan"), new Student(3, "Siddiqui"));
		
		
		req.setAttribute("students", students);
		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
		rd.forward(req, resp);
	}
}
