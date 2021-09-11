package com.hari.leetcode;

public class RepeatedSubstringPattern {

    static public boolean repeatedSubstringPattern(String s) {

        String temp = s.concat(s);
        return temp.substring(1, temp.length() - 1).contains(s);
    }

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abab"));
        System.out.println(repeatedSubstringPattern("aba"));
        System.out.println(repeatedSubstringPattern("abcabcabcabc"));
    }
}
