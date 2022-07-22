package question3;

import java.util.Scanner;

public class AccountDemo {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Your Account Number : ");
        String userAccountNumber=scanner.nextLine();
        System.out.println("Enter Amount want to deposit in your Account :");

        try {

            double userDepositAmount=scanner.nextDouble();
            System.out.println("Enter The Withdrawal Amount : ");
            double userWithdrawalAmount=scanner.nextDouble();

            Account account=new Account();
            account.accountNumber= userAccountNumber;
            account.deposit(userDepositAmount);
            double balance=account.withdraw(userWithdrawalAmount);
            if(balance==0){

                System.out.println("InsufficientFundException");

            }else System.out.println("Withdrawal Successful Amount is : "+userWithdrawalAmount);


        }catch (Exception e){

            System.out.println("Enter a valid key");

        }
    }

}
