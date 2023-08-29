package com.hari.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
Given a string s and a character letter, return the percentage of characters in s that equal letter rounded down to the nearest whole percent.

Constraints:

1 <= s.length <= 100
s consists of lowercase English letters.
letter is a lowercase English letter.
 */
public class PercentageofLetterinString {

    /*
    static public int percentageLetter(String s, char letter) {

        if(!s.contains(String.valueOf(letter)))
            return 0;

        Map<Character, Integer> map=new HashMap<>();

        for(char c:s.toCharArray())
            map.put(c, map.getOrDefault(c,0)+1);

        return (map.get(letter)*100)/s.length();
    }
     */

    static public int percentageLetter(String s, char letter) {
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)==letter)
                count++;
        }
        return (100*count)/s.length();
    }

    public static void main(String[] args) {
        System.out.println(percentageLetter("foobar",'o'));//Output: 33
        System.out.println(percentageLetter("jjjj",'k'));//Output: 0
    }
}
