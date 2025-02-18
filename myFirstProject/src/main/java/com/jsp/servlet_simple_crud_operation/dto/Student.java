package com.jsp.servlet_simple_crud_operation.dto;

public class Student {
	private int id;
	private String name;
	private String degree;
	private String branch;
	private String gender;
	private String password;
	
	
	


	public Student() {
		super();}
	
	
	public Student(int id, String name, String degree, String branch, String gender, String password) {
		super();
		this.id = id;
		this.name = name;
		this.degree = degree;
		this.branch = branch;
		this.gender = gender;
		this.password= password;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	

}
