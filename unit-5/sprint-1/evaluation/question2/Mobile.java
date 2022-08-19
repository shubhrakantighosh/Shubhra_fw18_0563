package question2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Mobile {
	
	HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
	
	public String addMobile(String company, String model) {
		
		ArrayList<String>listOfModel;
		if(mobiles.containsKey(company)) {
			
			listOfModel=mobiles.get(company);
			listOfModel.add(model);
			
		}else {
			listOfModel=new ArrayList<>();
			listOfModel.add(model);
		}
		
		mobiles.put(company, listOfModel);
		
		return "Mobile added successfully";
	}
	
	public List<String> getModels(String company)throws InvalidMobileException{
		
		return mobiles.get(company);
	}
	
	public static void main(String[] args) {
		
		Mobile mobile=new Mobile();
		String m1=mobile.addMobile("Apple", "iPhone 13 Pro");
		String m2=mobile.addMobile("Samsung", "S20");
		String m3=mobile.addMobile("BlackBerry","Q5");
		String m4=mobile.addMobile("Apple", "iPhone 12 Pro");
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		
		
		try {
			List<String>listString = mobile.getModels("gvhbjn");
			System.out.print(listString);
		} catch (InvalidMobileException e) {
		
			e.printStackTrace();
		}
		
	}
}
