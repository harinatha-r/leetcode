package com.hari.leetcode;

import java.util.*;

public class SingleNumberIII {

    static public int[] singleNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> li = new ArrayList<>();

        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            } else {
                map.put(i, 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1){
                li.add(entry.getKey());
            }
        }

        return new int[]{li.get(0), li.get(1)};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(singleNumber(new int[]{1,2,1,3,2,5})));
        System.out.println(Arrays.toString(singleNumber(new int[]{-1,0})));
        System.out.println(Arrays.toString(singleNumber(new int[]{1,0})));
    }
}
