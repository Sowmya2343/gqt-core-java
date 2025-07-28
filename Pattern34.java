public class Pattern34{

    public static void main(String[] args) {
 
        int numRows = 5; 

        printNumericalPyramid(numRows);
    }
    public static void printNumericalPyramid(int numRows) {
        for (int i = 0; i < numRows; i++) { 
            int numLeadingSpaces = (numRows - 1 - i) * 2;
            for (int j = 0; j < numLeadingSpaces; j++) {
                System.out.print(" "); 
            }
            for (int k = i; k > 0; k--) {
                System.out.print(k + " ");
            }
            System.out.print("0 ");

      
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            System.out.println(); // Move to the next line after completing the row
        }
    }
}
