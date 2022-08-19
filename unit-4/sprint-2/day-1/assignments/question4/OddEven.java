package question4;

import java.util.Scanner;

public class OddEven {

    public void checkOddEven(int number){

        if(number%2==0){

            System.out.println();

        }else if(number%2==1){

            System.out.println(number);

        }else System.out.println("Error");

    }

    public static void main(String[] args) {
        OddEven oddEven=new OddEven();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number : ");

        try {

            int number=scanner.nextInt();

            scanner.nextLine();

            oddEven.checkOddEven(number);

        }catch (Exception e){

            System.out.println("Invalid Input");

        }
    }
}
