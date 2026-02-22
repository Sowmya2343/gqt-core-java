package Multithreading;

public class Program12 {
    private static final ThreadLocal<String> userId = new ThreadLocal<>();

    public static void main(String[] args) {
        Runnable task = () -> {
            userId.set(Thread.currentThread().getName() + "-ID");
            System.out.println(userId.get());
        };
        new Thread(task, "UserA").start();
        new Thread(task, "UserB").start();
    }
}