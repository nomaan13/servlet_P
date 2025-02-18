package com.jsp.servlet_simple_crud_operation.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginStudentController extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
		String user = req.getParameter("username");
		String pass = req.getParameter("password");
		
		
	}
	

}
