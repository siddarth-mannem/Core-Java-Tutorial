package com.javaCodeChallenge.arrays;

/**
 * https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3228/
 * 
 * @author Siddarth Mannem
 *
 */
public class HeightChecker {

	public static void main(String[] args) {
		
		int[] nums =   {1,1,4,2,1,3};
		int misMatchCount = heightChecker(nums);
		System.out.println(misMatchCount);
	}
	
	public static int heightChecker(int[] heights) {
        
        int[] sortedArray = new int[heights.length];
        
        int count = 0;
        sortedArray[0] = heights[0];
        
        for(int i=1; i< heights.length; i++) {
            sortedArray[i] = heights[i];
            //System.out.println("Next Element : " + sortedArray[i]);
            for(int j=i; j>0; j--) {
                
                if(sortedArray[j] < sortedArray[j-1]) {
                    int tmp = sortedArray[j-1];
                    sortedArray[j-1] = sortedArray[j];
                    sortedArray[j] = tmp;
                } else {
                    break;
                }
            }
            // System.out.println(Arrays.toString(sortedArray));
        }
        
        for(int i = 0; i < sortedArray.length; i++) {
            if(sortedArray[i] != heights[i]) {
                    count++;
                }
        }
        
        return count;
    }

}
