package Collection;

import java.util.*;

public class Ex14_Hashtable {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(1,"A");
        ht.put(2,"B");

        System.out.println(ht.get(2));
    }
}