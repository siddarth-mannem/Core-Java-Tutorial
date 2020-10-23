package com.javaCodeChallenge.trees;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author siddharth
 * @Created Oct 16, 2020
 * 
 * This Node is 
 *
 */
public class BinaryNode {

	BinaryNode left, right;
	
	int data;
	
	public BinaryNode(int value) {
		this.data = value;
	}
	
	public BinaryNode() {

	}

	public void insert(int value) {
		
		if (value <= data) {
			if(left == null) {
				left = new BinaryNode(value);
			} else {
				left.insert(value);
			}
		} else {
			if( right == null) {
				right = new BinaryNode(value);
			} else {
				right.insert(value);
			}
		}
	}
	
	public boolean contains(int value) {
		return find(value, 1) != null ? Boolean.TRUE : Boolean.FALSE;
	}
	
	public BinaryNode find(int value, int totalIterations) {
		
		if(value == data) { 
			System.out.println("Iterations: " + totalIterations);
			return this;
		} else if(value < data) {
			if (left == null) {
				return null;
			} else 
				return left.find(value, ++totalIterations);
		} else {
			if (right == null) {
				return null;
			} else 
				return right.find(value, ++totalIterations);
		}
	}
	
	public int findHeight() {
		int height = 0;
					
		return height;
	}
	
	public List<Integer> collectInOrder() {
		
		List<Integer> orderedItems = new ArrayList<>();
		
		printInOrder(orderedItems, this);
		return orderedItems;
	}
	
	// "InOrder" prints in order of LeftNode -> ParentNode -> RightNode
	public void printInOrder(List<Integer> orderedItems, BinaryNode node) {
		
		if(node.left != null) {
			printInOrder(orderedItems, node.left);
		} 
		orderedItems.add(data);
		
		if(node.right != null) {
			printInOrder(orderedItems, node.right);
		}
		
	}

	/**
	 * @return the left
	 */
	public BinaryNode getLeft() {
		return left;
	}

	/**
	 * @param left the left to set
	 */
	public void setLeft(BinaryNode left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public BinaryNode getRight() {
		return right;
	}

	/**
	 * @param right the right to set
	 */
	public void setRight(BinaryNode right) {
		this.right = right;
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
	
	
}
