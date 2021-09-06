package com.hari.leetcode;

import java.util.HashMap;

public class CheckifWordEqualsSummationofTwoWords {

    static HashMap<Character, Integer> map = new HashMap<>();

    static{
        int num = 0;
        for(char i='a'; i<='z'; i++){
            map.put(i, num);
            num++;
        }
    }

    static public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {

        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();
        StringBuilder target = new StringBuilder();

        for(char c: firstWord.toCharArray()){
            first.append(map.get(c));
        }

        for(char c: secondWord.toCharArray()){
            second.append(map.get(c));
        }

        for(char c: targetWord.toCharArray()){
            target.append(map.get(c));
        }

        if((Integer.valueOf(first.toString())+ Integer.valueOf(second.toString())) == Integer.valueOf(target.toString())){
            return true;
        }


        return false;
    }

    public static void main(String[] args) {

        System.out.println(isSumEqual("acb", "cba", "cdb"));
        System.out.println(isSumEqual("aaa", "a", "aab"));
        System.out.println(isSumEqual("aaa", "a", "aaaa"));

    }
}
