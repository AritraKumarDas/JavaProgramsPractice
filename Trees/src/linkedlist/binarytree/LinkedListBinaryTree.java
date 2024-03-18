package linkedlist.binarytree;
import java.util.Scanner;
import java.util.Deque;
import java.util.Queue;
import java.util.LinkedList;

class Node{
	int data;
	Node left;
	Node right;
	Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class LinkedListBinaryTree {

	Node root = null;

	Deque<Node> deque = new LinkedList<Node>();

	public void insertNode(int k) {
		Node newNode = new Node(k);
		if(root == null) {
			root = newNode;
			deque.addFirst(newNode);
		}else {
			Node node = deque.removeFirst();
			if(node.left == null) {
				node.left = newNode;
				deque.addLast(newNode);
				deque.addFirst(node);
			}else if(node.right == null) {
				node.right = newNode;
				deque.addLast(newNode);
			}
		}

	}

	public void printLevelByLevel() {

		if(root == null) {
			System.out.println("Tree is empty");
			return;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		System.out.print("Binary Tree: ");
		while(!queue.isEmpty()) {
			Node temp = queue.poll();
			System.out.print(temp.data + " ");
			if(temp.left != null) {
				queue.add(temp.left);
			}
			if(temp.right != null) {
				queue.add(temp.right);
			}

		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LinkedListBinaryTree bt = new LinkedListBinaryTree();

		String choice = "A";

		while(!choice.equalsIgnoreCase("S")) {
			System.out.print("Enter tree node value: ");
			bt.insertNode(sc.nextInt());
			sc.nextLine(); // consume the left-over newline character
			bt.printLevelByLevel();
			System.out.print("\nEnter any key other than 'S' to add node to the binary tree: ");
			choice = sc.nextLine();

		}
		sc.close();
	}

}
