package question1;

public class Calculate implements Runnable{
    int sum=0;
    @Override
    public void run() {
        for (int i=1;i<10;i++) sum+=i;
        System.out.println("Sum of first 1 to 10 is : "+sum);
    }
}
