import java.util.Objects;
import java.util.Scanner;

public class Course {
    int courseId=2727;
    String courseName="Java";
    int courseFee=14900;

    public void displayCourseDetails(){
        System.out.println("Course ID : "+courseId+"\n"+"Course Name : "+courseName+"\n"+"Course Fee : "+courseFee);
    }

    public void authenticate(String username,String password){
        Course ShowCourse=new Course();
        if(Objects.equals(username, "Admin") & Objects.equals(password, "1234")){
            ShowCourse.displayCourseDetails();
        }
        else{
            System.out.println("Invalid Username or password");
        }
    }

    public static void main(String[] args) {
        Course inputDataUser=new Course();
        Scanner dataFromUser=new Scanner(System.in);

        System.out.print("Please Enter Your User ID : ");
        String username=dataFromUser.nextLine();

        System.out.print("Enter Your Password : ");
        String password=dataFromUser.nextLine();

        inputDataUser.authenticate(username,password);
    }
}
