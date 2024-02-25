package Sorting;

import java.util.Arrays;

public class Missing_Pr41 {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        cycle(nums);
        System.out.println(Arrays.toString(nums));
       /*  int i=0;
       int missing=nums.length+1;
         while(i<nums.length){
             if(i!=nums[i]-1 && nums[i]>0 ){
                missing=i+1;
                 break;
             }
             else{
              
                 i++;
             }
         }

       System.out.println(missing);*/
    }

    static void cycle(int[] nums){
        int i=0;
        while(i<nums.length ){
            int correct = nums[i]-1;
             if(nums[i]!= nums[correct] && nums[i]>0 && nums[i]<=nums.length){
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
