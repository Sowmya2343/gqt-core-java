package Multithreading;

class Message {
    private String content;
    private boolean hasMessage = false;

    public synchronized void put(String msg) {
        while (hasMessage) { try { wait(); } catch (InterruptedException e) {} }
        content = msg;
        hasMessage = true;
        notify();
    }

    public synchronized String take() {
        while (!hasMessage) { try { wait(); } catch (InterruptedException e) {} }
        hasMessage = false;
        notify();
        return content;
    }
}

public class Program11 {
    public static void main(String[] args) {
        Message m = new Message();
        new Thread(() -> m.put("Hello from Producer")).start();
        new Thread(() -> System.out.println("Received: " + m.take())).start();
    }
}
