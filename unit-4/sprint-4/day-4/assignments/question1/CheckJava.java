package question1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckJava {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println(" Enter Paragraph >It will find >Java< Keyword < ");
        String userParagraph=scanner.nextLine();
        Pattern pattern=Pattern.compile(userParagraph);
        Matcher matcher= pattern.matcher("Java");

        while (matcher.find()){
            System.out.println(matcher.start()+"<<<<<>>>>"+matcher.end());
        }
    }
}
