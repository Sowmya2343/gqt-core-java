import java.util.Scanner;

public class Pattern36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
 
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                if (k % 2 != 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }

            System.out.println();
        }

        sc.close(); 
    }
}
