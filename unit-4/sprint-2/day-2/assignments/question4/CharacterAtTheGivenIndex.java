package question4;

import java.util.Scanner;

public class CharacterAtTheGivenIndex {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String string=scanner.nextLine();

        System.out.println("Enter the character position you want to access:");
        int position=scanner.nextInt();

        scanner.nextLine();

        if(position>=0 && position<=string.length()){

            System.out.println("Character at position "+ position +" is :"+string.charAt(position));

        }else System.out.println("Invalid Input");
    }
}
