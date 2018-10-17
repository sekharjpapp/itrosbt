package java8example;

public class ThreadRunnable {
    public static void main(String[] args) {
        Runnable runnable =()->{
            System.out.println("Thread Name: " +Thread.currentThread().getName());
        };
        Thread thread = new Thread(runnable);

        thread.start();
    }
}
