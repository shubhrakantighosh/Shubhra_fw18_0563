package question1;

import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		TreeMap<Employee,Integer>employeeTreeMap=new TreeMap<>();
		
		employeeTreeMap.put(new Employee(12,"Shubhra","Kolkata"),8000);
		employeeTreeMap.put(new Employee(12,"Chirag","Durgapur"),5000);
		employeeTreeMap.put(new Employee(12,"Dhriti","Katwa"),6067);
		employeeTreeMap.put(new Employee(12,"Udit","Bangalore"),64570);
		
		System.out.println(employeeTreeMap);
		
	}

}
