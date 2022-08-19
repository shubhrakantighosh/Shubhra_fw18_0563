package question1;

public class Main {

    public static void main(String[] args) {
        Student student=new Student();

        student.setAge(19);
        student.setMarks(759);
        student.setName("Shubhra");
        student.setRoll(45);
        System.out.println(student);

        student.setAge(15);
        student.setMarks(459);
        student.setName("Chirag");
        student.setRoll(85);
        System.out.println(student);

    }
}
