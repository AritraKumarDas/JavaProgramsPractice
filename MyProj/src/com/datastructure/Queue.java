package com.datastructure;

public class Queue {

	int maxsize;
	int[] arr;
	int front;
	int rear;

	public Queue(int maxsize) {
		this.maxsize = maxsize;
		arr = new int[maxsize];
		this.front = -1;
		this.rear = -1;
	}

	public boolean isEmpty() {
		if (front == -1) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (rear == maxsize - 1) {
			return true;
		}
		return false;
	}

	public void enque(int value) {

		if (!isFull()) {
			rear++;
			arr[rear] = value;
			if (front == -1) {
				front = 0;
			}
		} else {
			System.out.println("Queue is full");
		}

	}

	public void deque() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
		} else if (front == rear) {
			front = -1;
			rear = -1;
		} else {
			front++;
		}
	}

	public void print() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
		} else {
			for (int i = front; i <= rear; i++) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {

		Queue queue = new Queue(5);

		// queue.print();
		queue.enque(10);
		queue.enque(20);
		queue.enque(30);
		queue.enque(40);
		queue.enque(50);

		queue.print();

		queue.deque();
		queue.print();
		queue.deque();
		queue.print();
		queue.deque();
		queue.print();
		queue.deque();
		queue.print();
		queue.enque(100);
		queue.deque();
		queue.print();
		queue.enque(10);
		queue.enque(20);
		queue.enque(30);
		queue.enque(40);
		queue.enque(200);
		queue.enque(300);
		queue.print();

	}

}
