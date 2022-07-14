package question1;

import java.util.Scanner;

public class AllStudents {

    public static void main(String[] args) {

//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter question2.Student Name");
//        String name=scanner.nextLine();
//        ScienceStudent scienceStudent=new ScienceStudent("Shubhra","Kolkata");
//        scienceStudent.phisicsMarks=87;
//        scienceStudent.mathsMarks=73;
//        scienceStudent.chemistryMarks=91;
//        scienceStudent.getPercentage();

        ScienceStudent scienceStudent=new ScienceStudent("Shubhra","Kolkata",98,87,91);
        scienceStudent.getPercentage();

    }
}
