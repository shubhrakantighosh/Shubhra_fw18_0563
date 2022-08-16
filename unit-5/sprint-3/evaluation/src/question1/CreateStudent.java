package question1;

import java.io.*;

public class CreateStudent {
    public static void main(String[] args) throws IOException {

        File file=new File("src/question1/student.txt");
        file.createNewFile();
        FileReader fileReader=new FileReader("src/question1/student.txt");
        BufferedReader bufferedReader=new BufferedReader(fileReader);

        File outputFile=new File("src/question1/reportCard.txt");
        outputFile.createNewFile();

        PrintWriter printWriter=new PrintWriter("src/question1/reportCard.txt");
        int i=bufferedReader.read();

        while (i!=-1) {
            String s = String.valueOf((char) i);

                printWriter.write(s);
                printWriter.flush();

                i = bufferedReader.read();
        }
    }
}
