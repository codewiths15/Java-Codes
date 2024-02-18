public class Infinity_array {
    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 8, 12, 34, 44, 54, 65, 66, 78, 99, 100 };
        start_end(arr, 7);
    }

    static void start_end(int[] arr, int target) {
        int start = 0;
        int end = 4;
        int search = -1;

        while (search == -1 && arr[end] < target) {

            System.out.println("Hello1");
            search = binary_search(arr, target, start, end);
            start = end + 1;
            end += 5;
        }

        System.out.println(arr[search]);

    }

    static int binary_search(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
