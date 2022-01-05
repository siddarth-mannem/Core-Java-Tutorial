package com.javaCodeChallenge.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

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
	
	/**
	 * Depth First Search (DFS)
	 * 
	 * @param source
	 * @param dest
	 * @return
	 */
	public boolean hasPathDFS(int source, int dest) {
		
		GNode s = getNode(source);
		GNode d = getNode(dest);
		
		HashSet<Integer> visited = new HashSet<>();
		
		return hasPathDFS(s, d, visited);
	}
	
	
	private boolean hasPathDFS(GNode source, GNode dest, HashSet<Integer> visited) {
	
		if(visited.contains(source.getId())) {
			return false;
		}
		visited.add(source.getId());
		if(source == dest) {
			return true;
		}
		
		for( GNode node: source.getAdjacentNodes()) {
			if(hasPathDFS(node, dest, visited)) {
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * Breadth First Search (BFS)
	 * 
	 * @param source
	 * @param dest
	 * @return
	 */
	private boolean hasPathBFS(GNode source, GNode dest) {
		
		LinkedList<GNode> nextToVisit = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		nextToVisit.add(source);
		while(!nextToVisit.isEmpty()) {
			GNode removedNode = nextToVisit.remove();
			if(removedNode.getId() == dest.getId()) {
				return true;
			}
			if(visited.contains(removedNode.getId())) {
				continue;
			}
			
			visited.add(removedNode.getId());
			for(GNode child: removedNode.getAdjacentNodes()) {
				nextToVisit.add(child);
			}
		}
		return false;
	}
	
}
