package com.javaTutorial.collections.queue;

/**
 * 
 * @author siddharth
 * @Created Oct 19, 2020
 *
 */
public class Queue {

	private QNode head;
	private QNode tail;
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void add(int data) {
		
		QNode newNode = new QNode(data);
		if(isEmpty()) {
			head = newNode;
			tail = newNode;
			return;
		}
		tail.setNext(newNode);
		this.tail = tail.getNext();
		
	}
	
	public int remove() {
		if(head == null) {
			return 0;
		}
		int deletedData = head.getData();
		head = head.getNext();		
		return deletedData; 
	}

	public int peak() {
		return head.getData();
	}
	
	public void printQueue() {
		printQueue(head);
	}
	private void printQueue(QNode node) {
		if(node == null) {
			return;
		}
		System.out.print(node.getData() + " --> ");
		printQueue(node.getNext());
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(getClass().getSimpleName() + " ");
		print(head, sb);
		return sb.toString();
	}
	
	private void print(QNode node, StringBuilder sb) {
		if(node == null) {
			return;
		}
		sb.append(node.getData() + " --> ");
		print(node.getNext(), sb);
		
		
	}
	
}
