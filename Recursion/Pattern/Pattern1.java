package Recursion.Pattern;

public class Pattern1 {

    /*
     * print:
     ****
     ***
     **
     *
     * 
     */
    static void pattern1(int r, int c) {

        if (r == 0) {
            return;
        }

        if (c < r) {
            System.out.print("*");
            pattern1(r, c + 1);
        } else {
            System.out.println();
            pattern1(r - 1, 0);
        }
    }

    static void rev_pattern1(int r, int c) {

        if (r == 0) {
            return;
        }

        if (c < r) {
            rev_pattern1(r, c + 1);
            System.out.print("*");

        } else {
            rev_pattern1(r - 1, 0);
            System.out.println();
           

        }
    }

    public static void main(String[] args) {

        int r = 4, c = 0;
        // pattern1(r, c);
        rev_pattern1(r, c);

    }
}
