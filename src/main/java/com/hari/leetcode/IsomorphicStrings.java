package com.hari.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

Constraints:

1 <= s.length <= 5 * 10^4
t.length == s.length
s and t consist of any valid ascii character.
 */
public class IsomorphicStrings {

    static public boolean isIsomorphic(String s, String t) {

        Map<Character, Integer> map1=new HashMap<>();
        Map<Character, Integer> map2=new HashMap<>();

        //Integer is used instead of int(only whole numbers) for non-primitive data. In this case Ascii characters are used in problem statements
        for(Integer i=0;i<s.length();i++){
            if(map1.put(s.charAt(i),i)!=map2.put(t.charAt(i),i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("paper", "order"));
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("paper", "title"));
    }
}
