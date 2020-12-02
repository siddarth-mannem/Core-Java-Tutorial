package com.javaCodeChallenge.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * This is a test class for BinaryNode class
 * 
 * @author Siddarth Mannem
 * @Date Dec 1, 2020
 *
 */
public class BinaryNodeTest {

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
		orderedNodes.forEach(k -> {System.out.print(k + ", ");});System.out.println("");
		
		BinaryNode node = rootNode.find(findValue, 1);
		System.out.println("Find a Node with value " + findValue + " : " + node.getData());
		System.out.println("Contains a Node with value " + containsValue + " : " + rootNode.contains(containsValue));
		int randonExistsValue = containsValue + rand.nextInt(numbersLimit - 20);
		System.out.println("Contains a Node with value " + randonExistsValue + " : " + rootNode.contains(randonExistsValue));

	}
	
	public static void insertData(BinaryNode rootNode, int value) {
		rootNode.insert(value);
	}

}
