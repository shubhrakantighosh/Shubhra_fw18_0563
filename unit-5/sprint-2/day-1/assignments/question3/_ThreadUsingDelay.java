package question3;

public class _ThreadUsingDelay {

    public static void main(String[] args) {

        Thread thread=new Thread((

        )->{
            for(int i=1;i<=10;i++) {

                if(i==6){
                    System.out.println("delay of 5 seconds");
                    try {
                        Thread.sleep(5000);

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                System.out.println(i);
            }
        }

                );

        thread.start();

    }

}
