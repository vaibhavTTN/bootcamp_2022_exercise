package Threading.Question4;

/*
    WAP to show usage of Callable and demonstrate how it is different from Runnable
 */


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Question4 {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(4);
        List<String> listOfTask = new ArrayList<>();

        for (int i = 1; i<=20; i++){
            String taskName = "Task "+i;
            Future<String> future = service.submit(new callableTask(taskName));
            try {
                listOfTask.add(future.get());
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }

//      Some task we can perform her
        Thread.sleep(10000);


        System.out.println(listOfTask);
    }
}

/*
        OUTPUT

         [
          Task 1, Task 2, Task 3, Task 4, Task 5, Task 6,
          Task 7, Task 8, Task 9, Task 10, Task 11, Task 12, Task 13,
          Task 14, Task 15, Task 16, Task 17, Task 18, Task 19, Task 20
          ]
 */