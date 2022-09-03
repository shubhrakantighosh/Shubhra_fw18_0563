package com.masai.Question4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IndianState {
	public static void main(String[] args) {
		
		List<String>kolkata=Arrays.asList("Bardhaman","Katwa","Durgapur","Barasat");
		List<String>delhi=Arrays.asList("Siri","New Delhi","Firozabad","Mehrauli");
		List<String>telangana=Arrays.asList("Warangal","Hyderabad","Nizamabad","Khammam");
		List<String>tamilNadu=Arrays.asList("Chennai","Coimbatore","Tiruchirapalli","Erode");
		List<String>punjab=Arrays.asList("Chandigar","Ludhiana","Amritsar","Jalandhar");
		
		Map<String,List>map=new HashMap<>();
		map.put("West Bengal",kolkata);
		map.put("Delhi",delhi);
		map.put("Telangana",telangana);
		map.put("Tamil Nadu",tamilNadu);
		map.put("Punjab",punjab);
		
		Set<String>states=map.keySet();
		List<String>listOfstate=new ArrayList<>(states);
		Collections.sort(listOfstate);
		Collections.reverse(listOfstate);
		
		for(String state:listOfstate) {
			System.out.println(state+" "+map.get(state.toString()));
		}
		
		
	}
}