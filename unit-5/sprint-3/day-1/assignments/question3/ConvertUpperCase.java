package question3;

import java.io.*;
import java.util.Scanner;

public class ConvertUpperCase {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the file name");

        try {

            String uerFileName=scanner.next();
            File file=new File(uerFileName+".txt");

            if (file.exists()) {

                FileReader fileReader=new FileReader(uerFileName+".txt");
                FileWriter fileWriter=new FileWriter("src/question3/newfile.txt");

                int i=fileReader.read();
                while (i!=-1){
                    String string= (String.valueOf(((char)i))).toUpperCase();
                    fileWriter.write(string);
                    fileWriter.flush();

                    i=fileReader.read();
                }
                System.out.println("file copy to newfile.txt to Upper Case");

            }else System.out.println("File doesn't exit");

        }catch (Exception e) {
            System.out.println("Invalid Entry");
        }

    }
}
