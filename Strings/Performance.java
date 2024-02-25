package Strings;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        // printing values from a-z
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series += ch;
        }

        System.out.println(series);

        // disadvantage for above code is, it is continuously creating new objects and
        // 'series' is always pointing to new object ignoring the old values so more
        // garbage values will be stored

        //Solution for above is 'StringBuilder is used' 

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
        builder.deleteCharAt(0); //delete character at 0
        System.out.println(builder);
        builder.reverse();// reverse the string
        System.out.println(builder);



    }
}
