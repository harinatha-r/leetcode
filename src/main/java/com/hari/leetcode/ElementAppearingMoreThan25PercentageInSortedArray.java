package com.hari.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ElementAppearingMoreThan25PercentageInSortedArray {

    static public int findSpecialInteger(int[] arr) {

        float count = (25*arr.length/100);
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i:arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()>count){
                return entry.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findSpecialInteger(new int[]{1,2,2,6,6,6,6,7,10}));
        System.out.println(findSpecialInteger(new int[]{1,1}));
    }
}
