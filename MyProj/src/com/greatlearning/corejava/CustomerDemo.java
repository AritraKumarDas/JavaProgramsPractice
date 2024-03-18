package com.greatlearning.corejava;

public class CustomerDemo {

	CustomerDemo() {
		System.out.println("Hello I am from default constructor");
	}

	CustomerDemo(String name) {
		System.out.println("Hello I am from parameterized constructor");
		System.out.println("My name is: " + name);
	}
	
	CustomerDemo(String name, int age) {
		System.out.println("Hello I am from parameterized constructor");
		System.out.println("My name is: " + name);
		System.out.println("My age is: " + age);
	}

	public static void main(String[] args) {
		
		CustomerDemo cust;
		
		cust = new CustomerDemo();
		cust = new CustomerDemo("rahul", 24);
		
		System.out.println(cust);
		
		

	}

}
