package com.hari.leetcode;

import java.util.HashMap;

/*
Given a string s, return the length of the longest substring between two equal characters, excluding the two characters. If there is no such substring return -1.

A substring is a contiguous sequence of characters within a string.


Constraints:

1 <= s.length <= 300
s contains only lowercase English letters.

 */
public class LargestSubstringBetweenTwoEqualCharacters {


    static public int maxLengthBetweenEqualCharacters(String s) {

        int max=-1;
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0; i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                max=Math.max(max, i-map.get(ch)-1);
            } else {
                map.put(ch, i);
            }
        }

        return max;
    }
    public static void main(String[] args) {
        System.out.println(maxLengthBetweenEqualCharacters("mgntdygtxrvxjnwksqhxuxtrv"));//Output: 18
        System.out.println(maxLengthBetweenEqualCharacters("aa"));//Output: 0
        System.out.println(maxLengthBetweenEqualCharacters("abca"));//Output: 2
        System.out.println(maxLengthBetweenEqualCharacters("cbzxy"));//Output: -1
        System.out.println(maxLengthBetweenEqualCharacters("abcabcdefa"));//Output: -1
    }
}
