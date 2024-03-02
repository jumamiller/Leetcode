package org.example;

public class LongestPalindromicSubstring {
    public String findLongestPalindromicSubstr(String s) {
        if (s.length() <= 1) {
            return s;
        }

        String maxStr = s.substring(0, 1);

        for (int i = 0; i < s.length() - 1; i++) {
            String odd = expandFromCenter(s, i, i);
            String even = expandFromCenter(s, i, i + 1);

            if (odd.length() > maxStr.length()) {
                maxStr = odd;
            }
            if (even.length() > maxStr.length()) {
                maxStr = even;
            }
        }

        return maxStr;
    }
    public String expandFromCenter(String s,int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);

    }
    public String findLongestPalindromicSubstring(String s) {
        //check if s has been provided
        if (s == null) {
            return "";
        }
        int n=s.length();
        int start=0;
        //lets define default maxLength
        int maxLength=1;
        Boolean[][] dp =new Boolean[n][n];
        //we know that if s.length=1, then it's a palindrome
        for (int i=0;i<n;i++) {
            dp[i][i]=true;
        }
        //for length=2
        for (int i=0;i<n-1;i++) {
            if (s.charAt(i)==s.charAt(i+1)) {
                dp[i][i+1]=true;
                maxLength=2;
            }
        }
        //if length>=3
        for (int i=3;i<=n;i++){
            for (int j=0;j<n-i+1;j++) {
                int len=i+j-1;
                if (s.charAt(j)==s.charAt(len) && dp[j+1][len-1]) {
                    dp[i][j]=true;
                    //check len
                    if (i>maxLength){
                        start=j;
                        maxLength=i;
                    }
                }
            }
        }
        return s.substring(start,start+maxLength);
    }
}
