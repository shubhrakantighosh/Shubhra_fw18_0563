package com.masai.Question1;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {
	
	public Map<Employee, String> sortMapUsingEmployeeSalary(Map<Employee,String> originalMap){
		Map<Employee, String> list=new HashMap<>();
		
		list.putAll(originalMap);
		
		return list;
	}
	
	public static void main(String[] args) {
		
		Map<Employee,String>map=new HashMap<>();
		
		map.put(new Employee(1, "Ram", 1000),"1");
		map.put(new Employee(2, "Soumya", 1200),"2");
		map.put(new Employee(3, "Chirag", 9000),"3");
		map.put(new Employee(4, "Subhadeep", 100),"4");
		map.put(new Employee(5, "Dhriti", 11000),"5");
		
		Map sortedList=new Demo().sortMapUsingEmployeeSalary(map);
		
		Set<Map.Entry<Employee,String>>employeeList=sortedList.entrySet();
		
		for(Map.Entry<Employee, String> employee:employeeList) {
			System.out.println(employee);
		}
		
	}

}
