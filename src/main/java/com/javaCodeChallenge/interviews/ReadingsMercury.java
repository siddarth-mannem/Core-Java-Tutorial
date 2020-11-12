package com.javaCodeChallenge.interviews;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class ReadingsMercury {

	
	public static void main(String[] args) {

		
	}
	/*
	 * Complete the 'calcMissing' function below.
	 *
	 * The function accepts STRING_ARRAY readings as parameter.
	 */
	public static void calcMissing(List<String> readings) {

		int count = 0;
		List<Double> missingData = new ArrayList<>();
		for(int i =0; i< readings.size(); i++) {
			if(i==0) {
				continue;
			}
			if(count == 20) {
				break;
			}

			if(readings.get(i).contains("Missing_")) {

				if(i == readings.size() - 1) {
					String data = readings.get(i-1);
					if(data.contains("Missing_")) {
						data = readings.get(i-2);
					}
					double prevReading = Double.valueOf(
							data.substring(
									data.lastIndexOf("\t", data.length() -1),
									data.length()
									)
							);
					double beforeAvg = prevReading + 1 + prevReading;
					double avg = Math.round( (1.0 * beforeAvg) / 2 * 10.0 ) / 10.0;
					String currentData = readings.get(i);
					String newData = currentData.replace(
							currentData.substring(currentData.indexOf("Missing_")), 
							String.valueOf(avg));
					readings.set(i, newData);
					//System.out.print(avg + " , ");
					missingData.add(avg);
				} else if( i == 1){
					String data = readings.get(i+1);
					if(data.contains("Missing_")) {
						data = readings.get(i+2);
					}
					double nextReading = Double.valueOf(
							data.substring(
									data.lastIndexOf("\t", data.length() - 1),
									data.length()
									)
							);
					double beforeAvg = nextReading - 1 + nextReading;
					double avg = Math.round( (1.0 * beforeAvg) / 2 * 10.0 ) / 10.0;
					String currentData = readings.get(i);
					String newData = currentData.replace(
							currentData.substring(currentData.indexOf("Missing_")), 
							String.valueOf(avg));
					readings.set(i, newData);
					//System.out.print(avg + " , ");
					missingData.add(avg);
				} else {
					String prevData = readings.get(i-1);
					if(prevData.contains("Missing_")) {
						prevData = readings.get(i-2);
					}
					double prevReading = Double.valueOf(
							prevData.substring(
									prevData.lastIndexOf("\t", prevData.length() - 1),
									prevData.length()
									)
							);
					String nextData = readings.get(i+1);
					if(nextData.contains("Missing_")) {
						nextData = readings.get(i+2);
					}
					double nextReading = Double.valueOf(
							nextData.substring(
									nextData.lastIndexOf("\t", nextData.length() - 1),
									nextData.length()
									)
							);
					double beforeAvg = prevReading + nextReading;
					double avg = Math.round( (1.0 * beforeAvg) / 2 * 10.0 ) / 10.0;
					String currentData = readings.get(i);
					String newData = currentData.replace(
							currentData.substring(currentData.indexOf("Missing_")), 
							String.valueOf(avg));
					readings.set(i, newData);
					//System.out.print(avg + " , ");
					missingData.add(avg);
				}
			}
		}

		missingData.forEach(System.out::println);
	}
}
