package com.greatlearning.corejava;

public class ConstructorDemo {
	
	int value1;
	float value2;
	String username;
	char userchoice;
	
	ConstructorDemo(){
		System.out.println("I am from default constructor.");
		value1 = 0;
		value2 = 0;
		username = "";
		userchoice = ' ';
		
	}

	ConstructorDemo(int integerValue, float floatValue, String name, char choice){
		System.out.println("I am Parameterized constructor. I take various arguments as input.");
		value1 = integerValue;
		value2 = floatValue;
		username = name;
		userchoice = choice;
	}
	
	float square() {
		return value1 * value2;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo c1 = new ConstructorDemo();
		ConstructorDemo c2 = new ConstructorDemo(4, 7.3f, "rahul gupta", 'z');
		
		System.out.println(c1.square());
		System.out.println(c2.square());
		
		

	}

}
