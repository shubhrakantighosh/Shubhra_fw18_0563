package question2;

import java.util.Scanner;

public class Demo {

    public Hotel provideFood(int amount){

        Hotel hotel=null;

        if(amount>1000){

            hotel = new TajHotel();

        } else if (amount>200) {

            hotel = new RoadSideHotel();

        }

        return hotel;

    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the amount");
        int amount = scanner.nextInt();

        Demo demo=new Demo();
        Hotel hotel = demo.provideFood(amount);

        if(hotel instanceof TajHotel){

            hotel.chickenBiryani();
            hotel.masalaDosa();
            ((TajHotel) hotel).welcomeDrink();

        } else if (hotel instanceof RoadSideHotel) {

            hotel.chickenBiryani();
            hotel.masalaDosa();

        }
        else System.out.println("Please Enter a valid amount");

    }
}
