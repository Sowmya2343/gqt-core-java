package Multithreading;
public class Program5 {
    public static void main(String[] args) {
        String res1 = "Lock1", res2 = "Lock2";
        new Thread(() -> {
            synchronized(res1) {
                System.out.println("T1 locked Res1");
                try { Thread.sleep(100); } catch(Exception e){}
                synchronized(res2) { System.out.println("T1 locked Res2"); }
            }
        }).start();

        new Thread(() -> {
            synchronized(res2) {
                System.out.println("T2 locked Res2");
                synchronized(res1) { System.out.println("T2 locked Res1"); }
            }
        }).start();
    }
}