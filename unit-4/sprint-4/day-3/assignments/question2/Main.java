package question2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Stadium Name : ");
        String stadium=scanner.nextLine();
        String stadiumToUpperCase=stadium.toUpperCase();

        IPL ipl=new IPL();
        ipl.homeTeamStadium(Stadium.valueOf(stadiumToUpperCase));


    }

}
