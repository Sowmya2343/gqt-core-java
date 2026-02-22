package come.gqt;
import java.util.Scanner;

public class Rhombus15 {

	
	    static double area(double d1, double d2) {
	        return (d1 * d2) / 2;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first diagonal: ");
	        double d1 = sc.nextDouble();

	        System.out.print("Enter second diagonal: ");
	        double d2 = sc.nextDouble();

	        double result = area(d1, d2);   // calling static method

	        System.out.println("Area of rhombus is: " + result);
	    }
	}