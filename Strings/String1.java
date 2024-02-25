package Strings;

public class String1 {

    public static void main(String[] args) {

        // 1. It creates a single pool and single object
        String a = "Sahil";
        String b = "Sahil";
        System.out.println("1. " + (a == b));

        // 2. It creates two pools and pointing to 2 different objects
        String c = new String("Sahil");
        String d = new String("Sahil");
        System.out.println("2. " + (c == d));

        // 3. To check the value is same or not it does not care whether the reference
        // variable(c,d) is pointing to same variable or not

        System.out.println("3. " + c.equals(d));

    }

}
