import java.lang.reflect.Array;
import java.util.Arrays;

public class p1684 {

    static void countConsistentStrings(String allowed, String[] words) {
        int[] arr = new int[26];
        for(int i=0; i<arr.length; i++){
            arr[i]=0;
        }
        int pos='a';
        for(int i=0; i<allowed.length(); i++){
            arr[allowed.charAt(i)-pos]=1;
        }
      boolean flag=true;
      int count=0;
       for(int i=0; i<words.length; i++){
        for(int j=0; j<words[i].length(); j++){
           
           if(arr[words[i].charAt(j)-pos]==0){
           
                flag=false;
                break;
           }
        }
        if(flag==true){
            count++;
        }
        flag=true;
       }

       System.out.println(count);
      
    }
    public static void main(String[] args) {
        
        String allowed = "abc";
        String[] words = {"a","b","c","ab","ac","bc","abc"};
        countConsistentStrings(allowed,words);

    }
}
