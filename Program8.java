package Multithreading;

import java.util.concurrent.CountDownLatch;

public class Program8 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);
        for(int i=0; i<3; i++) {
            new Thread(() -> { 
                System.out.println("Initialization task done");
                latch.countDown(); 
            }).start();
        }
        latch.await(); // Main waits until count is 0
        System.out.println("System initialized. Starting main app...");
    }
}
