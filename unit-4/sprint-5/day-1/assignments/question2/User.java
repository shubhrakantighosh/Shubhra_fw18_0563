package question2;

import java.util.Scanner;

public class User {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 1st Number :");
        int a=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Second Number :");
        int b=scanner.nextInt();

        try {
            int c=a/b;

        }catch (ArithmeticException ae){

            System.out.println("DivideByZeroException caught");
        }

        System.out.println("Inside finally block");
    }
}