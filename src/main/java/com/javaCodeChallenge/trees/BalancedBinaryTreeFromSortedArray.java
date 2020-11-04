package com.javaCodeChallenge.trees;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Balanced Binary tree from a given sorted arrays
 * 
 * Ref: https://www.youtube.com/watch?v=PZYTs9y4f4o
 * 
 * @author siddharth
 * @Created Nov 2, 2020
 *
 */
public class BalancedBinaryTreeFromSortedArray {
	
	private Node root;

	/**
	 * Creates a balanced binary tree using sorted array
	 * @param nums
	 */
	public void sortedArray(int[] nums) {
		
		if(nums == null || nums.length == 0) {
			return;
		}
		this.root = constructTree(nums, 0, nums.length-1);
	}
	//[2, 9, 10, 16, 21, 21, 27, 27, 40, 41, 47]
	private Node constructTree(int[] nums, int leftIndex, int rightIndex) {
		if(leftIndex > rightIndex) {
			return null;
		}
		
		int mid = leftIndex + (rightIndex - leftIndex) / 2;
		Node currentNode = new Node(nums[mid]);
		Node currentLeftChildNode = constructTree(nums, leftIndex, mid-1);
		Node currentRightChildNode = constructTree(nums, mid+1, rightIndex);
		currentNode.setLeft(currentLeftChildNode);
		currentNode.setRight(currentRightChildNode);
		
		return currentNode;
	}
	
	/**
	 * Check is tree is balanced or not
	 * 
	 * Ref: https://www.youtube.com/watch?v=zu22twD5QI4
	 * 
	 * @return
	 */
	public boolean isBalancedTree() {
		
		return isBalancedTree(getRoot());
	}
	
	private boolean isBalancedTree(Node node) {
		
		if(node == null) {
			return true;
		}
		
		return Math.abs(height(node.getLeft()) - height(node.getRight())) < 2 
				&& isBalancedTree(node.getLeft()) 
				&& isBalancedTree(node.getRight());
		
	}
	
	private int height(Node node) {
		
		if(node == null) return -1;
		int height = 1+ Math.max(height(node.getLeft()), height(node.getRight()));
		
		return height;
	}
	
	/**
	 * Check if tree is balanced binary tree or not
	 * 
	 * Ref: https://www.youtube.com/watch?v=zu22twD5QI4
	 * 
	 * @return
	 */
	public boolean isBalancedBinaryTree() {
		
		return isBalancedBinaryTree(getRoot());
	}
	
	private boolean isBalancedBinaryTree(Node node) {
		
		if(node == null) {
			return true;
		}
		
		return Math.abs(height(node.getLeft()) - height(node.getRight())) < 2 
				&& isBalancedBinaryTree(node.getLeft()) 
				&& isBalancedBinaryTree(node.getRight())
				&& checkBSTUtil(node);
		
	}
	
	/**
	 * Check if Tree is Binary or not
	 * 
	 * https://www.hackerrank.com/challenges/is-binary-search-tree/problem
	 * @param root
	 * @return
	 */
	private boolean checkBSTUtil(Node root) {

		if(root == null) {
			return true;
		}
		if (root.getData() < 0 || root.getData() > 1000) {
			return false;
		}
		if(root.getLeft() != null) {
			if( root.getLeft().getData() > root.getData()) {
				return false;
			}
		}

		if(root.getRight() != null) {
			if (root.getRight().getData() < root.getData()) {
				return false;
			}
		}

		return checkBSTUtil(root.getLeft()) && checkBSTUtil(root.getRight());
	}
	
	/**
	 * It prints entire Tree in a hierarchy tree structure
	 * 
	 */
	public void print() {

		print(getRoot());
	}

	private void print(Node root)
	{
		List<List<String>> lines = new ArrayList<List<String>>();

		List<Node> level = new ArrayList<Node>();
		List<Node> next = new ArrayList<Node>();

		level.add(root);
		int nn = 1;

		int widest = 0;

		while (nn != 0) {
			List<String> line = new ArrayList<String>();

			nn = 0;

			for (Node n : level) {
				if (n == null) {
					line.add(null);

					next.add(null);
					next.add(null);
				} else {
					String aa = String.valueOf(n.getData());
					line.add(aa);
					if (aa.length() > widest) widest = aa.length();

					next.add(n.getLeft());
					next.add(n.getRight());


					if (n.getLeft() != null) nn++;
					if (n.getRight() != null) nn++;
				}
			}

			if (widest % 2 == 1) widest++;

			lines.add(line);

			List<Node> tmp = level;
			level = next;
			next = tmp;
			next.clear();
		}

		int perpiece = lines.get(lines.size() - 1).size() * (widest + 4);
		for (int i = 0; i < lines.size(); i++) {
			List<String> line = lines.get(i);
			int hpw = (int) Math.floor(perpiece / 2f) - 1;

			if (i > 0) {
				for (int j = 0; j < line.size(); j++) {

					// split node
					char c = ' ';
					if (j % 2 == 1) {
						if (line.get(j - 1) != null) {
							c = (line.get(j) != null) ? '┴' : '┘';
						} else {
							if (j < line.size() && line.get(j) != null) c = '└';
						}
					}
					System.out.print(c);

					// lines and spaces
					if (line.get(j) == null) {
						for (int k = 0; k < perpiece - 1; k++) {
							System.out.print(" ");
						}
					} else {

						for (int k = 0; k < hpw; k++) {
							System.out.print(j % 2 == 0 ? " " : "─");
						}
						System.out.print(j % 2 == 0 ? "┌" : "┐");
						for (int k = 0; k < hpw; k++) {
							System.out.print(j % 2 == 0 ? "─" : " ");
						}
					}
				}
				System.out.println();
			}

			// print line of numbers
			for (int j = 0; j < line.size(); j++) {

				String f = line.get(j);
				if (f == null) f = "";
				int gap1 = (int) Math.ceil(perpiece / 2f - f.length() / 2f);
				int gap2 = (int) Math.floor(perpiece / 2f - f.length() / 2f);

				// a number
				for (int k = 0; k < gap1; k++) {
					System.out.print(" ");
				}
				System.out.print(f);
				for (int k = 0; k < gap2; k++) {
					System.out.print(" ");
				}
			}
			System.out.println();

			perpiece /= 2;
		}
	}

	/**
	 * @return the root
	 */
	public Node getRoot() {
		return root;
	}

	/**
	 * @param root the root to set
	 */
	public void setRoot(Node root) {
		this.root = root;
	}
	
	
}
