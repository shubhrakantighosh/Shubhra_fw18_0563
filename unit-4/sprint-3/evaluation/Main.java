import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Write logic to get numberOfPassenger and numberOfKms
        System.out.println("Enter the no Of Passenger");
        int passengers=scanner.nextInt();
        System.out.println("Enter distance in KM");
        int distance=scanner.nextInt();
        Ola myOla = new Ola();
        int myCar = myOla.bookCar(passengers, distance);
        int res = myOla.calculateBill(myCar);
        System.out.println("The total fare amount is "+ res);
    }
}
