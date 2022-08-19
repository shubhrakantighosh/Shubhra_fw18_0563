package question2;

public class Employee extends Member{
    String Specialisation;
    String Department;

    public void DetailsEmployee(){

        Employee employee=new Employee();
        System.out.println("Employee Name :"+employee.Name);
        System.out.println("Employee Name :"+employee.Age);
        System.out.println("Employee Name :"+employee.Phonenumber);
        System.out.println("Employee Name :"+employee.Address);
        System.out.println("Employee Name :"+Specialisation);
        System.out.println("Employee Name :"+Department);
        employee.printSalary();

    }


}
