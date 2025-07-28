pattern1
public class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++)
            System.out.println("* ".repeat(i).trim());
    }
}

// Pattern 2
public class Pattern2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n - i));
            System.out.println("* ".repeat(i).trim());
        }
    }
}

// Pattern 3
public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i * 2 - 1; j++)
                System.out.print(i);
            System.out.println();
        }
    }
}

// Pattern 4
public class Pattern4 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++)
            System.out.println(String.valueOf((char)('A' + i)).repeat(i * 2 + 1));
    }
}

// Pattern 5
public class Pattern5 {
    public static void main(String[] args) {
        int n = 5, count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i * 2 - 1; j++)
                System.out.print(count++);
            System.out.println();
        }
    }
}

// Pattern 6
public class Pattern6 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--)
                System.out.print((char) ('A' + j));
            System.out.println();
        }
    }
}

// Pattern 7
public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print(j % 2);
            System.out.println();
        }
    }
}

// Pattern 8
public class Pattern8 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--)
                System.out.print((char) ('A' + j));
            for (int j = 1; j <= i; j++)
                System.out.print((char) ('A' + j));
            System.out.println();
        }
    }
}

// Pattern 9
public class Pattern9 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--)
                System.out.print(j);
            for (int j = 2; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
    }
}

// Pattern 10
public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--)
                System.out.print((char)('A' + j));
            for (int j = 1; j <= i; j++)
                System.out.print((char)('A' + j));
            System.out.println();
        }
    }
}

// Pattern 11
public class Pattern11 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++)
            System.out.println((i + " ").repeat(i).trim());
    }
}

// Pattern 12
public class Pattern12 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}

// Pattern 13
public class Pattern13 {
    public static void main(String[] args) {
        int n = 5, count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print((count++) + " ");
            System.out.println();
        }
    }
}

// Pattern 14
public class Pattern14 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print((i + j) % 2 + " ");
            System.out.println();
        }
    }
}

// Pattern 15
public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++)
            System.out.println((n + " ").repeat(i).trim());
    }
}

// Pattern 16
public class Pattern16 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i * 2 - 1; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}

// Pattern 17
public class Pattern17 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--)
                System.out.print(j + " ");
            for (int j = 2; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}

// Pattern 18
public class Pattern18 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n - i));
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            for (int j = i - 1; j >= 1; j--)
                System.out.print(j);
            System.out.println();
        }
    }
}

// Pattern 19
public class Pattern19 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n - i));
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            for (int j = i - 1; j >= 1; j--)
                System.out.print(j);
            System.out.println();
        }
    }
}

// Pattern 20
public class Pattern20 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++)
                System.out.print((char)('A' + (j % n)));
            System.out.println();
        }
    }
}
