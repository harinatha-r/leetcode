package com.hari.leetcode;

import java.util.HashSet;
import java.util.Set;

/*
A string s is called good if there are no two different characters in s that have the same frequency.

Given a string s, return the minimum number of characters you need to delete to make s good.

The frequency of a character in a string is the number of times it appears in the string. For example, in the string "aab", the frequency of 'a' is 2, while the frequency of 'b' is 1.


Constraints:

1 <= s.length <= 105
s contains only lowercase English letters.
 */
public class MinimumDeletionstoMakeCharacterFrequenciesUnique {

    static public int minDeletions(String s) {
        int[] freq=new int[26];

        for(char c:s.toCharArray())
            freq[c-'a']++;

        int res=0;
        Set<Integer> set=new HashSet<>();

        for(int val:freq){
            while(val>0 && set.contains(val)){
                val--;
                res++;
            }
            set.add(val);
        }


        return res;
    }

    public static void main(String[] args) {
        System.out.println(minDeletions("aab"));//Output: 0
        System.out.println(minDeletions("aaabbbcc"));//Output: 2
        System.out.println(minDeletions("ceabaacb"));//Output: 2
    }
}
