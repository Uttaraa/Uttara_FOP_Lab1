package com.greatlearning.email.service;

import java.util.Random;

import com.greatlearning.email.model.Employee;

public class CredentialService implements ICredentialService{

	private String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String lower = "abcdefghijklmnopqrstuvwxyz";
	private String number = "0123456789";
	private String splChar = "!@#$%^&*()_+~-?:;";
	private String passwordChars = upper +lower + number +splChar;
	Random random = new Random();


	@Override
	public void generateEmail(Employee employee) {

		/* Generating the email address of new hires by using the function "toLowerCase"
                   which will convert the entries in lower case
		   and getDepartment function will assign the respective department in employee's email */

		String emailAddress= employee.getFirstName().toLowerCase()+employee.getLastName().toLowerCase()+"@"+employee.getDepartment().toLowerCase()+".gl.in";
		employee.setEmailAddress(emailAddress);

	}

	@Override
	public void generatePassword(Employee employee) {
		
		//Generating eight digit password using random.nextInt() funtion by randomly choosing the characters feeded in above string "passwordChars"
		
		String password ="";
		
		//for loop for picking eight characters
		
		for (int i=0; i<=8; i++) {
			password = password + passwordChars.charAt(random.nextInt(passwordChars.length()));
			employee.setPassword(password);
		}

	}

	@Override
	public void showCredentials(Employee employee) {
		
		//display generated credentials to the user
		
		System.out.println("Dear"+ employee.getFirstName()+ " your generated credentials are as follows");
		System.out.println("Email\t\t: "+ employee.getEmailAddress());
		System.out.println("Password\t: "+ employee.getPassword());
	}

}
