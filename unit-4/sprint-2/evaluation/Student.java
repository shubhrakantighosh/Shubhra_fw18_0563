import com.sun.scenario.effect.impl.state.AccessHelper;

import java.util.Scanner;

public class Student {
    int rollNumber;
    String studentName;
    int marks;

    public static void check(int noOfStudents){
        Scanner studentsDetails=new Scanner(System.in);
        for(int i=0;i<noOfStudents;i++){
            System.out.print("Enter the Roll Number : ");
            int roll=studentsDetails.nextInt();

            System.out.print("Enter the Name : ");
            String name=studentsDetails.next();

            System.out.print("Enter the marks : ");
            int mark=studentsDetails.nextInt();

            System.out.println("Student Detail "+(i+1));
            System.out.println("Student Roll Number: "+roll);
            System.out.println("Student Name: "+name);
            System.out.println("Student Mark: "+mark);
            System.out.println("=============================");
        }
    }

    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);
        System.out.print("Enter Number of Students you want to enter ");
        int noOfStudents=userInput.nextInt();
        check(noOfStudents);
    }
}
