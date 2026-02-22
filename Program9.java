package Multithreading;

public class Program9 {
    public static void main(String[] args) {
        Runnable r = () -> {
            for(int i=0; i<5; i++) System.out.println(Thread.currentThread().getName() + " running");
        };
        Thread low = new Thread(r, "Low");
        Thread high = new Thread(r, "High");
        low.setPriority(1);
        high.setPriority(10);
        low.start(); high.start();
    }
}