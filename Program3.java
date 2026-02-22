package Multithreading;

import java.util.concurrent.*;

public class Program3 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i = 1; i <= 4; i++) {
            int id = i;
            executor.execute(() -> System.out.println("Task " + id + " by " + Thread.currentThread().getName()));
        }
        executor.shutdown();
    }
}