package com.queue.linkedlist;

class Node {
	int nodeData;
	Node nextNode;

	public Node(int dataValue) {
		this.nodeData = dataValue;
		this.nextNode = null;
	}

}

public class QueueImplementationUsingLinkedList {

	Node head = null;
	Node tail = null;

	public void enqueue(int dataValue) {
		Node newNode = new Node(dataValue);
		if (head == null) {
			head = tail = newNode;
			return;
		}
		tail.nextNode = newNode;
		tail = newNode;
	}

	public void dequeue() {
		if (head == null) {
			System.out.println("Queue is empty");
			return;
		}

		System.out.println("Node data " + head.nodeData + " deleted from queue");

		if (head == tail) {
			head = tail = null;

		} else {
			head = head.nextNode;
		}
	}

	public void display() {
		if (head == null) {
			System.out.println("Queue is empty");
			return;
		}
		Node current = head;
		while (current != null) {
			System.out.print(current.nodeData + " -> ");
			current = current.nextNode;
		}
		System.out.println("NULL");
	}

	public static void main(String[] args) {

		QueueImplementationUsingLinkedList queue = new QueueImplementationUsingLinkedList();
		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);
		queue.enqueue(400);
		queue.display();
		queue.dequeue();
		queue.display();
		queue.dequeue();
		queue.display();
		queue.dequeue();
		queue.display();
		queue.dequeue();
		queue.display();
		queue.enqueue(500);
		queue.enqueue(600);
		queue.display();

	}

}
