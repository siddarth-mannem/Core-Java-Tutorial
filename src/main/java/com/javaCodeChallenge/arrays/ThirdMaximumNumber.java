package com.javaCodeChallenge.arrays;


/**
 * https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3231/
 * 
 * @author Siddarth Mannem
 *
 */
public class ThirdMaximumNumber {

	public static void main(String[] args) {

		int[] nums =  {2,2,2,1}; // {3,2,1}; // {2,2,3,1};//
		
		System.out.println("Third Max: " + thirdMax(nums));
	}

	public static int thirdMax(int[] arr) {
        int arr_size = arr.length;
		// Find first
        // largest element
        int first = arr[0];
        for (int i = 1;
                 i < arr_size ; i++)
            if (arr[i] > first)
                first = arr[i];

        // Find second
        // largest element
        int second = Integer.MIN_VALUE;
        for (int i = 0;
                 i < arr_size ; i++)
            if (arr[i] >= second &&
                arr[i] < first)
                second = arr[i];

        // Find third
        // largest element
        int third = Integer.MIN_VALUE;
        for (int i = 0;
                 i < arr_size ; i++)
            if (arr[i] >= third &&
                arr[i] < second)
                third = arr[i];
		
		if(third == Integer.MIN_VALUE) {
			return first;
		}
		
		return third;
		
	}
}
