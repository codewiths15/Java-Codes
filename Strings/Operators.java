package Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        
        System.out.println('a'+'b'); // adding ascii values
        System.out.println("a"+"b");// concatinating
        System.out.println("a"+1);
        System.out.println('a'+3);

        System.out.println("Sahil"+ new ArrayList<>());
        System.out.println("sahil"+new Integer(60));
        // System.out.println(new ArrayList<>() + new Integer(50)); // It will not work
        System.out.println(new ArrayList<>() +""+ new Integer(50)); // It will work


    }
}
