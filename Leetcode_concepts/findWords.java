package Leetcode_concepts;

import java.util.ArrayList;
import java.util.List;

public class findWords {

    
    public static List<Integer> findIndices(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        System.out.println(result);

        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] words = {"leet", "code"};
        char x = 'e';

        List<Integer> indices = findIndices(words, x);

        System.out.println("Output: " + indices);
    }
    
}
