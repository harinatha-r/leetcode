package com.hari.leetcode;

/*
You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

Constraints:

1 <= nums.length <= 104
0 <= nums[i] <= 105
 */
public class JumpGame {

    static public boolean canJump(int[] nums) {

        int reach=0;
        for(int i=0; i<=reach;i++){
            reach=Math.max(reach, i+nums[i]);
            if(reach>=nums.length-1)
                return true;
        }

        return false;
    }
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2,3,1,1,4}));//Output: true
        System.out.println(canJump(new int[]{3,2,1,0,4}));//Output: false
    }
}
