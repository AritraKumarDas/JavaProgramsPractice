package com.gl.prob2;

public class RightSkewedTree {
	Node headNode ;
	Node prevNode;
	
	public RightSkewedTree() {
		headNode = null;
		prevNode = null;
	}
	
	public Node convertToRightSkewed(Node root) {
		
		if(root==null) {
			return null;
		}
		
		convertToRightSkewed(root.left);
		
		if(headNode==null) {
			headNode=root;
			root.left=null;
			prevNode=root;
		}else {
			prevNode.right=root;
			root.left=null;
			prevNode=root;
		}
		
		convertToRightSkewed(root.right);
		
		return headNode;
	}
	

}
