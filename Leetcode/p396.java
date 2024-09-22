import java.util.Arrays;

public class p396 {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 6 };
        int max = maxRotateFunction(arr);
        System.out.println(max);
    }

    static int maxRotateFunction(int[] nums) {

        int n = nums.length;
        
        // Calculate sum of all elements in the array
        int sum_nums = 0;
        for (int num : nums) {
            sum_nums += num;
        }
        
        // Calculate F(0)
        int F = 0;
        for (int i = 0; i < n; i++) {
            F += i * nums[i];
        }
        
        // Initialize max as F(0)
        int max = F;
        
        // Calculate F(k) for k = 1 to n-1 using the recursive relationship
        for (int k = 1; k < n; k++) {
            // F(k) = F(k-1) + sum_nums - n * nums[n - k]
            F = F + sum_nums - n * nums[n - k];
            max = Math.max(max, F);
        }
        
        return max;

    }
}
