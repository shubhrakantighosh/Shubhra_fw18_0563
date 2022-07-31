package question2;

import java.util.Comparator;

public class Compare<Student>implements Comparator<question2.Student> {

    @Override
    public int compare(question2.Student o1, question2.Student o2) {
        if(o1.getMarks()>o2.getMarks()) return -1;
        else if(o1.getMarks()<o2.getMarks()) return 1;
        else return 0;
    }
}
