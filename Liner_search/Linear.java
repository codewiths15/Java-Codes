package Liner_search;

public class Linear {
    public static void main(String[] args) {
        
        int[] arr = {4,55,8,2,9};
        int ans = liner_search(arr, 0);
        System.out.println(ans);
    }

    static int liner_search(int[] arr, int target){

        if(arr.length==0){
            return -1;
        }
        for(int element : arr){
            if(element == target){
                return element;
            }
        }

        return -1;
    }
}
