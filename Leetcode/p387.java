import java.util.Arrays;

public class p387 {

    public static void main(String[] args) {

        // int pos = firstUniqChar("aabb");
        // System.out.println(pos);

       int pos= firstUniqChar2("leetcode");
       System.out.println(pos);
    }

    static int firstUniqChar(String s) {

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {

                if ((s.charAt(i) == s.charAt(j)) && i != j) {
                    break;
                }

                count++;
            }
            System.out.println(count);
            if (count == s.length()) {

                return i;
            }

        }

        return -1;

    }

    static int firstUniqChar2(String s) {
        int[] letter =new int[26];

      for(int i=0; i<s.length(); i++){
        letter[s.charAt(i)-'a']++;
      }

    for(int i=0; i<s.length(); i++){
        if(letter[s.charAt(i)-'a']==1){
            return i;
        }
    }

    return -1;
      
    }

}
