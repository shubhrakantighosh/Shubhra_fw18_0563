package question2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Employee employee=new Employee();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Employee ID : ");
        int employeeId=scanner.nextInt();

        scanner.nextLine();
        employee.setEmployeeId(employeeId);

        System.out.println("Enter Employee Name :");
        String employeeName=scanner.nextLine();
        employee.setEmployeeName(employeeName);

        System.out.println("Enter Employee Salary :");
        double salary=scanner.nextDouble();
        employee.setSalary(salary);

        System.out.println("Enter Employee PF Percentage : ");
        int pFPercentage=scanner.nextInt();
        employee.calculateNetSalary(pFPercentage);


        System.out.println("ID : "+employee.getEmployeeId());
        System.out.println("Name : "+employee.getEmployeeName());
        System.out.println("Salary : "+employee.getSalary());
        System.out.println("Net Salary : "+employee.getNetSalary());

    }
}
