package com.hari.leetcode;

import java.util.HashMap;
import java.util.PriorityQueue;

/*
Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.

Return the sorted string. If there are multiple answers, return any of them.

Constraints:

1 <= s.length <= 5 * 105
s consists of uppercase and lowercase English letters and digits.
 */
public class SortCharactersByFrequency {

    static public String frequencySort(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        for(char c:s.toCharArray())
            map.put(c, map.getOrDefault(c,0)+1);

        PriorityQueue<Character> pq= new PriorityQueue((a,b)->map.get(b)-map.get(a));
        pq.addAll(map.keySet());

        StringBuilder res=new StringBuilder();

        while(!pq.isEmpty()){
            char c=pq.poll();
            for(int i=1;i<=map.get(c);i++){
                res=res.append(c);
            }
        }


        return res.toString();
    }
    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));//Output: "eert"
        System.out.println(frequencySort("cccaaa"));//Output: "aaaccc"
        System.out.println(frequencySort("Aabb"));//Output: "bbAa"
    }
}
