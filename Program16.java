package Multithreading;

import java.util.concurrent.*;

public class Program16 {
    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        Future<Integer> result = exec.submit(() -> 10 + 20);
        System.out.println("Sum is: " + result.get());
        exec.shutdown();
    }
}