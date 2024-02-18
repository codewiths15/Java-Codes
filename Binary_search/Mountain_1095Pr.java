public class Mountain_1095Pr {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 3, 1 };
        int mini = search(arr, 3);
        System.err.println(mini);

    }

    static int search(int[] arr, int target) {
        int peak_ele = find_peak(arr);
        int ascen = binary_search(arr, target, true, 0, peak_ele - 1);
        int descen = binary_search(arr, target, false, peak_ele + 1, arr.length - 1);
        int min = 0;
        if (ascen == -1 && descen == -1) {
            return -1;
        } else {
            if (ascen == -1) {
                return descen;
            } else if (descen == -1) {
                return ascen;
            } 
        }

        return min;
    }

    static int find_peak(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        int final1 = 0;

        while (start <= end) {

            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                final1 = mid;
                break;
            } else if (arr[mid + 1] > arr[mid]) {
                start = mid + 1;
            } else if (arr[mid - 1] > arr[mid]) {
                end = mid - 1;
            }

        }

        return final1;

    }

    static int binary_search(int[] arr, int target, boolean isAsec, int start, int end) {

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            } else {

                if (isAsec) {
                    if (arr[mid] > target) {

                        end = mid - 1;
                    } else if (arr[mid] < target) {

                        start = mid + 1;
                    }

                } else {
                    if (arr[mid] < target) {

                        end = mid - 1;
                    } else if (arr[mid] > target) {

                        start = mid + 1;
                    }
                }
            }

        }
        return -1;
    }
}
