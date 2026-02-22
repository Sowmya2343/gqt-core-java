package Multithreading;

import java.util.concurrent.Phaser;

public class Program18 {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1); // Register self
        for (int i = 0; i < 2; i++) {
            phaser.register();
            new Thread(() -> {
                System.out.println("Phase 1 complete");
                phaser.arriveAndAwaitAdvance();
            }).start();
        }
        phaser.arriveAndDeregister();
    }
}
