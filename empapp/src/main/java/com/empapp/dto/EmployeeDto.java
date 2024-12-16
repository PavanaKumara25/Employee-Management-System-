package com.empapp.dto;

public class EmployeeDto {
	//POJO class 
	//A class with encapsulation which is used to store form data into objects 
	private long id;
	private String name;
	private String email;
	private String mobile;
	private int salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setId(long id) {
		this.id = id;
	}

}
