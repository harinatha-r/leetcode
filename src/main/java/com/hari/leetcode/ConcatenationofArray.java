package com.hari.leetcode;

import java.util.Arrays;

public class ConcatenationofArray {

    static public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int ans[] = new int[len*2];

        for(int i=0; i<nums.length; i++){
            ans[i] = nums[i];
            ans[i+len] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] ans = getConcatenation(new int[]{1,2,1});
        System.out.println(Arrays.toString(ans));
        int[] ans1 = getConcatenation(new int[]{1,3,2,1});
        System.out.println(Arrays.toString(ans1));
    }
}
