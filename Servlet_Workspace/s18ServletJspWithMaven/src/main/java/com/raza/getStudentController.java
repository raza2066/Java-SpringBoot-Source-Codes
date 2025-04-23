package com.raza;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Servlet implementation class getStudentController
 */
@SuppressWarnings("serial")
@WebServlet("/getStudent")
public class getStudentController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int student_id = Integer.parseInt(request.getParameter("id"));
		System.out.println("Controller Called with id: " +student_id);
		
		Dao dao = new Dao();
		Students student = new Students();
		try {
			student = dao.getStudent(student_id);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		request.setAttribute("student", student);
		System.out.println(student);
		
		RequestDispatcher rd = request.getRequestDispatcher("showStudent.jsp");
		rd.forward(request, response);
	}

}
