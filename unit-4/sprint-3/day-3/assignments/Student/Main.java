import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner studentDetails=new Scanner(System.in);
        System.out.print("Enter your roll number : ");
        int roll=studentDetails.nextInt();
        System.out.print("Enter your name : ");
        String name=studentDetails.next();
        System.out.print("Enter your marks : ");
        int marks=studentDetails.nextInt();
        Student details=new Student(roll,name,marks);
        details.displayDetails();
    }
}
