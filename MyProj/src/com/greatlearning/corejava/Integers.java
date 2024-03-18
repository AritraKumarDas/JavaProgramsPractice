package com.greatlearning.corejava;

public class Integers {
	
	int var1=10;
	static int var2=10;
	
	void method1(){
		var1++;
		System.out.println("Var 1 = " + var1);
		
	}
	
	void method2(){
		var2++;
		System.out.println("Var 2 = " + var2);
	}
	
	

	public static void main(String[] args) {
		
		Integers obj1 = new Integers();
		Integers obj2 = new Integers();
		Integers obj3 = new Integers();

		obj1.method1();
		obj2.method1();
		obj3.method1();
		
		obj1.method2();
		obj2.method2();
		obj3.method2();
	}

}
