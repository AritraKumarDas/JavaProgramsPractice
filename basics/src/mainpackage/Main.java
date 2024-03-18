
package mainpackage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		float a,b,result;
		long long_num = 8558968965L;
		a=3.25f;
		b=8.99f;
		int x = (int)long_num;
		
		result = a+b;
		System.out.println("Result = " + result);
		System.out.println(long_num);
		System.out.println(x);
		String str="Suraj";
		System.out.printf("Hi there %s, you are %d years old now", name,age);
//		if(str==true) {
//			System.out.println("true cond");
//		}else {
//			System.out.println("f cond");
//		}

	}

}
