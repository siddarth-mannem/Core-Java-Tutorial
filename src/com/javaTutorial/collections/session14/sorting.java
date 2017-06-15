package com.javaTutorial.collections.session14;

public class sorting{
	public static void main(String[] args)
	{
   int aa[]=new int[] {45, 1, 23, 4, 31, 17, 9, 1};
   int[] sort = new int[aa.length];
   int temp;
   for (int i = 0; i < aa.length -1; i++)
    {
       if (aa[i] >= aa[i + 1]) {
           temp = aa[i];
           aa[i] = aa[i + 1];
           aa[i + 1] = temp;
           sort = aa;
    } }	
 for (int i = 0; i < sort.length; i++)
  System.out.print(sort[i]+ " ");
    }
    }