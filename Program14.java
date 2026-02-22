package Multithreading;

import java.util.concurrent.*;

public class Program14 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        executor.submit(() -> System.out.println("Running via Executor"));
        executor.shutdown();
    }
}
