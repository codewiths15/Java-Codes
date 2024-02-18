
import java.util.Arrays;

public class Pr_34 {
    public static void main(String[] args) {

        int[] nums = { 5,7,7, 7, 7, 8, 8, 10 };
        int target = 7;
        int ans[] = new int[2];
        ans=searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchRange(int[] nums, int target) {
      int[] ans = {-1,-1};

      int start = search(nums, target, true);
      int end =search(nums, target, false);

      ans[0]=start;
      ans[1]=end;
      return ans;
    }

    static int search(int[] nums, int target, boolean findStartIndex){
        int ans=-1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start +(end - start) / 2;

           

            if (nums[mid] > target) {
                System.out.println(mid);
                end = mid - 1;

            } else if (nums[mid] < target) {
                System.out.println(mid);

                start = mid + 1;

            }
            else{
                ans=mid;

              if(findStartIndex){
                end=mid-1;
              }

              else{
                start=mid+1;
              }
            }
        }

        return ans;
    }
}
