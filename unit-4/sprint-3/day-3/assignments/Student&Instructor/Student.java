public class Student extends Person{
    int studentId;
    String courseEnrolled;
    int courseFee;

    public Student() {
        Person student=new Student();
        student.name=name;
        student.gender=gender;
        student.city=city;
        student.pinCode=pinCode;
        student.state=state;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", courseEnrolled='" + courseEnrolled + '\'' +
                ", courseFee=" + courseFee +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }

    public Student(int studentId, String courseEnrolled, int courseFee,String name,String gender,String city,String pinCode,String state) {
        this.name=name;
        this.gender=gender;
        this.city=city;
        this.pinCode=pinCode;
        this.state=state;
        this.studentId = studentId;
        this.courseEnrolled = courseEnrolled;
        this.courseFee = courseFee;
    }

}
