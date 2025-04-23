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
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/JavaFullStack";
			String uname = "root";
			String pass = "Raza7839";
			
			Connection connection = DriverManager.getConnection(url,uname,pass);
			PreparedStatement statement = connection.prepareStatement("delete from students where student_id = ?");
			statement.setInt(1, id);
			int result = statement.executeUpdate();
			
			PrintWriter out = res.getWriter();
			out.println((result == 0)? "Something Went Wrong!!!" : "Student Details Updated Succesfully");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
