package com.hari.leetcode;

public class NumberofStringsThatAppearasSubstringsinWord {

    static public int numOfStrings(String[] patterns, String word) {
        int count = 0;

        for(String s: patterns){
            if(word.contains(s))
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(numOfStrings(new String[]{"a","abc","bc","d"}, "abc"));
        System.out.println(numOfStrings(new String[]{"a","b","c"}, "aaaaabbbbb"));
        System.out.println(numOfStrings(new String[]{"a","a","a"}, "ab"));
    }
}
