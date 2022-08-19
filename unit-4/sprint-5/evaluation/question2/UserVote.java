package question2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserVote {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Your Date of Birth (dd-MM-yyyy) this format");
        String userDateOfBirth=scanner.next();

       try {

           LocalDate userBirth=LocalDate.parse(userDateOfBirth,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
           LocalDate current=LocalDate.now();

           if(current.getYear()>userBirth.getYear()){

               Period period=Period.ofYears(current.getYear());
               Period user=Period.ofYears(userBirth.getYear());
               int userEligible=period.getYears()-user.getYears();

               if(userEligible>=18){

                   if(current.getMonth()==userBirth.getMonth() & current.getDayOfMonth()==userBirth.getDayOfMonth()){

                       System.out.println("Happy Birthday, You are eligible to cast your vote.");

                   }else System.out.println("You are eligible to cast your vote");

               }else System.out.println("You are not eligible to cast your vote");

           }else System.out.println("Date of birth should not be in future");
           

       }catch (Exception e){

           System.out.println("\nplease pass the date in the\n" +
                   "proper format");

       }

    }
}
