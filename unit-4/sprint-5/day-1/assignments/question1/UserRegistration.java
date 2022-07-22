package question1;

import java.util.Scanner;

public class UserRegistration  {

    public void  registerUser(String username,String userCountry)throws InvalidCountryException{

        if(userCountry.equalsIgnoreCase("India")){

            System.out.println("User registration done successfully");

        }
        else
            throw new InvalidCountryException("User Outside India cannot be registered");
//        else throw new InvalidCountryException;


    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String userName=scanner.nextLine();
        System.out.println("Enter Your Country:");
        String userCountry=scanner.nextLine();

        UserRegistration userRegistration=new UserRegistration();
        try {
            userRegistration.registerUser(userName,userCountry);
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("hello");

    }
}
