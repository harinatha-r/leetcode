package com.hari.leetcode;

public class FindtheIndexoftheFirstOccurrenceinaString {

    /*
    Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

    Constraints:

    1 <= haystack.length, needle.length <= 104
    haystack and needle consist of only lowercase English characters.
     */
    static public int strStr(String haystack, String needle) {
        if(haystack.equals(needle)) return 0;

        if(needle.equals("")) return 0;

        for(int i=0; i<=haystack.length()-needle.length(); i++){
            if(haystack.charAt(i) == needle.charAt(0))
                if(haystack.substring(i, i+needle.length()).equals(needle))
                    return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));//Output: 0
        System.out.println(strStr("leetcode",  "leeto"));//Output: -1
    }
}
