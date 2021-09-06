package com.hari.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicateII {
    static public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                if(Math.abs(map.get(nums[i])-i) <= k){
                    return true;
                }
            }
            map.put(nums[i], i);

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1}, 3));
        System.out.println(containsNearbyDuplicate(new int[]{1,0,1,1}, 1));
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
        System.out.println(containsNearbyDuplicate(new int[]{0,1,2,3,4,0,0,7,8,9,10,11,12,0}, 1));
    }
}
