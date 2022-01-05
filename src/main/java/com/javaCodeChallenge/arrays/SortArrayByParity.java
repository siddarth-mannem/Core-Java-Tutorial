package com.javaCodeChallenge.arrays;

import java.util.Arrays;

/**
 * https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3260/
 * @author Siddarth Mannem
 *
 */
public class SortArrayByParity {

	public static void main(String[] args) {

		int[] nums =   {3,1,2,4};
		sortArrayByParity(nums);
		System.out.println(Arrays.toString((nums)));

	}

	/**
	 * Best Solution
	 * 
	 * @param nums
	 * @return
	 */
	public static int[] sortArrayByParity(int[] nums) {

		int i =0;
		int j =0;

		while(i < nums.length){

			if(nums[i] % 2 == 1){
				i++;
			}else{
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;

				i++;
				j++;

			}
			
			System.out.println(Arrays.toString(nums));

		}

		return nums;

	}

	/**
	 * My Solution
	 * 
	 * @param nums
	 * @return
	 */
	public int[] sortArrayByParityMySol(int[] nums) {

		// [3,1,2,4]
		int writePointer = 0;
		int[] oddArray = new int[nums.length];
		int oddArrayWritePointer = 0;
		for(int readPointer = 0; readPointer< nums.length; readPointer++) {
			if(nums[readPointer] % 2 == 0) {
				nums[writePointer++] = nums[readPointer];
			} else {
				oddArray[oddArrayWritePointer++] = nums[readPointer];
			}
			//System.out.println("count : " + writePointer + " | " + Arrays.toString(nums));
		}
		oddArrayWritePointer = 0;
		while (writePointer < nums.length)
			nums[writePointer++] = oddArray[oddArrayWritePointer++];

		return nums;
	}

}
