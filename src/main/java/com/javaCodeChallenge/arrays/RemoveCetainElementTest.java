package com.javaCodeChallenge.arrays;

import java.util.Arrays;

/**
 * https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3575/
 * 
 * @author Siddarth Mannem
 *
 */
public class RemoveCetainElementTest {

	public static void main(String[] args) {

		int[] nums =   {0,1,2,2,3,0,4,2}; 
		System.out.println("Copy of Array " + Arrays.toString(Arrays.copyOf(nums, nums.length)));
		int numToRemove = 2;
		int length = removeElementBestSolution(nums, numToRemove);
		
		System.out.println(Arrays.toString(nums));
		for(int i =0; i< length; i++) {
			System.out.print(nums[i] + " , ");
		}

	}

	public static int removeElementBestSolution(int[] nums, int val) {

		// nums = [3,2,2,3], val = 3
		int writePointer =0;

		for(int readPointer = 0; readPointer< nums.length; readPointer++) {

			if(nums[readPointer] != val) {
				int temp = nums[writePointer];
				nums[writePointer] = nums[readPointer];
				nums[readPointer] = temp;
				writePointer++;
			}
		}
		
		
		return writePointer;

	}

	public static int removeElement(int[] nums, int val) {

		// [3,2,2,3] val = 3
		//modify(nums,  val, 0);
		int length = nums.length;
		for(int k = 0; k< length; k++) {

			if(nums[k] == val) {
				nums[k] = nums[length -1];
				length--;
				k--;
			}
			//             System.out.println("Len: " + length);

			//             for(int i=0; i< length; i++) {
			//                 System.out.print(i + " -> " + nums[i] + " | ");
			//             }
			//System.out.println("");

		}
		return length;
	}

}
