package Recursion.Array;

public class checksort {
    //chekc whether the array is sorted or not
    public static void main(String[] args) {
        int[] arr ={1,2,5,4};
        System.out.println(issort(arr));

    }

    static boolean issort(int[] arr){
        int i=0;
        return helper(arr,i);
    }

    static boolean helper(int[] arr, int i){
        if(i==arr.length-1){
            return true;
        }

        return (arr[i]<arr[i+1]) & helper(arr, i+1);
    }
}
