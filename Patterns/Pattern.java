package Patterns;

public class Pattern {
    public static void main(String[] args) {
        pattern7(4);
    }

    static void pattern1(int n) {

        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        int c;
        for (int i = 1; i <= (2 * n) - 1; i++) {
            if (i > n) {
                c = (2 * n) - i;
            } else {
                c = i;
            }
            for (int j = 1; j <= c; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }
    }

    static void pattern4(int n) {
        int c;
        for (int i = 1; i <= (2 * n) - 1; i++) {
            if (i > n) {
                c = (2 * n) - i;
            } else {
                c = i;
            }
            for (int x = 1; x <= (n - c); x++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= c; j++) {

                System.out.print("* ");

            }
            System.out.println();

        }
    }

    static void pattern5(int n) {
        int c;
        for (int i = 1; i <= n; i++) {
            if (i > n) {
                c = (2 * n) - i;
            } else {
                c = i;
            }
            for (int x = 1; x <= (n - c); x++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        int c;
        for (int i = 1; i <= (2 * n) - 1; i++) {
            if (i > n) {
                c = (2 * n) - i;
            } else {
                c = i;
            }
            for (int x = 1; x <= (n - c); x++) {
                System.out.print("  ");
            }
            for (int j = c; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= c; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        int originalans = n;
        n = 2 * n-1;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int expectans = originalans - Math.min(Math.min(i, j), Math.min(n - i, n - j));

                System.out.print(expectans + " ");

            }
            System.out.println();
        }

    }
}
