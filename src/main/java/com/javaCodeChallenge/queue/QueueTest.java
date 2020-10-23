package com.javaCodeChallenge.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Random;

public class QueueTest {

	static final int NUMBERS_LIMIT = 100;
	static final String DIRECTION_SIGN = "Head   -->     Tail \n    |          | \n    |__________| ";
	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter a size of collection : ");
		//Enter data using BufferReader 
        BufferedReader reader = 
                   new BufferedReader(new InputStreamReader(System.in)); 
         
        // Reading data using readLine 
        String num = reader.readLine(); 
        
        // Printing the read line 
        System.out.println(num);
        int i = Integer.valueOf(num);
        
        Random rand = new Random();
        
        Queue queue = new Queue();
        
        System.out.println("Adding numbers: ");
        while(i >= 0) {
        	int value = rand.nextInt(NUMBERS_LIMIT);
        	System.out.print(value + " , ");
        	queue.add(value);
        	i--;
        }
        System.out.println("");
        
        System.out.println("Queue structure *** ");
        System.out.println(DIRECTION_SIGN);
        System.out.println(queue);
        System.out.println("");
        System.out.println("Deleted Data: " + queue.remove());
        System.out.println("Deleted Data: " + queue.remove());
        System.out.println("Deleted Data: " + queue.remove());
        int newNum = rand.nextInt(NUMBERS_LIMIT);
        System.out.println("Added new number " + newNum);
        queue.add(newNum);
        System.out.println(queue);
        
     // Creating an empty LinkedList 
        LinkedList<String> list = new LinkedList<String>(); 
  
        // Using add() method to add elements in the list 
        list.add("Geeks"); 
        list.add("for"); 
        list.add("Geeks"); 
        list.add("10"); 
        list.add("20"); 
  
        // Output the list 
        System.out.println("LinkedList:" + list); 
  
        // Remove the head using remove() 
        String removedNode = list.remove(); 
        System.out.println(removedNode);
        // Print the final list 
        System.out.println("Final LinkedList:" + list);

	}

}
