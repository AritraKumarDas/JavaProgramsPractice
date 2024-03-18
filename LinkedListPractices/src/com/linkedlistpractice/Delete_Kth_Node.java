package com.linkedlistpractice;

import java.util.Scanner;

class Delete_Kth_Node {
	Node head;

	void addToTheLast(Node node) {
		if (head == null)
			head = node;
		else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;

			temp.next = node;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("No of list items: ");
		int n = sc.nextInt();
		Delete_Kth_Node list = new Delete_Kth_Node();
		System.out.println("Enter values : ");
		int a1 = sc.nextInt();
		Node head = new Node(a1);
		list.addToTheLast(head);
		for (int i = 1; i < n; i++) {
			int a = sc.nextInt();
			list.addToTheLast(new Node(a));
		}
		System.out.println("Enter position to delete: ");
		int K = sc.nextInt();
		Node temp = list.head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();

		list.head = new Code().delete(list.head, K);
		temp = list.head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}

class Code {

	public Node delete(Node head, int K) {
		int count = countNodes(head);

		if (count < K) {
			return head;
		}

		Node temp = null;
		Node current = head;
		int i = 0;
		while (current != null) {
			i++;
			if (i % K == 0) {
				if (current == head) {
					head = head.next;
					current = current.next;
				} else {
					temp.next = current.next;
					current = temp.next;
				}
			} else {
				temp = current;
				current = current.next;
			}
		}
		return head;
	}

	public int countNodes(Node h) {
		int count = 0;
		Node temp = h;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
}

class Node {
	Node next;
	int data;

	Node(int d) {
		data = d;
		next = null;
	}
}