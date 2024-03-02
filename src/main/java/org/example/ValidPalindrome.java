package org.example;

public class ValidPalindrome {
    public boolean checkValidPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z]","");
        //
        int i=0;
        int j=s.length()-1;

        while(i<j) {
            if (s.charAt(i)==s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
