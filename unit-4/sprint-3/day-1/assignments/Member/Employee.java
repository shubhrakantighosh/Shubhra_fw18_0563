public class Employee extends Member{
    String Specialisation;
    String Department;

    public Employee() {
        Employee employee=new Employee();
        employee.Name=Name;
        employee.Age=Age;
        employee.phoneNumber=phoneNumber;
        employee.Address=Address;
        employee.Salary=Salary;
    }

    public Employee(String Name,int Age,String phoneNumber,String Address,double Salary,String specialisation, String department) {
        this.Name=Name;
        this.Age=Age;
        this.phoneNumber=phoneNumber;
        this.Address=Address;
        this.Salary=Salary;
        this.Specialisation = specialisation;
        this.Department = department;

        printSalary(Name,Age,phoneNumber,Address,Salary,specialisation,department);
    }
}
