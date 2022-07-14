package question2;

import java.util.Scanner;
public class Demo extends Student {

    public static void main(String[] args) {
        int count=0;
        Demo student=new Demo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of the students : ");
        int noOfStudents = scanner .nextInt();
        String[] array = new String[noOfStudents*4];

       for (int i=0;i<noOfStudents;i++){

           System.out.print("Enter question2.Student Name : ");
           student.name=scanner.next();
           array[count]="question2.Student Name :"+ student.name;
           count++;

           System.out.print("Enter Roll Number : ");
           student.roll=scanner.nextInt();
           array[count]="Roll Number :"+ student.roll;
           count++;

           System.out.print("Enter Marks : ");
           student.marks=scanner.nextInt();
           array[count]="question2.Student Marks :"+ student.marks / 10+"%";
           count++;

           System.out.print("Enter Address : ");
           student.address=scanner.next();
           array[count]="question2.Student Address :"+ student.address;
           count++;

       }
        for (String s : array) {
            System.out.println(s);
        }
    }
}
