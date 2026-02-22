package com.sonu;

public class StringBuilderclass18 {

	public static void main(String[] args) {

       
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("Original StringBuilder: " + sb);

        
        sb.append(" Java");
        System.out.println("After append: " + sb);

       
        sb.insert(6, "World ");
        System.out.println("After insert: " + sb);

        
        sb.replace(6, 11, "Everyone");
        System.out.println("After replace: " + sb);

        sb.delete(6, 14);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

  
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());


        System.out.println("Character at index 2: " + sb.charAt(2));

        sb.setCharAt(0, 'h');
        System.out.println("After setCharAt: " + sb);
    }
}
