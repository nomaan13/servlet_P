package com.jsp.studentRegistrationForm1.controller;

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

import com.jsp.studentRegistrationForm1.connection.StudentConnection;

@WebServlet("/register")
public class StudentRegistration extends HttpServlet {
	private final String INSERTQUERY = "INSERT INTO STUDENREGISTRATION VALUES (?,?,?,?,?)";
	Connection connection = StudentConnection.getStudentConnection();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sname = req.getParameter("name");
		String semail = req.getParameter("email");
		String spassword = req.getParameter("password");
		String sgender = req.getParameter("gender");
		String scity = req.getParameter("city");

		PrintWriter pw = resp.getWriter();

		try {
			PreparedStatement ps = connection.prepareStatement(INSERTQUERY);
			ps.setString(1, sname);
			ps.setString(2, semail);
			ps.setString(3, spassword);
			ps.setString(4, sgender);
			ps.setString(5, scity);

			int count = ps.executeUpdate();
			if (count > 0) {

				resp.setContentType("text/html");
				pw.println("<h2 sytle='color:Green'> User Registered successfully</h2>");

				RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");

				rd.include(req, resp);

			} else {
				resp.setContentType("text/html");
				pw.println("<h3 sytle='color:red'> User Not-Registered </h3>");

				RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");

				rd.include(req, resp);
			}
		} catch (SQLException e) {

			e.printStackTrace();
			resp.setContentType("text/html");
			pw.println("<h3 sytle='color:red'> User Not-Registered </h3>");

			RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");

			rd.include(req, resp);
		}

	}

}
