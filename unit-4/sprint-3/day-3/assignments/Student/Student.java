public class Student {
    private int roll;
    private String name;
    private int marks;
    private char grade;


    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", grade=" + grade +
                '}';
    }

    private char calculateGrade(int marks){
        if(marks>=500){
            return 'A';
        } else if (marks>=400) {
            return 'B';
        }
        else return 'D';
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public Student(int roll, String name, int marks) {
        this.setMarks(marks);
        this.setName(name);
        this.setRoll(roll);
        this.setGrade(calculateGrade(marks));
    }

    public void displayDetails(){
        System.out.println("Student Name : "+this.getName());
        System.out.println("Student Roll No : "+this.getRoll());
        System.out.println("Student Grade : "+this.getGrade());
        System.out.println("Student Marks : "+this.getMarks());
    }
}
