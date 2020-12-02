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
	
	public void insertValues(int[] items) {
		if(items == null || items.length == 0) {
			return;
		}
		for(int i = 0; i< items.length; i++) {
			insert(items[i]);
		}
	}
	
	public void insert(int value) {
	    
		if(getRoot() == null) {
			this.root = new Node(value);
		} else {
			this.root = insert(value, getRoot());
			System.out.println("");
		}
	}

	/**
	 *  //			A 
		//		  / 	
		//		 B		 B(temp)
		// 		  \
		//		   C
	 * @param value
	 * @param node
	 * @return
	 */
	public Node insert(int value, Node node) {
	    
		if(value < node.getData()) {
			if(node.getLeft() == null) {
				node.setLeft(new Node(value));
			} else {
				node.setLeft(insert(value, node.getLeft()));
			}
		} else {
			if(node.getRight() == null) {
				node.setRight(new Node(value));
			} else {
				node.setRight(insert(value, node.getRight()));
			}
		}
		int balHeight = balancedHeight(node);
		if(Math.abs(balHeight) > getThreshold()) {
			if(balHeight > 1) {

				// Check for left rotation
				if(node.getLeft() != null && node.getLeft().getLeft() == null && node.getLeft().getRight() != null ) {
					Node temp = node.getLeft();
					node.setLeft(node.getLeft().getRight());
					temp.setRight(null);
					node.getLeft().setLeft(temp);
				}
				
				// Right Rotate
				Node temp = node;
				node = node.getLeft();
				temp.setLeft(node.getRight());
				node.setRight(temp);
				
			} else {
				// Check for right rotation
				if(node.getRight() != null && node.getRight().getRight() == null && node.getRight().getLeft() != null ) {
					Node temp = node.getRight();
					node.setRight(node.getRight().getLeft());
					temp.setLeft(null);
					node.getRight().setRight(temp);
				}
				
				// Left Rotate
				Node temp = node;
				node = node.getRight();
				temp.setRight(node.getLeft());
				node.setLeft(temp);
			}
		}
		
		return node;
	}

	private int balancedHeight(Node node) {
		
		int leftSubTreeHeight = heightUtil(node.getLeft());
		int rightSubTreeHeight = heightUtil(node.getRight());
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
	 * It prints entire Tree in a hierarchy tree structure
	 * 
	 */
	public void print() {

		TreeUtil.print(getRoot());
	}


	/**
	 * @return the root
	 */
	public Node getRoot() {
		return this.root;
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
