package Multithreading;

public class Program2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("Low Priority"), "T1");
        Thread t2 = new Thread(() -> System.out.println("High Priority"), "T2");
        
        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.MAX_PRIORITY); // 10
        
        System.out.println(t1.getName() + " Priority: " + t1.getPriority());
        System.out.println(t2.getName() + " Priority: " + t2.getPriority());
        t1.start(); t2.start();
    }
}
