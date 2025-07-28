public class Pattern29 {

    public static void main(String[] args) {
        int centerRowValue = 5; 

        printDiamond(centerRowValue);
    }

    public static void printDiamond(int centerRowValue) {
    
        for (int i = centerRowValue; i >= 1; i--) {
            
            int numSpaces = centerRowValue - i;
            for (int j = 0; j < numSpaces; j++) {
                System.out.print("  ");
            }

            int numElements = (2 * i - 1);
            for (int k = 0; k < numElements; k++) {
                System.out.print(i + " ");
            }
            System.out.println(); 
        }

        for (int i = 2; i <= centerRowValue; i++) {

            int numSpaces = centerRowValue - i;
            for (int j = 0; j < numSpaces; j++) {
                System.out.print("  "); 
            }

            int numElements = (2 * i - 1);
            for (int k = 0; k < numElements; k++) {
                System.out.print(i + " ");
            }
            System.out.println(); 
        }
    }
}