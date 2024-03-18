package com.polynomials.linkedlist;

class Node {
	int coeff;
	int pow;
	Node nextNode;

	public Node(int coeff, int pow) {
		this.coeff = coeff;
		this.pow = pow;
		this.nextNode = null;
	}
}

class LinkedList {
	Node head;

	public LinkedList() {
		this.head = null;
	}

	public void addToListEnd(int coeff, int pow) {
		Node newNode = new Node(coeff, pow);
		if (head == null) {
			head = newNode;
			return;
		}

		Node current = head;
		while (current.nextNode != null) {
			current = current.nextNode;
		}
		current.nextNode = newNode;
	}

	public void displayList() {
		Node current = head;
		while (current != null) {

			System.out.print("(" + current.coeff + "x^" + current.pow + ")");
			if (current.nextNode != null) {
				System.out.print(" + ");
			}
			current = current.nextNode;
		}
		System.out.println("\n");
	}

}

public class PolynomialAdditionDemo {

	public static LinkedList sum(LinkedList e1, LinkedList e2) {

		if (e1.head == null) {
			return e2;
		}
		if (e2.head == null) {
			return e1;
		}

		Node tmp1 = e1.head;
		Node tmp2 = e2.head;

		LinkedList result = new LinkedList();

		while (tmp1 != null && tmp2 != null) {
			if (tmp1.pow > tmp2.pow) {
				result.addToListEnd(tmp1.coeff, tmp1.pow);
				tmp1 = tmp1.nextNode;
			} else if (tmp1.pow < tmp2.pow) {
				result.addToListEnd(tmp2.coeff, tmp2.pow);
				tmp2 = tmp2.nextNode;
			} else {
				result.addToListEnd(tmp1.coeff + tmp2.coeff, tmp1.pow);
				tmp1 = tmp1.nextNode;
				tmp2 = tmp2.nextNode;
			}
		}

		while (tmp1 != null) {
			result.addToListEnd(tmp1.coeff, tmp1.pow);
			tmp1 = tmp1.nextNode;
		}

		while (tmp2 != null) {
			result.addToListEnd(tmp2.coeff, tmp2.pow);
			tmp2 = tmp2.nextNode;
		}

		return result;
	}

	public static void main(String[] args) {

		int[] coeff1 = new int[] { 2, -5, 7 };
		int[] pow1 = new int[] { 2, 1, 0 };

		int[] coeff2 = new int[] { -7, 3, 7 };
		int[] pow2 = new int[] { 2, 1, 0 };

		LinkedList exp1 = new LinkedList();
		LinkedList exp2 = new LinkedList();

		for (int i = 0; i < coeff1.length; i++) {
			exp1.addToListEnd(coeff1[i], pow1[i]);
		}

		for (int i = 0; i < coeff2.length; i++) {
			exp2.addToListEnd(coeff2[i], pow2[i]);
		}

		exp1.displayList();

		exp2.displayList();

		LinkedList exp3 = sum(exp1, exp2);

		exp3.displayList();

	}

}
