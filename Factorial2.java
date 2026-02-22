package come.gqt;

import java.util.Scanner;
public class Factorial2 {



		    static int fact(int n) {
		        int factorial = 1;

		        for (int i = 1; i <= n; i++) {
		            factorial = factorial * i;
		        }

		        return factorial;
		    }

		    public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();

		        int result = fact(num);  

		        System.out.println("Factorial of " + num + " is: " + result);
		    }
}