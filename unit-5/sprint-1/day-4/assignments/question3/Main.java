package question3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        List<Student> studentList= Arrays.asList(

                new Student(18,"Shubhra",440),
                new Student(18,"Chirag",478),
                new Student(18,"Subhadeep",330),
                new Student(18,"Sourik",230),
                new Student(18,"Dhriti",500)
        );

        List<Employee>employeeList=new ArrayList<>();

        Employee employee=new Employee();

        studentList
                .stream()
                .forEach(student -> employeeList.add(new Employee(student.getRoll(),student.getName(),(student.getMarks()*1000))));

        employeeList
                .stream()
                .forEach(System.out::println);

    }

}
