package question1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Address address=new Address("West Bengal","Kolkata","700102");
        Student student=new Student(29,"Shubhra",address,"shubhra@mail.com","masai");

        FileOutputStream fileOutputStream=new FileOutputStream("student.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);
        objectOutputStream.close();
        System.out.println("Student file is Serialized");


        FileInputStream fileInputStream=new FileInputStream("student.txt");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Object object=objectInputStream.readObject();
        Student studentDeserialized=(Student)object;
        System.out.println("Student file is Deserialized");


        System.out.println("Student Name "+studentDeserialized.getName());
        System.out.println("Student RollNo "+studentDeserialized.getRoll());
        System.out.println("Student Email "+studentDeserialized.getEmail());
        System.out.println("Student State "+studentDeserialized.getAddress().getState());
        System.out.println("Student City "+studentDeserialized.getAddress().getCity());
        System.out.println("Student PinCode "+studentDeserialized.getAddress().getPinCode());
        System.out.println("Student Password "+studentDeserialized.getPassword());

    }
}
