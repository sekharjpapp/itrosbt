package concurrencyexamples;

import java.util.concurrent.*;

public class CallableTest {
    public static void main(String[] args) {
        Callable<String> callable = () -> "task is done";
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        Future<String> future= executorService.submit(callable);
        if (future.isDone()){
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}
