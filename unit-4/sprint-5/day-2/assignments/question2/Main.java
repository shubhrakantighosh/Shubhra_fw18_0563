package question2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Your Date Of Birth as format (dd//MM//yyyy):");
        String userDateOfBirth=scanner.next();

       try {

           LocalDate localDateFromUser=LocalDate.parse(userDateOfBirth, DateTimeFormatter.ofPattern("dd//MM//yyyy"));
           LocalDate currentDate=LocalDate.now();

           Period userPeriod=Period.ofYears(localDateFromUser.getYear());

           int userDate=userPeriod.getYears();
           int current=currentDate.getYear();


           if(current-userDate<0){
               System.out.println("Date should not be in Future");
           }else {

               Period period=Period.between(localDateFromUser,currentDate);
               System.out.println("Your age is : "+period.getYears());

           }

       }catch (Exception e){

           System.out.println("InvalidDateFormat");

       }

    }

}
