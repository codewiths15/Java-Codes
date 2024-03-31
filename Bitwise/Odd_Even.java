package Bitwise;

public class Odd_Even {
    public static void main(String[] args) {
        int n = 68;
        System.out.println("The number is Odd :" + isOdd(n));
    }

    static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}
