package Collection;

import java.util.*;

public class Ex11_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.add(1);
        dq.add(2);
        dq.remove();

        for(Integer i : dq)
            System.out.println(i);
    }
}
