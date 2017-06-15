package com.javaTutorial.collections.session14;
import java.util.Scanner;


public class Array {

public static void main(String[] args) {

     int[] aa = new int[] {45, 1, 23,4,31,0,0,0};
     int[] bb = new int[] {17, 9,1};
   
     System.out.println("Before merging");
     for (int i = 0; i < aa.length; i++)
           System.out.print(aa[i] + " ");
     
     System.arraycopy(bb, 0, aa, 5, 3);
     System.out.print("After merging ");
     for (int i = 0; i < aa.length; i++)
           System.out.print(aa[i] + " ");


     
   	   
}}