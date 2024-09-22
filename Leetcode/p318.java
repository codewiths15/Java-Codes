import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class p318 {

    public static void main(String[] args) {

        String[] words = { "eae", "ea", "aaf", "bda", "fcf", "dc", "ac", "ce", "cefde", "dabae" };
        int max = maxProduct1(words);
        System.out.println(max);
    }

    // time limit exceed
    static int maxProduct(String[] words) {

        List<List<Character>> wordset = new ArrayList<>();

        for (String word : words) {
            List<Character> charset = new ArrayList<>();
            for (char c : word.toCharArray()) {
                charset.add(c);
            }
            wordset.add(charset);
        }

        int max = 0;
        for (int i = 0; i < wordset.size(); i++) {
            for (int j = i + 1; j < wordset.size(); j++) {

                Set<Character> set1 = new HashSet<>(wordset.get(i));
                Set<Character> set2 = new HashSet<>(wordset.get(j));

                if (Collections.disjoint(set1, set2)) {

                    int result = wordset.get(i).size() * wordset.get(j).size();
                    if (result > max) {
                        max = result;
                    }

                }
            }
        }

        return max;
    }

    // Using Bitmask
    static int maxProduct1(String[] words) {
        int n = words.length;
        int[] bitMasks = new int[n];
        int[] lengths = new int[n];

        for (int i = 0; i < n; i++) {
            int bitmask = 0;
            for (char c : words[i].toCharArray()) {
                bitmask |= 1 << (c - 'a'); // Set the bit corresponding to the character
            }
            bitMasks[i] = bitmask;
            lengths[i] = words[i].length();
        }

        int maxProduct = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // If bitmasks have no common characters, check product
                if ((bitMasks[i] & bitMasks[j]) == 0) {
                    int product = lengths[i] * lengths[j];
                    maxProduct = Math.max(maxProduct, product);
                }
            }
        }

        return maxProduct;
    }
}
