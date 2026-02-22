package come.gqt;
import java.util.Scanner;


public class Power7 {



	    static long power(int base, int exponent) {
	        long result = 1;

	        for (int i = 1; i <= exponent; i++) {
	            result = result * base;
	        }

	        return result;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter base: ");
	        int base = sc.nextInt();

	        System.out.print("Enter exponent: ");
	        int exp = sc.nextInt();

	        long answer = power(base, exp);   
	        System.out.println(base + " power " + exp + " = " + answer);
	    }
	}