package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestNiceSubstring {

    public String findLongestSubstring(String s) {
        int n = s.length();
        String longestNice = "";

        // Iterate through all possible substrings
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substring = s.substring(i, j);
                if (isNice(substring) && substring.length() > longestNice.length()) {
                    longestNice = substring;
                }
            }
        }

        return longestNice;
    }
    // Function to check if a substring is nice
    private static boolean isNice(String str) {
        boolean[] lower = new boolean[26];
        boolean[] upper = new boolean[26];

        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lower[ch - 'a'] = true;
            } else if (Character.isUpperCase(ch)) {
                upper[ch - 'A'] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (lower[i] != upper[i]) {
                return false;
            }
        }

        return true;
    }
}
