package com.javaCodeChallenge.arrays;

/**
 * 
 * Ex: https://leetcode.com/problems/valid-mountain-array/
 * 
 * 
 * 
 * @author Siddarth Mannem
 *
 */
public class ValidMountainArrayTest {

	public static void main(String[] args) {
		

	}
	
	//
	/**
	 * Best Sol: https://www.youtube.com/watch?v=Wg7oi8D2OoQ
	 * Concept: 2 pointer logic. OPne from 0 and other from last index 
	 * @param arr
	 * @return
	 */
	public static boolean validMountainArrayBestSol(int[] arr) {
		
		if(arr.length <3) {
			return false;
		}
		// [0,1,2,3,4,5,6,7,8,1]
		// [0,1,2,3,4,5,6,7,8,9]
		
		int l=0, r= arr.length-1;
		
		while(l+1 < arr.length -1 && arr[l] < arr[l+1]) {	
			l++;
		}
		System.out.println("l : " + l);
		
		while ( r - 1 > 0 && arr[r] < arr[r-1]) {
			r--;
		}
		System.out.println("r : " + r);
		return l == r;
	}

	/**
	 * My Solution
	 * @param arr
	 * @return
	 */
	public static boolean validMountainArray(int[] arr) {
        
        //[0,1,2,3,4,5,6,7,8,9]
        // [1,3,2]
        if(arr.length<3) {
            return false;
        }
        boolean hasPeak = false;
        for (int i=1; i< arr.length-1; i++) {
            
            if(arr[i] == arr[i-1] || arr[i] == arr[i+1]) 
                return false;
            // UpStream
            else if(!hasPeak) {
                if(arr[i] < arr[i-1] ||  (arr[i] < arr[i+1] && i == arr.length-2)) {
                    return false;
                }
                if(arr[i] > arr[i+1]) {
                    
                    hasPeak = true;
                }
            
            // DownStream
            } else {
                if(arr[i] > arr[i-1] || arr[i] < arr[i+1]) {
                    return false;
                }
                
            }
        }
        
        return true;
    }
}
