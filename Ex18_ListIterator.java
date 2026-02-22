package Collection;

import java.util.*;

public class Ex18_ListIterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");

        ListIterator<String> li = list.listIterator();
        while(li.hasNext())
            System.out.println(li.next());
    }
}