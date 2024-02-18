package Liner_search;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Linear_searchstring {
    public static void main(String[] args) {

        String name = "Sahil";
        char target = 'a';
        // System.out.println(search_string(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search_string1(name, target));
    }

    static boolean search_string1(String name, char target) {
        if (name.length() == 0) {
            return false;
        }

        for (char ch : name.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }

        return false;
    }

    static boolean search_string(String name, char target) {
        if (name.length() == 0) {
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)) {
                return true;
            }
        }

        return false;
    }
}
