package question1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _ContentReader {

    public static void main(String[] args) throws IOException {
        File file=new File("abc.txt");

        file.createNewFile();

        FileWriter fileWriter=new FileWriter("C:\\Users\\shubh\\OneDrive\\Desktop\\Java\\Java\\Java\\src\\question1\\abc.txt");
        fileWriter.write("Hi \n Shubhra");
        fileWriter.flush();
        fileWriter.close();

        FileReader fileReader=new FileReader("C:\\Users\\shubh\\OneDrive\\Desktop\\Java\\Java\\Java\\src\\question1\\abc.txt");
        int i=fileReader.read();
        while (i!=-1){
            System.out.println((char)i);
            i=fileReader.read();
        }
    }
}
