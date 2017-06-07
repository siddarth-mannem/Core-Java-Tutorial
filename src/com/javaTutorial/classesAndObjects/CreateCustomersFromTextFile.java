package com.javaTutorial.classesAndObjects;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CreateCustomersFromTextFile {

	public static void main(String[] args) {

		FileInputStream fileStream;
		FileWriter writer = null;
		BufferedWriter bw = null;
		
		try {
			fileStream = new FileInputStream("/Users/siddarth/Documents/workspace/CoreJavaTut/bin/com/javaTutorial/classesAndObjects/sample.txt");
			InputStreamReader inputStremReader = new InputStreamReader(fileStream);
			BufferedReader br = new BufferedReader(inputStremReader);	
			
			Customer customer = null;
			ArrayList<Customer> customerList = new ArrayList<>();
			
			String nextLine = "";
			nextLine = br.readLine();
		    System.out.println("Before While loop: " + nextLine);

			while (nextLine != null) {
				
				customer = new Customer();
				
				customer.setFirstName(br.readLine());
				customer.setLastName(br.readLine());
				
				customer.setAge( Integer.valueOf(br.readLine()) );
				customer.setZip(Integer.valueOf(br.readLine()) );
				customer.setHeight( Double.valueOf(br.readLine()) );
				customer.setWeight(Double.valueOf(br.readLine()));
				
			    nextLine = br.readLine();
			    System.out.println("After setting CUstomer" + nextLine);
			    
			    customerList.add(customer);
			    
			    break;

			}

			System.out.println("--------------------After Setting Values to customerList, printing in loop");
			for (Customer cust: customerList) {
				
				System.out.println("First Name: " + cust.getFirstName());
				System.out.println("LastName: " + cust.getLastName());
				System.out.println("Weight: " + cust.getWeight());
			}

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {

				if (bw != null)
					bw.close();

				if (writer != null)
					writer.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
		
	}

}
