package question2;

public class Student {

    private int RollNo;
    private String Name;
    private int marks;


    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

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