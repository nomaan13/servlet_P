package com.jsp.servletForm.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/submitForm")
public class SubmitForm  extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String myname=req.getParameter("name");
	String myemail=req.getParameter("email");
	
	
	PrintWriter pw = resp.getWriter();
	pw.println("My name is : " + myname);
	pw.println("My email is : " + myemail);
	
	System.out.println("Name is :" + myname);
	System.out.println("Email is :"  + myemail);
	}

}
