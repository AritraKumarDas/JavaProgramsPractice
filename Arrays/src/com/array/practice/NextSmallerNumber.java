package com.array.practice;

import java.util.Scanner;

public class NextSmallerNumber {

	public static int nextSmallerInArray(int[] arr, int i) {

		for (int j = i + 1; j < arr.length; j++) {
			if (arr[j] < arr[i]) {
				return j;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		// write your answer here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of array elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements one by one: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			int nextSmaller = nextSmallerInArray(arr, i);

			if (nextSmaller >= 0) {
				System.out.print(arr[nextSmaller] + " ");
			} else {
				System.out.print(nextSmaller + " ");
			}
		}
	}
}
