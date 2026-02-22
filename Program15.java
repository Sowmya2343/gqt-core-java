package Multithreading;

public class Program15 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Working...");
            }
            System.out.println("Interrupted and exiting.");
        });
        t.start();
        Thread.sleep(10);
        t.interrupt();
    }
}