package com.hari.leetcode;

import java.util.*;

/*
The variance of a string is defined as the largest difference between the number of occurrences of any 2 characters present in the string. Note the two characters may or may not be the same.

Given a string s consisting of lowercase English letters only, return the largest variance possible among all substrings of s.

A substring is a contiguous sequence of characters within a string.

Constraints:

1 <= s.length <= 10^4
s consists of lowercase English letters.

 */
public class SubstringWithLargestVariance {

    /*
    Time Limit Exceeded
    static public int largestVariance(String s) {
        Set<String> set=new HashSet<>();
        int max=0;

        for(int i=0;i<s.length();i++){
            String substring="";
            for(int j=i;j<s.length();j++){
                substring+=s.charAt(j);
                set.add(substring);
            }
        }

        for(String str:set){
            int variance=0;
            Map<Character, Integer> map=new HashMap<>();
            for(char c: str.toCharArray() ){
                map.put(c,map.getOrDefault(c,0)+1);
            }
            variance=Collections.max(map.values())-Collections.min(map.values());

            max=Math.max(max, variance);
        }
        return max;
    }
     */
    static public int largestVariance(String s) {
        // Maintain a map of freq of characters in the string
        Map<Character, Integer> map = new HashMap<>();
        for (
                char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        int max = 0;
        // Check for every possible pair of characters in the map with the assumption that the one char is greater than the other
        // In the following piece of code, assuming c2 count is greater than c1
        for (
                char c1 : map.keySet()) {
            for (char c2 : map.keySet()) {
                // If both the characters are same then we don't explore any further
                if (c1 == c2)
                    continue;
                int c1Freq = 0, c2Freq = 0;
                int c1Remaining = map.get(c1); // Keep track of the remaining c1 chars

                // Iterate through all the characters in the string
                for (char c : s.toCharArray()) {
                    if (c == c1) {
                        c1Freq++;
                        c1Remaining--;
                    }
                    if (c == c2)
                        c2Freq++;

                    // If c2-count < c1-count then we reset the counters, only if we know there are more c1 chars to come in the iteration
                    // c1Remaining check is required for the test case "baa" and c1=b && c2=a. We don't reset the counters if there are no more c1 chars left
                    if (c2Freq < c1Freq && c1Remaining > 0) {
                        c2Freq = 0;
                        c1Freq = 0;
                    }

                    // Calculate variance of current substring and update max accordingly
                    if (c1Freq > 0 && c2Freq > 0)
                        max = Math.max(max, c2Freq - c1Freq);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(largestVariance("aababbb"));//Output=3
        System.out.println(largestVariance("abcde"));//Output=0
    }
}
