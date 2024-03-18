package com.linkedlistpractice;
import java.util.*;

class SumOfLastNnodes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of nodes in Linked List: ");
		int m = sc.nextInt();
		System.out.println("Enter no. of nodes you want sum from the last of the Linked List: ");
		int n = sc.nextInt();
		System.out.println("Enter the node values one by one: ");
		Node head = new Node(sc.nextInt());
		Node tail = head;

		for (int i = 1; i < m; i++) {
			tail.next = new Node(sc.nextInt());
			tail = tail.next;
		}

		Solution obj = new Solution();
		System.out.println("Sum of last " + n + " nodes: " + obj.SumOfNode(head, n));

	}
}

class Solution {

	public int SumOfNode(Node head, int n) {

		int count = 0;
		Node temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}

		temp = head;
		for (int i = 1; i <= (count - n); i++) {
			temp = temp.next;
		}
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + temp.data;
			temp = temp.next;
		}
		return sum;

	}
}

//class Node {
//	int data;
//	Node next;
//
//	public Node(int data) {
//		this.data = data;
//		this.next = null;
//	}
//}
