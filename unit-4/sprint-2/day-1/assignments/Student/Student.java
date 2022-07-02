public class Student {
    int roll;
    String name;
    String address;
    String collageName;
    Student(int roll,String name,String address){
        this.roll=roll;
        this.name=name;
        this.address=address;
    }
    Student(int roll,String name,String address,String collageName){
        this.roll=roll;
        this.name=name;
        this.address=address;
        this.collageName=collageName;
    }
    public Student getStudent(boolean isFromNIT){
        if(isFromNIT){
            return new Student(roll,name,address,collageName);
        }
        else {
            return new Student(roll,name,address,collageName);
        }
    }
}
