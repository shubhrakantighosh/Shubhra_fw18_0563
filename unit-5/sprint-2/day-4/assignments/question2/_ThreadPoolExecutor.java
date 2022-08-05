package question2;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _ThreadPoolExecutor {

    public static void main(String[] args) {

        _Taxi[] taxis={

                new _Taxi("Ashok"),
                new _Taxi("Karan"),
                new _Taxi("Raju"),
                new _Taxi("Suraj")
        };

        ExecutorService executorService= Executors.newFixedThreadPool(7);

        for (_Taxi taxi:taxis)
            executorService.submit(taxi);
        executorService.shutdown();
    }
}
