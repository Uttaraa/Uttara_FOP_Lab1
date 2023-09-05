package com.greatlearning.email.model;

public class Employee {
	
	private String firstName;
	private String lastName;
	private String department;
	private String emailAddress;
	private String password;

	//Parameterized Constructor of Employee Class
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
	}

	//Implementing getters and setters, no setter firstName and lastName as we're passing it through Strings.

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
