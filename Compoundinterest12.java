package come.gqt;
import java.util.Scanner;


public class Compoundinterest12 {


	    static double calculateCI(double principal, double rate, double time) {
	        double amount = principal * Math.pow((1 + rate / 100), time);
	        return amount - principal;   // Compound Interest
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Principal: ");
	        double p = sc.nextDouble();

	        System.out.print("Enter Rate of Interest: ");
	        double r = sc.nextDouble();

	        System.out.print("Enter Time (in years): ");
	        double t = sc.nextDouble();

	        double ci = calculateCI(p, r, t);   

	        System.out.println("Compound Interest is: " + ci);
	    }
	}