package question1;

import java.time.Period;

public class EmployeeBonus {
    double employeeBonus=0;

    public double EmployeeBonus(Period period) {

        if(period.getYears()<1){
            employeeBonus=5000;
        } else if (period.getYears()<3) {
            employeeBonus=8000;
        } else {
            employeeBonus=10000;
        }

        return employeeBonus;
    }
}
