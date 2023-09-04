package com.hari.leetcode;

import java.util.HashSet;
import java.util.Set;

/*
You are given a 0-indexed string s and a dictionary of words dictionary. You have to break s into one or more non-overlapping substrings such that each substring is present in dictionary. There may be some extra characters in s which are not present in any of the substrings.

Return the minimum number of extra characters left over if you break up s optimally.



Constraints:

1 <= s.length <= 50
1 <= dictionary.length <= 50
1 <= dictionary[i].length <= 50
dictionary[i] and s consists of only lowercase English letters
dictionary contains distinct words
 */
public class ExtraCharactersinaString {

    static public int minExtraChar(String s, String[] dictionary) {

        int count=0;
        Set<String> set=new HashSet<>();

        for(String str:dictionary)
            set.add(str);

        
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(minExtraChar("leetscode", new String[]{"leet","code","leetcode"}));//Output: 1
        System.out.println(minExtraChar("sayhelloworld", new String[]{"hello","world"}));//Output: 3
    }
}
