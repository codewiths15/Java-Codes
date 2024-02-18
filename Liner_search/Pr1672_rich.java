package Liner_search;

public class Pr1672_rich {
    public static void main(String[] args) {

        int[][] accounts = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };
        int m = accounts.length - 1;
        int n = accounts[0].length - 1;
        int max = 0, sum = 0;
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                sum += accounts[i][j];
                         

            }

            if (max < sum) {
                max = sum;
            }
            sum = 0;
        }
        System.out.println(max);

    }
}
