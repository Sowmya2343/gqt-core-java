package com.sonu;

public class StringMethod13 {

	public static void main(String[] args) {

        String str = "Hello Java Programming";

       
        int index = str.indexOf("Java");
        System.out.println("Index of 'Java': " + index);

        String sub1 = str.substring(6);
        System.out.println("Substring from index 6: " + sub1);

        String sub2 = str.substring(6, 10);
        System.out.println("Substring from index 6 to 10: " + sub2);

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "hello";

        System.out.println("s1 equals s2: " + s1.equals(s2));
        System.out.println("s1 equals s3: " + s1.equals(s3));
    }
}
