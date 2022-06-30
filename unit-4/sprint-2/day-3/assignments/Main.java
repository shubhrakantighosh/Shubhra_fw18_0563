import org.jetbrains.annotations.NotNull;

import java.util.Scanner;
class Main{
    public static String reversString(@NotNull String input){
        char[] ch = new char[input.length()];
        String reverse="";
        for(int i=input.length()-1;i>=0 ;i--) {
            reverse+=input.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String orignalString = sc.next();
        String result = reversString(orignalString);
        System.out.println("Original String is :"+ orignalString);
        System.out.println("Reversed String is :"+ result);
    }
}