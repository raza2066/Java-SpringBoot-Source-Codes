package com.crud;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String firstName = req.getParameter("firstName");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/JavaFullStack";
			String uname = "root";
			String pass = "Raza7839";
			
			Connection connection = DriverManager.getConnection(url,uname,pass);
			PreparedStatement statement = connection.prepareStatement("Update students set first_name = ? where student_id = ?");
			statement.setString(1, firstName);
			statement.setInt(2, id);
			int result = statement.executeUpdate();
			
			PrintWriter out = res.getWriter();
			out.println((result == 0)? "Something Went Wrong!!!" : "Student Details Deleted Succesfully");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
