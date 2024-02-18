package Liner_search;

public class Min_search {
    public static void main(String[] args) {
        
        int[] arr = {-98,-9,3,6,-22};
        System.out.println(mini_search(arr));
    }
    static int mini_search(int[] arr){

        if(arr.length ==0){
            return -1;
        }

        int min=arr[0];
        for(int i=1; i<arr.length; i++){
            if(min>arr[i])
            {
                min=arr[i];
            }
        }

        return min;

    }
}
