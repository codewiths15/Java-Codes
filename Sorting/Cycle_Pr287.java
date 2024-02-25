package Sorting;

import java.util.Arrays;

public class Cycle_Pr287 {
    public static void main(String[] args) {
        int[] nums ={3,1,3,4,2};
        int n = nums.length;
        cycle(nums);
        System.out.println(Arrays.toString(nums));
        int repeat = check(nums);
        System.out.println(repeat);
    }

    static int check(int[] arr){
        int i=0;
        int missing=0;
        while(i<arr.length){
            if(i==(arr[i]-1)){
                i++;
            }
            else{
                missing=i;
                break;
            }
        }

        return arr[missing];
    }

    static void cycle(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
             if(nums[i]!= nums[correct]){
                swap(i, correct, nums);
            }
            else{
                i++;
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
