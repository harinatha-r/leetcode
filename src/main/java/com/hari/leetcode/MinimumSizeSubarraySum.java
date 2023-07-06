package com.hari.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of positive integers nums and a positive integer target, return the minimal length of a
subarray
 whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

Constraints:

1 <= target <= 10^9
1 <= nums.length <= 10^5
1 <= nums[i] <= 10^4
 */
public class MinimumSizeSubarraySum {

    static public int minSubArrayLen(int target, int[] nums) {

        int i=0,j=0,min=Integer.MAX_VALUE,sum=0;
        while(i<nums.length){
            sum+=nums[i];
            while(sum>=target){
                min=Math.min(i-j+1,min);
                sum-=nums[j];
                j++;
            }
            i++;
        }
        return min==Integer.MAX_VALUE?0:min;
    }

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[]{2,3,1,2,4,3}));//Output: 2
        System.out.println(minSubArrayLen(4, new int[]{1,4,4}));//Output: 1
        System.out.println(minSubArrayLen(11, new int[]{1,1,1,1,1,1,1,1}));//Output: 0
    }
}
