package com.jspservletLoginForm3.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/submitform")
public class LoginController extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String myemail=req.getParameter("email");
		String mypass = req.getParameter("password");
		PrintWriter pw = resp.getWriter();
		
		if(myemail.equals("abc@gmail.com")&& mypass.equals("7748")) {
			req.setAttribute("name_key", "Nomaan");
			RequestDispatcher rd =req.getRequestDispatcher("/home.jsp");
			rd.forward(req, resp);
		}
		
		else
		{
			resp.setContentType("text/html");
			pw.print("<h3 style='color:red' align :center>Entered password or email is incorrect!!!!!</h3>");
			RequestDispatcher rd =req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
		}
	}

}
