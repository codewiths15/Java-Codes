package Recursion.Easy;

public class sumofdigits {

    public static void main(String[] args) {

        System.out.println(prod(132410));
    }

    // static int sum(int n){

    // if(n==0){
    // return 0;
    // }

    // return sum(n/10) + (n%10);
    // }

    static int prod(int n) { // product of digits

        if ((n % 10) == n) {
            return n;
        }

        return prod(n / 10) * (n % 10);
    }
}
