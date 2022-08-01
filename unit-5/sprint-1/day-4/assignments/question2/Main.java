package question2;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student>studentList= Arrays.asList(

                new Student(18,"Shubhra",740),
                new Student(18,"Chirag",878),
                new Student(18,"Subhadeep",330),
                new Student(18,"Sourik",930),
                new Student(18,"Dhriti",1000)
        );

        studentList
                .stream()
                .filter(students->students.getMarks()<=800)
                .forEach(System.out::println);
    }
}
