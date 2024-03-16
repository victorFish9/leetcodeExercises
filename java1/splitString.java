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

// # Given an array of strings words and a character separator, split each
// string in words by separator.

// # Return an array of strings containing the new strings formed after the
// splits, excluding empty strings.

// # Notes

// # separator is used to determine where the split should occur, but it is not
// included as part of the resulting strings.
// # A split may result in more than two strings.
// # The resulting strings must maintain the same order as they were initially
// given.