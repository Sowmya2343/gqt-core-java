public class Pattern32 {
    public static void main(String[] args) {
        int maxRows = 5;

        for (int i = 1; i <= maxRows; i++) {
            System.out.print(" ".repeat((maxRows - i) * 2));

            for (char ch = 'A'; ch < 'A' + i; ch++)
                System.out.print(ch + " ");

            if (i < maxRows) {
                for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--)
                    System.out.print(ch + " ");
            } else {
                for (char ch = 'A'; ch < 'A' + i - 1; ch++)
                    System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
