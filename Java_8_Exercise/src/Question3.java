//  Q3)Create a thread using lambda function

public class Question3 {
    public static void main(String[] args) {
        Runnable thread = ()-> System.out.println("Thread created using Lamdba");

        Thread run = new Thread(thread);

        run.start();
    }
}

/*
        OUTPUT

        Thread created using Lamdba
 */