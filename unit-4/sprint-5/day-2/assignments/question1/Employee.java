package question1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Employee {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Your Joining Date as Format (dd//MM//yyyy):");
        String joiningDate=scanner.next();

       try {

           LocalDate localDateFromUser=LocalDate.parse(joiningDate,DateTimeFormatter.ofPattern("dd//MM//yyyy"));

           LocalDate localDate=LocalDate.now();

           Period periodCurrent=Period.ofYears(localDate.getYear());
           int current=periodCurrent.getYears();
           int userYear=localDateFromUser.getYear();

           if(current-userYear<0){

               System.out.println("Age should not be in the future");

           }else {

               Period period=Period.between(localDateFromUser,localDate);

               EmployeeBonus employeeBonus=new EmployeeBonus();
               double bonusAmount=employeeBonus.EmployeeBonus(period);

               System.out.println("The bonus amount is : "+bonusAmount);

           }

       }catch (Exception e){

           System.out.println("Please pass the date in the correct format");

       }

    }

}
