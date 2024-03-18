package com.greatlearning.corejava;

import java.util.Scanner;

public class ReverseNumber {
	
	public static int reverse(int num) {
		int revNum=0;
		while(num > 0) {
			int rem = num%10;
			revNum = revNum*10 + rem;
			num= num/10;
			
		}
		return revNum;
		
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: " );
		int num = sc.nextInt();
		int rev = reverse(num);
		System.out.println("Reverse of the number: " + rev);
		
		
	}

}
