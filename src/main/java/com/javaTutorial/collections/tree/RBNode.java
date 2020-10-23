package com.javaTutorial.collections.tree;

/**
 * Red and Black Tree Node
 * 
 * @author siddharth
 * @Created Oct 19, 2020
 *
 */
public class RBNode {

	private int data;
	private String color;
	private Node left, right;
	
	public RBNode(int data, String color) {
		this.data = data;
		this.color = color;
	}
	
	public RBNode(int data) {
		this.data = data;
		this.color = "Red";
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
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
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
