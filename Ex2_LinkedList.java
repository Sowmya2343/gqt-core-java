package Collection;
import java.util.*;

public class Ex2_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.remove(10);

        for(Integer i : list)
            System.out.println(i);
    }
}