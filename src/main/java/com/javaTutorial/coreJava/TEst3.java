package com.javaTutorial.coreJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TEst3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("value : " + (25 % 10) + " & " + (25 / 10)  + "---" + (5 % 10) );
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		String thisLine = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while ((thisLine = br.readLine()) != null) {

			int count = 0;
			int maxNum = Integer.parseInt(thisLine);
			for (int i = 0; i <= maxNum; i++) {
				int j = i;
				while (j > 0) {
					if (j % 10 == 2)
						count++;
					j /= 10;
				}
			}
			System.out.println(count);
		}

	}
}
