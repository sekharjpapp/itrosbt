package executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SampleTest {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Runnable task2 = ()->{
            System.out.println(Thread.currentThread().getName());
            System.out.println("task 2 up and running ..");
        };
        executorService.submit(task2);

        executorService.shutdown();
    }
}
