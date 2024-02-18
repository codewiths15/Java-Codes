//sorted by rowColumn matrix 

import java.lang.reflect.Array;
import java.util.Arrays;

public class twod_search {

    public static void main(String[] args) {

        int[][] arr = {
                { 10, 20, 30, 40 },
                {
                        12, 22, 32, 42
                },
                { 15, 23, 35, 44 },
                {
                        16, 25, 37, 48
                }
        };

        System.out.println(Arrays.toString(search(arr, 25)));
    }

    static int[] search(int[][] matrix, int target) {

        int r = 0;
        int c = matrix.length - 1;

        while (r < matrix.length && c >= 0) {

            if (matrix[r][c] == target) {
                return new int[] { r, c };
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }

        }

        return new int[] { -1, -1 };

    }

}
