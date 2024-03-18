package com.linkedlistpractice;

import java.util.Scanner;

public class ReorderList {

	Node head;

	public void reorderList(Node h) {

		if (h == null || h.next == null) {
			return; // there are less than 2 nodes in the linked list, no need to reorder
		}

		// find the middle node of the linked list using the slow and fast pointers
		Node slow = h;
		Node fast = h;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		// split the linked list into two halves: head and tail
		Node tail = slow.next;
		slow.next = null;

		Node p1 = h;

		// reverse the tail of the linked list
		Node p2 = reverse(tail);

		// merge the head and tail of the linked list
		Node next;
		while (p2 != null) {
			next = p1.next;
			p1.next = p2;
			p2 = p2.next;
			p1.next.next = next;
			p1 = next;
		}

		head = h;
	}

	public Node reverse(Node head) {
		Node curr = head, prev = null, nex = null;
		while (curr != null) {
			nex = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nex;
		}
		return prev;
	}

	void insert(int value) {
		Node newNode = new Node(value);

		if (head == null) {
			head = newNode;
			return;
		}

		newNode.next = null;

		Node tmp = head;
		while (tmp.next != null)
			tmp = tmp.next;

		tmp.next = newNode;
		return;
	}

	void display() {
		Node tmp = head;
		while (tmp != null) {
			System.out.print(tmp.data + " ");
			tmp = tmp.next;
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ReorderList ob = new ReorderList();
		System.out.println("Enter no. of nodes in the list: ");
		int numberOfNodes = in.nextInt();
		System.out.println("Enter node values one by one: ");
		while (numberOfNodes-- > 0) {
			ob.insert(in.nextInt());
		}
		ob.display();
		ob.reorderList(ob.head);
		ob.display();

	}

}

//class Node {
//	int data;
//	Node next;
//
//	Node(int data) {
//		this.data = data;
//	}
//}
