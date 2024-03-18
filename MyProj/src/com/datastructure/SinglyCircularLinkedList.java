package com.datastructure;

public class SinglyCircularLinkedList {

	Node head;
	Node tail;

	public void insertAtLast(int dataValue) {
		Node newNode = new Node();
		newNode.nodeData = dataValue;
		if (head == null) {
			head = newNode;
		}

		if (tail == null) {
			tail = newNode;
		} else {
			tail.nextNode = newNode;
			tail = newNode;
		}
		tail.nextNode = head;
	}

	public void delete(int key) {

		Node temp = findNode(key);

		if (temp == null) {
			System.out.println("Node not found");
			return;
		}

		if (temp == head && temp.nodeData == key) {
			if (temp == tail) {
				head = tail = null;
			} else {
				head = head.nextNode;
				tail.nextNode = head;
			}
		} else {
			if (temp.nextNode == tail) {
				tail = temp;
			}
			temp.nextNode = temp.nextNode.nextNode;

		}
	}

	public Node findNode(int key) {

		if (head == null) {
			return null;
		}

		Node currentNode = head;

		if (currentNode.nodeData == key) {
			return currentNode;
		}

		while (currentNode.nextNode != head) {
			if (currentNode.nextNode.nodeData == key) {
				return currentNode;
			}
			currentNode = currentNode.nextNode;
		}
		return null;
	}

	public int countNodes() {
		if (head == null) {
			return 0;
		}
		int count = 1;
		Node temp = head;
		while (temp.nextNode != head) {
			count++;
			temp = temp.nextNode;
		}
		return count;
	}

	public void display() {
		if (head == null) {
			System.out.println("Circular List is empty");
			return;
		}
		Node temp = head;
		System.out.print(temp.nodeData + " -> ");
		temp = temp.nextNode;
		while (temp != head) {
			System.out.print(temp.nodeData + " -> ");
			temp = temp.nextNode;
		}
		System.out.println("END");
	}

	public static void main(String[] args) {

		SinglyCircularLinkedList circularList = new SinglyCircularLinkedList();
		circularList.insertAtLast(100);
		circularList.insertAtLast(200);
		circularList.insertAtLast(300);
		circularList.insertAtLast(400);
		circularList.display();
		System.out.println("No of nodes in circular list: " + circularList.countNodes());
		circularList.delete(300);
		circularList.display();

	}

}
