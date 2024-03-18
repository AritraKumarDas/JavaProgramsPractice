package gl.prob2.binarysearchtree;

public class BinarySearchTree {

	Node root; // Root node of Binary Search Tree

	// Constructor method of Binary Search Tree Class
	public BinarySearchTree(Node root) { 
		this.root = root;
	}

	// Node insert method in BST
	public Node insert(Node root, int k) { 
		Node newNode = new Node(k);
		if (root == null) {
			root = newNode;
			this.root = root; // Updating root data member of the class
			return root;
		}

		Node parent = null;
		Node temp = root;
		while (temp != null) {
			parent = temp;
			if (temp.data == k) {
				System.out.println("Node " + k + " already exists");
				return root;
			} else if (k < temp.data) {
				temp = temp.left;
			} else {
				temp = temp.right;
			}
		}

		if (k < parent.data) {
			parent.left = newNode;
		} else if (k > parent.data) {
			parent.right = newNode;
		}
		this.root = root; // Updating root data member of the class before returning
		return root;
	}

}
