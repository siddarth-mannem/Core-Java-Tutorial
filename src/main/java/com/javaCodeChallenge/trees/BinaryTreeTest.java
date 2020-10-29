package com.javaCodeChallenge.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BinaryTreeTest {

	public static void main(String[] args) {

		List<Integer> inputData = new ArrayList<>();
		int numbersLimit = 50;
		System.out.println("Adding randon 10 numbers between 1 - 1000 : ");
		Random rand = new Random();
		
		BinaryNode rootNode = new BinaryNode(rand.nextInt(numbersLimit));
		System.out.println(rootNode.getData());
		inputData.add(rootNode.getData());
		int i = 9;
		int findValue = 0;
		int containsValue = 0;
		while(i > 0) {
			int value = rand.nextInt(numbersLimit);
			inputData.add(value);
			System.out.println(value);
			insertData(rootNode, value);
			if(i == 5) {
				findValue = value;
			}
			if(i == 3) {
				containsValue = value;
			}
			i--;
			
		}
		
		System.out.println("Binary Tree1 InOrder print *** ");
		List<Integer> orderedNodes = rootNode.collectInOrder();
		orderedNodes.forEach(System.out::println);
		
		BinaryNode node = rootNode.find(findValue, 1);
		System.out.println("Find a Node with value " + findValue + " : " + node.getData());
		System.out.println("Contains a Node with value " + containsValue + " : " + rootNode.contains(containsValue));
		int randonExistsValue = containsValue + rand.nextInt(numbersLimit - 20);
		System.out.println("Contains a Node with value " + randonExistsValue + " : " + rootNode.contains(randonExistsValue));
		
		System.out.println("----------------------------------");
		BinaryTree tree2 = new BinaryTree();
		inputData.add(10);
		for(Integer value: inputData) {
			tree2.insert(value.intValue());
		}
		
		System.out.println("Binary Tree2 InOrder print *** ");
		tree2.printInOrder();
		
		Node nodeFromTree2 = tree2.find(findValue, 1);
		System.out.println("Find a Node with value " + findValue + " : " + nodeFromTree2.getData());
		System.out.println("Contains a Node with value " + containsValue + " : " + tree2.contains(containsValue));
		System.out.println("Contains a Node with value " + randonExistsValue + " : " + tree2.contains(randonExistsValue));
		
		System.out.println("----------------------------------");
		System.out.println("Is Tree1 equals to Tree2  ? " + tree2.compareTree(orderedNodes));
		
		System.out.println("Is Tree2 Binary format  ? " + tree2.checkBST());
		
		System.out.println("Swap Nodes at Kth Level ----------------------------------");
		
		BinaryTree tree3 = new BinaryTree();
		 
		for(int k = 0; k< inputData.size(); k++) {
			tree3.insert(inputData.get(k));
			if(k == 10) {
				break;
			}
		}
		
		tree3.swapNodesFromLevel(2);
		System.out.println("Print inorder after swapping : ");
		tree3.collectInOrder().forEach(System.out::println);
		System.out.println("---------------Tree top view-----------------");
		//tree3.printTree();
		tree3.print();
		
		tree3.printNodesAtLevel(5);
		
	}
	
	public static void insertData(BinaryNode rootNode, int value) {
		rootNode.insert(value);
	}
}
