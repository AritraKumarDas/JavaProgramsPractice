package com.stack.linkedlist;

class Node {
	int dataNode;
	Node nextNode;

	public Node(int data) {
		this.dataNode = data;
	}
}

public class StackImplementationUsingLinkedList {

	Node head = null;

	public void push(int data) {

		Node newNode = new Node(data);
		newNode.nextNode = head;
		head = newNode;
	}

	public void pop() {
		if (head == null) {
			System.out.println("Stack is empty");
			return;
		}
		System.out.println("Node data " + head.dataNode + " popped from Stack.");
		head = head.nextNode;
	}

	public void display() {
		if (head == null) {
			System.out.println("Stack is empty");
			return;
		}
		Node current = head;
		while (current != null) {
			System.out.println(current.dataNode);
			current = current.nextNode;
		}
	}

	public static void main(String[] args) {

		StackImplementationUsingLinkedList stack = new StackImplementationUsingLinkedList();

		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		stack.display();

	}

}
