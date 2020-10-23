package com.javaTutorial.collections.linkedList;

public class Node {
	
	private String data;
	Node nextNode;
	Node previousNode;
	private String name = null;

	
	public Node() {
		
	}
	
	public Node(String name) {
		this.name = name;
	}
	
	public Node(String data, Node nextNode) {
		
		this.data = data;
		this.nextNode = nextNode;
	}
	
	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}
	
	/**
	 * @return the nextNode
	 */
	public Node getNextNode() {
		return nextNode;
	}
	/**
	 * @param nextNode the nextNode to set
	 */
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	/**
	 * @return the previousNode
	 */
	public Node getPreviousNode() {
		return previousNode;
	}

	/**
	 * @param previousNode the previousNode to set
	 */
	public void setPreviousNode(Node previousNode) {
		this.previousNode = previousNode;
	}

	public String toString() {
		return "Data: " + this.data;
	}
	
}
