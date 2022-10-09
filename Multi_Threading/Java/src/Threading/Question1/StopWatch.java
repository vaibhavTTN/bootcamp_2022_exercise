package Threading.Question1;

/*
    Q1. Create and Run a Thread using Runnable Interface and Thread class and
        show usage of sleep and join methods in the created threads.
 */
class StopWatch extends Thread {

    private long StartMillis;
    private long StopMillis;
    private long sleepTime;


    StopWatch(long sleepTime) {
        this.sleepTime = sleepTime;
    }


    public void startTime() {
        this.StartMillis = System.currentTimeMillis();
        System.out.println("StopWatch Start for :: " + this.getName());
        try {
            Thread.sleep(this.sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void StopTime() {
        this.StopMillis = System.currentTimeMillis();
        double tim = ((this.StopMillis) - (this.StartMillis)) / 1000.0;
        System.out.println("StopWatch Stop for :: " + this.getName() + " time is " + (tim));
    }

    @Override
    public void run() {
        startTime();
        StopTime();
        System.out.println("StopWatch Thread is Started");
    }

}
