package question1;

import java.util.Objects;
import java.util.Scanner;

public class Demo {

    public static Bank getBank(String bank){

        Bank bank1=null;

        if(Objects.equals(bank, "axis")){

            bank1= new AxisBank();
            ((AxisBank) bank1).getCreditCard();

        } else if (Objects.equals(bank, "icici")) {

            bank1=new ICICIBank();

        }

        return bank1;

    }


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Bank Name");
        String bankName=scanner.next();

        Bank Bank = getBank(bankName);
        System.out.println(Bank);
    }
}
