package com.javaCodeChallenge.interviews;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

//String input[][] = {
//{Adam,0950},
//{Joe,1230},
//{Joe, 1200},
//{Adam,1410},
//{Joe, 1210},
//{Adam,1400},
//{Bob, 0700},
//{Adam,1345}, 
//{Adam,0945},
//{Adam,1350},
//{Bob,1400}}

//Adam :- [1345, 1350, 1400, 1410]
//Joe :- [1200, 1210, 1230]
public class VisaInterview {

	public static void main(String[] args) throws ParseException {
		
		System.out.println(1 + 2 + "3");
		String input[][] = {
				{"Adam","09:50"},
				{"Joe","12:30"},
				{"Joe","12:00"},
				{"Adam","14:10"},
				{"Joe","12:10"},
				{"Adam","14:00"},
				{"Bob","07:00"},
				{"Adam","13:45"}, 
				{"Adam","09:45"},
				{"Adam","12:30"},
				{"Adam","13:50"},
				{"Bob","14:00"}};
		
		findSuspeciousActivity(input);

	}

	private static Map<String, List<String>> findSuspeciousActivity(String input[][]) throws ParseException {
		
		Map<String, TreeSet<LocalTime>> finalMap = new HashMap<>();
		
		Map<String, List<LocalTime>> resultMap = new HashMap<>();
		
		Map<String, Integer> resultCount = new HashMap<>();
		
		List<LocalTime> capturedTimesList = null;
		
		for(int i = 0; i< input.length; i++) {
			
			TreeSet<LocalTime> dateTreeSet = finalMap.getOrDefault(input[i][0], new TreeSet<LocalTime>());
			dateTreeSet.add(convertToDate(input[i][1]));
			finalMap.put(input[i][0], dateTreeSet);
			
		}
		
		finalMap.entrySet().stream().forEach(e-> { 
			System.out.print(e.getKey() + " - ");
			e.getValue().stream().forEach(date -> {
				System.out.print("\n 	" + date.toString());
			});
			System.out.println("");
		});
		
		for(Map.Entry<String, TreeSet<LocalTime>> map : finalMap.entrySet()) {
			
			LocalTime startTimeInMins = map.getValue().first();
			capturedTimesList = new ArrayList<LocalTime>();
			capturedTimesList.add(startTimeInMins);
			int loginCount = 1;
			for(LocalTime currentLocalTime : map.getValue()) {
				
				if(!startTimeInMins.equals(currentLocalTime)) {
					if((
							toMins(currentLocalTime.getHour(), currentLocalTime.getMinute()) - 
							toMins(startTimeInMins.getHour(), startTimeInMins.getMinute()) < 60
						)
						) {
							loginCount++;
							if(loginCount >= 3) {
								resultCount.put(map.getKey(), resultCount.getOrDefault(map.getKey(), 0) + 1);
								capturedTimesList.add(currentLocalTime);
								resultMap.put(map.getKey(), capturedTimesList);
								capturedTimesList = new ArrayList<>();
								startTimeInMins = currentLocalTime;
								loginCount = 0;
							} else {
								capturedTimesList.add(currentLocalTime);
								continue;
							}
					} else {
						loginCount = 1;
						capturedTimesList = new ArrayList<>();
						capturedTimesList.add(currentLocalTime);
						startTimeInMins = currentLocalTime;
						continue;
					}
				}
			}
		}
		
		resultCount.entrySet().stream().forEach(e-> System.out.println(e));
		resultMap.entrySet().stream().forEach(e-> System.out.println(e));
		return null;
	}
	
	private static int toMins(int hour, int mins) {
//	    String[] hourMin = s.split(":");
//	    int hour = Integer.parseInt(hourMin[0]);
//	    int mins = Integer.parseInt(hourMin[1]);
	    int hoursInMins = hour * 60;
	    return hoursInMins + mins;
	}
	
	private static LocalTime convertToDate(String time) throws ParseException {
		
		//String time = "15:30:18";

//		DateFormat sdf = new SimpleDateFormat("HH:mm");
//		Date date = sdf.parse(time);
		
		LocalTime ltObject3 = LocalTime.parse(time);
		//LocalDateTime t = LocalDateTime.parse( time ).withYear(2021).withMonth(1).withDayOfMonth(1) ;
		return ltObject3;
	}
}
