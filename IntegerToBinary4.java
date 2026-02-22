package com.sonu;

import java.util.Scanner;

public class IntegerToBinary4 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int binary = 0, place = 1;

        while (num > 0) {
            int rem = num % 2;
            binary = binary + rem * place;
            place = place * 10;
            num = num / 2;
        }

        System.out.println("Binary equivalent: " + binary);
        sc.close();
    }
}