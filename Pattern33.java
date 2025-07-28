public class Pattern33 {
    public static void main(String[] args) {
        int maxRows = 5;
        for (int i = 1; i <= maxRows; i++) {
            System.out.print(" ".repeat((maxRows - i) * 2));
            for (char ch = 'A'; ch < 'A' + i; ch++) System.out.print(ch + " ");
            for (char ch = (char)((i < maxRows) ? 'A' + i - 2 : 'A'); (i < maxRows) ? ch >= 'A' : ch < 'A' + i - 1; ch += (i < maxRows) ? -1 : 1)
                System.out.print(ch + " ");
            System.out.println();
        }
    }
}
