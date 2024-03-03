package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] sArr=s.toCharArray();
        char[] tArr=t.toCharArray();
        
        if (sArr.length != tArr.length) return false;
        //sort the arrays in non-desc order
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr,tArr);
    }
    public boolean isAnagramHashTable(String s,String t) {
        HashMap<Character,Integer> count = new HashMap<>();

        for (char ch: s.toCharArray()) {
            count.put(ch,count.getOrDefault(ch,0)+1);
        }
        for (char ch: t.toCharArray()) {
            count.put(ch,count.getOrDefault(ch,0)-1);
        }
        //loop the map
        for (int val: count.values()) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }

}
