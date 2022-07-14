package question1;

import java.util.Scanner;

public class AllStudents {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Science Student Name :");
        String scienceName=scanner.nextLine();

        System.out.println("Enter Science Student Address :");
        String scienceAddress=scanner.nextLine();

        System.out.println("Enter Science Student Physic Marks :");
        int physicMarks=scanner.nextInt();

        System.out.println("Enter Science Student Chemistry Marks :");
        int chemistryMarks=scanner.nextInt();

        System.out.println("Enter Science Student Math Marks :");
        int mathMarks=scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter History Student Name :");
        String historyName=scanner.nextLine();

        System.out.println("Enter History Student Address :");
        String historyAddress=scanner.nextLine();

        System.out.println("Enter Science Student History Marks :");
        int historyMarks=scanner.nextInt();

        System.out.println("Enter Science Student Civics Marks :");
        int civicsMarks=scanner.nextInt();

        ScienceStudent scienceStudent=new ScienceStudent(scienceName,scienceAddress,physicMarks,chemistryMarks,mathMarks);

        float scienceStudentPercentage= scienceStudent.getPercentage();

        HistoryStudent historyStudent=new HistoryStudent(historyName,historyAddress,historyMarks,civicsMarks);

        float historyStudentPercentage=historyStudent.getPercentage();

        System.out.println("Percentage of the Science student is : "+scienceStudentPercentage);

        System.out.println("Percentage of the History student is : "+historyStudentPercentage);
    }
}
