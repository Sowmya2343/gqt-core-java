package come.gqt;
import java.util.Scanner;
public class Parallelogram16 {

	

	
	    static double area(double base, double height) {
	        return base * height;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter base: ");
	        double b = sc.nextDouble();

	        System.out.print("Enter height: ");
	        double h = sc.nextDouble();

	        double result = area(b, h);  

	        System.out.println("Area of parallelogram is: " + result);
	    }
	}