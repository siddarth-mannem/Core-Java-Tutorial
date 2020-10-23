package com.javaTutorial.collections.graph;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 
 * @author siddharth
 * @Created Oct 20, 2020
 *
 */
public class Graph {

	private HashMap<Integer, GNode> nodeLookUp = new HashMap<>();
	
	public GNode getNode(int id) {
		return nodeLookUp.get(id);
	}
	
	public void addEdge(int source, int dest) {
		GNode s = getNode(source);
		GNode d = getNode(dest);
		if(s == null) {
			s = new GNode(source); 
			nodeLookUp.put(source, s);
		}
		if(d == null) {
			d = new GNode(dest); 
			nodeLookUp.put(dest, d);
		}
		
		s.getAdjacentNodes().add(d);	
	}
	
	public boolean hasPathDFS(int source, int dest) {
		
		GNode s = getNode(source);
		GNode d = getNode(dest);
		
		HashSet<Integer> visited = new HashSet<>();
		
		return hasPathDFS(s, d, visited);
	}
	
	private boolean hasPathDFS(GNode source, GNode dest, HashSet<Integer> visited) {
	
		
		return false;
	}
	
	
}
