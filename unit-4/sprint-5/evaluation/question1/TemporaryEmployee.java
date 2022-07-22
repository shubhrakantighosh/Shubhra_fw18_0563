package question1;

public class TemporaryEmployee extends Employee{

    int hoursWorked;
    int hourlyWages;

    public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {

        super(employeeId, employeeName);
        this.hoursWorked = hoursWorked;
        this.hourlyWages = hourlyWages;
        calculateSalary();
    }

    void calculateSalary(){

        setSalary(hoursWorked*hourlyWages);

    }
}
