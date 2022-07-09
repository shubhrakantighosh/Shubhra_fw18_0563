public class Instructor extends Person{
    int instructorId;
    int salary;

    public Instructor() {
        Instructor instructor=new Instructor();
        instructor.name=name;
        instructor.gender=gender;
        instructor.city=city;
        instructor.pinCode=pinCode;
        instructor.state=state;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "instructorId=" + instructorId +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }

    public Instructor(int instructorId, int salary,String name,String gender,String city,String pinCode,String state) {
        this.instructorId = instructorId;
        this.salary = salary;
        this.name=name;
        this.gender=gender;
        this.city=city;
        this.pinCode=pinCode;
        this.state=state;
    }
}
