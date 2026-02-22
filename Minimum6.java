package come.gqt;
import java.util.Scanner;

public class Minimum6 {
	

	    static int min(int a, int b) {
	        if (a < b)
	            return a;
	        else
	            return b;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int num1 = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int num2 = sc.nextInt();

	        int result = min(num1, num2);   // calling static method

	        System.out.println("Minimum number is: " + result);
	    }
	}
	