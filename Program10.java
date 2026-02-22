package Multithreading;

public class Program10 {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("MyGroup");
        new Thread(group, () -> System.out.println("Running in group"), "T1").start();
        new Thread(group, () -> System.out.println("Running in group"), "T2").start();
        System.out.println("Active threads in " + group.getName() + ": " + group.activeCount());
    }
}