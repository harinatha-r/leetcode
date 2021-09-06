package com.hari.leetcode;

import java.util.HashSet;
import java.util.Set;

public class RemoveOneElementToMakeTheArrayStrictlyIncreasing {

    static public boolean canBeIncreasing(int[] nums) {
        int count = 0;
        Set<Integer> set = new HashSet<Integer>();
        set.add(nums[0]);

        for(int i=1; i<nums.length; i++){
            if(nums[i - 1] >= nums[i]){
                count++;
            }

            if(count>1) return false;

            set.add(nums[i]);
        }

//        if(nums.length == 2 && set.size()<nums.length) return true;
//        else if(set.size()<nums.length) return false;

        if(count == 1 || count == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canBeIncreasing(new int[]{100,21,100}));
        System.out.println(canBeIncreasing(new int[]{1,2,10,5,7}));
        System.out.println(canBeIncreasing(new int[]{2,3,4,2}));
        System.out.println("------");
        System.out.println(canBeIncreasing(new int[]{2,3,1,2}));
        System.out.println(canBeIncreasing(new int[]{1,1,1}));
        System.out.println(canBeIncreasing(new int[]{1,2,3}));
        System.out.println(canBeIncreasing(new int[]{1,1}));
    }
}
