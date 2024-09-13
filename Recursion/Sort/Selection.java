package Recursion.Sort;

import java.util.Arrays;

public class Selection {

    static void selection(int r, int c, int[] arr, int max) {

        int temp;
        if (r == 0) {
            return;
        }

        if (c < r) {

            if (arr[c] > arr[max]) {
                max = c;

            }

            selection(r, c + 1, arr, max);
        } else {

            temp = arr[max];
            arr[max] = arr[r];
            arr[r] = temp;

            selection(r - 1, 0, arr, 0);
        }
    }

    public static void main(String[] args) {
        int max = 0;
        int[] arr = { 4, 1, 2, 6, 3 };
        selection(arr.length - 1, 0, arr, max);
        System.out.println(Arrays.toString(arr));
    }
}
