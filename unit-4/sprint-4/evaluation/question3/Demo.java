package question3;

import java.util.Scanner;

public class Demo {

    public void showDetails(Month m){

        if(m==Month.JAN){
            System.out.println("This is the 1st Month of the Year January");
        } else if (m==Month.FEB) {
            System.out.println("This is the 2nd Month of the Year February");
        }else if (m==Month.MAR) {
            System.out.println("This is the 3rd Month of the Year March");
        }else if (m==Month.ARP) {
            System.out.println("This is the 4th Month of the Year April");
        }else if (m==Month.MAY) {
            System.out.println("This is the 5th Month of the Year May");
        }else if (m==Month.JUN) {
            System.out.println("This is the 6th Month of the Year June");
        }else if (m==Month.JUL) {
            System.out.println("This is the 7th Month of the Year July");
        }else if (m==Month.AUG) {
            System.out.println("This is the 8th Month of the Year August");
        }else if (m==Month.SEP) {
            System.out.println("This is the 9th Month of the Year September");
        }else if (m==Month.OCT) {
            System.out.println("This is the 10th Month of the Year October");
        }else if (m==Month.NOV) {
            System.out.println("This is the 11th Month of the Year November");
        }else if (m==Month.DEC) {
            System.out.println("This is the 12th Month of the Year December");
        }

    }

    public static void main(String[] args) {

        try {

            Demo demo=new Demo();
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the Name of the Month");
            String nameOfTheMonth=scanner.nextLine();
            demo.showDetails(Month.valueOf(nameOfTheMonth));

        }catch (Exception e){
            System.out.println("Invalid Month Name");
        }

    }

}
