package com.hari.leetcode;

/*
Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest amongst all the possible ones).

A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].

If middleIndex == 0, the left side sum is considered to be 0. Similarly, if middleIndex == nums.length - 1, the right side sum is considered to be 0.

Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.

Constraints:

1 <= nums.length <= 100
-1000 <= nums[i] <= 1000
 */
public class FindtheMiddleIndexinArray {

    static public int findMiddleIndex(int[] nums) {

        int left=0,right=0;

        for(int num : nums){
            right+=num;
        }

        for(int i=0;i<nums.length;i++){
            right-=nums[i];
            if(left==right)
                return i;
            left+=nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {

        System.out.println(findMiddleIndex(new int[]{2,3,-1,8,4}));//Output: 3
        System.out.println(findMiddleIndex(new int[]{1,-1,4}));//Output: 2
        System.out.println(findMiddleIndex(new int[]{2,5}));//Output: -1
    }
}
