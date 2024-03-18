package com.array.practice;

import java.util.Scanner;

public class ShortestSubArraySummation {

	public static int subArraySum(int[] arr, int start, int subArrSize) {
		int sum = 0;
		for (int i = start; i < start + subArrSize; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input Array size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Array elements one by one: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter minimum sum of required in subArrays: ");
		int k = sc.nextInt();

		int minSize = n + 1;

		for (int i = 0; i < n; i++) {
			for (int subArrSize = 1; subArrSize <= n - i; subArrSize++) {
				if (subArraySum(arr, i, subArrSize) >= k) {

					if (subArrSize < minSize) {
						minSize = subArrSize;
					}
				}
			}

		}

		if (minSize < n + 1) {
			System.out.println("Minimum sub array size which has sum more than " + k + " is: " + minSize);
		} else {
			System.out.println(-1);
		}
	}
}
