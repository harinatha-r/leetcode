package com.hari.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SumofUniqueElements {

    static public int sumOfUnique(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
           map.put(i, map.getOrDefault(i, 0)+1);
        }

        int sum = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                sum += entry.getKey();
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfUnique(new int[]{1,2,3,2}));
        System.out.println(sumOfUnique(new int[]{1,1,1,1,1}));
        System.out.println(sumOfUnique(new int[]{1,2,3,4,5}));
    }
}
