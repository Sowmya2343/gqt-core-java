package Collection;

import java.util.*;

enum Days {MON,TUE,WED}

public class Ex12_EnumSet {
    public static void main(String[] args) {
        EnumSet<Days> set = EnumSet.allOf(Days.class);
        for(Days d : set)
            System.out.println(d);
    }
}
