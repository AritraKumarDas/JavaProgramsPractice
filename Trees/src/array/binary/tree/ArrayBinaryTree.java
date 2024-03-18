package array.binary.tree;

import java.util.Scanner;

public class ArrayBinaryTree {

	int size;
	int[] arr;

	public ArrayBinaryTree(int size) {
		this.size = size;
		this.arr = new int[size + 1];
	}

	public void insertNodes() {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= size; i++) {
			System.out.println("Enter Node " + i + ": ");
			arr[i] = sc.nextInt();
			printNodes(i);
		}
		sc.close();
	}

	public void printNodes(int i) {
		System.out.print("Current Tree Structure: ");
		for (int j = 1; j <= i; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array Binary Tree: ");

		int size = sc.nextInt();
		ArrayBinaryTree abt = new ArrayBinaryTree(size);
		abt.insertNodes();

		sc.close();
	}
}
