package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr = {4,2};
        insert(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insert(int[] arr){
        int temp;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
    }
}
