package come.gqt;
import java.util.Scanner;


public class AreaRectangle13 {


	
	    static double area(double length, double width) {
	        return length * width;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter length: ");
	        double l = sc.nextDouble();

	        System.out.print("Enter width: ");
	        double w = sc.nextDouble();

	        double result = area(l, w);   // calling static method

	        System.out.println("Area of rectangle is: " + result);
	    }
	}