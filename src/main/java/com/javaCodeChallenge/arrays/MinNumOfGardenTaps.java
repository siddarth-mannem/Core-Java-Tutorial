package com.javaCodeChallenge.arrays;

import java.util.Arrays;

/**
 * Q: https://leetcode.com/problems/minimum-number-of-taps-to-open-to-water-a-garden/submissions/
 * 
 * @author siddarth
 *
 */
public class MinNumOfGardenTaps {

	public static void main(String[] args) {

		// Input: n = 7, ranges = [1,2,1,0,2,1,0,1]
		// Output: 3
		int n = 7;
		int[] ranges = {1,2,1,0,2,1,0,1};
		System.out.println("Total Taps: " + minTaps(n, ranges));
	}

	public static int minTaps(int n, int[] ranges) {

		int[][] rar = new int[ranges.length][2];

		for(int i =0; i< ranges.length; i++) {

			rar[i][0] = (i-ranges[i]) >= 0 ? i-ranges[i]  : 0;
			rar[i][1] = (i+ranges[i]) <= n ? i+ranges[i]  : n;
		}   //[[0, 1], [0, 3], [1, 3], [3, 3], [2, 6], [4, 6], [6, 6], [6, 7]] 
		System.out.println("Before Sort : " + Arrays.deepToString(rar));
		Arrays.sort(rar, (a,b) -> (a[0] == b[0] ? a[1] - b[1] : a[0] - b[0] ));
		//[[0, 1], [0, 3], [1, 3], [2, 6], [3, 3], [4, 6], [6, 6], [6, 7]]
		System.out.println("After Sort : " + Arrays.deepToString(rar));
		int layerEnd = 0;
		int totalTapCount = 0;
		while(layerEnd != n) {
			int maxReach = -1;
			for(int i=0; i< rar.length && rar[i][0] <= layerEnd; i++) {
				maxReach = Math.max(maxReach, rar[i][1]);

			}
			if(maxReach == -1 || maxReach == layerEnd ) {
				return -1;
			}
			System.out.println("from: " + layerEnd + " To: " + maxReach);
			totalTapCount++;
			layerEnd = maxReach;
		}

		return totalTapCount;

	}

}
