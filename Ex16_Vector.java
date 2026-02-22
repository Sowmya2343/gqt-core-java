package Collection;

import java.util.*;

public class Ex16_Vector {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("X");
        v.add("Y");
        v.remove("X");

        for(String s : v)
            System.out.println(s);
    }
}
