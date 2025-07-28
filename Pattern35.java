public class Pattern35 {

    public static void main(String[] args) {
        int numRows = 5; 
        printNumericalPyramid(numRows);
    }

    public static void printNumericalPyramid(int numRows) {
        for (int i = 1; i <= numRows; i++) { 
            int numLeadingSpaces = (numRows - i) * 2; 

            // Print leading spaces
            for (int j = 0; j < numLeadingSpaces; j++) {
                System.out.print(" ");
            }

            // Print ascending numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            // Print descending numbers
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k + " ");
            }

            System.out.println(); // Move to next line
        }
    }
}
