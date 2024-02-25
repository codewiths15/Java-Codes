package Sorting;

import java.util.ArrayList;
import java.util.List;

public class Mismatch_Pr645 {
    public static void main(String[] args) {
        int[] nums = {2,4,2,5,1,6};
        cycle(nums);
        int i=0;
        List<Integer> miss= new ArrayList<>();
        for (int index =0; index <nums.length; index++){
            if(nums[index] != index+1){
                miss.add(nums[index]);
                miss.add(index+1);
            }
        }

        System.out.println("The value repeated and the value missing is :"+miss);
        
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
    static void swap(int a, int b, int[] nums){
        int temp;
        temp=nums[a];
        nums[a] = nums[b];
        nums[b] = temp; 

    }
}