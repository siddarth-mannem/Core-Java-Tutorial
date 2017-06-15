package com.javaTutorial.arrays.assignment;

import java.util.Arrays;

public class ArraysMergeAndSort {

	public static void main(String[] args) {
		
		int[] array1 = {76, 89, 43, 47, 0, 23, 25, 0, 55, 0};
		int[] array2 = {3, 7, 9};
		int j=0;
		
		for(int i=0;i<array1.length;i++){
			if( array1[i] == 0 ){
				array1[i] = array2[j];
				j++;
			}
		}
		
		System.out.println("=====Array After Merging======");
		System.out.println(Arrays.toString(array1));
		
		Arrays.sort(array1);
		
		System.out.println("=====Array After Sorting======");

		System.out.println(Arrays.toString(array1));
		
		
			
	}

	}

