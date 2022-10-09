package Threading.ThreadPoolsQuestion2;

/*
    use of newFixedThreadPool
 */


import java.util.concurrent.*;

public class newFixedThreadPool {

    public static void main(String[] args) throws Exception {
        /*
                This will execute the code in 4 batch
         */

        ExecutorService executeService = Executors.newFixedThreadPool(4);

        System.out.println("This is newFixedThreadPool");

        for(int i = 0; i<20; i++){
            Task obj = new Task();
            Thread t = new Thread(obj);
            executeService.submit(t);
        }


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread Execution is completed");

    }
}
