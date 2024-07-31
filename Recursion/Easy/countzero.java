package Recursion.Easy;

public class countzero {

    public static void main(String[] args) {

        System.out.println(count1(1020040));
    }

    static int count1(int n) {
        int count = 0;

        return helper(n, count);
    }

    static int helper(int n, int count) {

        if (n == 0) {
            return count;
        }

        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, ++count);
        }

        return helper(n / 10, count);

    }

}
