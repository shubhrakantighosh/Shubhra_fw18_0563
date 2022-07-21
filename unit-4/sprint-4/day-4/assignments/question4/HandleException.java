package question4;

import java.util.Scanner;

public class HandleException {

    public static void main(String[] args) {

        try {

            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter an Integer Number It will give you square of this number : ");
            int number=scanner.nextInt();
            int squareNumber=number*number;

            System.out.println("The square value is :" +squareNumber);
            System.out.println("The work has been done successfully");

        }catch (Exception e){

            System.out.println("Entered input is not a valid format for an integer");
        }


    }


}
