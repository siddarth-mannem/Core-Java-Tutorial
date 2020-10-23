package com.javaTutorial.collections.linkedList;

public class CustomLinkedList {
	
	Node previousNode;
	Node root; // Head Node
	int size;
	
	public CustomLinkedList() {
		
		root = new Node();
		size = 0;
	}
	
	public CustomLinkedList(int size) {
		this.size = size;
	}

	public void add1(String data) {
		//Sid
		
		System.out.println("In add() and data is: " + data);
		Node currentNode = this.root;
				
		while(currentNode != null) {
			
			Node checkForAnotherNode = currentNode.getNextNode();
			Node node = new Node(data, null); // First time value is Harsha inserted
			//Second value is Siddarth
			if(currentNode.getPreviousNode() == null ) { // First Node or Root node
				this.root = node;
				return;
			} else if(checkForAnotherNode == null) {
					checkForAnotherNode = node;
					checkForAnotherNode.setPreviousNode(currentNode);
			}
			
			currentNode = currentNode.getNextNode();
			this.size++;

		}
				
		
	}
	
	
	public void add(String data) {
		System.out.println("In add() and data is: " + data);
		Node newNode = new Node(data, root);
		this.root = newNode;
		this.size++;
		return;
		
	}
	
	public Node findNode(String data) {
		System.out.println("-----------------------------------------------");
		System.out.println("In FindNode() ***");
		
		Node searchCurrentNode = this.root;
		int count =1;
		
		while(searchCurrentNode != null) {
			System.out.println("Loop: " + count + " and searchCurrentNode Data: " + searchCurrentNode.getData());
			if(searchCurrentNode.getData() != null && searchCurrentNode.getData().equals(data)) {
				return searchCurrentNode;
			}
			searchCurrentNode = searchCurrentNode.getNextNode(); // Reassigning currentNode to nextNode
			count++;
		}
		return null;
		
	}
	
}
