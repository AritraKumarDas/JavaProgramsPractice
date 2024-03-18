package com.array.practice;

import java.util.Scanner;

public class MinMaxSumSubArray {

	public static int findMin(int[] arr, int start, int k) {
		int min = arr[start];
		for (int i = start + 1; i < start + k; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int findMax(int[] arr, int start, int k) {
		int max = arr[start];
		for (int i = start + 1; i < start + k; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int sumMinMax(int[] arr, int start, int k) {
		return (findMin(arr, start, k) + findMax(arr, start, k));
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Array elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Array elements one by one: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter size of sub-array(k): ");
		int k = sc.nextInt();
		if (k <= n) {
			int sum = 0;
			for (int i = 0; i <= n - k; i++) {
				sum += sumMinMax(arr, i, k);
			}
			System.out.println("Total Sum of min & max of all sub-arrays: " + sum);
		} else {
			System.out.println("Sub array size is greater than main array size!");
		}

	}
}
