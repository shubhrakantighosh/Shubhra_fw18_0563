package question3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Start date should be smaller than End date (dd-MM-yyyy)");
        String start=scanner.next();
        System.out.println("Please enter date in dd-MM-yyyy");
        String end=scanner.next();

        try {

            LocalDate userStart=LocalDate.parse(start, DateTimeFormatter.ofPattern("dd-MM-yyy"));
            LocalDate userEnd=LocalDate.parse(end, DateTimeFormatter.ofPattern("dd-MM-yyy"));

            if(userEnd.getYear()>userStart.getYear()){

                Period period=Period.between(userStart,userEnd);
                System.out.println(period.toTotalMonths()*4);

            }else System.out.println("End date should be Bigger than start date ");


        }catch (Exception e){

            System.out.println("Invalid Date");

        }

    }

}
