package com.bankApplication.bankApp.Dto;

import jakarta.persistence.Column;
import lombok.Data;


@Data
public class EmployeeDto {
	private int eId;
	
	//@Column(name = "Name",nullable = false)
	private String Name;
	
	//@Column(name = "Email_Id",nullable = false)
	private String EmailId;

	//@Column(name = "PhoneNumber",nullable = false)
	private Long PhoneNumber;
	
	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public Long getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	//@Column(name = "Address",nullable = false)
    private String Address;
    
	//@Column(name = "salary",nullable = false)
    private double salary;
}
