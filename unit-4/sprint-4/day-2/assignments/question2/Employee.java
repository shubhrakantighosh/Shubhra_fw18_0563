package question2;

public class Employee {

     private int employeeId;
     private String employeeName;
     private double salary;
     private double netSalary;


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

    public void calculateNetSalary(int pfPercentage){

        this.setNetSalary((int) (this.salary-((this.salary*pfPercentage)/100)));

        System.out.println(netSalary);

    }

    public static int getPFPercentage(int pfPercentage){

        return pfPercentage;

    }

}
