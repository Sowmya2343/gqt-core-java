public class Pattern31 {

    public static void main(String[] args) {
        int centerRowValue = 5;

        printAlphabetDiamond(centerRowValue);
    }

    public static void printAlphabetDiamond(int centerRowValue) {

        for (int i = 1; i <= centerRowValue; i++) {
            char currentChar = (char) ('A' + i - 1); // Convert row number to corresponding character (1->A, 2->B, etc.)

            int numLeadingSpaces = centerRowValue - i;
            for (int j = 0; j < numLeadingSpaces; j++) {
                System.out.print("  "); // Two spaces for consistent alignment
            }

            for (char c = currentChar; c >= 'A'; c--) {
                System.out.print(c + " ");
            }
            for (char c = 'B'; c <= currentChar; c++) {
                System.out.print(c + " ");
            }
            System.out.println(); // Move to the next line after completing the row
        }

        for (int i = centerRowValue - 1; i >= 1; i--) {
            char currentChar = (char) ('A' + i - 1); // Convert row number to corresponding character

            int numLeadingSpaces = centerRowValue - i;
            for (int j = 0; j < numLeadingSpaces; j++) {
                System.out.print("  "); // Two spaces for consistent alignment
            }

            for (char c = currentChar; c >= 'A'; c--) {
                System.out.print(c + " ");
            }
            for (char c = 'B'; c <= currentChar; c++) {
                System.out.print(c + " ");
            }
            System.out.println(); // Move to the next line after completing the row
        }
    }
}