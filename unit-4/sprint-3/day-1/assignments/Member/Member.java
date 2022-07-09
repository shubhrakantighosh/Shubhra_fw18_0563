public class Member {
    String Name;
    int Age;
    String phoneNumber;
    String Address;
    double Salary;

    public void printSalary(String Name,int Age,String phoneNumber,String Address,double Salary,String specialisation, String department){
        System.out.println("Name : "+Name);
        System.out.println("Age : "+Age);
        System.out.println("Phone Number : "+phoneNumber);
        System.out.println("Address : "+Address);
        System.out.println("Salary : "+Salary);
        System.out.println("Specialisation : "+specialisation);
        System.out.println("Department : "+department);
    }
}
