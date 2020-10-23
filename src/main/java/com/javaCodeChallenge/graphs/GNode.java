package com.javaCodeChallenge.graphs;

import java.util.LinkedList;

public class GNode {

	private int id;
	
	LinkedList<GNode> adjacentNodes = new LinkedList<>();

	public GNode(int id) {
		super();
		this.id = id;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the adjacentNodes
	 */
	public LinkedList<GNode> getAdjacentNodes() {
		return adjacentNodes;
	}

	/**
	 * @param adjacentNodes the adjacentNodes to set
	 */
	public void setAdjacentNodes(LinkedList<GNode> adjacentNodes) {
		this.adjacentNodes = adjacentNodes;
	}
	
}
