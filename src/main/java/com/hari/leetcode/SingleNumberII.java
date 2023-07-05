package com.hari.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberII {

    /*
    static public int singleNumber(int[] nums) {

        Map<Integer, Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        System.out.println(map);

        for(int key:map.keySet()){
            if(map.get(key)==1)
                return key;
        }
        return 0;
    }
    */

    static public int singleNumber(int[] nums) {
        int ones = 0;
        int twos = 0;
        for (int value : nums) {
            ones = (ones ^ value) & ~twos;
            twos = (twos ^ value) & ~ones;
        }
        return ones;

    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,3,2}));//Output: 3
        System.out.println(singleNumber(new int[]{0,1,0,1,0,1,99}));//Output: 99
    }
}
