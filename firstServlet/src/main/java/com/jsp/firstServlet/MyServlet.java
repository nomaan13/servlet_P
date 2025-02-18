package com.jsp.firstServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		/**
		 * 
		 * @author nomaan
		 * To print output on web browser we have to use 
		 * PrintWriter ();
		 * with resp object
		 * e.g	 PrintWriter out =  resp.getWriter();
		 */
		
		PrintWriter out = resp.getWriter();
		out.print("Print this statement on browser............");
		System.out.println("Inside doGet() method");
		
	}

}
