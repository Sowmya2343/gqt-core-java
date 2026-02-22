package come.gqt;
import java.util.Scanner;

public class ReversString25 {
	
	    static String reverse(String str) {
	        if (str.isEmpty())   // base condition
	            return str;
	        else
	            return reverse(str.substring(1)) + str.charAt(0);
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        String result = reverse(input);   

	        System.out.println("Reversed string: " + result);
	    }
	}