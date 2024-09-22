import java.util.ArrayList;
import java.util.Arrays;

public class p821 {
    public static void main(String[] args) {

            String s="loveleetcode";
            char c='e';

            int[] arr = shortestToChar(s, c);
            System.out.println(Arrays.toString(arr));
    }

    static int[] shortestToChar(String s, char c) {

        int[] result = new int[s.length()];
        // List to store the positions
        ArrayList<Integer> positions = new ArrayList<>();
    
        // Loop through the string to find the positions of 'e'
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                positions.add(i); // Add index to the list if character matches
            }
        }
    
        System.out.println(positions);
       
        for (int i = 0; i < s.length(); i++) {
            int min = 10000;
            for (int j = 0; j < positions.size(); j++) {
                int res = Math.abs(i - positions.get(j));
                
                System.out.println(i+"--"+j+"  "+res);
                if (res < min) {
                    min = res;
                }
            }
          
            result[i] = min;
        }
    
        return result;
    }
    
}
