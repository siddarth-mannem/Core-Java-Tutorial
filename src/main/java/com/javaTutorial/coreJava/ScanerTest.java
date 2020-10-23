package com.javaTutorial.coreJava;
import java.util.Scanner;

public class ScanerTest {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
/*		System.out.println("Please enter your name: ");
		String name = scanner.nextLine();
		
		System.out.println("Welcome " + name);
		
		System.out.println("Whats your zip Code ? " );
		
		int zip = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Your Zip code is " + zip);*/
		

        //Creating Scanner instance to scan scanner for User input
        //Scanner scanner = new Scanner(System.in);
        
        
    
        System.out.println("System is ready to accept input, please enter name : ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", Can you enter an int number now?");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("You have entered : " + number);
        
        for(int i=1; i<=4; i++) {// 1,2,3, 4<=4
        	System.out.println("Please enter city- " + i + " : ");
        	String city = scanner.nextLine();
        	System.out.println("Hello " + name + ", Welcome to " + city);
        }
        
        System.out.println("Thank you");
        
        
        
        
/*        System.out.println("Please enter ints here with spaces :");
        
        int x = scanner.nextInt();
        System.out.println("Given Ints -- " + x + "," + scanner.nextInt() + ", " + scanner.nextInt());
        //scanner.nextLine();
        
        System.out.println(scanner.nextInt() + ", " + scanner.nextInt() + ", " + scanner.nextInt() + ", " + scanner.nextInt());*/
        
        
	}

}
