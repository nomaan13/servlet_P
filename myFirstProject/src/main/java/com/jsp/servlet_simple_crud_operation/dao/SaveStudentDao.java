package com.jsp.servlet_simple_crud_operation.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jsp.servlet_simple_crud_operation.dto.Student;

public class SaveStudentDao {
	public Student saveStudent(Student student) {
		String insertQuery ="insert into student_details values(?,?,?,?,?)";
		
		try {
			PreparedStatement ps = connection.prepareStatement(insertQuery);
			ps.setString(1, student.getName());
			ps.setString(2, student.getDegree());
			ps.setString(3, student.getBranch());
			ps.setString(4, student.getGender());
			ps.setString(5, student.getPassword());
			ps.execute();
			return student;
		} catch (Exception e) {
			
			e.printStackTrace();
			return null;
		}
		
	}
	
	
	public Student fetchStudentByEmailforLogin(String userEmail) {
		String selectQuery ="Select * from student_details where email = ? ";
		
		try {
			PreparedStatement ps= connection.perpareStatement(selectQuery);
			ps.setString(1, userEmail);
			ResultSet resultSet = ps.executeQuery();
			
			if(resultSet)//to be continuew
			
			
		
		} catch (Exception e) {
			e.printStackTrace();
					}
		
	}
	

}
