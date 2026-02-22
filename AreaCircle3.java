package come.gqt;
import java.util.Scanner;

public class AreaCircle3 {



	    static double area(double radius) {
	        return Math.PI * radius * radius;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter radius: ");
	        double r = sc.nextDouble();

	        double result = area(r);   // calling static method

	        System.out.println("Area of circle is: " + result);
	    }
	}