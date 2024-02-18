package Liner_search;

import java.util.Arrays;

public class Min_2D {
    public static void main(String[] args) {

        int[][] arr = {
                { 21, 29 },
                { 4, 6, 7 },
                { 10, 5, 9, 11 }
        };
       

        int ans[] = min_2d(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] min_2d(int[][] arr) {
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }

        return new int[] { min };
    }
}
