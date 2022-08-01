package question1;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Employee,Integer> employeeIntegerMap=new TreeMap<>(new Sort());

        Employee employee1=new Employee(278,"Shubhra","Kolkata");
        Employee employee2=new Employee(167,"Chirag","Chennai");
        Employee employee3=new Employee(901,"Subhadeep","Bangalore");
        Employee employee4=new Employee(145,"Dhriti","Delhi");
        Employee employee5=new Employee(672,"Soumya","Bihar");

        employeeIntegerMap.put(employee1,1);
        employeeIntegerMap.put(employee2,2);
        employeeIntegerMap.put(employee3,3);
        employeeIntegerMap.put(employee4,4);
        employeeIntegerMap.put(employee5,5);

        System.out.println(employeeIntegerMap);

    }
}
