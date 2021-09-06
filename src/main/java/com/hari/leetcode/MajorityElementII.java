package com.hari.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElementII {

    static public List<Integer> majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> li = new ArrayList<>();
        int count = nums.length/3;

        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            } else {
                map.put(i, 1);
            }

            if(map.get(i)>count && !li.contains(i)){
                li.add(i);
            }
        }

        return li;
    }

    public static void main(String[] args) {

        System.out.println(majorityElement(new int[]{3,2,3}));
        System.out.println(majorityElement(new int[]{1}));
        System.out.println(majorityElement(new int[]{1,2}));
    }
}
