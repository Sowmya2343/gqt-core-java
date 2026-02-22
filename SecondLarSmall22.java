package com.sonu;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLarSmall22 {

	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter size of array: ");
	        int n = sc.nextInt();

	        if (n < 2) {
	            System.out.println("Array must have at least 2 elements!");
	            return;
	        }

	        int[] arr = new int[n];

	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        
	        Arrays.sort(arr);

	        
	        int secondSmallest = arr[1];

	        
	        int secondLargest = arr[n - 2];

	        System.out.println("Second smallest element: " + secondSmallest);
	        System.out.println("Second largest element: " + secondLargest);

	        sc.close();
	    }
	}
