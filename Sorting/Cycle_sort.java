package Sorting;

import java.util.Arrays;

// cycle sort is used to sort array with single iteration (number should be from 1 to N)
public class Cycle_sort {
    public static void main(String[] args) {
        
        int[] arr = {4,2,3,1};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycle(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            while(i!=(arr[i]-1)){
                swap(i, arr[i]-1, arr);
            }
        }
    }
    static void swap(int a, int b, int[] arr){
        int temp;
        temp=arr[a];
        arr[a] = arr[b];
        arr[b] = temp; 

    }
}
