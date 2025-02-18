package com.jsp.servletLoginForm.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class StudentLogin extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String myname=req.getParameter("name");
		String myclass=req.getParameter("class");
		String mycontact=req.getParameter("contact");
		String myemail=req.getParameter("email");
		
		PrintWriter pw =resp.getWriter();
		
		pw.println("Entered name is : " + myname);
		pw.println("Entered class is :" + myclass);
		pw.println("Entered contact is : " + mycontact);
		pw.println("Entered email is :" + myemail);
	
		
	}

}
