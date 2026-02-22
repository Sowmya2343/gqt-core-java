package come.gqt;

import java.util.Scanner;
public class AreaTrangle9 {


	
	    static double area(double base, double height) {
	        return 0.5 * base * height;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter base: ");
	        double b = sc.nextDouble();

	        System.out.print("Enter height: ");
	        double h = sc.nextDouble();

	        double result = area(b, h);   // calling static method

	        System.out.println("Area of triangle is: " + result);
	    }
	}
	