package com.javaCodeChallenge.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 79. Word Search
 * 
 * Ref: https://leetcode.com/problems/word-search/
 * 
 * @author siddharth
 * @Created Oct 23, 2020
 *
 */
public class WordSearch {

	public static void main(String[] args) {
		
//		char[][] board = {{'a'}};
//		String word = "a";
				
//		char[][] board = {
//				{'A','B','C','E'},
//				{'S','F','C','S'},
//				{'A','D','E','E'}};
//		String word = "ABCCED";
		
		char[][] board = {
				{'A','B','C','E'},
				{'S','F','E','S'},
				{'A','D','E','E'}};
		
		String word = "ABCESEEEFS";
//		
//		char[][] board = {
//				{'a','a','a','a'},
//				{'a','a','a','a'},
//				{'a','a','a','a'}};
//		String word = "aaaaaaaaaaaaa";
		System.out.println(exist(board, word));
	}
	
	/**
	 * Solution-1
	 * 
	 * @param board
	 * @param word
	 * @return
	 */
	public static boolean exist(char[][] board, String word) {
		
		if(word == null || word.trim() == "") {
			return false;
		}
		
		Set<String> cellCheck = null;
		for(int i=0; i< board.length; i++) {
    		for(int j=0; j< board[i].length; j++) {
    			if(board[i][j] == word.charAt(0)) {
    				cellCheck = new HashSet<>();
    				if(charFoundAtCell(cellCheck, board, word, 0, i, j)) {
    					return true;
    				}
    			}
    		}
    	}
		return false;
    } 
	
	private static boolean charFoundAtCell(Set<String> cellCheck, char[][] board, String word, int wordIndex, int i, int j) {
    	
		if(wordIndex == word.length() && cellCheck.size() <= (board.length * board[0].length)) {
			
			return true;
		}
		
		String cell = i + "" + j;
    	if(isSafe(board, i, j) && !cellCheck.contains(cell) && word.charAt(wordIndex) == board[i][j]) {
    		
    		cellCheck.add(cell);
			if(charFoundAtCell(cellCheck, board, word, wordIndex + 1, i, j+1)) {
				return true;
			}
			if(charFoundAtCell(cellCheck, board, word, wordIndex + 1, i, j-1)) {
				return true;
			}
			if(charFoundAtCell(cellCheck, board, word, wordIndex + 1, i-1, j)) {
				return true;
			}
			if(charFoundAtCell(cellCheck, board, word, wordIndex + 1, i+1, j) ) {
				return true;
			}
			cellCheck.remove(cell);
    	}
		
		return false;
	}
	
	private static boolean isSafe(char board[][], int i, int j) {
		 
        if (i >= 0 && i < board.length
            &&
            j >= 0 && j < board[0].length)
            return true;
        return false;
    }
	
	/**
	 * Solution-2
	 * 
	 * @param word
	 * @param board
	 * @return
	 */
	private static boolean exists(String word, char[][] board) {


		if(word == null || word == "") {
			return false;
		}
		List<String> foundCells = new ArrayList<>();

		char[] foundWordChars = word.toCharArray();


		for(int k=0; k< foundWordChars.length; k++) {
			boolean resetLoop = false;

			for(int i=0; i< board.length; i++) {
				for(int j=0; j< board[i].length; j++) {
					
					if(foundCells.contains(i + "" + j)) {
						continue;
					}
					char letter = board[i][j];
					
					if(letter == foundWordChars[k]) {
						foundCells.add(i + "" + j);
						resetLoop = true;
					}
					if(resetLoop) {
						break;
					}
				}
				if(resetLoop) {
					break;
				}
			}

		}

		StringBuilder fondWordSb = new StringBuilder("");

		for(String s : foundCells) {
			//System.out.println("s: " + s);
			//System.out.println("Words Found from board: " + board[Integer.valueOf(s.substring(0,1))][Integer.valueOf(s.substring(1))]);
			fondWordSb.append(board[Integer.valueOf(s.substring(0,1))][Integer.valueOf(s.substring(1))]);
		}

		if(fondWordSb.toString().equals(word)) {
			return true;
		}
		return false;
	}

}
