package com.javaCodeChallenge.arrays;

/**
 * 
 * Remove Duplicates from Sorted Array
 * 
 * https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3258/
 * @author padminipaturi
 *
 */
public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		
		int[] nums =   {0,0,1,1,1,2,2,3,3,4}; // {1,1,2};//{1,1}; //{1};// {};//
		int newLength = removeDuplicatesSolBest(nums);
		for (int i = 0; i < newLength; i++) {
			System.out.print(nums[i] + " ");
		}
		//System.out.println("After removing Dupes: " + Arrays.toString(nums));
	}
	
	/**
	 * Best Solution from leetcode
	 * 	i=0; j=1	 
	 * 
	 * 	Index ->	 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9
	 * 
	 *  Value ->	[0 , 0 , 1 , 1 , 1 , 2 , 2 , 3 , 3 , 4]
	 *  
	 * Step-1		 i   j
	 * 				[0 , 0 , 1 , 1 , 1 , 2 , 2 , 3 , 3 , 4]
	 * 
	 * Step-2		 i  	 j 
	 * 					 i1	 j2 	 					-> nums[i1] = nums[j2]		
	 * 				[0 , 1 , 1 , 1 , 1 , 2 , 2 , 3 , 3 , 4] 
	 * 
	 * Step-3			 i1      j3
	 * 					 i1      	 j4	
	 * 					 i1      	 	 j5	
	 * 						 i2			 j5				-> nums[i2] = nums[j5]
	 * 				[0 , 1 , 2 , 1 , 1 , 2 , 2 , 3 , 3 , 4]
	 * 
	 * Step-4			 	 i2				 j6
	 * 						 i2				     j7
	 * 							 i3				 j7  	-> nums[i3] = nums[7j]
	 * 				[0 , 1 , 2 , 3 , 1 , 2 , 2 , 3 , 3 , 4]
	 * 
	 * Step-5					 i3				     j8
	 * 							 i3				     	 j9
	 * 							 	 i4				     j9 	-> nums[i4] = nums[j9]
	 * 				[0 , 1 , 2 , 3 , 4 , 2 , 2 , 3 , 3 , 4]
	 * 
	 * Size = i (4) + 1 = 5
	 * 
	 * @param nums
	 * @return
	 */
	public static int removeDuplicatesSolBest(int[] nums) {

		if(nums.length == 0) {
			return 0;
		}
		int i=0;
		
		for(int j=1; j< nums.length; j++) {
			
			if(nums[j] != nums[i]) {
				nums[++i] = nums[j];
			}
		}
		
		return i+1;
	}
	
	public static int removeDuplicatesSol1(int[] nums) {

		if(nums==null || nums.length == 0){
            return 0;
        }
        if(nums.length<3){
			return (nums.length > 1 && nums[0] == nums[1]) ? 1 : nums.length;
		}
        int length = nums.length;
        for(int i=1; i<length; i++) {
			
            if(i>0 && nums[i] == nums[i-1]) {
                int shiftFromElement = i-1;
                while(shiftFromElement < nums.length-1) {
                    nums[shiftFromElement] = nums[shiftFromElement+1];
                    shiftFromElement++;
                }
                length--;
                i--;
            }
        }
		return length;
	}
	
	public static int removeDuplicatesSol2(int[] nums) {
		
		
		if(nums==null || nums.length == 0){
            return 0;
        }
        if(nums.length<3){
			return (nums.length > 1 && nums[0] == nums[1]) ? 1 : nums.length;
		}
        int length = nums.length;
        for(int i=1; i<length; i++) {
			
            if(i>0 && nums[i] == nums[i-1]) {
                int shiftFromElement = i-1;
                while(shiftFromElement < nums.length-1) {
                    nums[shiftFromElement] = nums[shiftFromElement+1];
                    shiftFromElement++;
                }
                length--;
                i--;
            }
        }
		return length;
	}

}
