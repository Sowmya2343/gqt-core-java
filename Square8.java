package come.gqt;
import java.util.Scanner;


public class Square8 {

	
	
	    static double findSquareRoot(double num) {
	        return Math.sqrt(num);
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        double number = sc.nextDouble();

	        double result = findSquareRoot(number);   // calling static method

	        System.out.println("Square root of " + number + " is: " + result);
	    }
	}