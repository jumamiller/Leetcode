package org.example;

public class LengthOfLastWord {
    public int findLengthOfLastWord(String str) {
        //convert to array
        String[] words=str.split(" ");

        String lastWord=words[words.length-1];

        return lastWord.length();
    }
}
