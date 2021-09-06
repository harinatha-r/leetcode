package com.hari.leetcode;

import java.util.Arrays;

public class SortArrayByParity {

    static public int[] sortArrayByParity(int[] nums) {

        if(nums.length == 1)
            return nums;

        int[] ans = new int[nums.length];
        int even=0, odd=nums.length-1;

        for(int i:nums){
            if(i%2==0){
                ans[even] = i;
                even++;
            } else {
                ans[odd] = i;
                odd--;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{3,1,2,4})));

        System.out.println(Arrays.toString(sortArrayByParity(new int[]{0})));
    }
}
