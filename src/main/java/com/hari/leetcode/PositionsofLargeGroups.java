package com.hari.leetcode;

import java.util.*;

public class PositionsofLargeGroups {

    static public List<List<Integer>> largeGroupPositions(String s) {

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(null == s || s.length()<3){
            return list;
        }

        Integer initialIndex = 0, lastIndex = 0;
        int count = 1;
        for(int i=0; i<s.length()-1; i++){

            if(s.charAt(i) == s.charAt(i+1)){
                count++;
            } else {
                if(count>=3){
                    List<Integer> li = new ArrayList();
                    li.add(initialIndex);
                    li.add(i);

                    list.add(li);
                }
                initialIndex = i+1;
                count = 1;
            }
            lastIndex = i+1;
        }

        if(count>=3){
            List<Integer> li = new ArrayList();
            li.add(initialIndex);
            li.add(lastIndex);

            list.add(li);
        }

        return list;
    }

    public static void main(String[] args) {
        System.out.println(largeGroupPositions("aaa"));
        System.out.println(largeGroupPositions("abbxxxxzzy"));
        System.out.println(largeGroupPositions("abc"));
        System.out.println(largeGroupPositions("abcdddeeeeaabbbcd"));
    }
}
