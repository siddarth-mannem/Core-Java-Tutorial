package com.javaCodeChallenge.linkedList;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {

		Solution solution = new Solution();
		ListNode rootNode = solution.createInput();

		//		ListNode currentNode = rootNode;
		//
		//		while(currentNode != null) {
		//			System.out.println("Node - " + currentNode.val);
		//			currentNode = currentNode.next != null ? currentNode.next: null;
		//		}
		solution.updatedChain(rootNode, 4);
		
		System.out.println("Merge 2 Sorted LinkedList");
		// Merge 2 Sorted LinkedList
		
		ListNode a = new ListNode(1);
		a.next = new ListNode(3);
		a.next.next = new ListNode(5);
		
		ListNode b = new ListNode(2);
		b.next = new ListNode(4);
		b.next.next = new ListNode(7);
		
		ListNode mergedNode = solution.mergeTwoSortedLinkedList(a, b);
		
		while(mergedNode != null) {
			System.out.println(mergedNode.val);
			mergedNode = mergedNode.next;
		}
			
	}
	
	

	public ListNode updatedChain(ListNode head, int k) {

		ListNode finalNodeHead = null;
		ListNode finalRoot = null;
		ListNode finalLastNode = null;

		ListNode previousNode = null;
		List<ListNode> nodesChainList = new ArrayList<>();
		ListNode nodeChainRoot = null;
		ListNode nodeChainLast = null;
		ListNode currentNode = head;
		while(head != null) {
			currentNode = head;
			if(nodeChainLast == null) {
				nodeChainRoot = new ListNode(currentNode.val);
				nodeChainLast = nodeChainRoot;
			} else {
				nodeChainLast = new ListNode(currentNode.val);
				nodeChainLast.next = previousNode;
			}
			previousNode = nodeChainLast;
			if(currentNode.val % k == 0) {

				nodesChainList.add(nodeChainLast);
				nodeChainRoot = null;
				nodeChainLast = null;
				finalRoot = null;
				finalLastNode = null;
			} else {

				if(finalLastNode == null) {
					// Step-2
					finalRoot = currentNode;
					// Step-3
					finalLastNode = currentNode;
				} else {
					// Step-2
					finalLastNode.next = currentNode;
					// Step-3
					finalLastNode = currentNode;
				}
			}
			head = head.next != null ? head.next: null;
		}
		System.out.println("printing nodesChainList: ");
		for(ListNode node : nodesChainList) {
			while(node != null) {
				System.out.println("Node - " + node.val);
				node = node.next != null ? node.next: null;
			}
		}

		System.out.println("Printing finalRoot: ");
		ListNode curNode = finalRoot;
		while(curNode != null) {
			System.out.println("Node - " + curNode.val);
			curNode = curNode.next != null ? curNode.next: null;
		}

		ListNode LastNodeFromList = nodesChainList.get(nodesChainList.size()-1);
		while(LastNodeFromList != null) {
			System.out.println("LastNodeFromList - " + LastNodeFromList.val);
			if(LastNodeFromList.next == null) {
				LastNodeFromList.next = finalRoot;
				break;
			}
			LastNodeFromList = LastNodeFromList.next != null ? LastNodeFromList.next: null;
		}

		System.out.println("After merging: ");
		for(ListNode node : nodesChainList) {
			while(node != null) {
				System.out.println("Node - " + node.val);
				node = node.next != null ? node.next: null;
			}
		}
		System.out.println("convertListToNode");

		finalNodeHead = convertListToNode(nodesChainList);

		while(finalNodeHead != null) {
			System.out.println("finalNodeHead - " + finalNodeHead.val);
			finalNodeHead = finalNodeHead.next != null ? finalNodeHead.next: null;
		}

		return finalNodeHead;
	}

	public ListNode convertListToNode(List<ListNode> nodesList) {

		ListNode root = null;
		ListNode lastNode = null;
		ListNode currentNode;
		int count = 1;
		for(ListNode node : nodesList) {

			while(node != null) {
				// step-1
				currentNode = node;
				if(count==1) {
					// Step-2
					root = currentNode;
					// Step-3
					lastNode = currentNode;
				} else {
					// Step-2
					lastNode.next = currentNode;
					// Step-3
					lastNode = currentNode;
				}
				node = node.next != null ? node.next: null;
				count++;
			}
		}
		return root;
	}

	public ListNode convertListToNode(ListNode node, ListNode finalNodeHead) {

		if(node != null) {
			finalNodeHead = node;
			if(node.next != null) {
				finalNodeHead.next = convertListToNode(node.next, null);
			}
		}
		return finalNodeHead;
	}

	public ListNode createInput() {

		ListNode root = null;
		ListNode lastNode = null;
		ListNode currentNode;
		for(int i=1; i<=6; i++) {

			// step-1
			currentNode = new ListNode(i);
			if(i==1) {
				// Step-2
				root = currentNode;
				// Step-3
				lastNode = currentNode;
			} else {
				// Step-2
				lastNode.next = currentNode;
				// Step-3
				lastNode = currentNode;
			}
		}
		return root;
	}
	
	
	/**
	 * Merched two sorted linked list
	 * @param a
	 * @param b
	 * @return
	 */
	public ListNode mergeTwoSortedLinkedList(ListNode a, ListNode b) {
	       
		ListNode sampleNode = new ListNode(0);
	       
	       // a = [1,3,5]
	       // b = [2,4,7]       
		ListNode finalTail = sampleNode;
	       while(true) {
	           
	           if(a == null) {
	               finalTail = b;
	               break;
	           } 
	           if(b == null) {
	               finalTail = a;
	               break;
	           }
	           if(a.val <= b.val ) {
	               finalTail.next = a;
	               a = a.next;
	           } else {
	               finalTail.next = b;
	               b = b.next;
	           }
	           
	           finalTail = finalTail.next;
	           
	       }
	       
	       return sampleNode.next;
	   }

	//	List<String> names = new ArrayList<>();
	//	String name = "Siddhu";
	//	names.add(name);
	//	System.out.println("Before modifying");
	//	names.forEach(System.out::println);
	//	name = "Gow";//new String("Gow");
	//	System.out.println("After Modifying");
	//	names.forEach(System.out::println);
	//	

	//	List<Cust> names = new ArrayList<>();
	//	Cust cust = new Cust("Siddhu");
	//	names.add(cust);
	//	System.out.println("Before modifying");
	//	names.forEach(System.out::println);
	//	Cust cust2 = new Cust("Gow");
	//	cust = cust2;
	//	System.out.println("After Modifying");
	//	names.forEach(System.out::println);

}
