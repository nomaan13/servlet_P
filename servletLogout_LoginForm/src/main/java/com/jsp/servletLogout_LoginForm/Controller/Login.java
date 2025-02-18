package com.jsp.servletLogout_LoginForm.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login  extends HttpServlet{
	


	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String myemail = req.getParameter("email");
		String mypass = req.getParameter("pass");
		
		PrintWriter out = resp.getWriter();
		
		if(myemail.equals("abc@gmail.com") && mypass.equals("7748")) {
			req.setAttribute("name_key", "Nomaan");
			
			RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
			rd.forward(req, resp);
		}
		else
		{
			resp.setContentType("text/html");
			out.print("<h3 style='color:red'> Email id or password didnot matched </h3>");
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			rd.forward(req, resp);
		}
	}

}
