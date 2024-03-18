package akd.subpackage;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = {10,20,30,40,50};
//		System.out.println("Enter multiplier: ");
//		int multiplier = sc.nextInt();
//		
//		for(int x: arr) {
//			System.out.printf("%d x %d = %d\n",x,multiplier,x*multiplier);
//		}
		
		int i = arr.length-1;
		System.out.println("Reversed Array:");
		while(i>=0) {
			System.out.println(arr[i]);
			i--;
		}
		
		
		for(int x=0;x<5;x++) {
			for(int j=0;j<=x;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		boolean isPresent = false;
		System.out.println("The student is " + isPresent);
		System.out.printf("Here it is: %s \n hahaha",isPresent);
		
		double d1 = 66.8;
		char c1 = (char)d1;
		System.out.println("Double to char conv -> " + c1);
		
		
		sc.close();
	}

}
