package question4;


import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Address address=new Address("West Bengal","Kolkata",700102);
        Employee employee=new Employee(2727,"Shubhra",address,"shubhra@mail.com","masai");

        FileOutputStream fileOutputStream=new FileOutputStream("emp.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employee);
        objectOutputStream.close();
        System.out.println("Employee file is Serialized");

        FileInputStream fileInputStream=new FileInputStream("emp.txt");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Object object=objectInputStream.readObject();
        Employee employeeDeserialized=(Employee)object;
        System.out.println("Employee file Deserialize");

        System.out.println("Employee Name "+employeeDeserialized.getEmpName());
        System.out.println("Employee RollNo "+employeeDeserialized.getEmpId());
        System.out.println("Employee Email "+employeeDeserialized.getEmail());
        System.out.println("Employee State "+employeeDeserialized.getAddress().getState());
        System.out.println("Employee City "+employeeDeserialized.getAddress().getCity());
        System.out.println("Employee PinCode "+employeeDeserialized.getAddress().getPinCode());
        System.out.println("Employee Password "+employeeDeserialized.getPassword());

    }
}
