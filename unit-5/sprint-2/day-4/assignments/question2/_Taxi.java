package question2;


public class _Taxi implements Runnable{
    String name;
    public _Taxi(String name) {
        this.name=name;
    }

    @Override
    public void run() {

        System.out.println(name+" Cab is going on his route "+ Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name+" Cab reached his destination "+Thread.currentThread().getName());
    }
}
