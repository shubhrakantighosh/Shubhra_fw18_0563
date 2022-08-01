package question1;

public class Student {

    int RollNo;
    String Name;
    int marks;

    public Student(int rollNo, String name, int marks) {
        RollNo = rollNo;
        Name = name;
        this.marks = marks;
    }


    @Override
    public String toString() {
        return "Student{" +
                "RollNo=" + RollNo +
                ", Name='" + Name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
