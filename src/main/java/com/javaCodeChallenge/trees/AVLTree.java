package com.javaCodeChallenge.trees;

public class AVLTree {
	
	private Node root;
	
	// Default value is 1
	private int threshold = 1;

	public AVLTree(int threshold) {
		this.threshold = threshold;
	}
	
	public AVLTree(int value, int threshold) {
		this.root = new Node(value);
		this.threshold = threshold;
	}

	public AVLTree() {
		
	}
	
	public void insert(int value) {
	    
		if(root == null) {
			root = new Node(value);
		} else {
			insert(value, root);
		}
	}

	public void insert(int value, Node node) {
	    
		if(value < node.getData()) {
			if(node.getLeft() == null) {
				node.setLeft(new Node(value));
			} else {
				insert(value, node.getLeft());
			}
		} else {
			if(node.getRight() == null) {
				node.setRight(new Node(value));
			} else {
				insert(value, node.getRight());
			}
		}
		int balHeight = balancedHeight(node);
		if(Math.abs(balHeight) > getThreshold()) {
			if(balHeight > 1) {					//	A 
											//	  / 	
										//		 B		 BT
				 Node temp = node; 
				 node = node.getLeft();
				 temp.setLeft(node.getRight());
				 node.setRight(temp);
			} else {
				
			}
		}
	}
	
	
	public void insertValues(int[] items) {
		if(items == null || items.length == 0) {
			return;
		}
		//Node root = getRoot() != null ? getRoot() : new Node();
		for(int i = 0; i< items.length; i++) {
			insert(items[i]);
		}
	}
	
	private int balancedHeight(Node node) {
		
		int leftSubTreeHeight = heightUtil(root.getLeft());
		int rightSubTreeHeight = heightUtil(root.getRight());
		return leftSubTreeHeight - rightSubTreeHeight;
	}
	
	private int heightUtil(Node root) {
		if (root == null) {
			return -1;
		}
		int left = heightUtil(root.getLeft());
		int right = heightUtil(root.getRight());

		return Math.max(left, right) + 1;
	}

	/**
	 * @return the root
	 */
	public Node getRoot() {
		return root;
	}

	/**
	 * @param root the root to set
	 */
	public void setRoot(Node root) {
		this.root = root;
	}

	/**
	 * @return the threshold
	 */
	public int getThreshold() {
		return threshold;
	}

	/**
	 * @param threshold the threshold to set
	 */
	public void setThreshold(int threshold) {
		this.threshold = threshold;
	}
	
}
