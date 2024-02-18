
public class cealing {
    public static void main(String[] args) {

        int[] arr = { 4, 5, 8, 99 };
        // int start = 0;
        // int end= arr.length;
        int target = 95;
        // while(target>arr[start]){
        // start++;
        // }
        // System.out.println(arr[start]);
        int mid = binary_search(arr, target);
        System.out.println(mid);

    }

    static int binary_search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}
