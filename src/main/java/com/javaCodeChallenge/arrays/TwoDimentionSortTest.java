package com.javaCodeChallenge.arrays;

import java.util.Arrays;

public class TwoDimentionSortTest {

	public static void main(String[] args) {

		int[][] beforeSort = {{2,3}, {3,6},{2,1},{1,7}};

		Arrays.sort(beforeSort, (a, b) -> ( 
				//a[0] == b[0] ? a[1] - b[1] : a[0] - b[0] // AESC
				a[0] == b[0] ? b[1] - a[1] : b[0] - a[0]	// DESC
				));
		System.out.println(Arrays.deepToString(beforeSort));
	}
}

