public class Student {
    private int roll;
    private String name;
    private int age;
    private int marks;

    public void checkStudentDetails(int roll,String name,int age,int marks){
        if(age>0 & age <60 & marks>0 & marks<500){
            System.out.println(name);
            System.out.println(age);
            System.out.println(roll);
            System.out.println(marks);
        }
    }
    public static void main(String[] args) {
        Student studentData=new Student();
        studentData.checkStudentDetails(27,"Chirag",6,10);

        Student data=new Student();
        data.checkStudentDetails(78,"shubhra",24,945);
    }
}