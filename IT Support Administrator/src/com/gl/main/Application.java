package com.gl.main;

import java.util.Scanner;
import com.gl.employee.*;
import com.gl.service.CredentialService;

public class Application {

	// Driver Class main method
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);       // Scanner instance created
		String firstName;
		String lastName;
		String department = "";

		System.out.println("Enter first name of the employee: " );  // First Name input from user
		firstName = sc.nextLine();
		System.out.println("Enter last name of the employee: " );   // Last Name input from user
		lastName = sc.nextLine();

		Employee employee = new Employee(firstName, lastName);  // calls the Employee parameterized constructor
		int choice;
		
		try {

			do {
				System.out.println("Please enter the department from the following: " );
				System.out.println("1. Technical");
				System.out.println("2. Admin");
				System.out.println("3. Human Resource");
				System.out.println("4. Legal");

				choice = sc.nextInt();

				switch(choice) {
				case 1:
					department ="tech";
					break;
				case 2:
					department ="admin";
					break;

				case 3:
					department ="hr";
					break;
				case 4:
					department ="legal";
					break;

				default:
					System.out.println("Invalid department selected. Try Again!\n");

				}
			} while(choice < 1 || choice > 4);      // Repeated input from user in case of wrong selection of department


			CredentialService credential = new CredentialService();

			String generatedEmail = credential.generateEmailAddress(employee, department);
			String generatePassword = credential.generatePassword();

			employee.setEmail(generatedEmail);         // newly generated employee email assigned
			employee.setPassword(generatePassword);   // newly generated employee password assigned

			credential.showCredentials(employee);	// display of employee credentials
			
		} catch(Exception e) {

			System.out.println("Non-numeric value entered in department options");
		}

		sc.close();                             // scanner instance closed

	}

}


