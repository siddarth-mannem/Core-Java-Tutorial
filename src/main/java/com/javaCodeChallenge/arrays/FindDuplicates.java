package com.javaCodeChallenge.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * 442. Find All Duplicates in an Array
 * Ref: https://leetcode.com/problems/find-all-duplicates-in-an-array/
 * 
 * Solution: https://www.youtube.com/watch?v=lYxEdtR5_xQ&list=PLtQWXpf5JNGJagakc_kBtOH5-gd8btjEW&index=2
 * 
 * @author siddharth
 * @Created Oct 23, 2020
 *
 */
public class FindDuplicates {

	public static void main(String[] args) {
	
		int[] nums = {4,3,2,7,8,2,3,1};
		
		
		System.out.println(findDuplicates(nums));
	}
	
	public static List<Integer> findDuplicates(int[] nums) {
        
		List<Integer> duplicatesList = new ArrayList<>();
		
		for(int i =0; i <nums.length; i++) {
			int currentNum = nums[i];
			if(currentNum < 0) {
				currentNum *= -1;
			}
			if(nums[currentNum -1] < 0) {
				duplicatesList.add(currentNum);
				continue;
			}
			nums[currentNum -1] *= -1;
		}
		
		return duplicatesList;
    }

}
