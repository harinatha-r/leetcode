package com.hari.leetcode;

public class CheckIfTwoStringArraysareEquivalent {

    static public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(String st:word1){
            sb1.append(st);
        }

        for(String st:word2){
            sb2.append(st);
        }

        return (sb1.toString().equals(sb2.toString()))?true:false;
    }

    public static void main(String[] args) {
        System.out.println(arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"}));
        System.out.println(arrayStringsAreEqual(new String[]{"a", "cb"}, new String[]{"ab", "c"}));
        System.out.println(arrayStringsAreEqual(new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"}));
    }
}
