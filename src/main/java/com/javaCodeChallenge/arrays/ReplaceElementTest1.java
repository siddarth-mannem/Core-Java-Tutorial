package com.javaCodeChallenge.arrays;

import java.util.Arrays;

/**
 * Replace Elements with Greatest Element on Right Side
 *
 * https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3259/
 */
public class ReplaceElementTest1 {

	public static void main(String[] args) {

		int[] arr = {17,18,5,4,6,1};
		
		int[] arr2 = replaceElements(arr);
		System.out.println(Arrays.toString(arr2));
	}

	/**
	 * Best Solution
	 * Iterate from back and replace Max element every time.
	 */
	public static int[] replaceElements(int[] arr) {

		int max = -1;
		for(int i=arr.length-1; i>= 0; i--) {

			int tmp = arr[i];
			arr[i] = max;
			max = Math.max(max, tmp);
		}

		return arr;
	}

	public static int[] replaceElementsMySol(int[] arr) {


		for(int i=0; i< arr.length-1; i++) {

			int greatNum =arr[i+1];
			int k =i+1;
			while(k<arr.length) {
				if(greatNum < arr[k]) {
					greatNum = arr[k];
				}
				k++;
			}
			arr[i] = greatNum;
		}
		arr[arr.length -1] = -1;
		return arr;
	}

}
