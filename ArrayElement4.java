package come.gqt;
import java.util.Scanner;

public class ArrayElement4 {

	
	    static int findSum(int arr[]) {
	        int sum = 0;

	        for (int i = 0; i < arr.length; i++) {
	            sum = sum + arr[i];
	        }

	        return sum;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();

	        int arr[] = new int[n];

	        System.out.println("Enter elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        int result = findSum(arr);  

	        System.out.println("Sum of array elements is: " + result);
	    }
	}