package com.greatlearning.service;

import com.greatlearning.model.Employee;
import java.security.SecureRandom;
import java.util.Random;

public class CredentialsService {
	private String email;
	private String password;

	public void generateEmail(Employee emp) {
		StringBuilder sb = new StringBuilder();
		sb.append(emp.getFirstName()).
				 append(emp.getLastName())
				.append("."+emp.getDepartment())
				.append("@")
				.append("abc.com");
		email = sb.toString();
	}

	public char[] generatePassword() {

		 String capitalLetter="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 String smallLetter="abcdeghijklmnopqrstuvwxyz";	
		 String number="012356789";
		 String special="!@#$%&*+?:";
		 String value=capitalLetter+smallLetter+number+special;
		 Random random= new Random();
		 char[] password=new char[8];
		 for(int i=0;i<8;i++)
		 {
			password[i]= value.charAt(random.nextInt(value.length())) ;
			
		 }
		 return password;
	}

	public void showCredentials() {
		System.out.println("Employee Email: " + email.toLowerCase());
		System.out.println("Password: " + generatePassword());
	}
}
