package question3;

class Bank{

    private Bank(){

        System.out. println("Inside private constructor of Bank");

    }

    static Bank getBankObj(){
        return new Bank();
    }
}