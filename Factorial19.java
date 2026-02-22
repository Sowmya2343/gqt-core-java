package com.sonu;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial19 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        
        BigInteger factorial = BigInteger.ONE;

     
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println("Factorial of " + n + " is: " + factorial);

        sc.close();
    }
}