package com.sonu;

import java.util.Scanner;

public class DiagonalMtrix23 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows/columns of square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter " + (n*n) + " elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            primarySum += matrix[i][i];           
            secondarySum += matrix[i][n - 1 - i]; 
        }

        System.out.println("Sum of primary diagonal: " + primarySum);
        System.out.println("Sum of secondary diagonal: " + secondarySum);

        sc.close();
    }
}