public class Manager extends Member{
    String Specialisation;
    String Department;

    public Manager() {
        Member manager=new Manager();
        manager.Name=Name;
        manager.Age=Age;
        manager.phoneNumber=phoneNumber;
        manager.Address=Address;
        manager.Salary=Salary;
    }

    public Manager(String Name,int Age,String phoneNumber,String Address,double Salary,String specialisation, String department) {
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
