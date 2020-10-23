package com.javaCodeChallenge.arrays;

/**
 * Unique Paths
 * 
 * https://leetcode.com/problems/unique-paths/
 * 
 * @author siddharth
 * @Created Oct 22, 2020
 *
 */
public class ArrayPath {

	public static void main(String[] args) {

		int r = 2, c = 3;
		int[][] matrix = new int[r][c];
		//System.out.println(matrix.length);
		//System.out.println(matrix[2].length);
		//System.out.println(uniquePaths(matrix, 0, 0));
		
		System.out.println(bestSolution(r, c));
	}
	
	static int uniquePaths(int[][] matrix, int i, int j) {
		
		if (isSafe(matrix, i, j)) {
			int bottomCell = uniquePaths(matrix, i+1, j);
			int rightCell = uniquePaths(matrix, i, j+1);
			if(bottomCell ==0 & rightCell == 0) {
				return 1;
			}
			return bottomCell + rightCell;
		}
		return 0;
	}
	
	// Method for checking boundries
    public static boolean isSafe(int matrix[][], int i, int j) {
 
        if (i >= 0 && i < matrix.length
            &&
            j >= 0 && j < matrix[0].length)
            return true;
        return false;
    }
    
    private static int bestSolution(int rw, int clm) {
    	int[][] matrix = new int[rw][clm];
    	
    	for(int i=0; i< rw; i++) {
    		matrix[i][0] = 1;
    	}
    	
    	for(int j=0; j<clm; j++) {
    		matrix[0][j] = 1;
    	}
    	
    	for(int i=1; i< matrix.length; i++) {
    		for(int j=1; j< matrix[i].length; j++) {
    			matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
    		}
    	}
    	
    	
    	return matrix[rw-1][clm-1];
    }

}
