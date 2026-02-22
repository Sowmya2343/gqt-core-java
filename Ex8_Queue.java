package Collection;

import java.util.*;

public class Ex8_Queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.remove();

        for(Integer i : q)
            System.out.println(i);
    }
}
