package question3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student>studentList= Arrays.asList(
                new Student (12,495,"Name1"),
                new Student (13,230,"Name2"),
                new Student (10,210,"Name5"),
                new Student (6,400,"Name3"),
                new Student (2,352,"Name4")
        );

        studentList
                .stream()
                .filter(student -> student.getMarks()<250)
                .forEach(System.out::println);
    }
}
