package com.array.practice;

import java.util.Scanner;

public class ShortestSortedSubArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements one by one: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int start = -1;
		int end = -1;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] >= arr[i + 1]) {
				start = i;
				break;
			}
		}
		for (int i = n - 1; i > 0; i--) {
			if (arr[i - 1] >= arr[i]) {
				end = i;
				break;
			}
		}

	
		if (start != end && arr[start] != arr[end]) {       // 
			for (int i = start; i <= end; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println("\nSubarray Size: " + (end-start+1));
		} else {
			System.out.println("Array is already sorted");
			System.out.println("\nSubarray Size: " + 0);

		}
	}
}
