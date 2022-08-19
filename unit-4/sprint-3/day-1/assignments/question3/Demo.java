package question3;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter number of students");

        try {

            int noOfStudents=scanner.nextInt();
            scanner.nextLine();

            Student student=new Student();
            Student[] students=new Student[noOfStudents];

            for (int i=0;i<noOfStudents;i++){

                System.out.println("Enter Student Name ");
                student.name=scanner.nextLine();
                System.out.println("Enter Student Roll");
                student.roll=scanner.nextInt();

                scanner.nextLine();

                System.out.println("Enter Student Marks ");
                student.marks=scanner.nextInt();

                scanner.nextLine();

                System.out.println("Enter Student Address ");
                student.address=scanner.nextLine();

                students[i]=new Student(student.roll,student.name, student.address, student.marks);

            }

            for (Student studentDisplay:students){

                System.out.println("Student Name : "+studentDisplay.name);
                System.out.println("Student Roll : "+studentDisplay.roll);
                System.out.println("Student Marks : "+studentDisplay.marks);
                System.out.println("Student Address : "+studentDisplay.address);

            }

        }catch (Exception e){
            System.out.println("Invalid Input");
        }
    }
}
