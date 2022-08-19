package question3;


public class Student {

    private int roll;
    private String name;
    private String address;
    private String collageName;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCollageName() {
        return collageName;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }



    public static Student getStudent(boolean isFromNIT){

        Student student=new Student();

        if (isFromNIT){

            student.getAddress();

        }else {

            student.getAddress();
        }

        return student;
    }
}
