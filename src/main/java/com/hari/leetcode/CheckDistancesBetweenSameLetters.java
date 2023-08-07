package com.hari.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
You are given a 0-indexed string s consisting of only lowercase English letters, where each letter in s appears exactly twice. You are also given a 0-indexed integer array distance of length 26.

Each letter in the alphabet is numbered from 0 to 25 (i.e. 'a' -> 0, 'b' -> 1, 'c' -> 2, ... , 'z' -> 25).

In a well-spaced string, the number of letters between the two occurrences of the ith letter is distance[i]. If the ith letter does not appear in s, then distance[i] can be ignored.

Return true if s is a well-spaced string, otherwise return false.

2 <= s.length <= 52
s consists only of lowercase English letters.
Each letter appears in s exactly twice.
distance.length == 26
0 <= distance[i] <= 50
 */
public class CheckDistancesBetweenSameLetters {

    static  public boolean checkDistances(String s, int[] distance) {

        Map<Character, Integer> map=new HashMap<>();
        int len=s.length();
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, i-map.get(ch)-1);
            } else {
                map.put(ch, i);
            }
        }

        for(Map.Entry<Character, Integer> ent:map.entrySet()){
            if(ent.getValue()!=distance[ent.getKey()-'a']){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {

        System.out.println(checkDistances("abaccb", new int[]{1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}));//Output: true
        System.out.println(checkDistances("aa", new int[]{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}));//Output: false
    }
}
