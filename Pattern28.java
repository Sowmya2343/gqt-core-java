public class Pattern28 {

    public static void main(String[] args) {
        int rows = 5; // You can change this to adjust the height of the pyramid

        printPyramid(rows);
    }

    public static void printPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 0; j < rows - i; j++) {
                System.out.print("  "); 
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print(i + " ");
            }
            System.out.println(); 
        }
    }
}