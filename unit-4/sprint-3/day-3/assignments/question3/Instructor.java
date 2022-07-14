package question3;

public class Instructor extends Person{
    int instructorId;
    int salary;

    @Override
    public String toString() {
        return super.toString()+ "Instructor{" +
                "instructorId=" + instructorId +
                ", salary=" + salary +
                '}';
    }
}
