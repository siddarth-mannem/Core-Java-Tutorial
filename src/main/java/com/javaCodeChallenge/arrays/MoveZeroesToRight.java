package com.javaCodeChallenge.arrays;

import java.util.Arrays;

/**
 * 
 * https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3157/
 * 
 * @author Siddarth Mannem
 *
 */
public class MoveZeroesToRight {

	public static void main(String[] args) {
		
		int[] nums =   {0,0,1,2,0,3,4,0};
		moveZeroes(nums);
		System.out.println(Arrays.toString((nums)));
	}
	public static void moveZeroes(int[] nums) {
        // [0,1,0,3,12]
        //Arrays.sort(nums);
        int writePointer = 0;
        for(int readPointer = 0; readPointer< nums.length; readPointer++) {
            if(nums[readPointer] != 0) {
                nums[writePointer++] = nums[readPointer];
            }
            //System.out.println("count : " + writePointer + " | " + Arrays.toString(nums));
        }
        while (writePointer < nums.length)
            nums[writePointer++] = 0;
    }
	

}
