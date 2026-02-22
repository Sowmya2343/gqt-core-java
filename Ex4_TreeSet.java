package Collection;

import java.util.*;

public class Ex4_TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(30);
        set.add(10);
        set.add(20);
        set.remove(10);

        for(Integer i : set)
            System.out.println(i);
    }
}