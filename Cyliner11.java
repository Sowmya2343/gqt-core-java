package come.gqt;
import java.util.Scanner;


public class Cyliner11 {


	    static double volume(double radius, double height) {
	        return Math.PI * radius * radius * height;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter radius: ");
	        double r = sc.nextDouble();

	        System.out.print("Enter height: ");
	        double h = sc.nextDouble();

	        double result = volume(r, h);   // calling static method

	        System.out.println("Volume of cylinder is: " + result);
	    }
	}