package com.masai.Question4;

import java.util.TreeMap;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IndianState {
	public static void main(String[] args) {
		
		Map<String,String>map=new TreeMap<>(Collections.reverseOrder());
		map.put("West Bengal","Kolkata");
		map.put("Delhi","Delhi");
		map.put("Telangana","Hydrabad");
		map.put("Tamil Nadu","Chennai");
		map.put("Punjab","Chandigar");
		
		Set<Entry<String,String>> set=map.entrySet();
		
		for(Entry<String,String>sets:set) {
			System.out.println(sets.getKey()+" "+sets.getValue());
		}
		
	}
}