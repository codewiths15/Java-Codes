package Strings;

import java.util.Arrays;

public class Palindrom {
    public static void main(String[] args) {
        //check whether given string is palindrome;
        String a = "abccba";
        char[] b = new char[a.length()];
        b = a.toCharArray();
        System.out.println(Arrays.toString(b));
        int check = palindrom_check(b);
        if(check ==1){
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }

    static int palindrom_check(char[] b){
        int start = 0;
        int end = b.length-1;
        while(start<end){
            if(b[start]==b[end]){
                start++;
                end--;
            }
            else{
                return -1;
            }
        }

        return 1;
    }
}
