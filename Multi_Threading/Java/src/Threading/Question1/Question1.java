package Threading.Question1;
/*
    Create and Run a Thread using Runnable Interface and Thread class and
    show usage of sleep and join methods in the created threads.
 */
public class Question1 {
    public static void main(String[] args) throws InterruptedException {
 /*
            You Have to Provied the time(milliSec) to stop the StopWatch while creating object of
            Stop Watch
 */

        StopWatch t1 = new StopWatch(1000);
        StopWatch t2 = new StopWatch(5000);
        StopWatch t3 = new StopWatch(8000);
        StopWatch t4 = new StopWatch(3000);
        StopWatch t5 = new StopWatch(4000);

        /*
            Setting the name of Thread
         */

        t1.setName("T1");
        t2.setName("T2");
        t3.setName("T3");
        t4.setName("T4");
        t5.setName("T5");

        /*
         Starting the Thread
         */
//        System.out.println("Starting Thread Without Join");
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();



        System.out.println("Starting Thread using Join");

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        t4.start();
        t4.join();
        t5.start();

    }
}

/*
    OUTPUT

        Starting Thread Without Join
        StopWatch Start for :: T3
        StopWatch Start for :: T2
        StopWatch Start for :: T1
        StopWatch Start for :: T4
        StopWatch Start for :: T5
        StopWatch Stop for :: T1 time is 1.003
        StopWatch Thread is Started
        StopWatch Stop for :: T4 time is 3.003
        StopWatch Thread is Started
        StopWatch Stop for :: T5 time is 4.003
        StopWatch Thread is Started
        StopWatch Stop for :: T2 time is 5.003
        StopWatch Thread is Started
        StopWatch Stop for :: T3 time is 8.002
        StopWatch Thread is Started


        Starting Thread using Join
        StopWatch Start for :: T1
        StopWatch Stop for :: T1 time is 1.003
        StopWatch Thread is Started
        StopWatch Start for :: T2
        StopWatch Stop for :: T2 time is 5.0
        StopWatch Thread is Started
        StopWatch Start for :: T3
        StopWatch Stop for :: T3 time is 8.0
        StopWatch Thread is Started
        StopWatch Start for :: T4
        StopWatch Stop for :: T4 time is 3.001
        StopWatch Thread is Started
        StopWatch Start for :: T5
        StopWatch Stop for :: T5 time is 4.001
        StopWatch Thread is Started

 */