package come.gqt;
import java.util.Scanner;
public class SquareRoot14 {

	    static int square(int num) {
	        return num * num;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();

	        int result = square(n);   

	        System.out.println("Square of " + n + " is: " + result);
	    }
	}