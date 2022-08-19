package question2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        Employee employee=new Employee();


        System.out.println("Employee Name :");
        employee.Name=scanner.nextLine();
        System.out.println("Employee Age :");
        employee.Age=scanner.nextInt();

        scanner.nextLine();

        System.out.println("Employee Address :");
        employee.Address=scanner.nextLine();
        System.out.println("Employee Phone Number :");
        employee.Phonenumber=scanner.nextLine();
        System.out.println("Employee Specialisation :");
        employee.Specialisation=scanner.nextLine();
        System.out.println("Employee Department");
        employee.Department=scanner.nextLine();
        System.out.println("Employee Salary");
        employee.Salary=scanner.nextDouble();

        employee.DetailsEmployee();


//        Manager manager=new Manager();
//
//
//        System.out.println("Manager Name :");
//        manager.Name=scanner.nextLine();
//        System.out.println("Manager Age :");
//        manager.Age=scanner.nextInt();
//
//        scanner.nextLine();
//
//        System.out.println("Manager Address :");
//        manager.Address=scanner.nextLine();
//        System.out.println("Manager Phone Number :");
//        manager.Phonenumber=scanner.nextLine();
//        System.out.println("Manager Specialisation :");
//        manager.Specialisation=scanner.nextLine();
//        System.out.println("Manager Department");
//        manager.Department=scanner.nextLine();
//        System.out.println("Manager Salary");
//        manager.Salary=scanner.nextDouble();

//        manager.DetailsManager();

    }
}
