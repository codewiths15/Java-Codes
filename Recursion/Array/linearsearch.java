package Recursion.Array;

import java.util.ArrayList;

public class linearsearch {
    
    public static void main(String[] args) {
        int[] arr={1,2,2,3,2,45};
        // System.out.println(search(arr, 4, 0));
        // ArrayList<Integer> arr1 = new ArrayList<>();
        // System.out.println(index(arr, 2, 0,arr1 ));
        System.out.println(index1(arr, 2, 0 ));

    }

    static boolean search(int[] arr, int target, int i){

        if(i>=arr.length){
            return false;
        }

        return (arr[i]==target) | search(arr, target, i+1);
    }

    static ArrayList<Integer> index(int[] arr, int target,int index, ArrayList<Integer> arr1){

        if(index==arr.length){
            return arr1;
        }

        if(arr[index]==target){
            arr1.add(index);
        }

       return index(arr, target, index+1,arr1);

    }

    static ArrayList<Integer> index1(int[] arr, int target,int index){

        ArrayList<Integer> arr1 = new ArrayList<>();
        if(index==arr.length){
            return arr1;
        }

        if(arr[index]==target){
            arr1.add(index);
        }

       ArrayList<Integer> ansfromabove =  index1(arr, target, index+1);

       arr1.addAll(ansfromabove);
       return arr1;
    }
}
