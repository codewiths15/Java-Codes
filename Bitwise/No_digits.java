package Bitwise;

public class No_digits {
    public static void main(String[] args) {

        // step1;
        int n = 33;
        int base = 2;// base can be 2 and 10 which will help to determine the number of digits in
                     // binary number or decimal number. Complexity is log(n)
        int ans = (int) ((Math.log(n)) / (Math.log(base))) + 1;
        System.out.println(ans);
    }
}
