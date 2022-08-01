package question1;


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

        studentList
                .stream()
                .filter(student -> student.marks>250 && student.marks<=500)
                .forEach(System.out::println);
    }
}
