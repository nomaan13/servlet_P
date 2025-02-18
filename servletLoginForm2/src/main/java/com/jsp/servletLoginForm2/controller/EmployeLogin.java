package com.jsp.servletLoginForm2.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class EmployeLogin extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String myemail=req.getParameter("email");
		String mypass=req.getParameter("password");
		
		if(myemail.equals("abc@gmail.com") && mypass.equals("123")) {
		resp.sendRedirect("https://www.youtube.com/");}
		else
		{
			resp.sendRedirect("https://www.google.com/");
		}
	}
	
	

}
