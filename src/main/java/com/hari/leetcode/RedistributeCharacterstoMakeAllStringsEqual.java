package com.hari.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RedistributeCharacterstoMakeAllStringsEqual {

    static public boolean makeEqual(String[] words) {

        int numOfWords = words.length;
        HashMap<Character, Integer> map = new HashMap<>();

        for(String word : words) {
            for(Character c : word.toCharArray()) {
                map.put(c, map.getOrDefault(c,0)+1);
            }
        }

        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue()%numOfWords != 0)
                return false;
        }

        return true;
    }

    //Faster
    /*
    static public boolean makeEqual(String[] words) {
        int[] alph = new int[26];

        for(int i =0;i<words.length;i++)
            for(int j = 0;j< words[i].length();j++)
                alph[words[i].charAt(j)-'a']++;


        for(int i = 0;i<26;i++)
            if(alph[i] % words.length !=0) return false;

        return true;
    }
     */

    public static void main(String[] args) {
        System.out.println(makeEqual(new String[]{"abc","aabc","bc"}));
        System.out.println(makeEqual(new String[]{"ab","a"}));
    }
}
