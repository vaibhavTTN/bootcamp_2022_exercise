package Threading.ThreadPoolsQuestion2;

public class Task extends Thread {
    @Override
    public void run() {
        System.out.println("Thread no is started " + getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread no is stoped " + getName());
    }
}
