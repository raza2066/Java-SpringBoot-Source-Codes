package com.crud;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/insert")
public class InsertServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			int id = Integer.parseInt(req.getParameter("id"));
			String firstName = req.getParameter("firstName");
			String lastName = req.getParameter("lastName");
			String email = req.getParameter("email");
			String dobString = req.getParameter("dob");
			String enrollmentDateString = req.getParameter("enrollmentDate");
			
			java.sql.Date dob = null;
	        java.sql.Date enrollmentDate = null;
	        
	        // SimpleDateFormat for date parsing (format: yyyy-MM-dd)
	        if (dobString != null && !dobString.isEmpty()) {
	            dob = java.sql.Date.valueOf(dobString);  // or use SimpleDateFormat if more flexibility is needed
	        }
	        
	        if (enrollmentDateString != null && !enrollmentDateString.isEmpty()) {
	            enrollmentDate = java.sql.Date.valueOf(enrollmentDateString);  // or use SimpleDateFormat if more flexibility is needed
	        }
			
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/JavaFullStack";
			String uname = "root";
			String pass = "Raza7839";
			
			Connection connection = DriverManager.getConnection(url,uname,pass);
			
			PreparedStatement statement = connection.prepareStatement("insert into students values(?,?,?,?,?,?)");
			statement.setInt(1,id);
			statement.setString(2, firstName);
			statement.setString(3,lastName);
			statement.setDate(4, dob);
			statement.setString(5,email);
			statement.setDate(6, enrollmentDate);
			
			int result  = statement.executeUpdate();
			PrintWriter out = res.getWriter();
			out.println((result == 0)? "Something Went Wrong!!!" : "Student Details Added Succesfully");
			
		} catch (Exception e) {
	        e.printStackTrace();
	        PrintWriter out = res.getWriter();
	        out.println("An error occurred: " + e.getMessage());
	    }
	}
}
