package question3;

import java.util.Scanner;

public class Main {

    public static Person generatePerson(Person person){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Name : ");
        person.name= scanner.nextLine();

        System.out.println("Enter Your Gender : ");
        person.gender= scanner.nextLine();

        System.out.println("Enter Your State : ");
        person.address.state= scanner.nextLine();


        System.out.println("Enter Your City Name : ");
        person.address.city= scanner.nextLine();

        System.out.println("Enter Your City Pin Code : ");
        person.address.pinCode= scanner.nextLine();


        if(person instanceof Student) {

            Student student=(Student)person;

            System.out.println("Enter Student ID : ");
            student.studentId = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Enter Course Enrolled");
            student.courseEnrolled = scanner.nextLine();

            System.out.println("Enter Course Fee");
            student.courseFee = scanner.nextInt();


        }
        else if (person instanceof Instructor) {

            Instructor instructor=(Instructor)person;

            System.out.println("Enter Instructor ID : ");
            instructor.instructorId = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Enter Salary");
            instructor.salary =scanner.nextInt();

        }
        else System.out.println("Wrong Input");

        return person;
    }

    public static void main(String[] args) {

        Person student=generatePerson(new Student());
        Person instructor=generatePerson(new Instructor());

        System.out.println(student);
        System.out.println(instructor);
    }
}

