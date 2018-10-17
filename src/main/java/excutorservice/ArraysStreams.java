package excutorservice;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ArraysStreams {
    public static void main(String[] args) {
        ExecutorService executorService =Executors.newFixedThreadPool(10 );

        int[] ns = new int[] {1,2,3,4,5};
        Arrays.stream(ns)
                .forEach(System.out::println);
        System.out.println("Task Started ..");
        executorService.shutdown();


    }
}
