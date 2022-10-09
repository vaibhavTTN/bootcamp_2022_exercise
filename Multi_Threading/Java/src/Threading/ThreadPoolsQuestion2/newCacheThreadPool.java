package Threading.ThreadPoolsQuestion2;

/*
    use of newCacheThreadPool
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class newCacheThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        System.out.println("This is newCachedThreadPool");
        for(int i = 0; i<20; i++){
            Task obj = new Task();
            Thread t = new Thread(obj);
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
