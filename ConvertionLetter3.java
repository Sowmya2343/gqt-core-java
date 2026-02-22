package com.sonu;

import java.util.Scanner;

public class ConvertionLetter3 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
           
            ch = (char) (ch - 32);
            System.out.println("Uppercase character: " + ch);

        } else if (ch >= 'A' && ch <= 'Z') {
           
            ch = (char) (ch + 32);
            System.out.println("Lowercase character: " + ch);

        } else {
            System.out.println("Invalid input! Please enter an alphabet.");
        }

        sc.close();
    }
}
