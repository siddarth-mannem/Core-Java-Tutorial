package com.javaCodeChallenge.interviews;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {


		char[][] board = {
				{'A', 'B', 'C', 'X'},
				{'D', 'E', 'F', 'A'},
				{'D', 'E', 'F', 'S'}
		};

		System.out.println(" Rows: " + board.length + " \n Columns: " + board[0].length);

		String word = "SAAEEBX";

		System.out.println("Exists: " + exists(word, board));
	}

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
			System.out.println("s: " + s);
			//System.out.println("Words Found from board: " + board[Integer.valueOf(s.substring(0,1))][Integer.valueOf(s.substring(1))]);
			fondWordSb.append(board[Integer.valueOf(s.substring(0,1))][Integer.valueOf(s.substring(1))]);
		}

		if(fondWordSb.toString().equals(word)) {
			return true;
		}
		return false;
	}

}
