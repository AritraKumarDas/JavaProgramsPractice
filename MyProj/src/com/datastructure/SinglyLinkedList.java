package com.datastructure;

class Node {
	public int nodeData;
	public Node nextNode;
	
	public Node() {
		
	}
	
	public Node(int data) {
		this.nodeData = data;
	}
}

public class SinglyLinkedList {

	private Node head;

	public SinglyLinkedList() {
		this.head = null;
	}

	public void insertAtFront(int dataValue) {
		Node newNode = new Node();
		newNode.nodeData = dataValue;
		newNode.nextNode = head;
		head = newNode;
	}

	public void insertAtLast(int dataValue) {

		Node newNode = new Node();
		newNode.nodeData = dataValue;
		newNode.nextNode = null;

		if (head == null) {
			head = newNode;
		} else {
			Node currentNode = head;
			while (currentNode.nextNode != null) {
				currentNode = currentNode.nextNode;
			}
			currentNode.nextNode = newNode;
		}
	}

	public void insertAtPos(int dataValue, int pos) {

		if (pos == 0) {
			insertAtFront(dataValue);
			return;
		}

		Node currentNode = head;
		for (int i = 0; currentNode != null && i < pos - 1; i++) {
			currentNode = currentNode.nextNode;
		}

		if (currentNode == null) {
			System.out.println("Entered position to insert is invalid");
			return;
		}

		Node newNode = new Node();
		newNode.nodeData = dataValue;
		newNode.nextNode = currentNode.nextNode;
		currentNode.nextNode = newNode;

	}

	public void deleteFromFront() {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			System.out.println("Node value " + head.nodeData + " deleted from front");
			head = head.nextNode;

		}
	}

	public void deleteFromEnd() {
		if (head == null) {
			System.out.println("List is empty");
		} else if (head.nextNode == null) {
			System.out.println("Node value " + head.nodeData + " deleted from end");
			head = null;
		} else {
			Node currentNode = head;
			while (currentNode.nextNode.nextNode != null) {
				currentNode = currentNode.nextNode;
			}
			System.out.println("Node value " + currentNode.nextNode.nodeData + " deleted from end");
			currentNode.nextNode = null;
		}
	}

	public void deleteAtPos(int pos) {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		if (pos < 1) {
			System.out.println("Invalid position to delete");
			return;
		}
		if (pos == 1) {
			head = head.nextNode;
		} else {
			Node currentNode = head;
			for (int i = 1; currentNode != null && i < pos - 1; i++) {
				currentNode = currentNode.nextNode;
			}

			if (currentNode == null || currentNode.nextNode == null) {
				System.out.println("Position entered is more than the number of elements in the list");
				return;
			}

			currentNode.nextNode = currentNode.nextNode.nextNode;
		}

	}

	public void reorderList() {

		if (head == null || head.nextNode == null) {
			return;
		}

		Node end = head;
		while (end.nextNode != null) {
			end = end.nextNode;
		}

		Node t1 = head;
		Node t2 = head.nextNode;
		Node current = head.nextNode;
		while (t2 != end) {
			System.out.println("t2 = " + t2.nodeData);
			while (current.nextNode != end) {
				current = current.nextNode;
			}
			t1.nextNode = end;
			end.nextNode = t2;
			if (t2.nextNode != end) {
				t1 = t2;
				t2 = t2.nextNode;
				end = current;
				current = t2;
			} else {
				break;
			}

		}
		t2.nextNode = null;
	}

	public void reverse() {
		Node prev = null;
		Node curr = head;
		Node next = null;
		while (curr != null) {
			next = curr.nextNode;
			curr.nextNode = prev;
			prev = curr;
			curr = next;
		}
		head = prev;

	}

	public void searchList(int key) {
		Node currentNode = head;
		int nodeCount = 0;
		while (currentNode != null) {
			nodeCount++;
			if (currentNode.nodeData == key) {
				System.out.println("Key found in node no: " + nodeCount);
				return;
			}
			currentNode = currentNode.nextNode;
		}
		System.out.println("Key not found!");
	}

	public void clearList() {
		Node temp;
		while (head != null) {
			temp = head;
			head = head.nextNode;
			temp = null; // freeing memory
		}
		return;
	}

	public void displayList() {
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.nodeData + " -> ");
			currentNode = currentNode.nextNode;
		}
		System.out.println("NULL");
	}

	public static void main(String[] args) {

		SinglyLinkedList linkedList = new SinglyLinkedList();
		// linkedList.insertAtFront(100);
		// linkedList.insertAtFront(200);
		// linkedList.insertAtFront(300);
		// linkedList.displayList();
		// linkedList.insertAtLast(400);
		// linkedList.displayList();
		// linkedList.insertAtLast(500);
		// linkedList.displayList();
		// linkedList.deleteFromFront();
		// linkedList.displayList();
		// linkedList.deleteFromFront();
		// linkedList.displayList();
		// linkedList.deleteFromFront();
		// linkedList.displayList();
		// linkedList.deleteFromFront();
		// linkedList.displayList();
		// linkedList.deleteFromFront();
		// linkedList.displayList();
		// linkedList.deleteFromFront();
		// linkedList.displayList();
		// linkedList.deleteFromEnd();
		// linkedList.displayList();
		// linkedList.deleteFromEnd();
		// linkedList.displayList();
		// linkedList.deleteFromEnd();
		// linkedList.displayList();
		// linkedList.insertAtLast(700);
		// linkedList.displayList();
		// linkedList.insertAtFront(100);
		// linkedList.displayList();
		// linkedList.insertAtLast(800);
		// linkedList.displayList();
		// linkedList.insertAtFront(200);
		// linkedList.displayList();
		// linkedList.insertAtPos(500,0);
		//// linkedList.displayList();
		// linkedList.insertAtPos(600,1);
		// linkedList.displayList();
		// linkedList.insertAtPos(900,5);
		// linkedList.displayList();
		// linkedList.insertAtPos(400,7);
		// linkedList.displayList();
		// linkedList.insertAtPos(555, 0);
		// linkedList.displayList();
		// linkedList.insertAtFront(444);
		// linkedList.displayList();
		// linkedList.insertAtFront(333);
		// linkedList.displayList();
		// linkedList.deleteAtPos(2);
		// linkedList.displayList();
		// linkedList.deleteAtPos(2);
		// linkedList.displayList();
		// linkedList.deleteAtPos(2);
		// linkedList.displayList();
		// linkedList.deleteAtPos(1);
		// linkedList.displayList();
		// linkedList.insertAtFront(888);
		// linkedList.insertAtFront(999);
		// linkedList.displayList();
		// linkedList.searchList(888);
		// linkedList.clearList();
		// linkedList.displayList();
		// linkedList.reverse();
		linkedList.insertAtLast(1);
		linkedList.insertAtLast(2);
		linkedList.insertAtLast(3);
		linkedList.insertAtLast(4);
		linkedList.insertAtLast(5);
		linkedList.insertAtLast(6);
		linkedList.insertAtLast(7);
		linkedList.insertAtLast(8);
		// linkedList.insertAtLast(9);
		linkedList.displayList();
		linkedList.reverse();
		// linkedList.reorderList();
		linkedList.displayList();

	}

}
