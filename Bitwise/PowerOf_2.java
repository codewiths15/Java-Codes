package Bitwise;

public class PowerOf_2 {
    public static void main(String[] args) {
        // check whether number is power of 2;

        int n = 16;
        if ((n & (n - 1)) == 0) {
            System.out.println("Power of 2");
        } else {
            System.out.println("Not power of 2");
        }
    }
}
