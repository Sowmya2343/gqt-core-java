package Collection;

import java.util.*;

public class Ex15_Properties {
    public static void main(String[] args) {
        Properties p = new Properties();
        p.setProperty("username","admin");
        System.out.println(p.getProperty("username"));
    }
}