package com.hari.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckifAllCharactersHaveEqualNumberofOccurrences {

    static public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }

        Set<Integer> set = new HashSet<>(map.values());
        if(set.size()==1)
            return true;

        return false;
    }
    public static void main(String[] args) {

        System.out.println(areOccurrencesEqual("abacbc"));
        System.out.println(areOccurrencesEqual("aaabb"));
    }
}
