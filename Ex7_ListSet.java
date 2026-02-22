package Interface;

import java.util.*;

interface MyList {
    void add(int x);
    void remove(int x);
    boolean contains(int x);
}

interface MySet {
    void add(int x);
    void remove(int x);
    boolean contains(int x);
}

class ArrayListClass implements MyList {
    ArrayList<Integer> list = new ArrayList<>();
    public void add(int x){ list.add(x); }
    public void remove(int x){ list.remove(Integer.valueOf(x)); }
    public boolean contains(int x){ return list.contains(x); }
}

class HashSetClass implements MySet {
    HashSet<Integer> set = new HashSet<>();
    public void add(int x){ set.add(x); }
    public void remove(int x){ set.remove(x); }
    public boolean contains(int x){ return set.contains(x); }
}

public class Ex7_ListSet {
    public static void main(String[] args) {
        ArrayListClass a = new ArrayListClass();
        a.add(10);
        System.out.println(a.contains(10));

        HashSetClass h = new HashSetClass();
        h.add(20);
        System.out.println(h.contains(20));
    }
}