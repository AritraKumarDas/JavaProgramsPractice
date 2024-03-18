package binarysearchtree;
import java.util.Scanner;


class BSTNode{
	int data;
	BSTNode left;
	BSTNode right;

	BSTNode(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class BinarySearchTree {

	BSTNode root;

	BinarySearchTree(BSTNode root){
		this.root = root;
	}

	public BSTNode insert(BSTNode root, int k) {
		BSTNode newNode = new BSTNode(k);
		if (root == null){
			root = newNode;
			this.root = root;     // bst root in constructor
			return root;
		}

		BSTNode parent = null;
		BSTNode temp = root;
		while(temp!=null) {
			parent = temp;
			if(temp.data == k) {
				System.out.println("Node " + k + " already exists");
				return root;
			}
			else if(k < temp.data) {
				temp = temp.left;
			}else {
				temp = temp.right;
			}
		}

		if(k < parent.data) {
			parent.left = newNode;
		}else if(k > parent.data) {
			parent.right = newNode;
		}
		this.root = root;   // bst root in constructor
		return root;
	}

	public void inorder(BSTNode root) {

		if(root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}

	public void preorder(BSTNode root) {

		if(root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}

	public void postorder(BSTNode root) {

		if(root == null) {
			return;
		}

		preorder(root.left);
		preorder(root.right);
		System.out.print(root.data + " ");
	}
	
	public BSTNode searchRecursiveInBST(BSTNode root, int k) {
		
		if(root == null || root.data == k) {
			return root;
		}
		
		if(k < root.data) {
			 return searchRecursiveInBST(root.left, k);
		}else {
			 return searchRecursiveInBST(root.right, k);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {5,18,3,89,45,70,56,68,45,20};

		BSTNode root = null;

		BinarySearchTree bst = new BinarySearchTree(root);

		for(int i=0; i< arr.length; i++) {
			root = bst.insert(root, arr[i]);
		}
		System.out.println("IN ORDER TRAVERSAL => ");
		bst.inorder(root);

//		System.out.println("\nPRE ORDER TRAVERSAL => ");
//		bst.preorder(root);
//		
//		System.out.println("\nPOST ORDER TRAVERSAL => ");
//		bst.postorder(root);
		
		System.out.println("\nEnter Item to search: ");
		int k = sc.nextInt();
		BSTNode searchResultNode = bst.searchRecursiveInBST(root, k);
		
		if(searchResultNode != null) {
			
			System.out.println("Node found");
		}else {
			System.out.println("Node not found in BST!");
		}



		//		System.out.println("\nRoot = " + bst.root.data);




	}

}
