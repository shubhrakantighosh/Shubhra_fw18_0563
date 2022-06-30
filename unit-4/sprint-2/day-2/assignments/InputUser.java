import java.util.Scanner;
public class InputUser {
    public void ShowResults(String user,int userFind){
        int rangeStart=user.length()-1;
        if(userFind<=rangeStart & userFind>=0) {
        System.out.println("Character at position "+ userFind +" is : "+user.charAt(userFind));
        }
        else{
            System.out.println("Please Enter Character in that Range");
        }
    }
    public static void main(String[] args) {
        InputUser results = new InputUser();
        Scanner inputFromUser = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String user = inputFromUser.nextLine();

        System.out.print("Enter the character position you want to access : ");
        int userFind= inputFromUser.nextInt();

        results.ShowResults(user, userFind);
    }
}
