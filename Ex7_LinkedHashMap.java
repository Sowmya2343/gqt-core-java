package Collection;

import java.util.*;

public class Ex7_LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"One");
        map.put(2,"Two");

        for(Map.Entry<Integer,String> e : map.entrySet())
            System.out.println(e.getKey()+" "+e.getValue());
    }
}