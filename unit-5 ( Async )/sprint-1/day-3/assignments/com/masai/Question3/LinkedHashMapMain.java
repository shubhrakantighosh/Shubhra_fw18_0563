package com.masai.Question3;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapMain {
	public static void main(String[] args) {
		
		LinkedHashMap<String, String>linkedHashMap=new LinkedHashMap<>();
		
		linkedHashMap.put("West Bengal","Kolkata");
		linkedHashMap.put("Delhi","Delhi");
		linkedHashMap.put("Telangana","Hydrabad");
		linkedHashMap.put("Tamil Nadu","Chennai");
		linkedHashMap.put("Punjab","Chandigar");
		
		for(Map.Entry<String, String>capital:linkedHashMap.entrySet()) {
			System.out.println("Capital of the "+capital.getKey()+" is "+capital.getValue()+".");
		}
	}
}
