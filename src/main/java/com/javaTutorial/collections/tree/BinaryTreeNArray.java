package com.javaTutorial.collections.tree;

public class BinaryTreeNArray {

	private NArrayNode root;

	public BinaryTreeNArray(int value, int size) {
		root = new NArrayNode(value, size);
	}
	
	public BinaryTreeNArray() {
		
	}
	
	public void insert(int value, int size) {
		if(root == null)  {
			root = new NArrayNode(value, size);
			root.setRoot(true);
			return;
		}
		insert(value, size, root);
	}
	
	public boolean insert(int value, int size, NArrayNode node) {
		
		boolean addedNode = false;
		for(int i = 0; i < node.getChildren().length; i++) {
			NArrayNode child = node.getChildren()[i];
			if(child == null) {
				node.getChildren()[i] = new NArrayNode(value, size);
				return true;
			} else if(child != null) {
				continue;
			}
		}
		if(!addedNode && node.isRoot()) {
			for(int i = 0; i < node.getChildren().length; i++) {
				addedNode = insert( value,  size,  node.getChildren()[i]);
				if (addedNode) {
					return addedNode;
				}
			}
		}
		
		return addedNode;
	}
	
	public void printInOrder() {
		
		printInOrder(getRoot());
		
	}
	
	/**
	 * Inorder traversal of an N-ary Tree
	 * 
	 * Ref: https://www.geeksforgeeks.org/inorder-traversal-of-an-n-ary-tree/
	 * @param node
	 */
	public void printInOrder(NArrayNode node) {
		
		if(node == null) {
			return;
		}
		
		int nodeLength = node.getChildren().length;
		
		for(int i = 0; i < nodeLength -1; i++) {
			printInOrder(node.getChildren()[i]);
		}
		// Print the current node's data 
        System.out.print("" + node.getData() + " "); 
  
        // Last child 
        printInOrder(node.getChildren()[nodeLength - 1]); 
	}
	
	public void printTreeDiagram() {
		StringBuilder buffer = new StringBuilder(50);
		printTreeDiagram(buffer, "", "", getRoot());
		System.out.println(buffer.toString());
	}
	private void printTreeDiagram(StringBuilder buffer, String prefix, String childrenPrefix, NArrayNode node) {
        buffer.append(prefix);
        buffer.append(node.getData());
        buffer.append('\n');
        
        
        for(int i = 0; i < node.getChildren().length; i++) {
        	if(node.getChildren()[i] != null) {
        		//buffer.append(prefix + "│   ");
        		printTreeDiagram(buffer, childrenPrefix + "├── ", childrenPrefix + "│   ", node.getChildren()[i]);
        		
        	}
		}
    }
	
	/**
	 * @return the root
	 */
	public NArrayNode getRoot() {
		return root;
	}

	/**
	 * @param root the root to set
	 */
	public void setRoot(NArrayNode root) {
		this.root = root;
	}
	
	
}
