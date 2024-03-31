package Bitwise;

public class UniqueNo {
    public static void main(String[] args) {

        int[] arr = { 2, 2, 6, 3, 4, 3, 4 };
        System.out.println(unique(arr));
    }

    static int unique(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans ^= arr[i]; /* a^a=0 */
        }

        return ans;
    }

}
