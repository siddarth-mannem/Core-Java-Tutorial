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
		
		if (value <= node.getData()) {
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
	
	public void printInOrder() {
		printInOrder(root);
	}
	
	// "InOrder" prints in order of LeftNode -> ParentNode -> RightNode
	public void printInOrder(Node node) {
		
		if(node.getLeft() != null) {
			printInOrder(node.getLeft());
		}
		
		System.out.println(node.getData());
		
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
	 * Compare if InOrder LinkedList equals to the Tree.
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
		
		swapNodesFromLevel(level, getRoot());
 	}
	
	public void swapNodesFromLevel(int level, Node node) {
		
		if (node == null) {
			return;
		}
		
		if((level-1) <= 1) {
			Node temp = node.getLeft();
			node.setLeft(node.getRight());
			node.setRight(temp);
			if((node.getLeft() != null && node.getLeft().getLeft() != null) || 
					(node.getRight() != null && node.getRight().getRight() != null)) {
				swapNodesFromLevel(level - 1, node.getLeft());
				swapNodesFromLevel(level - 1, node.getRight());
			}
		} else {
			swapNodesFromLevel(level - 1, node.getLeft());
			swapNodesFromLevel(level - 1, node.getRight());
		}
 	}
	
	/**
	 * Check if Tree is Binary or not
	 * 
	 * https://www.hackerrank.com/challenges/is-binary-search-tree/problem
	 * @param root
	 * @return
	 */
    boolean checkBST() {
        
        if(getRoot() == null) {
            return true;
        }
        
        return checkBSTUtil(getRoot());
    }

    boolean checkBSTUtil(Node root) {
        
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
            if (root.getRight().getData() <= root.getData()) {
                return false;
            }
        }
        
        return checkBSTUtil(root.getLeft()) && checkBSTUtil(root.getRight());
    }
    
    /**
     * Calculate Height a Binary Tree
     * https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem
     * 
     * @return
     */
    public int heightOfTree() {
      	return heightUtil(getRoot());
    }

    static int heightUtil(Node root) {
        if (root == null) {
              return 0;
        }
        int left = heightUtil(root.getLeft());
        int right = heightUtil(root.getRight());

        return Math.max(left, right) + 1;
    }
    
    public void mirrorTree() {
    	mirror(getRoot());
    	
    }
    
    /**
     * Given a Binary Tree, convert it into its mirror
     * 
     * Ref: https://practice.geeksforgeeks.org/problems/mirror-tree/1/?category[]=Tree&category[]=Binary%20Search%20Tree&category[]=Segment-Tree&category[]=Traversal&category[]=Binary%20Indexed%20Tree&category[]=AVL-Tree&company[]=Amazon&page=1&query=category[]Treecategory[]Binary%20Search%20Treecategory[]Segment-Treecategory[]Traversalcategory[]Binary%20Indexed%20Treecategory[]AVL-Treecompany[]Amazonpage1
     * 
     * @param node
     */
    void mirror(Node node) {
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
