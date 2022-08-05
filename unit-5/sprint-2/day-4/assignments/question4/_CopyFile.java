package question4;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class _CopyFile {

    public static void main(String[] args) throws IOException {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the file name");
        String userInputFileName=scanner.next();

        File file=new File("src/question4/"+userInputFileName);

        if (file.exists()){
            System.out.println("File exist");

            System.out.println("Enter the file name");

           try {

               String userNewFileName=scanner.next();
               File creatAnotherFile=new File("src/question4/"+userNewFileName+"txt");
               creatAnotherFile.createNewFile();

               FileWriter fileWriter=new FileWriter("src/question4/"+userNewFileName+"txt");

               FileReader fileReader=new FileReader("src/question4/"+userInputFileName);

               int i=fileReader.read();

               while (i!=-1) {

                   fileWriter.write(String.valueOf((char)i));
                   fileWriter.flush();
                   fileWriter.flush();

                   i=fileReader.read();
               }

           }catch (Exception e){

               System.out.println("Error Input");
           }


        }else System.out.println("Doesn't Exit "+userInputFileName);

    }
}
