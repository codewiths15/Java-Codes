package Bitwise;

public class ith_number {
    public static void main(String[] args) {

        int num = 15;
        int pos = 7;
        // i_th(num, pos);
        set(num, pos);
    }

    // find the digit at ith position in binary number
    // static void i_th(int num, int pos) {
    // int i = num & (1 << (pos - 1));
    // if (i != 0) {
    // System.out.println(1);
    // } else {
    // System.out.println(i);
    // }

    // }
    // At 7th position replacing 0 with 1 and if it is 1 than as it is.

    static void set(int num, int pos) {
        int num1 = num | (1 << (pos - 1));
        System.out.println(num1);
    }

}
