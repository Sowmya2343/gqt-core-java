package Multithreading;

import java.util.concurrent.*;

public class Program17 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(1);
        new Thread(() -> {
            try { queue.put("Data"); } catch (InterruptedException e) {}
        }).start();
        System.out.println("Took: " + queue.take());
    }
}
