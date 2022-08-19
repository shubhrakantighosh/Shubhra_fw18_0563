package question1;

import java.util.Scanner;

public class Course {

    int courseId;
    String courseName;
    int courseFee;

    public void displayCourseDetails(){

        System.out.println("Your Course Name is : "+courseName);
        System.out.println("Your Course ID  is : "+courseId);
        System.out.println("Your Course Fee is :"+courseFee);

    }

    public static void authenticate(String username,String password){
        if (username.equals("Admin") && password.equals("1234")){

            System.out.println("Successfully Login");
            Scanner scanner=new Scanner(System.in);
            Course course=new Course();
            try {

                System.out.println("Enter Course Name : ");
                course.courseName=scanner.nextLine();
                System.out.println("Enter Course ID : ");
                course.courseId=scanner.nextInt();

                scanner.nextLine();

                System.out.println("Enter Course Fee");
                course.courseFee=scanner.nextInt();
                course.displayCourseDetails();

            }catch (Exception e){

                System.out.println("Wrong Input");

            }

        }else System.out.println("Invalid Username or password");
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter User Name : ");
        String userName=scanner.next();
        System.out.println("Enter Password : ");
        String userPassword=scanner.next();
        authenticate(userName,userPassword);
    }
}
