package com.javaTutorial.collections.queue;

/**
 * 
 * @author siddharth
 * @Created Oct 19, 2020
 *
 */
public class QNode {
	
	private int data;
	private QNode next;
	
	public QNode(int value) {
		this.data = value;
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
	 * @return the next
	 */
	public QNode getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(QNode next) {
		this.next = next;
	}

}
