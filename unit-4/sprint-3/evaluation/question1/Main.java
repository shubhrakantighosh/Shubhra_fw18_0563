package question1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        OLA ola=new OLA();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number of Passenger");

        try {

            int numberOfPassenger=scanner.nextInt();

            scanner.nextLine();

            System.out.println("Enter Number of KM");
            int numberOfKM=scanner.nextInt();

            scanner.nextLine();
            Car car=ola.bookCar(numberOfPassenger,numberOfKM);
            int totalBill=ola.calculateBill(car);
            System.out.println("Total bill is : "+totalBill);

        }catch (Exception e){
            System.out.println("Invalid Input");
        }

    }
}
