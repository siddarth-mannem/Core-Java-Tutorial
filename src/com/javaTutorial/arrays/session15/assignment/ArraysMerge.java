package com.javaTutorial.arrays.session15.assignment;

import java.util.Arrays;

public class ArraysMerge {

	public static void main(String[] args) {
		int[] array1 = {12,0,9,23,0,0,0};
		int[] array2 = {45,27,35,31};
		int j=0;
		
		for(int i=0; i<array1.length; i++){
			if(array1[i]==0){
				array1[i]=array2[j];
				j++;
			}
			
		}
		
		System.out.println("--------After Merging Arrays and Before Sorting--------");
		for(int i=0;i<array1.length;i++){
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		System.out.println("------After Sorting--------");
		
		Arrays.sort(array1);
		
		for(int i=0;i<array1.length;i++){
			System.out.print(array1[i] + " ");
		}
		
	}

}
