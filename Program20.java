package Multithreading;

import java.util.concurrent.Semaphore;

public class Program20 {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(2);
        Runnable r = () -> {
            try {
                sem.acquire();
                System.out.println(Thread.currentThread().getName() + " in critical section");
                Thread.sleep(1000);
                sem.release();
            } catch (Exception e) {}
        };
        for(int i=0; i<4; i++) new Thread(r).start();
    }
}
