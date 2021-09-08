package com.hari.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class DetermineifStringHalvesAreAlike {

    static List<Character> li = Arrays.asList(new Character[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'});

    static public boolean halvesAreAlike(String s) {

        String a = s.substring(0,s.length()/2);
        String b = s.substring((s.length()/2));

        int aCount = 0, bCount = 0;

        for(char c: a.toCharArray()){
            if(li.contains(c))
                aCount++;
        }

        for(char c: b.toCharArray()){
            if(li.contains(c))
                bCount++;
        }

        return (aCount==bCount) ? true:false;
    }

    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book"));
        System.out.println(halvesAreAlike("textbook"));
        System.out.println(halvesAreAlike("MerryChristmas"));
        System.out.println(halvesAreAlike("AbCdEfGh"));
        System.out.println(halvesAreAlike("AbCdEfG"));
    }
}
