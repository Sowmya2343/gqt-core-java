package Collection;

import java.util.*;

public class Ex3_HashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.remove("Python");

        for(String s : set)
            System.out.println(s);
    }
}