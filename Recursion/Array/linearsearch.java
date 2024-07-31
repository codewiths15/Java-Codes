package Recursion.Array;

public class linearsearch {
    
    public static void main(String[] args) {
        int[] arr={1,2,3,45};
        System.out.println(search(arr, 4, 0));

    }

    static boolean search(int[] arr, int target, int i){

        if(i>=arr.length){
            return false;
        }

        return (arr[i]==target) | search(arr, target, i+1);
    }
}
