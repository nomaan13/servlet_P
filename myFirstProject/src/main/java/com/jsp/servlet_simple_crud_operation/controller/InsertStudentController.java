package com.jsp.servlet_simple_crud_operation.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class InsertStudentController extends   HttpServlet {
	
			public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
				//Create the object of StudentService 
				/*StudentService  service = new StudentService();
				 *    
				 */
				String name = req.getParameter("name");
				String email = req.getParameter("email");
				String age = req.getParameter("age");
				String phone = req.getParameter("phone");
				String degree = req.getParameter("Degree");
				String gender = req.getParameter("gender");
				
//				Student student = new Student(name,email,degree,)
				
				
/*				System.out.println(name);
				System.out.println(email);
				System.out.println(degree);
				System.out.println(gender);
*/				
				PrintWriter pw = res.getWriter();
				
				pw.write("<html><body><h4>"+"Name is :  " + name  + "</h4></body></html>");
				pw.write("<html><body><h4>"+"Email is : " + email + "</h4></body></html>");
				pw.write("<html><body><h4>"+"Age is :   " + age   + "</h4></body></html>");
				pw.write("<html><body><h4>"+"Phone is : " + phone + "</h4></body></html>");
				pw.write("<html><body><h4>"+"Degree is :" + degree+ "</h4></body></html>");
				pw.write("<html><body><h4>"+"Gender is :" + gender+ "</h4></body></html>");
				
				
				
				RequestDispatcher rd = req.getRequestDispatcher("Student_Registration.jsp");
				rd.include(req, res);
				
				
				
				System.out.println("Sussessfully inserted!!!!");
			}
			
			

	

}
