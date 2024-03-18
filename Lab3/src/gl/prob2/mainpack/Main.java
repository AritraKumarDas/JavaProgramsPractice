package gl.prob2.mainpack;

import java.util.Scanner;

import gl.prob2.binarysearchtree.BinarySearchTree;
import gl.prob2.binarysearchtree.Node;
import gl.prob2.pairsum.PairSumUtil;

// Driver class Main
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = { 40, 20, 60, 10, 30, 50, 70 }; // BST Node data taken in an array

		Node root = null; // Initializing BST root with null

		BinarySearchTree bst = new BinarySearchTree(root); // Instance of BST Created

		// Insertion of Nodes in the BST with hard-coded data from Array
		for (int i = 0; i < arr.length; i++) {
			root = bst.insert(root, arr[i]);
		}

		// Input of sum taken through Scanner class to find equivalent Node pairs
		System.out.println("Enter the sum to find equivalent node pairs: ");
		int sum = sc.nextInt();

		PairSumUtil ob = new PairSumUtil(); // PairSumUtil instance created for calling methods

		ob.findPair(root, sum); // findPair method of PairSumUtil class invoked to get the pairs.

		sc.close(); // Scanner resource closed

	}

}
