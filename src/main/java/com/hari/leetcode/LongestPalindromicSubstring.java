package com.hari.leetcode;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashSet;

public class LongestPalindromicSubstring {

    /**
     * Brute Force Method: O(n^3)
     *
     */

    /*
    static public String longestPalindrome(String s) {

        if(s.length() == 1)
            return s;

        HashSet<String> setPalindrm = new HashSet<>();
        HashSet<String> setNotPalinrm = new HashSet<>();
        String longestPalindrome = String.valueOf(s.charAt(0));

        for(int i=0; i<s.length()-1; i++){
            for(int j=i+1; j<s.length(); j++){
                String sub = s.substring(i, j+1);
                if(!setPalindrm.contains(sub) && !setNotPalinrm.contains(sub)) {
                    if (isPalindrome(sub)) {
                        setPalindrm.add(sub);
                        if (longestPalindrome.length() < sub.length())
                            longestPalindrome = sub;
                    } else {
                        setNotPalinrm.add(sub);
                    }
                }
            }
        }

        return longestPalindrome;
    }

    static public boolean isPalindrome(String subStr){

        int i = 0, j = subStr.length()-1;

        while(i<j){
            if(subStr.charAt(i) != subStr.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }
    */

    /**
     * Naive Solution: O(N^2)
     *
     */

    static public String longestPalindrome(String s) {
        int start=0, end=0;
        for(int i=0; i<s.length(); i++) {
            int odd = expand(s, i, i);
            int even = expand(s, i, i + 1);

            int len = Math.max(odd, even);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end+1);
    }

    static public int expand(String str, int left, int right){
        while(left>=0 && right<str.length() && str.charAt(left)==str.charAt(right)){
            left--;
            right++;
        }

        return right-left-1;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("cbbd"));
        System.out.println(longestPalindrome("cdbb"));
        System.out.println(longestPalindrome("abcdefghijklmnopqrstuvwxyz"));
        System.out.println(longestPalindrome("abcdefghijklmnopqrstuvwxyzz"));
        System.out.println(longestPalindrome("abcdefghijklmnopqrstuvwxyzzyxwvutsrqponmlkjihgfedcba"));
        System.out.println(longestPalindrome("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzaa"));
        System.out.println(longestPalindrome("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzaaabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"));
        System.out.println(longestPalindrome("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }
}