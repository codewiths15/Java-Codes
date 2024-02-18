package Even_digit;

public class Eveno_count {
    public static void main(String[] args) {

        int[] arr = { 21, 44, 65, 8, 999 };
        System.out.println(count_even(arr));
    }

    static int count_even(int[] arr) {
        int count = 0;
        for (int nums : arr) {
            if (even(nums)) {
                count++;
            }
        }

        return count;
    }

    static boolean even(int nums) {

        int no_dig = num_digit2(nums);
        if (no_dig % 2 == 0) {
            return true;
        }

        return false;

    }

    // optimal solution for finding number of digits
    static int num_digit2(int num) {
        return (int) (Math.log10(num)) + 1;
    }

    static int num_digit(int num) {

        int digits = 0;
        while (num > 0) {
            num = num / 10;
            digits++;
        }

        return digits;
    }
}
