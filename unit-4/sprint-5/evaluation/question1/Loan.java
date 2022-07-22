package question1;

public class Loan {

    public double calculateLoanAmount(Employee employeeObj){
        double salary=employeeObj.getSalary();

        double current=0;

        if(employeeObj instanceof PermanentEmployee){

            current=(salary*15)/100;

        }
        else if (employeeObj instanceof TemporaryEmployee){

            current=(salary*10)/100;

        }

        return current;
    }

}
