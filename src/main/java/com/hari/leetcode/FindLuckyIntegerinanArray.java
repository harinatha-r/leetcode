package com.hari.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FindLuckyIntegerinanArray {

    static public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int luckyNumber = -1;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getKey() == entry.getValue()){
                if(entry.getValue()>luckyNumber){
                    luckyNumber = entry.getKey();
                }
            }
        }

        return luckyNumber;
    }
    public static void main(String[] args) {
        System.out.println(findLucky(new int[]{2,2,3,4}));//Output: 2
        System.out.println(findLucky(new int[]{1,2,2,3,3,3}));//Output: 3
        System.out.println(findLucky(new int[]{2,2,2,3,3}));//Output: -1
        System.out.println(findLucky(new int[]{5}));//Output: -1
        System.out.println(findLucky(new int[]{7,7,7,7,7,7,7}));//Output: 7
    }
}
