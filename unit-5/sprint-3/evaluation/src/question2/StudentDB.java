package question2;

import java.io.*;

public class StudentDB {
    public void studentsData(Student student) throws IOException {
        File file=new File("src/question2/dataBase.txt");
        file.createNewFile();

        FileOutputStream fileOutputStream=new FileOutputStream("src/question2/dataBase.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student.toString());
        objectOutputStream.close();

    }
    public void addStudent(Student student) throws IOException {
        StudentDB studentDB=new StudentDB();
        studentDB.studentsData(student);
    }
}
