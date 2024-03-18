package com.linkedlistpractice;

import java.util.Scanner;

class DeleteAlternateNode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Node head1 = null, tail1 = null;
		System.out.println("Enter total no. of nodes to insert in Linked List: ");
		int n1 = sc.nextInt();
		System.out.println("Enter values of nodes one by one: ");
		int d1 = sc.nextInt();
		head1 = new Node(d1);
		tail1 = head1;

		while (n1-- > 1) {
			tail1.next = new Node(sc.nextInt());
			tail1 = tail1.next;
		}

		Soln obj = new Soln();
		head1 = obj.deleteAlternate(head1);
		while (head1 != null) {
			System.out.print(head1.data + " ");
			head1 = head1.next;
		}
		System.out.println();

	}

}

class Soln {

	public Node deleteAlternate(Node head) {

		if (head == null) {
			return null;
		}
		Node temp = head;
		Node current = head.next;
		while (current != null) {
			temp.next = current.next;
			temp = temp.next;
			if (temp != null) {
				current = temp.next;
			} else {
				current = null;
			}

		}
		return head;
	}
}

//class Node {
//	int data;
//	Node next;
//
//	public Node(int data) {
//		this.data = data;
//	}
//}
