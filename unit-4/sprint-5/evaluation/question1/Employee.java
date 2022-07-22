package question1;

public class Employee {

    private int employeeId;
    private String employeeName;
    private double salary;


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


    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    void calculateSalary(Loan loan){

//        if(loan instanceof PermanentEmployee){
//
//            double pFAmount =basicPay*0.12;
//            setSalary(basicPay-pFAmount);
//
//        } else if (loan instanceof TemporaryEmployee) {
//            setSalary(hoursWorked*hourlyWages);
//        }

    }
}
