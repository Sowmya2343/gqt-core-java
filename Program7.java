package Multithreading;

public class Program7 {
    private static ThreadLocal<Integer> threadVal = ThreadLocal.withInitial(() -> 0);

    public static void main(String[] args) {
        Runnable task = () -> {
            threadVal.set((int)(Math.random() * 100));
            System.out.println(Thread.currentThread().getName() + " value: " + threadVal.get());
        };
        new Thread(task).start();
        new Thread(task).start();
    }
}
