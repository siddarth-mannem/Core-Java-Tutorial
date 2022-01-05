package com.javaTutorial.collections.linkedList;

import java.util.LinkedList;

public class CustomLinkedListTest {

	public static void main(String[] args) throws NullPointerException {

		LinkedList<String> names = new LinkedList<>();
		
		names.add("Harsha");
		names.add("Siddharth");
		names.add(null);
		names.add("");
		names.add("Java");
		for(String name : names) {
			System.out.println(name);
			if(name == null ) {
				throw new NullPointerException();

			}
		}

		System.out.println("----------------------------------------------");
		
		CustomLinkedList namesList = new CustomLinkedList();
		
		namesList.add("Harsha");
		namesList.add("Siddharth");
		namesList.add(null);
		namesList.add("");
		namesList.add("Java");
		Node findNode = namesList.findNode("Siddharth");
		Node findNextNode = findNode.getNextNode();
		
		System.out.println("Search Node: " + findNode);
		System.out.println("Search NextNode: " + findNextNode.getData());

		/*8
		 * String name = "Harsha"; #153
		 * 
		 * String nextName = name; // 
		 */
	}

}
