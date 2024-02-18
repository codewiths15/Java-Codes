 package Sorting;

import java.util.Arrays;

class Bubble_sort {

   public static void main(String[] args) {
    // int[] arr = {4,3,11,5,1};
    int[] arr = {1,2,4,5,7};
    bubble(arr);
    System.out.println(Arrays.toString(arr));

   } 

   static void bubble(int[] arr){
    boolean swapped;
    int temp;
    for(int i=0; i<arr.length; i++){
        swapped = false;
        for(int j=1; j<arr.length-i; j++){
            if(arr[j]<arr[j-1]){
                temp = arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                swapped = true;
                System.out.println(1);
            }
           
        }

        if(!swapped){
            break;
        }
    }

   }
}
