package com.gl.prob2;

public class Driver {
	

	public static void main(String[] args) {
		
		int[] arr = {50,30,60,10,55};

		Node root = null;

		BinarySearchTree bst = new BinarySearchTree();

		for(int i=0; i< arr.length; i++) {
			root = bst.insert(root, arr[i]);
		}
		
		System.out.println("----- Before Coversion of Binary Search Tree ----- ");
		System.out.println("Root Node = " + root.data);
		bst.printLevelByLevel(root);
		
		RightSkewedTree rst = new RightSkewedTree();
		root = rst.convertToRightSkewed(root);
		
		System.out.println("\n\n----- After conversion to Right Skewed Tree ----- ");
		System.out.println("Root Node = " + root.data);
		bst.printLevelByLevel(root);

	}

}
