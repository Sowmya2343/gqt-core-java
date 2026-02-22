package Multithreading;

public class Program6 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try { Thread.sleep(5000); } 
            catch (InterruptedException e) { System.out.println("T1 was interrupted!"); }
        });
        t1.start();
        t1.interrupt(); // Interrupting t1 immediately
    }
}
