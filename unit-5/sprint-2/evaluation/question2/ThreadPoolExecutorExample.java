package question2;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutorExample implements Runnable{
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(10);

    }

    @Override
    public void run() {
        int sum=0;
        for(int i=1;i<=5;i++){
            sum+=i;
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(sum);
    }
}
