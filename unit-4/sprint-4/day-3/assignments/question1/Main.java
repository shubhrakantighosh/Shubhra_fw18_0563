package question1;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Mobile Model No ");
        String mobileModelNo=scanner.nextLine();

        Mobile mobile=new Mobile();
        mobile.searchOutdatedModel(mobileModelNo);
    }

}
