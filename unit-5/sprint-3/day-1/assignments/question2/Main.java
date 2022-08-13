package question2;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        Employee employee=new Employee("Shubhra","06-May-1996","SB101","Student",40000);
        File file=new File("src/question2","OutObject.txt");
        file.createNewFile();

        PrintWriter printWriter=new PrintWriter("OutObject.txt");
        printWriter.println(employee.getSalary());
        printWriter.flush();
        printWriter.close();




    }
}
