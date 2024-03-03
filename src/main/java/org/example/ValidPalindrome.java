package org.example;

public class ValidPalindrome {
    public boolean checkValidPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        //
        int i=0;
        int j=s.length()-1;

        while(i<j) {
            if (s.charAt(i)!=s.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
    public boolean validPalindromeOnCharacterDeletion(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                // give a last chance
                // delete char at left
                if (validSubPalindrome(s, left + 1, right)) return true;
                // delete char at right
                return validSubPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }
    private boolean validSubPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
