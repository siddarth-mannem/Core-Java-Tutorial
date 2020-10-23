package com.javaTutorial.classesAndObjects;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class FileReaderWriterTest {

	public static void main(String[] args) {

		/*URL url = FileReaderWriterTest.class.getResource("java.txt"); //new File("java.txt");
		System.out.println("URL: " + url); */
		FileInputStream fielStream;
		FileWriter writer = null;
		BufferedWriter bw = null;
		
		try {
			fielStream = new FileInputStream("/Users/siddarth/Documents/workspace/CoreJavaTut/bin/com/javaTutorial/classesAndObjects/java.txt");
			InputStreamReader inputStremReader = new InputStreamReader(fielStream);
			BufferedReader br = new BufferedReader(inputStremReader);	
			
			while (br.readLine() != null) {
			    System.out.println(br.readLine());
			}

			
			File fileToWrite = new File("/Users/siddarth/Documents/workspace/CoreJavaTut/bin/com/javaTutorial/classesAndObjects/sample.txt");
			
			System.out.println(fileToWrite.getAbsolutePath());
			
			writer = new FileWriter(fileToWrite);
			bw = new BufferedWriter(writer);
			bw.write("Hellooooo..............");
			
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
