package Multithreading;

public class Program13 {
    private static volatile boolean stop = false;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            while (!stop) { /* Busy wait */ }
            System.out.println("Stop signal received!");
        }).start();

        Thread.sleep(1000);
        stop = true; // Volatile ensures the other thread sees this change
    }
}
