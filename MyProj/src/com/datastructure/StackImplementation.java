package com.datastructure;

public class StackImplementation {

	int size_of_stack;
	int[] arr;
	int current_pointer;

	public StackImplementation(int size) {
		this.current_pointer = -1;
		this.size_of_stack = size;
		this.arr = new int[size_of_stack];

	}

	public boolean push(int value) {
		if (current_pointer >= size_of_stack - 1) {
			System.out.println("Stack Overflow!");
			return false;
		} else {
			arr[++current_pointer] = value;
			System.out.println("Pushed successfully");
			return true;
		}
	}

	public int pop() {
		if (current_pointer <= -1) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x = arr[current_pointer--];
			return x;
		}
	}

	public void peek() {
		if (current_pointer <= -1) {
			System.out.println("Stack Underflow");
		} else {
			int topElement = arr[current_pointer];
			System.out.println("Peeked element: " + topElement);
		}
	}

	public void print() {
		System.out.println("Current Stack Position ----> ");
		if (current_pointer <= -1) {
			System.out.println("Stack is empty");
			return;
		}

		for (int i = current_pointer; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {

		StackImplementation stack = new StackImplementation(5);
		stack.print();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.print();
		System.out.println("Item popped: " + stack.pop());
		System.out.println("Item popped: " + stack.pop());
		System.out.println("Item popped: " + stack.pop());
		System.out.println("Item popped: " + stack.pop());
		System.out.println("Item popped: " + stack.pop());
		// System.out.println("Item popped: " + stack.pop());
		stack.peek();

	}

}
