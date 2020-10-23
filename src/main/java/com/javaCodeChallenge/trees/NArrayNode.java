package com.javaCodeChallenge.trees;

/**
 * N Array node. Default children is 3
 * 
 * @author siddharth
 * @Created Oct 19, 2020
 *
 */
public class NArrayNode {

	private int data;
	private NArrayNode[] children;
	private boolean isRoot = false;
	
	public NArrayNode(int value, int size) {
		this.data = value;
		this.children = new NArrayNode[size];
	}
	
	public NArrayNode() {
		this.children = new NArrayNode[3];
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
	 * @return the children
	 */
	public NArrayNode[] getChildren() {
		return children;
	}

	/**
	 * @param children the children to set
	 */
	public void setChildren(NArrayNode[] children) {
		this.children = children;
	}

	/**
	 * @return the isRoot
	 */
	public boolean isRoot() {
		return isRoot;
	}

	/**
	 * @param isRoot the isRoot to set
	 */
	public void setRoot(boolean isRoot) {
		this.isRoot = isRoot;
	}
	
}
