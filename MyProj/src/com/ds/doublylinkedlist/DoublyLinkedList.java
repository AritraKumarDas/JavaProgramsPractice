package com.ds.doublylinkedlist;

class Node {
	int nodeData;
	Node prevNode;
	Node nextNode;

	public Node(int dataValue) {
		this.nodeData = dataValue;
		this.prevNode = null;
		this.nextNode = null;
	}
}

public class DoublyLinkedList {

	Node head;

	public void insertAtFront(int dataValue) {

		Node newNode = new Node(dataValue);

		if (head == null) {
			head = newNode;
			return;
		}

		newNode.nextNode = head;
		head.prevNode = newNode;
		head = newNode;

	}

	public void insertAtEnd(int dataValue) {

		Node newNode = new Node(dataValue);

		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while (temp.nextNode != null) {
			temp = temp.nextNode;
		}
		newNode.prevNode = temp;
		temp.nextNode = newNode;
	}

	public void delete(int dataValue) {

		Node temp = findNode(dataValue);

		if (temp == null) {
			System.out.println("Node not found");
			return;
		}
		if (temp == head) {
			head = head.nextNode;
			if (temp.nextNode != null) {
				head.prevNode = null;
			}
			return;
		}
		temp.prevNode.nextNode = temp.nextNode;
		if (temp.nextNode != null) {
			temp.nextNode.prevNode = temp.prevNode;
		}
	}

	public Node findNode(int dataValue) {

		Node currentNode = head;
		while (currentNode != null) {
			if (currentNode.nodeData == dataValue) {
				return currentNode;
			}
			currentNode = currentNode.nextNode;
		}
		return null;
	}

	public void displayList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.nodeData + " -> ");
			temp = temp.nextNode;
		}
		System.out.println("NULL");
	}

	public static void main(String[] args) {

		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		// doublyLinkedList.insertAtFront(100);
		// doublyLinkedList.insertAtFront(200);
		// doublyLinkedList.insertAtFront(300);
		// doublyLinkedList.displayList();
		// doublyLinkedList.insertAtEnd(400);
		doublyLinkedList.insertAtFront(900);
		doublyLinkedList.insertAtEnd(500);
		doublyLinkedList.displayList();
		doublyLinkedList.delete(500);
		doublyLinkedList.displayList();
		doublyLinkedList.delete(900);
		doublyLinkedList.displayList();
		doublyLinkedList.delete(700);
		doublyLinkedList.displayList();

	}

}
