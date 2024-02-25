package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cycle_Pr448 {
    public static void main(String[] args) {
         int[] nums ={4,3,2,7,8,2,3,1};
        int n = nums.length;
        cycle(nums,n);

        List<Integer> ans = new ArrayList<>();
        for (int index =0; index <nums.length; index++){
            if(nums[index] != index+1){
                ans.add(index+1);
            }
        }

        System.out.println("Missing numbers :"+ans);
    }

    static void cycle(int[] nums,int n){
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
