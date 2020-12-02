package com.javaCodeChallenge.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * 
 * @author siddharth
 * @Created Oct 16, 2020
 * 
 * This Binary Tree
 *
 */
public class BinaryTree {

	Node root;

	public BinaryTree(int value) {
		this.root = new Node(value);
	}

	public BinaryTree() {

	}

	public void insert(int value) {

		if(root == null) {
			root = new Node(value);
		} else {
			insert(value, root);
		}
	}

	public void insert(int value, Node node) {

		if (value < node.getData()) {
			if(node.getLeft() == null) {
				node.setLeft(new Node(value));
			} else {
				insert(value, node.getLeft());
			}
		} else {
			if( node.getRight() == null) {
				node.setRight(new Node(value));
			} else {
				insert(value, node.getRight());
			}
		}
	}

	public boolean contains(int value) {
		return find(value, 1) != null ? Boolean.TRUE : Boolean.FALSE;
	}

	public Node find(int value, int totalIterations) {
		return find(value, totalIterations, root);
	}

	private Node find(int value, int totalIterations, Node node ) {

		if(value == node.getData()) { 
			System.out.println("Iterations: " + totalIterations);
			return node;
		} else if(value < node.getData()) {
			if (node.getLeft() == null) {
				return null;
			} else 
				return find(value, ++totalIterations, node.getLeft());
		} else {
			if (node.getRight() == null) {
				return null;
			} else 
				return find(value, ++totalIterations, node.getRight());
		}
	}


	// "InOrder" prints in order of LeftNode -> ParentNode -> RightNode
	public void printInOrder() {
		printInOrder(root);
		System.out.println("");
	}

	private void printInOrder(Node node) {

		if(node.getLeft() != null) {
			printInOrder(node.getLeft());
		}

		System.out.print(node.getData() + ", ");

		if(node.getRight() != null) {
			printInOrder(node.getRight());
		}
	}
	
	// "PreOrder" prints in order of ParentNode -> LeftNode -> RightNode
	public void printPreOrder() {
		printPreOrder(root);
		System.out.println("");
	}
	private void printPreOrder(Node node) {

		System.out.print(node.getData() + ", ");

		if(node.getLeft() != null) {
			printInOrder(node.getLeft());
		}

		if(node.getRight() != null) {
			printInOrder(node.getRight());
		}
	}

	// "InOrder" prints in order of LeftNode -> ParentNode -> RightNode
	public List<Integer> collectInOrder() {

		List<Integer> orderedItems = new ArrayList<>();

		collectInOrder(orderedItems, getRoot());
		return orderedItems;
	}

	private void collectInOrder(List<Integer> orderedItems, Node node) {

		if(node.getLeft() != null) {
			collectInOrder(orderedItems, node.getLeft());
		} 
		orderedItems.add(node.getData());

		if(node.getRight() != null) {
			collectInOrder(orderedItems, node.getRight());
		}

	}

	/**
	 * Q: Compare if InOrder LinkedList equals to the Tree. OR
	 * Q: How to compare 2 trees.
	 * 
	 * Solution: 
	 * 		1)	convert Tree1 to InOrder List
	 * 		2)	Traverse Tree2 also in InOrder.
	 * 		3)	Now compare first Element of Tree2 node data with Tree1 InOrder list first element.
	 * 		4)	return false if two element's data is not matching
	 *		5)	IF matches then delete the Tree1 List first element and repeat the step 2,3,4 through recursive method
	 * 
	 * @param inOrderedList
	 * @return
	 */
	public boolean compareTree(List<Integer> inOrderedList) {

		return compareTree(inOrderedList, this.getRoot());

	}

	public boolean compareTree(List<Integer> inOrderedList, Node node) {

		if(node.getLeft() != null) {
			return compareTree(inOrderedList, node.getLeft());
		}

		if(!inOrderedList.get(0).equals(node.getData())) {
			return false;
		} else {  
			inOrderedList.remove(0);
		}

		if(node.getRight() != null) {
			return compareTree(inOrderedList, node.getRight());
		}

		return true;
	}

	/**
	 * Swap Nodes in Binary tree of every k’th level
	 * https://www.geeksforgeeks.org/swap-nodes-binary-tree-every-kth-level/
	 * 
	 * @param level
	 */
	public void swapNodesFromLevel(int level) {

		swapNodesFromLevel(1, level, getRoot());
	}

	public void swapNodesFromLevel(int currentLevel, int swapFromLevel, Node node) {

		if (node == null) {
			return;
		}

		if(currentLevel >= swapFromLevel) {
			Node temp = node.getLeft();
			node.setLeft(node.getRight());
			node.setRight(temp);
			if((node.getLeft() != null && node.getLeft().getLeft() != null) || 
					(node.getRight() != null && node.getRight().getRight() != null)) {
				swapNodesFromLevel(currentLevel + 1, swapFromLevel, node.getLeft());
				swapNodesFromLevel(currentLevel + 1, swapFromLevel, node.getRight());
			}
		} else {
			swapNodesFromLevel(currentLevel + 1, swapFromLevel, node.getLeft());
			swapNodesFromLevel(currentLevel + 1, swapFromLevel, node.getRight());
		}
	}

	/**
	 * Check if Tree is Binary or not
	 * 
	 * https://www.hackerrank.com/challenges/is-binary-search-tree/problem
	 * @param root
	 * @return
	 */
	public boolean isBinarySearchTree() {

		if(getRoot() == null) {
			return true;
		}

		return checkBSTUtil(getRoot());
	}

	private boolean checkBSTUtil(Node root) {

		if(root == null) {
			return true;
		}
		if (root.getData() < 0 || root.getData() > 1000) {
			return false;
		}
		if(root.getLeft() != null) {
			if( root.getLeft().getData() >= root.getData()) {
				return false;
			}
		}

		if(root.getRight() != null) {
			if (root.getRight().getData() < root.getData()) {
				return false;
			}
		}
		
		boolean isBst = checkBSTUtil(root.getLeft()) && checkBSTUtil(root.getRight());
		//System.out.println(isBst ? "Yes" : "No");

		return isBst;
	}

	/**
	 * Calculate Height a Binary Tree
	 * Def: The height of a binary tree is the number of edges between the tree's root and its furthest leaf
	 * https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem
	 * 
	 * @return
	 */
	public int heightOfTree() {
		return heightUtil(getRoot());
	}

	private int heightUtil(Node root) {
		if (root == null) {
			return -1;
		}
		int left = heightUtil(root.getLeft());
		int right = heightUtil(root.getRight());

		return Math.max(left, right) + 1;
	}


	/**
	 * Given a Binary Tree, convert it into its mirror
	 * 
	 * Ref: https://practice.geeksforgeeks.org/problems/mirror-tree/1/?category[]=Tree&category[]=Binary%20Search%20Tree&category[]=Segment-Tree&category[]=Traversal&category[]=Binary%20Indexed%20Tree&category[]=AVL-Tree&company[]=Amazon&page=1&query=category[]Treecategory[]Binary%20Search%20Treecategory[]Segment-Treecategory[]Traversalcategory[]Binary%20Indexed%20Treecategory[]AVL-Treecompany[]Amazonpage1
	 * 
	 * @param node
	 */
	public void mirrorTree() {
		mirror(getRoot());

	}

	private void mirror(Node node) {
		if(node != null) {
			mirror(node.getLeft());
			mirror(node.getRight());
			Node temp;
			temp = node.getLeft();
			node.setLeft(node.getRight());
			node.setRight(temp);
		}
	}

	/**
	 * DFS
	 * Ascending order of Nodes at Kth Level of a Tree
	 * 
	 * @param level
	 * @param nodesToVisit
	 * @param sortedNodeValues
	 */
	public void printNodesAtLevel(int level) {

		Queue<Node> nodesToVisit = new LinkedList<Node>();
		nodesToVisit.add(getRoot());

		Set<Integer> sortedNodeValues = new TreeSet<>((Integer i, Integer j) -> {return i-j;});
		printNodesAtLevel(level, nodesToVisit, sortedNodeValues);
		System.out.println("Sorted Node values at Level " + level + " : " + sortedNodeValues);
	}

	private void printNodesAtLevel(int level, Queue<Node> nodesToVisit, Set<Integer> sortedNodeValues) {

		Node node = nodesToVisit.poll();

		if(level == 1) {
			sortedNodeValues.add(node.getData());
			return;
		}

		if(level > 1) {
			if(node.getLeft() != null) {
				nodesToVisit.add(node.getLeft());
				printNodesAtLevel(level - 1, nodesToVisit, sortedNodeValues);
			}

			if(node.getRight() != null) {
				nodesToVisit.add(node.getRight());
				printNodesAtLevel(level - 1, nodesToVisit, sortedNodeValues);
			}
		}
	}

	/**
	 * 
	 * Binary Search Tree to Greater Sum Tree
	 * 
	 * Ref: https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
	 * 		https://www.geeksforgeeks.org/transform-bst-sum-tree/
	 * 
	 * @param root
	 * @return
	 */
	public void bstToGst() {

		createNode(getRoot(), new Sum());
	}

	private void createNode(Node node, Sum sum) {

		if(node == null) {
			return;
		}
		createNode(node.getRight(), sum); 

		sum.sum = sum.sum + node.getData();

		node.setData(sum.sum - node.getData());

		createNode(node.getLeft(), sum);

	}
	
	/**
	 * 
	 * Binary Search Tree to Greater Sum Tree by creating new instance of binary tree.
	 * Note: Same as above bstToGst() except with new instance of binary tree.
	 * 
	 * Ref: https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
	 * 		https://www.geeksforgeeks.org/transform-bst-sum-tree/
	 * 
	 * @param root
	 * @return
	 */
	public BinaryTree bstToGst1() {

		Node newRootNode = createNode1(getRoot(), new Sum());
		BinaryTree newGstTree = new BinaryTree();
		newGstTree.setRoot(newRootNode);
		return newGstTree;
	}
	
	private Node createNode1(Node node, Sum sum) {
		
		
		Node currentNode = new Node();
		
		// 40
		Node rightNode = null;
		// RightNode // null
		if(node.getRight() != null) {
			rightNode = createNode1(node.getRight(), sum); 
		}
		
		// When node 40 -> sum = 40 and newCurrentNode = sum - 40
		sum.sum = sum.sum + node.getData();
		
		currentNode.setData(sum.sum - node.getData());
		
		// LeftNode // 35
		Node leftNode = null;
		if(node.getLeft() != null) {
			leftNode = createNode1(node.getLeft(), sum);
		}
		
		currentNode.setRight(rightNode);
		currentNode.setLeft(leftNode);

		return currentNode;
    }
	
	/**
	 * Q: Balance a Binary Search Tree
	 * Convert existing binary tree to balanced Binary Tree by sorting list of nodes. That means O(n)
	 * 
	 * Ref: https://leetcode.com/problems/balance-a-binary-search-tree/
	 */
	public void balanceBinaryTree() {
		
		List<Integer> inputNums = collectInOrder();
		if(inputNums == null) {
			return;
		}
		this.root = balanceBinaryTree(inputNums, 0, inputNums.size()-1);
	}

	private Node balanceBinaryTree(List<Integer> inputNums, int leftIndex, int rightIndex) {
		
		if(leftIndex > rightIndex) {
			return null;
		}
		
		int mid = leftIndex + (rightIndex - leftIndex) / 2;
		Node currentNode = new Node(inputNums.get(mid));
		Node currentLeftNode = balanceBinaryTree(inputNums, leftIndex, mid -1);
		Node currentRightNode = balanceBinaryTree(inputNums, mid + 1, rightIndex);
		currentNode.setLeft(currentLeftNode);
		currentNode.setRight(currentRightNode);
		return currentNode;		
	}
	
	/**
	 * Q: Self Balance a Binary Search Tree OR
	 * Q: Convert existing binary tree to balanced Binary Tree with out sorted list of nodes. That means O(log(n)) OR
	 * Q: AVL Tree (Adelson-Velsky and Landis)
	 * 
	 * Ref: https://leetcode.com/problems/balance-a-binary-search-tree/
	 * 		https://www.youtube.com/watch?v=vRwi_UcZGjU
	 * 
	 */
	private void balanceBinaryTree2() {
		
	}
	
	
	public void insertAVL(int[] items, int threshold) {
	    
	}
	
	/**
	 * Check is tree is balanced binary tree or not
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
		
		return Math.abs(heightUtil(node.getLeft()) - heightUtil(node.getRight())) < 2 
				&& isBalancedBinaryTree(node.getLeft()) 
				&& isBalancedBinaryTree(node.getRight())
				&& checkBSTUtil(node);
		
	}

	public void printTreeDiagram() {
		StringBuilder buffer = new StringBuilder(50);
		printTreeDiagram(buffer, "", "", getRoot());
		System.out.println(buffer.toString());
	}
	private void printTreeDiagram(StringBuilder buffer, String prefix, String childrenPrefix, Node node) {
		buffer.append(prefix);
		buffer.append(node.getData());
		buffer.append('\n');

		if(node.getLeft() != null) {
			printTreeDiagram(buffer, childrenPrefix + "├── ", childrenPrefix + "│   ", node.getLeft());
		}
		if(node.getRight() != null) {
			printTreeDiagram(buffer, childrenPrefix + "├── ", childrenPrefix + "│   ", node.getRight());
		}
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

	public void printTree() {
		topView(getRoot());
	}


	// function should print the topView of 
	// the binary tree 
	private void topView(Node root) { 
		class QueueObj { 
			Node node;
			int hd; 

			QueueObj(Node node, int hd) { 
				this.node = node; 
				this.hd = hd; 
			} 
		} 
		Queue<QueueObj> q = new LinkedList<QueueObj>(); 
		Map<Integer, Node> topViewMap = new TreeMap<Integer, Node>(); 

		if (root == null) { 
			return; 
		} else { 
			q.add(new QueueObj(root, 0)); 
		} 

		System.out.println("The top view of the tree is : "); 

		// count function returns 1 if the container  
		// contains an element whose key is equivalent  
		// to hd, or returns zero otherwise. 
		while (!q.isEmpty()) { 
			QueueObj tmpNode = q.poll(); 
			if (!topViewMap.containsKey(tmpNode.hd)) { 
				topViewMap.put(tmpNode.hd, tmpNode.node); 
			} 

			if (tmpNode.node.getLeft() != null) { 
				q.add(new QueueObj(tmpNode.node.getLeft(), tmpNode.hd - 1)); 
			} 
			if (tmpNode.node.getRight() != null) { 
				q.add(new QueueObj(tmpNode.node.getRight(), tmpNode.hd + 1)); 
			} 

		} 
		for (Entry<Integer, Node> entry : topViewMap.entrySet()) { 
			System.out.print(entry.getValue().getData()); 
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


	public class Sum { 
		int sum = 0; 
	} 

}
