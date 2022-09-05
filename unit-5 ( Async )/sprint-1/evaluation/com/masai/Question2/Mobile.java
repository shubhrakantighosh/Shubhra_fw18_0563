package com.masai.Question2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Mobile {
	
	HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
	
	public String addMobile(String company, String model) {
		
		
		ArrayList<String>list=new ArrayList<>();
		
		if(mobiles.containsKey(company)) {

			mobiles.get(company).add(model);
			
			return "Mobile added successfully";
			
		}else {
			
			list.add(model);
			mobiles.put(company, list);
			
			return "Model Added to the existing list";
		}
		
	}
	
	public List<String> getModels(String company){
		
		List<String>list=new ArrayList<>();
		if(mobiles.containsKey(company)) {
			
			Set<Map.Entry<String, ArrayList<String>>>set=mobiles.entrySet();
			
			for(Map.Entry<String, ArrayList<String>>sets:set) {
				if(sets.getKey().equals(company)) {
					list.addAll(sets.getValue());
				}
			}
		}
		
		return list;
	}
	

	public static void main(String[] args) {
		
		Mobile mobile=new Mobile();
		
		mobile.addMobile("Apple", "iPhone 13 Pro");
		mobile.addMobile("Apple", "iPhone 12");
		mobile.addMobile("Apple", "iPhone 11");
		mobile.addMobile("Samsung", "S20");
		
		
		List<String> list=mobile.getModels("Appe");
		
		if(list.size()!=0) {
			for(String model:list) {
				System.out.println(model);
			}
		}else System.out.println("Invalid Company Supplied");
		

	}

}
