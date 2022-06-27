public class StudentDetails {
    void displayStudentDetails(int rollNo,String name,int mark){
        System.out.println("Roll Number : "+rollNo+"\n"+"Name : "+name+"\n"+"Mark : "+mark);
        System.out.println("\n"+"--------------------------"+"\n");
    }
    public static void main(String[] args) {
        StudentDetails firstStudent=new StudentDetails();
        StudentDetails secStudent=new StudentDetails();
        StudentDetails thirdStudent=new StudentDetails();
        firstStudent.displayStudentDetails(12,"Shubhra",90);
        secStudent.displayStudentDetails(14,"Chirag",89);
        thirdStudent.displayStudentDetails(45,"Subhadeep",91);
    }
}
