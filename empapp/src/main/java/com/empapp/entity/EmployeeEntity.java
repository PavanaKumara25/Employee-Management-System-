package com.empapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	
	@Column(name="name",nullable=false,length=20)
	private String name;
	
	@Column(name="email",nullable=false,unique=true,length=200)
	private String email;
	
	@Column(name="mobile",nullable=false,length=10)
	private String mobile;
	
	@Column(name="salary",nullable=false)
	private int salary;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public void setSalary(int salary2) {
		this.salary = salary2;
	}

}
