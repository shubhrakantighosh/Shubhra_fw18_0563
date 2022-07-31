package question2;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<Student, String> studentDetails=new TreeMap<>(new Compare());
        Student s1=new Student("Shubhra",80, 500);
        Student s2=new Student("Chirag",27, 798);
        Student s3=new Student("Soumya",21, 780);
        Student s4=new Student("Subhadeep",71, 670);
        studentDetails.put(s1,"West Bengal");
        studentDetails.put(s2,"Delhi");
        studentDetails.put(s3,"Bihar");
        studentDetails.put(s4,"Punjab");

        studentDetails.forEach((student,state)-> System.out.println("From "+state+" >"+"\n"+"Name of the Student is "+student.getName()+" ,marks is "+
                student.getMarks()+" and roll is  "+student.getRoll()));


    }
}

