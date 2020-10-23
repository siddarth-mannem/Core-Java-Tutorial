package com.javaCodeChallenge.trees;

/**
 * Red and Black Tree implementation
 * 
 * @author siddharth
 * @Created Oct 19, 2020
 *
 */
public class RedBlackTree {

	RBNode root;

	public RedBlackTree(RBNode root) {
		this.root = root;
	}
	
	public RedBlackTree() {
		
	}

	/**
	 * @return the root
	 */
	public RBNode getRoot() {
		return root;
	}

	/**
	 * @param root the root to set
	 */
	public void setRoot(RBNode root) {
		this.root = root;
	}
	
	
}
