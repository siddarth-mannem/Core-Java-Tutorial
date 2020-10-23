package com.javaCodeChallenge.arrays;

import java.util.HashSet;
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
}
