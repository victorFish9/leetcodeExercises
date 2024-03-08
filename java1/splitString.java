package java1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class splitString {
    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            StringBuilder text = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (c != separator)
                    text.append(c);
                else if (!text.isEmpty()) {
                    result.add(text.toString());
                    text = new StringBuilder();
                }
            }
            if (!text.isEmpty())
                result.add(text.toString());
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple,orange", "banana", "grape,kiwi,mango");
        List<String> result = splitWordsBySeparator(input, ',');
        System.out.println(result);
    }
}