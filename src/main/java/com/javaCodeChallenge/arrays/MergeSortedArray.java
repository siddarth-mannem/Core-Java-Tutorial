package com.javaCodeChallenge.arrays;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {

		int[] nums1 = {1,3,4,6,7,9,0,0,0};// {7,3,9,4,6,1,0,0,0};//{1,2,3,0,0,0};
		int[] nums2 = {5,9,12};//{12,5,9}; //{2,5,6};
		int m = nums1.length;
		int n = nums2.length;
		mergeSol1(nums1, m, nums2, n);
		System.out.println("M: " + m + " N: " + n + " array: " + Arrays.toString(nums1));
		
	}
	//[1,2,3,0,0,0]
	// [2,5,6]
	public static void mergeSol1(int[] nums1, int m, int[] nums2, int n) {

		//int[] finalArray = new int[m+n];
		int nums1ValPointer = m-n -1;
		int nums2ValPointer = n-1;
		
		int num1FinalPointer = m-1;
		for(int i=m-1; i >=0 && nums2ValPointer >=0 && nums1ValPointer >=0; i--) {

			if(nums1[nums1ValPointer] > nums2[nums2ValPointer]) {
				nums1[num1FinalPointer] = nums1[nums1ValPointer];
				nums1ValPointer--;
			} else if (nums1[nums1ValPointer] < nums2[nums2ValPointer]) {
				nums1[num1FinalPointer] = nums2[nums2ValPointer];
				nums2ValPointer--;
				
			} else {
				nums1[num1FinalPointer] = nums1[nums1ValPointer];
				num1FinalPointer--;
				nums1[num1FinalPointer] = nums2[nums2ValPointer];
				nums1ValPointer--;
				nums2ValPointer--;
			}
			
			num1FinalPointer--;
		}
		Arrays.sort(nums1);
	}
	
	public static void mergeSol2(int[] nums1, int m, int[] nums2, int n) {
		for(int i = 0 ; i < n ; i++)
	        nums1[i + m] = nums2[i];
	    Arrays.sort(nums1);
	}
	

}
