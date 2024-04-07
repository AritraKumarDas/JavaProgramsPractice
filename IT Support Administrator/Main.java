package com.jdbcdemo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		EmployeeDAO dao = new EmployeeDAO();
		
		int choice;
		
		do {
			
			System.out.println("1. Insert data into Table: ");
			System.out.println("2. Read data from Table: ");
			System.out.println("3. Modify Salary of Employee: ");
			System.out.println("4. Delete record from Table: ");
			System.out.println("5. Clear all records from Table: ");
			System.out.println("0. Exit");
			System.out.println("\nSelect option: ");
			choice = sc.nextInt();
			
			switch(choice) {

			case 1:{
				int count = dao.insertData();
				if(count>0) {
					System.out.println(count + " record inserted");
				}else {
					System.out.println("Record insertion failed");
				}
				System.out.println();
				break;
			}
			case 2:
				ArrayList<Employee> emplist = dao.readFromTable();
				System.out.println("EmpID"+"\t" + "EmpName" + "\t"+"Emp Dept" + "\t"+ "Emp Salary");
				for(Employee e: emplist) {
					e.printData();
				}
				System.out.println("\n");
				break;
				
			case 3: {
				System.out.println("Enter Employee Id: ");
				int id = sc.nextInt();
				System.out.println("Enter New Employee Salary: ");
				float newSal = sc.nextFloat();
				int count = dao.changeSalary(id,newSal);
				System.out.println(count + " record/s updated");
				System.out.println();
				break;
			}
				
				
			case 4:{
				System.out.println("Enter Employee Id: ");
				int id = sc.nextInt();
				int count = dao.deleteRecord(id);
				if(count>0) {
					System.out.println(count + " record deleted");
				}else {
					System.out.println("Record could not be deleted");
				}
				System.out.println();
				break;
			}
			
			case 5:{
				int count=0;
				count = dao.deleteAllRecords();
				if(count>0) {
					System.out.println(count + " record/s deleted");
				}else {
					System.out.println("Records could not be deleted");
				}
				System.out.println();
				break;
			}
			case 0:
				System.out.println("Program ended successfully");
				break;
				
				
			default:
				
				System.out.println("\nInvalid Selection. Try Again\n");
				break;
			}

		}while(choice>0);

		dao.closeConnection();
		sc.close();
		
	}

}
