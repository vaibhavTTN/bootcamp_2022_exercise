package Threading.ThreadPoolsQuestion2;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    use of newSingleThreadExecutor
 */

public class newSingleThreadExecutor {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        System.out.println("This is newSingleThreadExecutor");

        for(int i = 0; i<20; i++){
            Thread t = new Thread( new Task());
            executorService.submit(t);
        }


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread Execution is completed");
    }

}
