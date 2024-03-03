package org.example;

import java.util.HashSet;
import java.util.Set;

public class PermutationString {
    public boolean checkInclusion(String s1, String s2) {
        return false;
    }
    public static Set<String> getPermutation(String str) {
        Set<String> permutations = new HashSet<>();

        if (str==null) {
            return null;
        }
        if (str.isEmpty()) {
            permutations.add("");
            return permutations;
        }
        //get first char
        char first = str.charAt(0);
        //remaining substr
        String sub=str.substring(1);
        //recursive call to call getPermutation
        Set<String> words=getPermutation(sub);
        //access every ele from words
        for (String strNew:words) {
            for (int i = 0;i<=strNew.length();i++){
                // insert the permutation to the set
                permutations.add(strNew.substring(0, i) + first + strNew.substring(i));
            }
        }
        return permutations;
    }
}
