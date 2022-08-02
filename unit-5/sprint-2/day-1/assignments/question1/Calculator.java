package question1;

public class Calculator {

    public static void main(String[] args) {

        Thread thread=new Thread(new Calculate());
        thread.start();

    }

}
