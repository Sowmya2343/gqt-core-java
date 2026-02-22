package Multithreading;

public class Program4 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> { try { Thread.sleep(500); } catch(Exception e){} System.out.println("T1 Done"); });
        Thread t2 = new Thread(() -> System.out.println("T2 Done"));
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("All threads joined. Main exiting.");
    }
}