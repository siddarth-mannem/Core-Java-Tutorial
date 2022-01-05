package com.javaCodeChallenge.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3270/
 * 
 * @author padminipaturi
 *
 */
public class FindDisappearedNumsInArray {

	public static void main(String[] args) {
		
		int[] nums = {10,2,5,10,9,1,1,4,3,7}; //{2,2}; //{4,3,2,7,8,2,3,1}; //{1,1}; // 
		
		List<Integer> list = findDisappearedNumbersBestSol(nums);
		list.stream().forEach(System.out::println);
		
	}
	
	/**
	 * Best Solution : https://medium.com/@saurav.agg19/find-all-numbers-disappeared-in-an-array-c6a01393909
	 * 
	 * @param nums
	 * @return
	 */
	public static List<Integer> findDisappearedNumbersBestSol(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }
	
	/**
	 * Input: nums = [4,3,2,7,8,2,3,1]
	 * Output: [5,6]
	 */
	private static List<Integer> findDisappearedNumbers (int[] nums) {
		
		// [1,2,2,3,3,4,7,8]
		//  1,2,3,4,5,6,7,8
		// [1,2,2,3,3,4,7,8]
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		List<Integer> list = new ArrayList<Integer>();
		int n = nums.length;
		for(int i = 1; i<= n; i++) {
			if(nums[i-1] != i) {
				int k=i-1;
				boolean found = false;
				while(!found && k<n) {
					if(i == nums[k])
						found = true;
					else if(i < nums[k])
						break;
					k++;
				}
				if(!found) 
					list.add(i);
			}
		}
		
		return list;
		
	}

}
