package Collection;

import java.util.*;

public class Ex10_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.pop();

        for(Integer i : stack)
            System.out.println(i);
    }
}