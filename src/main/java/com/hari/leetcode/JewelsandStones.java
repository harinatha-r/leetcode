package com.hari.leetcode;

import java.util.HashSet;

public class JewelsandStones {
    /*
    static public int numJewelsInStones(String jewels, String stones) {

        int count = 0;

        for(char c: stones.toCharArray()){
            if(jewels.contains(String.valueOf(c))){
                count++;
            }
        }

        return count;
    }
    */
    static public int numJewelsInStones(String jewels, String stones) {

        int result = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }
        for (int i = 0; i < stones.length(); i++) {
            if (set.contains(stones.charAt(i))) result++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones( "aA", "aAAbbbb"));
        System.out.println(numJewelsInStones( "z", "ZZ"));
    }
}
