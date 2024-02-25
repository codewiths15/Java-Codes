package Sorting;

import java.util.Arrays;

public class Cycle_Pr268 {
    public static void main(String[] args) {
        int[] arr ={2,3,0,4};
        int n = arr.length;
        cycle(arr,n);
        System.out.println(Arrays.toString(arr));
        int miss = check(arr);
        System.out.println("Missing value is : "+miss);

    }

    static int check(int[] arr){
        int i=0;
        int missing=arr.length;
        while(i<arr.length){
            if(i==arr[i]){
                i++;
            }
            else{
                missing=i;
                break;
            }
        }

        return missing;
    }
    static void cycle(int[] arr,int n){
        int i=0;
        while(i<arr.length){
            if(arr[i]>=n){
                i++;
            }
            else{
                if(i!=arr[i]){
                    swap(i, arr[i], arr);
                }
                else{
                    i++;
                }
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
