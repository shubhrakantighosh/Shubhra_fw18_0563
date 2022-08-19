package question1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Number of Students you want to enter");
        try {

            int numberOfStudents=scanner.nextInt();

            scanner.nextLine();

            for(int i=0;i<numberOfStudents;i++){

                System.out.println("Enter Your Roll Number : ");
                int rollNumber=scanner.nextInt();

                scanner.nextLine();

                System.out.println("Enter Your Name : ");
                String name=scanner.nextLine();
                System.out.println("Enter Your Marks : ");
                int marks=scanner.nextInt();

                scanner.nextLine();

                Student student=new Student(rollNumber,name,marks);

                System.out.println("Student Name : "+student.studentName);
                System.out.println("Student Roll Number : "+student.rollNumber);
                System.out.println("Student Marks : "+student.marks);
                System.out.println("====================================");
            }

        }catch (Exception e){

            System.out.println("Invalid Input");

        }

    }
}
