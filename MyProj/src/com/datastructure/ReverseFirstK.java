package com.datastructure;

import java.util.Scanner;

public class ReverseFirstK {

	public static void reverseFirstK(int[] arr, int k) {
		if (k > arr.length) {
			System.out.println("Position k entered is more than array size!");
			return;
		}
		Stack st = new Stack(k);
		for (int i = 0; i < k; i++) {
			st.push(arr[i]);
		}
		for (int i = 0; i < k; i++) {
			arr[i] = st.pop();
		}

	}

	public static void main(String[] args) {

		// write your answer here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nos of Array elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements one by one: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter position K upto which you want to reverse: ");
		int k = sc.nextInt();

		reverseFirstK(arr, k);

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}

class Stack {
	int maxSize;
	int currentPointer = -1;
	int[] stack;

	Stack(int k) {
		this.maxSize = k;
		this.stack = new int[k];
	}

	public void push(int value) {
		if (currentPointer >= maxSize) {
			System.out.println("Stack overflow");
			return;
		}
		stack[++currentPointer] = value;
	}

	public int pop() {
		if (currentPointer <= -1) {
			System.out.println("Stack underflow");
			return -1;
		}
		return stack[currentPointer--];
	}

}
