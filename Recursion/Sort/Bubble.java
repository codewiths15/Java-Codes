package Recursion.Sort;

import java.lang.reflect.Array;
import java.util.Arrays;

// same code of pattern
public class Bubble {
    
    static void bubble(int r, int c, int[] arr) {

        int temp;
        if (r == 0) {
            return;
        }

        if (c < r) {

            if(arr[c]>arr[c+1]){
                temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            
            bubble(r, c + 1, arr);
           

        } else {
            bubble(r - 1, 0, arr);
           
           

        }
    }

    public static void main(String[] args) {
        
        int[] arr={4,3,1,2,6};
        bubble(arr.length-1, 0, arr);
        System.out.println(Arrays.toString(arr));
    }
}
