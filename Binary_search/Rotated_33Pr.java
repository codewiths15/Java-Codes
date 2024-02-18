public class Rotated_33Pr {
    public static void main(String[] args) {

        int[] arr={4,5,6,7,0,1,2};
        int mini = search(arr, 0);
        System.err.println(mini);
    }

    static int search(int[] arr, int target) {
        int peak_ele = find_peak(arr);
        int arr1 = binary_search(arr, target, 0, peak_ele - 1);
        int arr2 = binary_search(arr, target, peak_ele + 1, arr.length - 1);
        int min = 0;
        if (arr1 == -1 && arr2 == -1) {
            return -1;
        } else {
            if (arr1 == -1) {
                return arr2;
            } else if (arr2 == -1) {
                return arr1;
            } 
        }

        return min;
    }
    static int find_peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
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
