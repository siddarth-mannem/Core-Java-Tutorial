package com.javaTutorial.coreJava;
import java.util.Scanner;

public class PrimeNumTest {

	public static void main(String args[])
	   {		
		
		int prime=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=scan.nextInt();
		
		for(int i=2;i<n/2;i++){
			if(n%i==0){
				prime=0;
				break;
			}
		}
		if(prime==1){
		 System.out.println("The number you entered is Prime number");
		}
		else{
			System.out.println("The number you entered is not Prime number");
		}
	   }

}
