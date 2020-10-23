package com.javaTutorial.coreJava;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.map.PassiveExpiringMap;

public class Test21 {

	public void setVol() throws IOException,FileNotFoundException  {
		System.out.println("Hello Im in Parent ***");
		
		
		Map<String, String> map = new PassiveExpiringMap(30L, TimeUnit.SECONDS);
		
		
	}
}
