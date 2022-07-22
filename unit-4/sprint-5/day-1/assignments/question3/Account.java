package question3;

public class Account {

    String accountNumber;
    double balance;

    public void deposit(double amount){

        this.balance=amount;

    }
    public double withdraw(double amount) {
        double current=0;

        if(this.balance>amount){

            this.balance= this.balance-amount;
            current=this.balance;
            System.out.println("Your Account Balance is now : "+this.balance);

        }
        return current;
    }

}
