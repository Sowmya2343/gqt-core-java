package com.sonu;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingDescending21 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Ascending order using Arrays.sort()
        int[] asc = arr.clone();  // Clone original array
        Arrays.sort(asc);
        System.out.println("Ascending order: " + Arrays.toString(asc));

        // Descending order
        int[] desc = arr.clone();
        Arrays.sort(desc);
        // Reverse array for descending
        for (int i = 0; i < desc.length / 2; i++) {
            int temp = desc[i];
            desc[i] = desc[desc.length - 1 - i];
            desc[desc.length - 1 - i] = temp;
        }
        System.out.println("Descending order: " + Arrays.toString(desc));

        sc.close();
    }
}