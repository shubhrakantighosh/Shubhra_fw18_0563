package question2;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Student>studentHashSet=new HashSet<>();

        studentHashSet.add(new Student (1,"Ram","Delhi","ram@masai.com","null"));
        studentHashSet.add(new Student (2,"Sam", "Mumbai","sam@masai.com", "null"));
        studentHashSet.add(new Student (3,"John","Pune","john@masai.com", "null"));
        studentHashSet.add(new Student (4,"David", "Bangalore", "david@masai.com", "null"));
        studentHashSet.add(new Student (5, "Mark", "Kerala", "mark@masai.com","null"));

        StudentDB studentDB=new StudentDB();
        studentHashSet
                .stream()
                .forEach(student -> {
                    try {
                        studentDB.addStudent(student);

                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
        System.out.println("Student data serialized");

    }
}
