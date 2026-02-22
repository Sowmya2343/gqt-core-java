package com.sonu;

import java.util.Scanner;

public class UpeercaseString17 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert to Uppercase
        String upper = str.toUpperCase();
        System.out.println("Uppercase: " + upper);

        // Convert to Lowercase
        String lower = str.toLowerCase();
        System.out.println("Lowercase: " + lower);

        sc.close();
    }
}