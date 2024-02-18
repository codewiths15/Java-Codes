package Liner_search;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Search_2D {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,6,7},
            {10,5,9}
        };
        int target = 5;
        int ans[] = search_2d(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search_2d(int[][] arr, int target) {
        if (arr.length == 0) {
            return new int[] { -1, -1 };
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] { -1, -1 };
    }

}
