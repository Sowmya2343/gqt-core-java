public class Pattern30 {

    public static void main(String[] args) {
        int centerRowValue = 5; // You can change this to adjust the diamond's size

        printHollowDiamond(centerRowValue);
    }

     */
    public static void printHollowDiamond(int centerRowValue) {
        // Part 1: Top half of the diamond (from centerRowValue down to 1)
        for (int i = centerRowValue; i >= 1; i--) {
 
            int numLeadingSpaces = centerRowValue - i;
            for (int j = 0; j < numLeadingSpaces; j++) {
                System.out.print("  "); // Two spaces for alignment
            }

            System.out.print(i);

            // Print middle spaces (only if not the '1' row)
            if (i > 1) {
                // Calculate spaces between the two numbers: (2 * i - 1) total elements - 2 numbers = (2*i - 3) spaces
                int numMiddleSpaces = (2 * i - 3);
                for (int k = 0; k < numMiddleSpaces; k++) {
                    System.out.print("  "); // Two spaces for each 'gap'
                }
                // Print the second number
                System.out.print(i);
            }
            System.out.println(); // Move to the next line
        }

        // Part 2: Bottom half of the diamond (from 2 up to centerRowValue)
        // We start from 2 to avoid reprinting the '1' row (which is the last row of the top half)
        for (int i = 2; i <= centerRowValue; i++) {
            // Print leading spaces
            int numLeadingSpaces = centerRowValue - i;
            for (int j = 0; j < numLeadingSpaces; j++) {
                System.out.print("  "); // Two spaces for alignment
            }

            // Print the first number
            System.out.print(i);

            // Print middle spaces (only if not the '1' row)
            if (i > 1) {
                // Calculate spaces between the two numbers: (2 * i - 3) spaces
                int numMiddleSpaces = (2 * i - 3);
                for (int k = 0; k < numMiddleSpaces; k++) {
                    System.out.print("  "); // Two spaces for each 'gap'
                }
                // Print the second number
                System.out.print(i);
            }
            System.out.println(); // Move to the next line
        }
    }
}