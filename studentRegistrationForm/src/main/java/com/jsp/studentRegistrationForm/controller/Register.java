package com.jsp.studentRegistrationForm.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.studentRegistrationForm.connection.StudentConnection;

@WebServlet("/register")
public class Register extends HttpServlet {

	Connection connection = StudentConnection.getStudentConnection();
	final String INSERTQUERY = "INSERT INTO STUDENREGISTRATION VALUES (?,?,?,?)";

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String myname = req.getParameter("name");
		String myemail = req.getParameter("email");
		String mypassword = req.getParameter("password");
		String mygender = req.getParameter("gender");
		String mycity = req.getParameter("city");

		PrintWriter pw = resp.getWriter();

		try {
			PreparedStatement ps = connection.prepareStatement(INSERTQUERY);
			ps.setString(1, myname);
			ps.setString(2, myemail);
			ps.setString(3, mypassword);
			ps.setString(4, mygender);
			ps.setString(5, mycity);

			int count = ps.executeUpdate();
			if (count > 0) {

				resp.setContentType("text/html");
				pw.println("<h3 sytle='color:green'> User Registered successfully</h3>");

				RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");

				rd.include(req, resp);

			} else {
				resp.setContentType("text/html");
				pw.println("<h3 sytle='color:red'> User Not-Registered </h3>");

				RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");

				rd.include(req, resp);
			}
		} catch (SQLException e) {
			resp.setContentType("text/html");
			pw.println("<h3 sytle='color:red'> User Not-Registered </h3>");

			RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");

			rd.include(req, resp);

			e.printStackTrace();
		}

	}
}
