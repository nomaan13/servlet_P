package com.jsp.studentRegistrationForm2.controller;

import java.sql.Connection;

import com.jsp.studentRegistrationForm2.connection.StudentConnection;

public class Driver {

	public static void main(String[] args) {
		Connection connection = StudentConnection.getStudentConnection();
		
		  if (connection != null) {
	            System.out.println("Connection established successfully!");
	        } else {
	            System.out.println("Failed to establish connection.");
	        }  
		  
		  
		System.out.println("Hiiiiiiiii");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				}
	
}
