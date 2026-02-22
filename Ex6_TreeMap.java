package Collection;

import java.util.*;

public class Ex6_TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(2,"B");
        map.put(1,"A");

        for(Integer key : map.keySet())
            System.out.println(key+" "+map.get(key));
    }
}
