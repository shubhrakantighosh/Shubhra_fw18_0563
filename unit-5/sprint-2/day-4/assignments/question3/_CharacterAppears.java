package question3;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class _CharacterAppears {

    public static void main(String[] args) throws IOException {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the file name");

        try {

            String userFileName=scanner.next();
            FileReader fileReader=new FileReader("C:\\Users\\shubh\\OneDrive\\Desktop\\Java\\Java\\Java\\src\\question3\\"+userFileName);

            System.out.println("Enter the character");
            String userInput=scanner.next();
            int i=fileReader.read();
            int count=0;

            while (i!=-1){

                String string= String.valueOf(((char)i));
                if(string.equalsIgnoreCase(userInput)) count++;
                i=fileReader.read();

            }

            if(count>0) System.out.println(userInput+" found "+count+" times");
            else System.out.println(userInput+" Not Found");

        }catch (Exception e){

            System.out.println("Error Input");
        }

    }
}
