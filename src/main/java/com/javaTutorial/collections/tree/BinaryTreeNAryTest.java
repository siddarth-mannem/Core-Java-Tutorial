package com.javaTutorial.collections.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BinaryTreeNAryTest {

	public static void main(String[] args) {

		List<Integer> inputData = new ArrayList<>();
		int numbersLimit = 50;
		System.out.println("Adding randon 10 numbers between 1 - 1000 : ");
		Random rand = new Random();

		int i = 20;
		while(i > 0) {
			int value = rand.nextInt(numbersLimit);
			System.out.print(value + " ");
			inputData.add(value);
			i--;
		}

		BinaryTreeNArray tree2 = new BinaryTreeNArray();
		
		for(Integer value: inputData) {
			tree2.insert(value.intValue(), 3);
		}
		
		System.out.println("Binary N-Ary Tree InOrder print *** ");
		tree2.printInOrder();
		System.out.println("");
		tree2.printTreeDiagram();
		
	}
	
	public static void insertData(BinaryNode rootNode, int value) {
		rootNode.insert(value);
	}
}
