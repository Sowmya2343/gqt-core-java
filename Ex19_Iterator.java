package Collection;

import java.util.*;

public class Ex19_Iterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        Iterator<Integer> it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}