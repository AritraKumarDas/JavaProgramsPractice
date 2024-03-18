package com.gl.mentoringsessions2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ente array size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Ente array elements one by one: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
       
        MergeSorting ob = new MergeSorting();
        int start = 0;
        int end = arr.length - 1;
        System.out.println("Before Sorting--->");
        ob.display(arr);
        ob.mergeSort(arr,start,end);
        System.out.println("After Sorting--->");
        ob.display(arr);
        
        ArrayRotate rotate = new ArrayRotate();
        System.out.println("Enter rotation value (k): ");
//        int k = sc.nextInt();
        arr = rotate.rotateArray(arr);
        
        System.out.println("After Rotating--->");
        ob.display(arr);
        
    }
}
