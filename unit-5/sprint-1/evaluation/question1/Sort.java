package question1;

import java.util.Comparator;

public interface Sort<Employee> implements Comparator<question1.Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getName()>o2.getName()) return -1;
        else if(o1.getName()<o2.getName()) return 1;
        else return 0;
    }


}
