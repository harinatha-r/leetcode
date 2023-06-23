package com.hari.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
Given a string of English letters s, return the greatest English letter which occurs as both a lowercase and uppercase letter in s. The returned letter should be in uppercase. If no such letter exists, return an empty string.

An English letter b is greater than another letter a if b appears after a in the English alphabet.

Constraints:
1 <= s.length <= 1000
s consists of lowercase and uppercase English letters.

 */
public class GreatestEnglishLetterinUpperandLowerCase {

    static public String greatestLetter(String s) {
        Map<Character, Integer> lower=new HashMap<>();
        Map<Character, Integer> upper=new HashMap<>();

        for(char c:s.toCharArray()){
            if(Character.isLowerCase(c)){
                lower.put(c,1);
            } else {
                upper.put(c,1);
            }
        }

        for(char ch='Z'; ch>='A';ch--){
            if(upper.containsKey(ch)){
                if(lower.containsKey(Character.toLowerCase(ch))){
                    return String.valueOf(ch);
                }
            }
        }

        return "";
    }

    public static void main(String[] args) {
        System.out.println(greatestLetter("lEeTcOdE"));//Output: "E"
        System.out.println(greatestLetter("arRAzFif"));//Output: "R"
        System.out.println(greatestLetter("AbCdEfGhIjK"));//Output: ""
    }
}
