package com.jdbcdemo;

public class Employee {
	int empId;
	String empName;
	String empDept;
	float empSal;

	public Employee(int empId, String empName, String empDept, float empSal) {
		this.empId=empId;
		this.empName=empName;
		this.empDept=empDept;
		this.empSal=empSal;

	}

	public void printData() {

		System.out.println(empId + "\t" + empName + "\t" + empDept + "\t" + empSal);

	}
}
