package com.hari.leetcode;

public class MaximumRepeatingSubstring {

    static public int maxRepeating(String sequence, String word) {

        int count=0;
        String temp = word;
        while(sequence.contains(temp)){
            count++;
            temp+=word;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(maxRepeating("ababc", "ab"));
        System.out.println(maxRepeating("ababc", "ba"));
        System.out.println(maxRepeating("ababc", "ac"));
    }
}
