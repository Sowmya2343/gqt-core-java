package Collection;

import java.util.concurrent.*;

public class Ex20_ArrayBlockingQueue {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> q = new ArrayBlockingQueue<>(5);
        q.add(10);
        q.add(20);
        q.remove();

        for(Integer i : q)
            System.out.println(i);
    }
}
