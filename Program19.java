package Multithreading;

import java.util.concurrent.CyclicBarrier;

public class Program19 {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(2, () -> System.out.println("Barrier Released!"));
        Runnable r = () -> {
            try { 
                System.out.println(Thread.currentThread().getName() + " at barrier");
                barrier.await(); 
            } catch (Exception e) {}
        };
        new Thread(r).start();
        new Thread(r).start();
    }
}
