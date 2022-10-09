package Threading.Question4;

import java.util.concurrent.Callable;

class callableTask implements Callable<String> {

    String taskName;

    callableTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return taskName;
    }
}
