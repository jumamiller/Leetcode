package org.example;

import java.util.HashSet;

public class LongestSubWithoutRepeatingChar {
    public int findLongestSubstr(String s) {
        HashSet<Character> set = new HashSet<>();
        int j=0;
        int i=0;
        int max=0;

        //sliding window
        while(j<s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                max=Math.max(set.size(),max);
                j++;
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}
