package com.javaCodeChallenge.trees;

/**
 * 
 * @author siddharth
 * @Created Oct 17, 2020
 *
 */
public class Node {

	private int data;
	private Node left, right;
	
	public Node(int value) {
		this.data = value;
	}
	
	public Node() {

	}

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * @return the left
	 */
	public Node getLeft() {
		return left;
	}

	/**
	 * @param left the left to set
	 */
	public void setLeft(Node left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public Node getRight() {
		return right;
	}

	/**
	 * @param right the right to set
	 */
	public void setRight(Node right) {
		this.right = right;
	}
	
}
