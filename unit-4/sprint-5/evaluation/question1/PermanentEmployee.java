package question1;

public class PermanentEmployee extends Employee{

    private double basicPay;

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
        super(employeeId, employeeName);
        this.basicPay = basicPay;
        calculateSalary();
    }

     void calculateSalary(){

        double pFAmount =basicPay*0.12;
        setSalary(basicPay-pFAmount);

    }
}
