package com.sonu;

public class WrapperClass {

	 public static void main(String[] args) {

	       
	        int a = 10;
	        double b = 25.5;
	        char c = 'A';

	        
	        Integer intObj = a;
	        Double doubleObj = b;
	       
	        System.out.println("Autoboxing:");
	        System.out.println("Integer object: " + intObj);
	        System.out.println("Double object: " + doubleObj);
	       
	        int x = intObj;
	        double y = doubleObj;
	       
	        System.out.println("\nUnboxing:");
	        System.out.println("int value: " + x);
	        System.out.println("double value: " + y);
	       
	        String s = "100";
	        int num = Integer.parseInt(s);
	        System.out.println("\nConverted String to int: " + num);

	        int p = 50;
	        String str = Integer.toString(p);
	        System.out.println("Converted int to String: " + str);
	    }
	}