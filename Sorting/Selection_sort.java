package Sorting;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        
        int[] arr ={4,2,6,77,1};
        select(arr);
        System.out.println(Arrays.toString(arr));

    }

     static void select(int[] arr){

        int min;
        int temp;
        for(int i=0; i<arr.length-1; i++){
            min=i;

            for(int j=i+1; j<arr.length; j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }
     } 
}
