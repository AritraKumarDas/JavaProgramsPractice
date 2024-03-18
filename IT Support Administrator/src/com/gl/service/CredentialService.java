package com.gl.service;

import com.gl.employee.Employee;
import java.util.Random;

public class CredentialService {
	
	String companyName = "greatlearning.com";  // Storing the name of the domain company
	
	
	// Random 8-character password generator method
	public String generatePassword() {
		
		String password="";
		
		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";          // Array of Upper Case Alphabets
		String small = "abcdefghijklmnopqrstuvwxyz";		// Array of Lower Case Alphabets
		String numbers = "0123456789";						// Array of digits
		String special = "!@#$%^&*";						// Array of Special Characters
		
		Random random = new Random();					// generating a Random Class instance as 'random'
		
		// 8 digit Password creation combining Upper Case, Lower Case, Digits & special characters
				
		password += caps.charAt(random.nextInt(caps.length()));
		password += caps.charAt(random.nextInt(caps.length()));
		password += small.charAt(random.nextInt(small.length()));
		password += small.charAt(random.nextInt(small.length()));
		password += numbers.charAt(random.nextInt(numbers.length()));
		password += numbers.charAt(random.nextInt(numbers.length()));
		password += special.charAt(random.nextInt(special.length()));
		password += special.charAt(random.nextInt(special.length()));
		
		
		return password;
	}
	
	// Email Address generator method
	public String generateEmailAddress(Employee emp, String dept) {
		String email = emp.getFirstName() + emp.getLastName() + "@" + dept + "." + companyName ;
		return email.toLowerCase();
		
	}

	// Display of Employee details
	public void showCredentials(Employee emp) {
		
		System.out.println("Dear " + emp.getFirstName() + " your generated credentials are as follows:-");
		
		System.out.println("Email ---> " + emp.getEmail());
		System.out.println("Password ---> " + emp.getPassword());
		
	}
}
