package question2;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {

    public boolean validate(String name, String mobileNum, String aadharCard){

        boolean flag=false;

        boolean checkName=Pattern.matches("([A-Za-z_][A-Za-z0-9_]*){3,8}",name);

        boolean checkNumber= Pattern.matches("[6789]{1}\\d{9}",mobileNum);

        boolean checkAadharCard=Pattern.matches("[0-9]{12}",aadharCard);

        System.out.println(checkName);

        if(checkName && checkNumber && checkAadharCard ){

            flag =true;
        }

        return flag;
    }

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String userName=scanner.nextLine();
        System.out.println("Enter Your Aadhaar Number : ");
        String userAadhaarNumber=scanner.next();
        System.out.println("Enter Mobile Number : ");
        String userMobileNumber=scanner.next();

         Demo demo=new Demo();

         boolean userData=demo.validate(userName,userMobileNumber,userAadhaarNumber);

         if(userData){

             Citizen citizen=new Citizen();
             citizen.setName(userName);
             citizen.setMobileNumber(userMobileNumber);
             citizen.setAadharNumber(userAadhaarNumber);

             System.out.println("Name : "+citizen.getName());
             System.out.println("Aadhaar Number : "+citizen.getAadharNumber());
             System.out.println("Mobile Number : "+citizen.getMobileNumber());

        }else System.out.println("Invalid Input");
    }

}
