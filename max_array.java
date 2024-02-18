import java.util.Arrays;

public class max_array {
    public static void main(String[] args) {

        int[] arr = { 4, 77, 234, 9 };

        int maxi = max(arr);

        System.out.println("Maximum value from array is :" + maxi);

        revarray(arr, 0, (arr.length - 1));
        System.out.println("Revserse of array" + Arrays.toString(arr));

    }

    static int max(int[] arr) {
        int great = 0;
        for (int i = 0; i < arr.length; i++) {
            if (great < arr[i]) {
                great = arr[i];
            }
        }

        return great;
    }

    // Reverse an array
    static void revarray(int[] arr, int start, int end) {
        while (start < end) {
            int temp;
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
    }
}